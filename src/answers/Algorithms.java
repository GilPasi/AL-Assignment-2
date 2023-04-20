package answers;

public class Algorithms {
	
	public static void dropSpaceVehicle(int x , int h) {//h = height , x = tries
		int [][] table = new int[x][h];
		
		//In java a table is initialized with all cells contain 0 
		//Therefore there is only a need to reset the first line (one try line)
		for(int i = 0 ; i < table.length; i++)table[0][i]=i; 
		printArray(table);
		
		final int ROW = 1;
		
		for(int i = 1; i < table.length; i++) {
			
		}
	}
	
	private static void printArray (int [][] array) {
		for(int i = 0 ; i < array.length; i++) {
			for(int j = 0; j < array[0].length ; j ++)
				System.out.print(array [i][j] + "\t");
			
			System.out.println();
		}
	}
	
	
	public static int max(Integer... vals) {
	    return Collections.max(Arrays.asList(vals)); 
	}
}
