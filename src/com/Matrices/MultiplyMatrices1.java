package com.Matrices;

public class MultiplyMatrices1 {

		public static void main(String[] args) {
			int r1 = 2, c1 = 3;
			int r2 = 3, c2 = 2;

			int[][] firstMatrix = { { 4, -2, 5 }, { 6, 0, 4 } };
			int[][] secondMatrix = { { 4, 3 }, { 2, 0 }, { 8, 4 } };

			int[][] product = multiplyMatrices1(firstMatrix, secondMatrix, r1, c1, c2);
			//method to to matrix multiplication
			displayProduct(product); //display matrix
		}

		public static int[][] multiplyMatrices1(int[][] firstMatrix, int[][] secondMatrix, int r1, int c1, int c2) {
			int[][] product = new int[r1][c2];//resultant matrix
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					for (int k = 0; k < c1; k++) {
						product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
					}
				}
			}
			return product;
		}

		public static void displayProduct(int[][] product) {
			System.out.println("Product of two matrices is: ");
			for (int[] row : product) {
				for (int column : row) {
					System.out.print(column + "    ");
				}
				System.out.println();
			}
		}
}
		
	