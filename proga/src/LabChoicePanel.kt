package org.itmo.ui

import java.awt.*
import javax.swing.*

class LabChoicePanel(
    val disciplineName: String,
    val onBack: () -> Unit
) : JPanel() {

    init {
        layout = BorderLayout()

        val label = JLabel("Выберите лабораторную работу по $disciplineName", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 18f)
        }
        add(label, BorderLayout.NORTH)

        val centerPanel = JPanel()
        centerPanel.layout = BoxLayout(centerPanel, BoxLayout.Y_AXIS)

        // 7 кнопок
        for (i in 1..7) {
            val btn = JButton("Лабораторная работа №$i").apply {
                alignmentX = CENTER_ALIGNMENT
                addActionListener {
                    // Показать окно с содержимым ЛР
                    // Например, создаём новый LabPanelX(i):
                    val labPanel = when(i) {
                        1 -> Lab1Panel { showMe() } // вернёмся обратно в этот же LabChoicePanel
                        2 -> Lab2Panel { showMe() }
                        else -> LabPanel(i) { showMe() } // или обобщённый класс
                    }
                    // Заменяем содержимое окна на labPanel:
                    // Т.к. требование — «Вернуться назад»,
                    // мы можем открыть labPanel во всплывающем JDialog
                    showLabDialog(labPanel)
                }
            }
            centerPanel.add(Box.createRigidArea(Dimension(0, 10)))
            centerPanel.add(btn)
        }

        centerPanel.add(Box.createVerticalGlue())
        add(centerPanel, BorderLayout.CENTER)

        // Кнопка «Назад»
        val bottomPanel = JPanel(FlowLayout(FlowLayout.LEFT))
        val backButton = JButton("Вернуться назад").apply {
            addActionListener { onBack() }
        }
        bottomPanel.add(backButton)
        add(bottomPanel, BorderLayout.SOUTH)
    }

    /**
     * Восстановить (показать) текущую панель после закрытия JDialog.
     */
    private fun showMe() {
        // Здесь ничего не нужно, т.к. панель и так на экране,
        // если мы используем диалоги. Если бы был CardLayout,
        // то нужно было бы cardLayout.show(...)
    }

    private fun showLabDialog(panel: JPanel) {
        val dialog = JDialog(SwingUtilities.getWindowAncestor(this), "Лабораторная работа", Dialog.ModalityType.APPLICATION_MODAL)
        dialog.contentPane.add(panel)
        dialog.size = Dimension(600, 800)
        dialog.setLocationRelativeTo(this)
        dialog.isVisible = true
    }
}
