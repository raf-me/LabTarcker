package org.itmo.ui.fpiikt

import org.itmo.ui.LabChoicePanel
import java.awt.*
import javax.swing.*

/**
 * Пример панели "Программирование" (ФПИиКТ).
 * Кнопка "Назад" — возвращает к FPIiKTPanel.
 * При выборе ЛР показываем панель конкретной ЛР (7 штук).
 */
class ProgrammingPanel(
    val onBack: () -> Unit
) : JPanel() {
    init {
        layout = BorderLayout()

        val title = JLabel("Программирование (ФПИиКТ)", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 20f)
        }
        add(title, BorderLayout.NORTH)

        // «Выбор лабораторной работы» — для простоты один общий LabChoicePanel
        val labChoice = LabChoicePanel(
            disciplineName = "Программирование (ФПИиКТ)",
            onBack = onBack
        )
        add(labChoice, BorderLayout.CENTER)
    }
}
