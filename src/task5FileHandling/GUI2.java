package task5FileHandling;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class GUI2 {
  public static void main(String... args) {
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextArea tarea = new JTextArea(10, 10);

    JButton readButton = new JButton("OPEN FILE");
    readButton.addActionListener(ev -> {
 
        try {
          BufferedReader input = new BufferedReader(new InputStreamReader(
              new FileInputStream("data/Task5.txt")));
          tarea.read(input, "READING FILE :-)");
        } catch (Exception e) {
          e.printStackTrace();
        }
      
    });

    frame.getContentPane().add(tarea, BorderLayout.CENTER);
    frame.getContentPane().add(readButton, BorderLayout.PAGE_END);
    frame.pack();
    frame.setVisible(true);
  }
}