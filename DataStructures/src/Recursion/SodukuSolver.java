package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SodukuSolver {
	public static void print1DArray(int[] A) {
		System.out.println();
		for (int i = 0; i < 9; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

	public static void print2DArray(int[][] A) {
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[] takeStartEndofSubGrid(int r, int c) {
		int ans[] = new int[4];
		int sRSubGrid = 0;
		int lRSubGrid = 0;
		int sCSubGrid = 0;
		int lCSubGrid = 0;
		if (r > -1 && r < 3) {
			sRSubGrid = 0;
			lRSubGrid = 3;
			if (c > -1 && c < 3) {
				sCSubGrid = 0;
				lCSubGrid = 3;
			}
			if (c > 2 && c < 6) {
				sCSubGrid = 3;
				lCSubGrid = 6;
			}
			if (c > 5 && c < 9) {
				sCSubGrid = 6;
				lCSubGrid = 9;
			}
		}
		if (r > 2 && r < 6) {
			sRSubGrid = 3;
			lRSubGrid = 6;
			if (c > -1 && c < 3) {
				sCSubGrid = 0;
				lCSubGrid = 3;
			}
			if (c > 2 && c < 6) {
				sCSubGrid = 3;
				lCSubGrid = 6;
			}
			if (c > 5 && c < 9) {
				sCSubGrid = 6;
				lCSubGrid = 9;
			}
		}
		if (r > 5 && r < 9) {
			sRSubGrid = 6;
			lRSubGrid = 9;
			if (c > -1 && c < 3) {
				sCSubGrid = 0;
				lCSubGrid = 3;
			}
			if (c > 2 && c < 6) {
				sCSubGrid = 3;
				lCSubGrid = 6;
			}
			if (c > 5 && c < 9) {
				sCSubGrid = 6;
				lCSubGrid = 9;
			}
		}
		ans[0] = sRSubGrid;
		ans[1] = lRSubGrid;
		ans[2] = sCSubGrid;
		ans[3] = lCSubGrid;
		return ans;
	}

	public static ArrayList<Integer> takeAllPossibleNumbersforVacentBox(int r, int c, int[][] GRID) {
		int[][] subGrid = new int[3][3];
		int[] Allnumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		ArrayList<Integer> possibleNumbers = new ArrayList<Integer>();
		int sRSubGrid = 0;
		int lRSubGrid = 0;
		int sCSubGrid = 0;
		int lCSubGrid = 0;
		TreeSet<Integer> possibleNumberstoFill = new TreeSet<Integer>();
		for (int i = 0; i < r; i++) {
//			System.out.print(GRID[i][c]+ " ");
			if (GRID[i][c] != 0)
				possibleNumberstoFill.add(GRID[i][c]);
		}
//		System.out.print(" %% ");
		for (int i = r + 1; i < 9; i++) {
//			System.out.print(GRID[i][c]+ " ");
			if (GRID[i][c] != 0)
				possibleNumberstoFill.add(GRID[i][c]);
		}
//		System.out.println("\nAfter Row...");
//		System.out.println(possibleNumberstoFill);
//		System.out.println();
		for (int i = 0; i < c; i++) {
//			System.out.print(GRID[r][i] + " ");
			if (GRID[r][i] != 0)
				possibleNumberstoFill.add(GRID[r][i]);
		}
//		System.out.print(" $$ ");
		for (int i = c + 1; i < 9; i++) {
//			System.out.print(GRID[r][i] + " ");
			if (GRID[r][i] != 0)
				possibleNumberstoFill.add(GRID[r][i]);
		}
//		System.out.println("\nAfter Column....");
//		System.out.println(possibleNumberstoFill);
		int ans[] = takeStartEndofSubGrid(r, c);
		sRSubGrid = ans[0];
		lRSubGrid = ans[1];
		sCSubGrid = ans[2];
		lCSubGrid = ans[3];
//		System.out.println("Sub Grid...");
		for (int i = sRSubGrid; i < lRSubGrid; i++) {
			for (int j = sCSubGrid; j < lCSubGrid; j++) {
//        		if(GRID[i][j]!=0)
//        		possibleNumberstoFill.add(GRID[i][j]);
//        		System.out.print(GRID[i][j]+ " ");
			}
//        	System.out.println();
		}
		for (int i = sRSubGrid; i < lRSubGrid; i++) {
			for (int j = sCSubGrid; j < lCSubGrid; j++) {
				if (GRID[i][j] != 0)
					possibleNumberstoFill.add(GRID[i][j]);
			}
		}
//        System.out.println(possibleNumberstoFill);
		Iterator<Integer> itr = possibleNumberstoFill.iterator();
//        print1DArray(Allnumbers);
//
		while (itr.hasNext()) {
			Numbers.add(itr.next());
		}
//        System.out.println(Numbers);
//		for (int i = 0; i < Numbers.size() - 1; i++) {
////        	System.out.println(Numbers.get(i));
//			if (Numbers.get(i + 1) - Numbers.get(i) > 0) {
//				for (int j = Numbers.get(i) + 1; j < Numbers.get(i + 1); j++) {
//					possibleNumbers.add(j);
//				}
//			}
//		}
//        System.out.println("Possible Numbers");
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < Numbers.size(); j++) {
				if (Allnumbers[i] == Numbers.get(j)) {
					Allnumbers[i] = 0;
					break;
//					possibleNumbers.add(Allnumbers[i]);
				}
			}
 		}
//		print1DArray(Allnumbers);
		for (int i = 0; i < 9; i++) {
			if (Allnumbers[i] != 0)
				possibleNumbers.add(Allnumbers[i]);
		}
//        System.out.println(possibleNumbers);
		return possibleNumbers;

	}

	public static boolean sudokuSolver(int board[][]) {

		/*
		 * Your class should be named Solution. Don't write main() function. Don't read
		 * input, it is passed as function argument. Don't print output and return
		 * output as specified in the question.
		 */
		HashMap<String, ArrayList<Integer>> VacentwithPossibleNumber = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
//				GRID[i][j] = scanner.nextInt();
				if (board[i][j] == 0) {
//					System.out.println(board[i][j] + " row = " + i + " col = " + j);
//					System.out.println(takeAllPossibleNumbersforVacentBox(i, j, board));
					VacentwithPossibleNumber.put(Integer.toString(i)+Integer.toString(j),takeAllPossibleNumbersforVacentBox(i, j, board) );

				}

			}
		}
		System.out.println("\nWith Possible Numbers");
		System.out.println(VacentwithPossibleNumber);
		
		int[][] subGrid = new int[3][3];
		int subGridIndexingArray[][] = {
				{0,3,0,3},
				{0,3,3,6},
				{0,3,6,9},
				
				{3,6,0,3},
				{3,6,3,6},
				{3,6,6,9},
				
				{6,9,0,3},
				{6,9,3,6},
				{6,9,6,9},
		};
        for(int i=0;i<subGridIndexingArray.length;i++) {
        	int i1=0;
        	for(int j=subGridIndexingArray[i][0];j<subGridIndexingArray[i][1];j++) {
                int j1=0;
        		for(int k=subGridIndexingArray[i][2];k<subGridIndexingArray[i][3];k++) {
//                	System.out.print(board[j][k]+" ");
//                	System.out.println("i1 = "+i1+" j1 = "+j1++);
                	subGrid[i1][j1++] = board[j][k];
                }
                System.out.println();
                i1++;
                
        	}
        	print2DArray(subGrid);
        	
        	System.out.println("");
        }
//		9 0 0 0 2 0 7 5 0 
//		6 0 0 0 5 0 0 4 0 
//		0 2 0 4 0 0 0 1 0 
//		2 0 8 0 0 0 0 0 0 
//		0 7 0 5 0 9 0 6 0 
//		0 0 0 0 0 0 4 0 1 
//		0 1 0 0 0 5 0 8 0 
//		0 9 0 0 7 0 0 0 4 
//		0 8 2 0 4 0 0 0 6

//		3 0 6 5 0 8 4 0 0 
//		5 2 0 0 0 0 0 0 0 
//		0 8 7 0 0 0 0 3 1 
//		0 0 3 0 1 0 0 8 0 
//		9 0 0 8 6 3 0 0 5 
//		0 5 0 0 9 0 6 0 0 
//		1 3 0 0 0 0 2 5 0 
//		0 0 0 0 0 0 0 7 4 
//		0 0 5 2 0 6 3 0 0 

//		print2DArray(board);
//		int indexRnumber = 0;
//		int indexCnumber = 1;
//
//		takeAllPossibleNumbersforVacentBox(indexRnumber, indexCnumber, board);

		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] GRID = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				GRID[i][j] = scanner.nextInt();
			}
		}
		sudokuSolver(GRID);
		scanner.close();
	}
}
