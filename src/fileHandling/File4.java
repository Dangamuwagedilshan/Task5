package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new FileReader("data/wolf-fox.txt"));
		
		r.lines()
		.map(l-> l.toUpperCase())
		.forEach(l-> System.out.println(l));	
		
		r.close();
	}

}
