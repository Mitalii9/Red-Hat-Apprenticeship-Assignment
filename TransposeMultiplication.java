package com.company;

import java.util.Scanner;

public class TransposeMultiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        //taking input of size of matrices
        System.out.println("Enter the size of matrices:");
        int n=sc.nextInt();
        int[][] mat1=new int[n][n];
        int[][] mat2= new int[n][n];

        //taking input of first matrix
        System.out.println("Enter first matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }

        //taking input of second matrix
        System.out.println("Enter second matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat2[i][j]=sc.nextInt();
            }
        }

        //function call to convert the matrices into it's transpose
        transpose(mat1,n);
        transpose(mat2,n);

        //function call to multiply two matrices
        multiply(mat1,mat2,n);
    }

    //function to convert the matrix into it's transpose(in-place using swapping)
    public static void transpose(int mat[][],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    //function to multiply two matrix,here transposed matrices are passed.
    public static void multiply(int mat1[][],int mat2[][],int n){
        //matrix to store the product of matrices
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        display(res,n);
    }

    //function to print the matrix
    public static void display(int mat[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}

//Time Complexity: O(n^3)
//Space Complexity:O(n)
