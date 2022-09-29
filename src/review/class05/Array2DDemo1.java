package review.class05;

public class Array2DDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] individualsInRoom1 = new String[] {"Sabah", "Shah", "David"};
		String[] individualsInRoom2 = new String[] {"Eric", "Mina", "Asghar"};
		String[] individualsInRoom3 = new String[] {"Cassandra", "Fraidoon", "Ali"};
		// a 2D array that will store 3 single d arrays  
		String[][] rooms= new String[3][];
		rooms[0]= individualsInRoom1;
		rooms[1]= individualsInRoom2;
		rooms[2]= individualsInRoom3;
		
		System.out.println(rooms[1][1]);
		
		
	}

}
