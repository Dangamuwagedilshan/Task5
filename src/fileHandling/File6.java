package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new FileReader("data/wolf-fox.txt"));
		
		System.out.println(r.lines().reduce("",String::concat));
		
		r.close();
	}

}
