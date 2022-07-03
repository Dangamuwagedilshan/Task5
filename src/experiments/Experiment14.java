package experiments;

import java.util.stream.Stream;

public class Experiment14 {

	class ClubStreamBuilder{
		public Stream<Club> build(){
			
			Stream.Builder<Club> builder = Stream.builder();
			builder.add(new Club(13, "White Dragon", 12, 22, 1, 12, 629, 201, 252, 82, 13, 84, 25, 57));
			
			return builder.build();
		}
	}
	public void run() {
		ClubStreamBuilder builder = new ClubStreamBuilder();
		Stream <Club> clubStream = builder.build();
		clubStream.forEach(n-> System.out.println(n));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new Experiment14().run();
	}
	
}
