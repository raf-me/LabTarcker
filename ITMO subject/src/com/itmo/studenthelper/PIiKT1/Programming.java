package com.itmo.studenthelper.PIiKT1;
//import com.itmo.studenthelper.main.proga3-4VT;
import com.itmo.studenthelper.UserFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import static javax.swing.SwingConstants.TOP;


public class Programming extends JFrame {
    public Programming() {
        setTitle("ФПИиКТ");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Программирование 1 курс");
        JButton lab1 = new JButton("Лабораторная работа 1");
        JButton lab2 = new JButton("Лабораторная работа 2");
        JButton lab3 = new JButton("Лабораторная работа 3-4");
        JButton lab5 = new JButton("ЛР5");
        JButton lab6 = new JButton("ЛР6");
        JButton lab7 = new JButton("ЛР7");
        JButton test = new JButton("Test");
        JButton backButton = new JButton("<");


        // Возвращение в UserFrame
        lab1.addActionListener(e -> {
            new lab1();
            dispose();
        });

        lab2.addActionListener(e -> {
            new lab2();
            dispose();
        });

        lab3.addActionListener(e -> {
            try {
                new lab3();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            dispose();
        });

        backButton.addActionListener(e -> {
            new UserFrame();
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

        lab7.addActionListener(e -> {
            new lab7();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(backButton);
        panel.add(label);
        panel.add(label);
        panel.add(lab1);
        panel.add(lab2);
        panel.add(lab3);
        panel.add(lab5);
        panel.add(lab6);
        panel.add(lab7);
        panel.add(test);
        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 25));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab1 extends JFrame {
    public lab1() {
        setTitle("Программирование 1 курс");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextField label = new JTextField("Лабораторная работа 1");
        JTextField task1 = new JTextField("Ваш вариант выдан практиком (или лектором)");
        JTextField task2 = new JTextField("Лабораторная работа находится в PDF-файле");
        //JEditorPane task0 = new JEditorPane("");
        JTextField task3 = new JTextField("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new Programming();
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

class lab2 extends JFrame {
    public lab2() {
        setTitle("Программирование 1 курс");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Лабораторная работа 2");
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("Назад в окно пользователя");

        backButton.addActionListener(e -> {
            new Programming();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(task1);
        panel.add(task2);
        panel.add(task3);
        panel.add(backButton);
        add(panel);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab3 extends JFrame {
    public lab3() throws IOException {
        setTitle("Программирование 1 курс");
        setSize(720, 800);

        JLabel label = new JLabel("Лабораторная работа 3-4");
        JTextArea enter1 = new JTextArea("\nddd");
        enter1.setLineWrap(true);
        JTextField textTask1 = new JTextField(15);
        JLabel task1 = new JLabel("Ваш вариант выдан практиком (или лектором)");
        JTextArea enter2 = new JTextArea("   \n");
        enter2.setLineWrap(true);
        JLabel task2 = new JLabel("Лабораторная работа находится в PDF-файле");
        JTextArea enter3 = new JTextArea("\n");
        JLabel task3 = new JLabel("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JTextArea enter4 = new JTextArea("\n");
        JButton backButton = new JButton("Назад в окно пользователя");
        JLabel pdf = new JLabel("Лабораторная работа 3-4:");

        label.setFont(new Font("Arial", Font.PLAIN, 25));
        task1.setFont(new Font("Arial", Font.PLAIN, 17));
        task2.setFont(new Font("Arial", Font.PLAIN, 17));
        task3.setFont(new Font("Arial", Font.PLAIN, 17));
        pdf.setFont(new Font("Arial", Font.PLAIN, 13));

        backButton.addActionListener(e -> {
            new Programming();
            dispose();
        });

        backButton.addActionListener(e -> {
            new Programming();
            dispose();
        });

        JLabel number = new JLabel("Ваш вариант: ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(enter1);
        panel.add(task1);
        panel.add(enter2);
        panel.add(task2);
        panel.add(task3);
        panel.add(task3);
        panel.add(enter4);
        panel.add(number);
        panel.add(textTask1);
        panel.add(pdf);
        panel.add(backButton);
        add(panel);

        backButton.setFont(new Font("Arial", Font.PLAIN, 25));
        setVisible(true);
    }
}

class lab5 extends JFrame {
    private JTextField variantField;
    private JTextArea commentArea;
    private JTextField gradeField;
    private JLabel fileLabel;
    private static final String SAVE_FILE = "labdata.ser";
    private HashMap<String, String> data = new HashMap<>();

    public lab5() {
        setTitle("Программирование 1 курс ПИиКТ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(980, 850);
        setLayout(new BorderLayout());

        // Основная панель
        JPanel mainPanel = new JPanel(new GridBagLayout());

        /*JLabel label = new JLabel("Лабораторная работа 5");
        label.setBounds(10, 10, 280, 20);
        mainPanel.add(label);
*/
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 1;

        JButton backButton = new JButton("<");
        backButton.addActionListener(e -> {
            new Programming();
            dispose();
        });
        backButton.setPreferredSize(new Dimension(60, 20));
        mainPanel.add(backButton, gbc);

        // Инструкции
        gbc.gridx = 1; gbc.gridy = 0;
        gbc.gridwidth = 1;
        JLabel lab = new JLabel("Лабораторная работа 5");
        lab.setFont(new Font("SansSerif", Font.BOLD, 20));
        lab.setSize(25, 25);
        mainPanel.add(lab, gbc);

        gbc.gridx = 1; gbc.gridy = 1;
        gbc.gridwidth = 1;

        JTextArea instructionArea = new JTextArea(
                "Ваш вариант выдан практиком или лектором. В случае, если выдача работы не подразумевает сдачу предыдущей, эта ячейка может быть пустой.\n" +
                "Вариант: (Ячейка для ввода значения, оно должно сохраняться при выходе из программы)\n" +
                "Лабораторная работа находится в PDF-файле (Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).\n\n" +
                        "Обязательно:\n" +
                        "1. Внимательно ознакомьтесь с требованиями работы.\n" +
                        "2. Вы должны выполнить лабораторную работу согласно всем требованиям.\n" +
                        "3. В день практики вы должны прийти на занятие и защитить свою работу.\n" +
                        "4. В случае, если практик намеренно не даёт сдать работу, напишите своему лектору.\n" +
                        "5. Самое главное – не сдавайтесь и пробуйте снова и снова, пока не достигните результата.\n" +
                        "В таком случае вы получите дополнительные дни сдачи как во время сессии, так и в семестре.\n" +
                        "6. Получить итоговый балл и прикрепить отчёт.\n" +
                "Удачи!"
        );

        instructionArea.setPreferredSize(new Dimension(410, 430));

        instructionArea.setWrapStyleWord(true);
        instructionArea.setLineWrap(true);
        instructionArea.setEditable(false);
        instructionArea.setBackground(new Color(247, 248, 247, 183));
        instructionArea.setBorder(BorderFactory.createTitledBorder("Инструкция"));
        mainPanel.add(new JScrollPane(instructionArea), gbc);

        /*Font titleFont = new Font("SansSerif", Font.BOLD, 22);
        Font labelFont = new Font("SansSerif", Font.BOLD, 16);
        Font fieldFont = new Font("SansSerif", Font.PLAIN, 16);
        Font buttonFont = new Font("SansSerif", Font.BOLD, 16);
        */
        // Вариант
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        //JLabel task1 = new JLabel("Вариант:");
        Font task1 = new Font("SansSerif", Font.PLAIN, 10);
        //mainPanel.add(new JLabel("Вариант:"), gbc);
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        variantField = new JTextField(16);


        // Ссылка
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        JLabel linkLabel = new JLabel("<html><a href=''>Ссылка на лабораторную работу</a></html>");
        linkLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        linkLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new java.net.URI("https://se.ifmo.ru/courses/programming#:~:text=Лабораторная%20работа%20%233-4"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        variantField = new JTextField(10);
        mainPanel.add(new JLabel("Вариант:"), gbc);
        gbc.gridx = 1;
        mainPanel.add(variantField, gbc);
        mainPanel.add(linkLabel, gbc);

        // Прикрепление отчета
        gbc.gridy++;
        JButton attachButton = new JButton("Прикрепить отчет");
        fileLabel = new JLabel("Файл не выбран");
        attachButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selected = fileChooser.getSelectedFile();
                fileLabel.setText(selected.getName());
                data.put("filePath", selected.getAbsolutePath());
            }
        });
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        mainPanel.add(attachButton, gbc);
        gbc.gridx = 1;
        mainPanel.add(fileLabel, gbc);

        // Комментарии
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 4;
        mainPanel.add(new JLabel("Комментарии к работе:"), gbc);
        gbc.gridy++;
        commentArea = new JTextArea(5, 50);
        commentArea.setLineWrap(true);
        commentArea.setWrapStyleWord(true);
        mainPanel.add(new JScrollPane(commentArea), gbc);

        // Балл
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        mainPanel.add(new JLabel("Балл:"), gbc);
        gradeField = new JTextField(5);
        gbc.gridx = 1;
        mainPanel.add(gradeField, gbc);

        // Кнопка сохранения
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        JButton saveButton = new JButton("Сохранить");
        saveButton.addActionListener(e -> saveData());
        mainPanel.add(saveButton, gbc);

        add(mainPanel, BorderLayout.CENTER);
        loadData();
        setVisible(true);
    }

    private void saveData() {
        data.put("variant", variantField.getText());
        data.put("comments", commentArea.getText());
        data.put("grade", gradeField.getText());

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(SAVE_FILE))) {
            out.writeObject(data);
            JOptionPane.showMessageDialog(this, "Данные сохранены!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(SAVE_FILE))) {
            data = (HashMap<String, String>) in.readObject();
            variantField.setText(data.getOrDefault("variant", ""));
            commentArea.setText(data.getOrDefault("comments", ""));
            gradeField.setText(data.getOrDefault("grade", ""));
            fileLabel.setText(new File(data.getOrDefault("filePath", "")).getName());
        } catch (IOException | ClassNotFoundException e) {
            // Ignore if no saved data
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(lab5::new);
    }
}

class lab6 extends JFrame{
    private JTextField variantField;
    private JTextArea commentArea;
    private JTextField gradeField;
    private JLabel fileLabel;
    private static final String SAVE_FILE = "labdata.ser";
    private HashMap<String, String> data = new HashMap<>();

    public lab6() {
        setTitle("программирование");
        setSize(980, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        //gbc.insets = new Insets(5, 5, 5, 5);
        //gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel mainPanel = new JPanel();

        JButton backButton = new JButton("<");
        backButton.addActionListener(e -> {
            new Programming();
            dispose();
        });
        mainPanel.add(backButton);

        //gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 1;
        JTextField label = new JTextField("Лабораторная работа 6");
        label.setFont(new Font("SansSerif", Font.BOLD, 20));

        mainPanel.add(label);

        //gbc.gridy = 1; gbc.gridx = 1; gbc.gridwidth = 2;

        JTextArea instructionArea = new JTextArea(
                "Ваш вариант выдан практиком или лектором. В случае, если выдача работы не подразумевает сдачу предыдущей, эта ячейка может быть пустой.\n" +
                "Вариант: (Ячейка для ввода значения, оно должно сохраняться при выходе из программы)\n" +
                "Лабораторная работа находится в PDF-файле (Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).\n\n" +
                "Обязательно:\n" +
                        "1. Внимательно ознакомьтесь с требованиями работы.\n" +
                        "2. Вы должны выполнить лабораторную работу согласно всем требованиям.\n" +
                        "3. В день практики вы должны прийти на занятие и защитить свою работу.\n" +
                        "4. В случае, если практик намеренно не даёт сдать работу, напишите своему лектору.\n" +
                        "5. Самое главное – не сдавайтесь и пробуйте снова и снова, пока не достигните результата.\n" +
                        "В таком случае вы получите дополнительные дни сдачи как во время сессии, так и в семестре.\n" +
                        "6. Получить итоговый балл и прикрепить отчёт.\n" +
                "Удачи!"
        );

        instructionArea.setPreferredSize(new Dimension(410, 430));

        instructionArea.setWrapStyleWord(true);
        instructionArea.setLineWrap(true);
        instructionArea.setEditable(false);
        instructionArea.setBackground(new Color(241, 241, 241, 183));
        instructionArea.setBorder(BorderFactory.createTitledBorder("Инструкция"));

        mainPanel.add(instructionArea);
        setVisible(true);
    }
}

class lab7 extends JFrame {
    public lab7() {
        setTitle("Программирование 1 курс");
        setSize(720, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTextField label = new JTextField("Лабораторная работа 1");
        JTextField task1 = new JTextField("Ваш вариант выдан практиком (или лектором)");
        JTextField task2 = new JTextField("Лабораторная работа находится в PDF-файле");
        //JEditorPane task0 = new JEditorPane("");
        JTextField task3 = new JTextField("(Для кафедры ВТ: Варианты лабораторных работ находятся на se.ifmo).");
        JButton backButton = new JButton("<");

        backButton.addActionListener(e -> {
            new Programming();
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