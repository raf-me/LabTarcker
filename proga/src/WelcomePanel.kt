package org.itmo.ui

import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.*

class WelcomePanel(val onNext: ()->Unit) : JPanel() {
    init {
        layout = BorderLayout()

        val label = JLabel("Добро пожаловать в ITMO App", SwingConstants.CENTER).apply {
            font = font.deriveFont(24f)
        }
        add(label, BorderLayout.CENTER)

        // «Кнопка Далее» внизу, вне основного контента
        val bottomPanel = JPanel(FlowLayout(FlowLayout.RIGHT))
        val nextButton = JButton("Далее").apply {
            addActionListener { onNext() }
        }
        bottomPanel.add(nextButton)
        add(bottomPanel, BorderLayout.SOUTH)
    }
}
