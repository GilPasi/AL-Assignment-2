package runner;

import  answers.*;
public class Runner {
	public static void main ( String [] args ) {
//		String path = Algorithms.findHeightsSequence(10, 2 ,4 );
//		System.out.println(path);
//		Algorithms.dropSpaceVehicle(4, 200);
		
		int[][][] grid = {
				
				{{1,2,3,4},
				{4,5,6,5},
				{1,2,3,6},
				{1,2,3,6}},
				
				{{1,2,3,4},
				{4,5,6,5},
				{16,17,18,6},
				{16,17,18,6}},
					
				{{1,2,3,7},
				{22,5,6,5},
				{1,2,3,4},
				{25,26,27,9},},
				
				{{4,5,6,7},
				{22,5,6,5},
				{5,2,3,4},
				{25,26,27,9},}
		};		
		
		final int [][][] exampleBeast = {{{1,2,3}},{{1,2,3}}};
		final int [][][] exampleBeast2 = {{{1,2,2}},{{1,2,2}}};
		GridBeasts.print3D(grid);

		GridBeasts.findBeast(grid , 2,1,3);
		
		System.out.println(GridBeasts.foundBeasts);
		
		System.out.println(GridBeasts.findFactors(90));
		
		

	}
}
    

