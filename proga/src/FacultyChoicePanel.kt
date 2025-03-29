package org.itmo.ui

import javax.swing.*
import java.awt.*

class FacultyChoicePanel(val onFacultySelected: (String) -> Unit) : JPanel() {
    init {
        layout = BoxLayout(this, BoxLayout.Y_AXIS)

        add(Box.createRigidArea(Dimension(0, 30)))
        val titleLabel = JLabel("ITMO UNIVERSITY", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 24f)
            alignmentX = CENTER_ALIGNMENT
        }
        add(titleLabel)

        val subLabel = JLabel("С возвращением, студент!", SwingConstants.CENTER).apply {
            font = font.deriveFont(18f)
            alignmentX = CENTER_ALIGNMENT
        }
        add(Box.createRigidArea(Dimension(0, 10)))
        add(subLabel)
        add(Box.createRigidArea(Dimension(0, 20)))

        val faculties = listOf("ФПИиКТ", "ФИТиП", "ФПИн")
        faculties.forEach { fac ->
            val btn = JButton(fac).apply {
                alignmentX = CENTER_ALIGNMENT
                addActionListener {
                    // Сообщаем наружу, что выбрали факультет
                    onFacultySelected(fac)
                }
            }
            add(Box.createRigidArea(Dimension(0, 10)))
            add(btn)
        }
        add(Box.createVerticalGlue())
    }
}
