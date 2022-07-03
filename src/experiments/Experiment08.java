package experiments;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Consumer;

public class Experiment08 {
	
	
	public void run() {
		List<Club> table = Arrays.asList(
				new Club(1, "Belfast Saints", 10, 2, 1, 15, 628, 200, 251, 85, 11, 81, 24, 56),
				new Club(2, "Tiger", 26, 56, 0, 16, 425, 454, 111, 12, 53, 91, 20, 15),
				new Club(3, "wales", 221, 16, 11, 16, 443, 251, 12, 27, 31, 40, 2, 68),
				new Club(4, "Dukes", 221, 114, 21, 47, 554, 688, 746, 100, 30, 45, 8, 28),
				new Club(5, "Exeter bricks", 12, 1, 7, 0, 223, 237, 96, 40, 45, 0, 71, 68),
				new Club(6, "Hornets", 22, 71, 12, 92, 82, 127, 665, 47, 24, 1, 0, 11),
				new Club(7, "North sea Sharks", 22, 121, 10, 101, 327, 662, 45, 32, 24, 56, 14, 54),
				new Club(8, "Suicide Squad", 22, 103, 0, 142, 784, 104, -40, 85, 40, 2, 5, 69),
				new Club(9, "Berkshire", 22, 4, 5, 36, 253, 255, -46, 753, 31, 2, 0, 48),
				new Club(10, "Norfolk Irish", 22, 40, -1, 74, 44, 78, -106, 4, 53, 44, 06, -42),
				new Club(11, "Middlesex Wolfs", 22, 31, -1, 76, 235, 665, -40, 507, 61, 44, 80, 314),
				new Club(12, "East Sussex", 22, 0, -10, 29, 23, 581, -368, 259, 107, 1, 0, -21));
		
		
		System.out.println("Serial Club Names\n.............");
		table.stream().forEach(clb -> System.out.println(clb));
		
		System.out.println("Parallel Club Names\n.............");
		table.parallelStream().forEach(clb->System.out.println(clb));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new Experiment08().run();
	}	

}
