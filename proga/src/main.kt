package org.itmo.ui

import java.awt.*
import javax.swing.*

fun main() {
    SwingUtilities.invokeLater {
        MainApp()
    }
}

/**
 * Главное окно с CardLayout,
 * где храним все панели (экраны).
 */
class MainApp : JFrame("ITMO App") {
    private val cardLayout = CardLayout()
    private val mainPanel = JPanel(cardLayout)

    init {
        size = Dimension(540, 960) // Формат 9:16
        defaultCloseOperation = EXIT_ON_CLOSE

        // Создаём экраны и добавляем их в mainPanel под уникальными именами
        val welcomePanel = WelcomePanel(
            onNext = { cardLayout.show(mainPanel, "login") }
        )
        mainPanel.add(welcomePanel, "welcome")

        val loginPanel = LoginPanel(
            onLoginSuccess = { cardLayout.show(mainPanel, "facultyChoice") }
        )
        mainPanel.add(loginPanel, "login")

        // Выбор факультета
        val facultyChoicePanel = FacultyChoicePanel(
            onFacultySelected = { facultyName ->
                // Для примера — если выбрали "ФПИиКТ", то показываем экран дисциплин ФПИиКТ
                if (facultyName == "ФПИиКТ") {
                    // Создаём панель, если её ещё не добавляли
                    if (getPanel("fpiikt") == null) {
                        val fpiiktPanel = FPIiKTPanel(
                            onBack = { cardLayout.show(mainPanel, "facultyChoice") },
                            onDisciplineSelected = { disciplineKey ->
                                // disciplineKey — имя дисциплины, типа "programming", "informatics", ...
                                // Создаём объект дисциплины, если он не создан
                                if (getPanel(disciplineKey) == null) {
                                    val disciplinePanel = createDisciplinePanel(disciplineKey)
                                    mainPanel.add(disciplinePanel, disciplineKey)
                                }
                                cardLayout.show(mainPanel, disciplineKey)
                            }
                        )
                        mainPanel.add(fpiiktPanel, "fpiikt")
                    }
                    cardLayout.show(mainPanel, "fpiikt")
                }
                // Аналогично для ФПИн и ФИТиП (создать свои панели)
            }
        )
        mainPanel.add(facultyChoicePanel, "facultyChoice")

        contentPane.add(mainPanel)
        cardLayout.show(mainPanel, "welcome") // Начинаем с приветствия
        isVisible = true
    }

    /**
     * Утилитный метод: найти панель в mainPanel по имени
     */
    private fun getPanel(name: String): Component? {
        for (comp in mainPanel.components) {
            val layout = mainPanel.layout as CardLayout
            // CardLayout не даёт прямого метода getConstraints(),
            // поэтому сравним комп, добавленный под этим именем, иначе проверим вручную.
            // Упростим: просто сравним comp.name
            if (comp.name == name) {
                return comp
            }
        }
        return null
    }

    /**
     * Создаём панель дисциплины по её ключу (например, "programming" -> ProgrammingPanel())
     */
    private fun createDisciplinePanel(key: String): JPanel {
        return when (key) {
            "programming" -> org.itmo.ui.fpiikt.ProgrammingPanel(
                onBack = { cardLayout.show(mainPanel, "fpiikt") }
            ).apply { name = "programming" }
/*
            "informatics" -> org.itmo.ui.fpiikt.InformaticsPanel(
                onBack = { cardLayout.show(mainPanel, "fpiikt") }
            ).apply { name = "informatics" }

            "prof" -> org.itmo.ui.fpiikt.ProfessionalPanel(
                onBack = { cardLayout.show(mainPanel, "fpiikt") }
            ).apply { name = "prof" }

            "db" -> org.itmo.ui.fpiikt.DatabasesPanel(
                onBack = { cardLayout.show(mainPanel, "fpiikt") }
            ).apply { name = "db" }

            "web" -> org.itmo.ui.fpiikt.WebProgrammingPanel(
                onBack = { cardLayout.show(mainPanel, "fpiikt") }
            ).apply { name = "web" }

            "softeng" -> org.itmo.ui.fpiikt.SoftwareEngineeringPanel(
                onBack = { cardLayout.show(mainPanel, "fpiikt") }
            ).apply { name = "softeng" }
*/
            else -> JPanel().apply { name = key }
        }
    }
}
