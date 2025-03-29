package com.itmo.studenthelper;

import com.itmo.studenthelper.INF.INFPIiKT;
import com.itmo.studenthelper.PIiKT1.Programming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentHelperApplication {
    public static void main(String[] args) {
        new FirstFrame();
    }
}

class FirstFrame extends JFrame {
    public FirstFrame() {
        setTitle("Главное меню");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton openSecondFrame = new JButton("Войти");
        openSecondFrame.setPreferredSize(new Dimension(100, 30));

        openSecondFrame.addActionListener(e -> {
            new SecondFrame();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Добро пожаловать!"));
        panel.add(openSecondFrame);
        add(panel);

        setVisible(true);
    }
}

// Окно ввода пароля
class SecondFrame extends JFrame {
    public SecondFrame() {
        setTitle("Введите пароль");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));



        JLabel isu = new JLabel("Индификатор:");
        JLabel label = new JLabel("Пароль:");
        JTextField login = new JTextField(10);
        JTextField textField = new JTextField(10);
        JButton submitButton = new JButton("Подтвердить");
        JLabel errorLabel = new JLabel("");
        errorLabel.setForeground(Color.RED);

        submitButton.addActionListener(e -> {

            //String write = login.getText();
            //String input = textField.getText();
            //if ("467478".equals(write) && "1234".equals(input)) {
                new UserFrame(); // Открываем пользовательское окно
                dispose();
            //} else {
              //  errorLabel.setText("Неверный пароль!");
            //}
        });

        panel.add(isu);
        panel.add(login);
        panel.add(label);
        panel.add(textField);
        panel.add(submitButton);
        panel.add(errorLabel);
        add(panel);

        setVisible(true);
    }
}

// Четвертое окно (дополнительное)
class ExtraFramePIn extends JFrame {
    public ExtraFramePIn() {
        setTitle("Дополнительное окно");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Это дополнительное окно.");
        JButton backButton = new JButton("Назад в окно пользователя");

        // Возвращение в UserFrame
        backButton.addActionListener(e -> {
            new UserFrame();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(backButton);
        add(panel);

        setVisible(true);
    }
}

class ExtraFramePIiKT extends JFrame {
    public ExtraFramePIiKT() {
        setTitle("ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("С Возвращением!");
        JLabel talk1 = new JLabel(" ");
        JButton Programming = new JButton("Программирование");
        JButton INFPIiKT = new JButton("Информатика");
        JButton ButtonINF = new JButton("Информатика");
        JButton ButtonDataBase = new JButton("База данных");
        JButton ButtonOPJ = new JButton("Основы профессиональной деятельности");
        JButton backButton = new JButton("Назад в окно пользователя");

        Programming.addActionListener(e -> {
            new Programming();
            dispose();
        });

        INFPIiKT.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        ButtonINF.addActionListener(e -> {
            new ExtraFramePIiKT();
            dispose();
        });

        ButtonDataBase.addActionListener(e -> {
            new ExtraFramePIiKT();
            dispose();
        });

        ButtonOPJ.addActionListener(e -> {
            new ExtraFramePIiKT();
            dispose();
        });

        // Возвращение в UserFrame
        backButton.addActionListener(e -> {
            new UserFrame();
            dispose();
        });

        JPanel panel = new JPanel();


        panel.add(label);
        panel.add(talk1);
        panel.add(Programming);
        panel.add(INFPIiKT);
        panel.add(ButtonOPJ);
        panel.add(ButtonDataBase);

        panel.add(backButton);
        add(panel);

        setVisible(true);
    }
}