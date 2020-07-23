package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter with lines` number of matrix: ");
		int M = sc.nextInt();
		
		System.out.print("Enter with colunms` number of matrix: ");
		int N = sc.nextInt();
		
		int mat[][] = new int[M][N];
		
		System.out.println("Enter with matrix`s values:");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter with a value: " );
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == x){
					System.out.println("Position " + i + ", " + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j > mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if(i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}	
				}
			}
		}
		

		
		sc.close();
	}

}
