package com.ua.behavioural.memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MementoMain extends JFrame {
    public static void main(String[] args) {
        new MementoMain();
    }

    private JButton saveButton, undoButton, redoButton;
    private JTextArea article = new JTextArea(20, 30);
    Handler handler = new Handler();
    Originator originator = new Originator();
    int saveFiles = 0, currentArticle = 0;

    public MementoMain() {
        this.setSize(450, 550);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Article"));
        panel1.add(article);
        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);
        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);
        redoButton = new JButton("ReDo");
        redoButton.addActionListener(redoListener);
        panel1.add(saveButton);
        panel1.add(undoButton);
        panel1.add(redoButton);
        this.add(panel1);
        this.setVisible(true);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == saveButton) {
                String textInTextArea = article.getText();
                originator.setArticle(textInTextArea);
                handler.addMemento(originator.storeInMemento());
                saveFiles++;
                currentArticle++;
                System.out.println("Saved Files : " + saveFiles);
                undoButton.setEnabled(true);
            } else if (e.getSource() == undoButton) {
                if (currentArticle >= 1) {
                    currentArticle--;
                    String textBoxArticle = originator.restoreFromMemento(handler.getMemento(currentArticle));
                    article.setText(textBoxArticle);
                    redoButton.setEnabled(true);
                } else {
                    undoButton.setEnabled(false);
                }
            } else if (e.getSource() == redoButton) {
                if ((saveFiles - 1) > currentArticle) {
                    currentArticle++;
                    String textBoxArticle = originator.restoreFromMemento(handler.getMemento(currentArticle));
                    article.setText(textBoxArticle);
                    undoButton.setEnabled(true);
                } else {
                    redoButton.setEnabled(false);
                }
            }
        }
    }
}

