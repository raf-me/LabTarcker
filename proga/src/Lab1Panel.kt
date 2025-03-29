package org.itmo.ui

import java.awt.*
import java.io.File
import javax.swing.*
import kotlin.system.exitProcess

/**
 * ЛР #1 — отдельный класс
 */
class Lab1Panel(val onClose: ()->Unit) : JPanel() {
    init {
        layout = BorderLayout()

        val title = JLabel("Лабораторная работа #1", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 18f)
        }
        add(title, BorderLayout.NORTH)

        val textArea = JTextArea().apply {
            text = """
                Шаблон для ЛР #1
                
                - Возможность открыть PDF
                - Комментарий, балл, и т.д.
            """.trimIndent()
            isEditable = false
        }
        add(JScrollPane(textArea), BorderLayout.CENTER)

        val bottomPanel = JPanel(FlowLayout(FlowLayout.RIGHT))
        val openPdfButton = JButton("Открыть PDF").apply {
            addActionListener {
                try {
                    val pdfFile = File("src/lab1.pdf") // Путь к файлу в src
                    Desktop.getDesktop().open(pdfFile)
                } catch (ex: Exception) {
                    JOptionPane.showMessageDialog(this@Lab1Panel, "Не удалось открыть PDF: ${ex.message}")
                }
            }
        }
        bottomPanel.add(openPdfButton)

        val closeButton = JButton("Закрыть").apply {
            addActionListener {
                val parentDialog = SwingUtilities.getWindowAncestor(this@Lab1Panel) as JDialog
                parentDialog.dispose() // закрыть диалог
                onClose()
            }
        }
        bottomPanel.add(closeButton)
        add(bottomPanel, BorderLayout.SOUTH)
    }
}

/**
 * ЛР #2 — отдельный класс
 */
class Lab2Panel(val onClose: ()->Unit) : JPanel() {
    init {
        layout = BorderLayout()

        val title = JLabel("Лабораторная работа #2", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 18f)
        }
        add(title, BorderLayout.NORTH)

        val textArea = JTextArea().apply {
            text = "Шаблон для ЛР #2..."
            isEditable = false
        }
        add(JScrollPane(textArea), BorderLayout.CENTER)

        val bottomPanel = JPanel(FlowLayout(FlowLayout.RIGHT))
        val openPdfButton = JButton("Открыть PDF").apply {
            addActionListener {
                try {
                    Desktop.getDesktop().open(File("src/lab2.pdf"))
                } catch (ex: Exception) {
                    JOptionPane.showMessageDialog(this@Lab2Panel, "Ошибка: ${ex.message}")
                }
            }
        }
        bottomPanel.add(openPdfButton)

        val closeButton = JButton("Закрыть").apply {
            addActionListener {
                (SwingUtilities.getWindowAncestor(this@Lab2Panel) as JDialog).dispose()
                onClose()
            }
        }
        bottomPanel.add(closeButton)
        add(bottomPanel, BorderLayout.SOUTH)
    }
}

/**
 * Обобщённая панель для ЛР #N (3..7), чтобы не плодить много файлов,
 * но по условию можно создать отдельные Lab3Panel, Lab4Panel...
 */
class LabPanel(val labNumber: Int, val onClose: ()->Unit) : JPanel() {
    init {
        layout = BorderLayout()
        val title = JLabel("Лабораторная работа #$labNumber", SwingConstants.CENTER).apply {
            font = font.deriveFont(Font.BOLD, 18f)
        }
        add(title, BorderLayout.NORTH)

        val textArea = JTextArea().apply {
            text = "Шаблон для ЛР #$labNumber...\n(тут можно вставить данные из PDF)"
            isEditable = false
        }
        add(JScrollPane(textArea), BorderLayout.CENTER)

        val bottomPanel = JPanel(FlowLayout(FlowLayout.RIGHT))
        val openPdfButton = JButton("Открыть PDF").apply {
            addActionListener {
                try {
                    Desktop.getDesktop().open(File("src/lab$labNumber.pdf"))
                } catch (ex: Exception) {
                    JOptionPane.showMessageDialog(this@LabPanel, "Ошибка: ${ex.message}")
                }
            }
        }
        bottomPanel.add(openPdfButton)

        val closeButton = JButton("Закрыть").apply {
            addActionListener {
                (SwingUtilities.getWindowAncestor(this@LabPanel) as JDialog).dispose()
                onClose()
            }
        }
        bottomPanel.add(closeButton)
        add(bottomPanel, BorderLayout.SOUTH)
    }
}
