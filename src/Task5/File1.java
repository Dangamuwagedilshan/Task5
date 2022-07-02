package Task5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new FileReader("data/wolf-fox.txt"));
		r.lines().forEach(l-> System.out.println(l));
	}

}
