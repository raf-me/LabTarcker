package com.itmo.studenthelper.INF;

import com.itmo.studenthelper.PIiKT1.Programming;
import com.itmo.studenthelper.UserFrame;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


import javax.swing.*;

public class INFPIiKT extends JFrame {
    public INFPIiKT(){
        setTitle("ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Информатика 1 курс");
        JButton lab1 = new JButton("Лабораторная работа 1");
        JButton lab2 = new JButton("Лабораторная работа 2");
        JButton lab3 = new JButton("Лабораторная работа 3");
        JButton lab4 = new JButton("Лабораторная работа 4");
        JButton lab5 = new JButton("Лабораторная работа 5");
        JButton lab6 = new JButton("Лабораторная работа 6");
        JButton backButton = new JButton("<");

        lab1.addActionListener(e -> {
            new lab1();
            dispose();
        });

        lab2.addActionListener(e -> {
            new lab2();
            dispose();
        });

        lab3.addActionListener(e -> {
            new lab3();
            dispose();
        });

        lab4.addActionListener(e -> {
            new lab4();
            dispose();
        });

        lab5.addActionListener(e -> {
            new lab5();
            dispose();
        });

        lab6.addActionListener(e -> {
            new lab6();
            dispose();
        });

        backButton.addActionListener(e -> {
            new UserFrame();
            dispose();
        });

        JPanel panel = new JPanel();
        add(panel);
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(lab1);
        panel.add(lab2);
        panel.add(lab3);
        panel.add(lab4);
        panel.add(lab5);
        panel.add(lab6);
        setVisible(true);
    }
}

class lab1 extends JFrame{
    public lab1(){
        setTitle("Информатика ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 1");
        JLabel bag1 = new JLabel("");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(bag1);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);

        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab2 extends JFrame {
    public lab2() {
        setTitle("Информатика ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 2");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);

        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab3 extends JFrame {
    public lab3() {
        setTitle("Информатика ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 3");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);

        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab4 extends JFrame {
    public lab4() {
        setTitle("Информатика ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 4");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);

        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab5 extends JFrame {
    public lab5() {
        setTitle("Информатика ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 5");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);

        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab6 extends JFrame {
    public lab6() {
        setTitle("Информатика ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 6");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new INFPIiKT();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);

        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}