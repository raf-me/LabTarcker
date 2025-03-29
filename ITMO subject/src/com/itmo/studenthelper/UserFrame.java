package com.itmo.studenthelper;

import javax.swing.*;

// Окно пользователя (третье окно)
public class UserFrame extends JFrame {
    public UserFrame() {
        setTitle("Обычный пользователь");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton ButtonPIiKT = new JButton("ФПИиКТ");
        JButton ButtonPIn = new JButton("ФПИн");
        JButton backButton = new JButton("Выйти");

        // Переход в четвертое окно
        ButtonPIiKT.addActionListener(e -> {
            new ExtraFramePIiKT();
            dispose();
        });

        ButtonPIn.addActionListener(e -> {
            new ExtraFramePIn();
            dispose();
        });

        // Возвращение в главное меню
        backButton.addActionListener(e -> {
            new FirstFrame();
            dispose();
        });

        JPanel panel = new JPanel();

        panel.add(ButtonPIiKT);
        panel.add(ButtonPIn);
        panel.add(backButton);
        add(panel);

        setVisible(true);
    }
}
