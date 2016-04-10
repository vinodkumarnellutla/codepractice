import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0 
public class MatrixSetZero {
	public static void MatrixZero(int[][]matrix){
		int row[]=new int[matrix.length];
		System.out.println(matrix.length);
		int[] column=new int[matrix[0].length];
		System.out.println(matrix[0].length);
		for(int i=0;i<matrix.length;i++)
		{
		for (int j = 0; j <matrix[0].length; j++) {
			if(matrix[i][j]==0)
			{
				row[i]=1;
				column[j]=1;
			}
		}	
			
			
		}
		for(int i=0;i<matrix.length;i++)
		{
		for (int j = 0; j <matrix[0].length; j++) {
			if(row[i]==1|column[j]==1)
			{
				matrix[i][j]=0;
				System.out.println(matrix[i][j]);
			}
		}
		}
	}
	
	public static void main(String[] args) {
		int[][] matrix=new int[][]{{4,6},{8,1}};
		
		 MatrixZero(matrix);
	
		  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("insert elements in to matrix");
		
				
			}
		
	}
	

