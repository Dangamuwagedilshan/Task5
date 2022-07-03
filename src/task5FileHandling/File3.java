package task5FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new FileReader("data/Task5.txt"));
		
		r.lines().filter(l->l.contains("http")).forEach(l-> System.out.println(l));	
		
		r.close();
	}

}
