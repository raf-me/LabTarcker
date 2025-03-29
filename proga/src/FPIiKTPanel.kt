package org.itmo.ui

import java.awt.*
import javax.swing.*

/**
 * Панель со списком дисциплин ФПИиКТ.
 * Кнопка «Назад» возвращает к FacultyChoicePanel.
 * При выборе дисциплины вызываем onDisciplineSelected(ключ).
 */
class FPIiKTPanel(
    val onBack: () -> Unit,
    val onDisciplineSelected: (String) -> Unit
) : JPanel() {
    init {
        layout = BorderLayout()

        val title = JLabel("ФПИиКТ - Выбор дисциплины", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 20f)
        }
        add(title, BorderLayout.NORTH)

        val centerPanel = JPanel()
        centerPanel.layout = BoxLayout(centerPanel, BoxLayout.Y_AXIS)

        // Дисциплины
        val disciplines = listOf(
            // "Имя для отображения" to "ключ для CardLayout"
            "Программирование" to "programming",
            "Информатика" to "informatics",
            "Основы проф. деятельности" to "prof",
            "Базы данных" to "db",
            "Веб-Программирование" to "web",
            "Основы программной инженерии" to "softeng"
        )

        disciplines.forEach { (name, key) ->
            val btn = JButton(name).apply {
                maximumSize = Dimension(300, 40)
                alignmentX = CENTER_ALIGNMENT
                addActionListener {
                    onDisciplineSelected(key)
                }
            }
            centerPanel.add(Box.createRigidArea(Dimension(0, 10)))
            centerPanel.add(btn)
        }

        centerPanel.add(Box.createVerticalGlue())
        add(centerPanel, BorderLayout.CENTER)

        // Кнопка «Назад» внизу
        val bottomPanel = JPanel(FlowLayout(FlowLayout.LEFT))
        val backButton = JButton("Вернуться назад").apply {
            addActionListener { onBack() }
        }
        bottomPanel.add(backButton)
        add(bottomPanel, BorderLayout.SOUTH)
    }
}
