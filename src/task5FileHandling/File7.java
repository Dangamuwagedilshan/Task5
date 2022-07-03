package task5FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Optional;

public class File7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new FileReader("data/Task5.txt"));
		Optional<String> result = r.lines().reduce((left,right)->left.concat(" ".concat(right)));
		
		if(result.isPresent()) {
			System.out.println("The result is "+result.get());
		}else {
			System.out.println("Result is not present");
		}
		
		r.close();
		
	}

}
