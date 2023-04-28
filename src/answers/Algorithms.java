package answers;
import java.util.*;

public class Algorithms {
	
	public static int[][] dropSpaceVehicle(int x , int h) {//h = height , x = tries
		int [][] table = new int[x][h + 1];
		
		//In java a table is initialized with all cells contain 0 
		//Therefore there is only a need to reset the first line (one try line)
		for(int i = 0 ; i < table[0].length; i++)table[0][i]=i; 
		printArray(table);			

		
		for(int r = 1 ; r < x ; r++) { //r for row 
			for(int c = 1; c < table[0].length; c++) {// c for column
				ArrayList<Integer> options = new ArrayList<>();
				
				for(int i = 0 ; i < c; i ++) 
					options.add(Math.max(table[r][i] , table[r - 1][c - i - 1]));				
				
				table[r][c] = min(options) + 1;
			}
		}
		
		printArray(table);
		return table;
	}
	
//	public static String findHeightsSequence(int h , int x , int g) {
//		String seq = "";
//		int throwCount = 1;
//		int [][] minimalThrows = dropSpaceVehicle(x, h);
//		
//		int curH = h;
//		
//		while(curH > 0) {
//			int curV = minimalThrows[x - 1][curH];
//			
//			
//			for(int i = 0 ; i < minimalThrows[0].length; i ++) {
//				
//				int worstCase = Math.max(minimalThrows[x - 1][i] , minimalThrows[x - 2][curH - i - 1]);
//				
//				if(worstCase == curV - 1) {
//					
//					seq += "Throw " + throwCount++ + ": " + (curH - i) + " meters\n";
//										
//					curH -= i;
//					break;
//				}
//			}
//			
//			if(curH > g) {
//				seq += "- a vehicle is smashed";
//				x--;
//				if(x == 1) {
//					for(int i = 0 ; i < )
//				}
//				break;
//				
//			}
//		}
//		
//		
//		
//		return seq;
//	}
	
	private static void printArray (int [][] array) {
		String delimiterUnit = "______________________________________________________________________________________________________________________________";
		String delimiter = delimiterUnit;
		for(int i = 0 ; i < array.length; i++) {
			delimiter += delimiterUnit;
			for(int j = 0; j < array[0].length ; j ++)
				System.out.print(array [i][j] + "\t");
			
			System.out.println();
		}
		System.out.println(delimiter);
	}
	
	
	public static int min(ArrayList<Integer> list) {return Collections.min(list);}
}
