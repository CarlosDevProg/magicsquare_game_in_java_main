package application;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matrix[][] = new int[4][4];
		int vetRow[] = new int[4];
		int vetCol[] = new int[4];
		int i, j, sumMd = 0, sumSd = 0;
		boolean testRow = true, testColumn = true;
		//reading and saving the values in array
		System.out.println("Type the sequence of the numbers of the magic square!!");
		   for (i = 0; i < 4; i++) {
			   for (j = 0; j < 4; j++) {
				   System.out.printf("Number in position [%d][%d] = ", i, j);
				   matrix[i][j] = sc.nextInt();
			   }
		   }
		   
		   System.out.println();
		   
		   //sum of array row
		   for (i = 0; i < 4; i++) {
			   for(j = 0; j < 4; j++) {
				   vetRow[i] += matrix[i][j];
 			   }
		   }
		   
		   //sum of array column
		   for (i = 0; i < 4; i++) {
			   for (j = 0; j < 4; j++) {
				   vetCol[j] += matrix[i][j];
			   }
		   }
		   
		   //sum of main diagonal
		   for (i = 0; i < 4; i++) {
			   for (j = 0; j < 4; j++) {
				   if (i == j) {
				     sumMd += matrix[i][j];
				   }
			   }
		   }
		   
		   //sum of secondary diagonal
		   for (i = 0; i < 4; i++) {
			   for (j = 0; j < 4; j++) {
				   if (j == (4 - 1 - i)) {
					   sumSd += matrix[i][j];
				   }
			   }
		   }
		   
		   /*Printing the results of the sums
           of each row, each column,
           of the main and secondary diagonal.
           Also here I print the original array*/
		   
		 //printing the sum of each row of the array
		 for (i = 0; i < 4; i++) {
			 System.out.printf("Sum of row [%d] = %d%n", i, vetRow[i]);
		 }
		 
		 System.out.println();
		 
		//printing the sum of each column of the array
		 for (j = 0; j < 4; j++) {
			 System.out.printf("Sum of column [%d] = %d%n", j, vetCol[j]);
		 }
		 
		 System.out.println();
		 
		//printing the sum of the main diagonal
		 System.out.printf("Sum of main diagonal = %d", sumMd);
		 
		 System.out.println();
		 
		//printing the sum of the secondary diagonal
		 System.out.printf("Sum of the secondary diagonal = %d", sumSd);
		 
		 System.out.println();
		 System.out.println();
		 
		//Test if the results is equal
		for (i = 1; i < 4; i++) {
			if (vetRow[i] != vetRow[i - 1]) {
				testRow = false;
			}
			else if (vetCol[i] != vetCol[i - 1]) {
				testColumn = false;
			}
		}
		
		if (testRow && testColumn && sumMd == sumSd && sumMd == vetRow[0]) {
			System.out.println("There is a Magic Square!! =D");
		}
		else {
			System.out.println("There isn't a Magic Square!! =(");
		}
		
		System.out.println();
		
		System.out.println("Original array: ");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println("");
		}
	
		sc.close();
	}
}