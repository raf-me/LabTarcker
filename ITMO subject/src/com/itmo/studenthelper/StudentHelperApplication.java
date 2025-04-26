package com.itmo.studenthelper;

import com.itmo.studenthelper.INF.INFPIiKT;
import com.itmo.studenthelper.PIiKT1.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

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

        /*try {
            DatabaseManager.init();
        } catch(SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Не удалось инициализировать БД:\n" + ex.getMessage(),
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        */

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

            String write = login.getText();
            String input = textField.getText();


            boolean ok = false;
            AccessManager.Role role = AccessManager.Role.STUDENT;   // дефолт

            if ("root".equals(write) && "1234".equals(input)) {
                role = AccessManager.Role.MASTER;    // главный редактор
                ok   = true;
            } else if ("teacher".equals(write) && "4321".equals(input)) {
                role = AccessManager.Role.TEACHER;   // преподаватель
                ok   = true;
            } else if ("student".equals(write) && "1111".equals(input)) {
                role = AccessManager.Role.STUDENT;   // студент
                ok   = true;
            }


            if (ok) {
                AccessManager.loginAs(role);
                new UserFrame();
                dispose();
            } else {
                errorLabel.setText("Неверный логин или пароль!");
            }
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
        JButton DataBase = new JButton("Базы данных");
        JButton OPJ = new JButton("Основы профессиональной деятельности");
        JButton backButton = new JButton("Назад в окно пользователя");


        JButton[] buttons = { Programming, INFPIiKT, DataBase, OPJ};


        Programming.addActionListener(e -> { new Programming(); dispose(); });
        INFPIiKT.addActionListener(e -> { new INFPIiKT(); dispose(); });
        //DataBase  .addActionListener(e -> { new DataBase();  dispose(); });
        //OPJ  .addActionListener(e -> { new OPJ();  dispose(); });



        JPanel top = new JPanel(new BorderLayout());
        //JButton backButton = new JButton("< Назад");
        backButton.addActionListener(e -> {
            new UserFrame();
            dispose();
        });
        JLabel title = new JLabel("Дисциплины КСиТ", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.PLAIN, 24));
        top.add(backButton, BorderLayout.WEST);
        top.add(title,      BorderLayout.CENTER);


        JPanel table = new JPanel(new GridLayout(0, 2, 8, 8));
        table.setBorder(BorderFactory.createEmptyBorder(12,12,12,12));


        for (JButton btn : buttons) {
            table.add(btn);
            JTextField comment = new JTextField();
            comment.setEnabled(AccessManager.canComment());
            table.add(comment);
        }


        setLayout(new BorderLayout());
        add(top,    BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);

        setVisible(true);
    }

        /*JButton point1 = new JButton("Программирование");
        JButton point2 = new JButton("Информатика");
        JButton lab1   = new JButton("Базы данных");
        JButton lab2   = new JButton("Основы профессиональной деятельности");
        JButton lab3   = new JButton("Web-программирование");
        JButton lab5   = new JButton("Языки программирования");
        JButton lab6   = new JButton("Основы программной инженерии");


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

        setVisible(true);*/




}
