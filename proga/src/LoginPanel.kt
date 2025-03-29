package org.itmo.ui

import java.awt.*
import javax.swing.*

class LoginPanel(val onLoginSuccess: ()->Unit) : JPanel() {
    private val tfLogin = JTextField(15)
    private val pfPassword = JPasswordField(15)

    init {
        layout = BorderLayout()

        // Верхняя часть — поля логина/пароля
        val centerPanel = JPanel(GridBagLayout())
        val gbc = GridBagConstraints()
        gbc.insets = Insets(10, 10, 10, 10)
        gbc.fill = GridBagConstraints.HORIZONTAL

        gbc.gridx = 0; gbc.gridy = 0
        centerPanel.add(JLabel("Логин:"), gbc)

        gbc.gridx = 1
        centerPanel.add(tfLogin, gbc)

        gbc.gridx = 0; gbc.gridy = 1
        centerPanel.add(JLabel("Пароль:"), gbc)

        gbc.gridx = 1
        centerPanel.add(pfPassword, gbc)

        add(centerPanel, BorderLayout.CENTER)

        // Кнопка Войти внизу
        val bottomPanel = JPanel(FlowLayout(FlowLayout.RIGHT))
        val btnLogin = JButton("Войти").apply {
            addActionListener {
                // TODO: Проверить логин/пароль
                onLoginSuccess()
            }
        }
        bottomPanel.add(btnLogin)
        add(bottomPanel, BorderLayout.SOUTH)
    }
}
