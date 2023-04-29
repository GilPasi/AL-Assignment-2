package runner;

import  answers.*;
public class Runner {
	public static void main ( String [] args ) {
		//Task 1 - space-vehicle drops
		SpaceVehicleDrop.heightSequence(100, 3 , 90);
		
		
		
		
		//Task 3 - grid beasts
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
		GridBeasts.print3D(grid);
		GridBeasts.findAllBeasts(3, grid);
			
	}
}
    

