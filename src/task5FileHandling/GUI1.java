package task5FileHandling;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI1 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JButton b = new JButton("Press Me");
		
		f.setLayout(new BorderLayout());
		f.add(b,BorderLayout.CENTER);
		
		//b.addActionListener(event->System.out.println("Button ...."+event.getActionCommand()));
		
	
		b.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream("data/Task5.txt")));
					List<String> l = r.lines().collect(Collectors.toList());
					for(String line: l) {
						System.out.println(line);
					}
					r.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		
		f.pack();
		f.setVisible(true);
		
	}
}
