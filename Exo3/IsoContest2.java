package Exo3;
import java.util.*;

import Exo3.IsoContest.Tuple;

public class IsoContest2 {

	public static void main(String[] args) {
		String  line;
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int n = Integer.parseInt(N);

		String[][] grid = new String[n][n];

		for(int i = 0; i < n; i++){
			line = sc.nextLine();
			String[] arr = line.split("");
			for(int j=0; j<n; j++){
				grid[i][j] = arr[j];
			}
		}

		Tuple t;
		int cultivables = 0;
		for(int i = 0; i < n; i++){
			for(int j=0; j<n; j++){
				if(grid[i][j].equals("X"))
					continue;

				if(isCultuvable(grid, i, j, n))
					cultivables++;
			}
		}

		System.out.println(cultivables);
	}

	public static boolean isCultuvable(String[][] grid, int i, int j, int n) {

		int[] rows = new int[]{i-1, i, i+1};
		int[] cols = new int[]{j-1, j, j+1};

		for(int row: rows){
			for(int col: cols){
				if(row == col)
					continue;
				if(isPossible(row,col, n)){
					if(grid[row][col].equals("X")){
						return true;
					}
				}
			}
		}

		return false;
	}

	public static boolean isPossible(int i, int j, int n) {
		if(i < 0 || i >= n)
			return false;
		if(j < 0 || j >= n)
			return false;
		return true;
	}


}
