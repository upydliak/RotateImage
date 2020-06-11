package com.ulianapydliak;

public class Main {

    /*a = [[1, 2, 3],
           [4, 5, 6],
           [7, 8, 9]]*/

    /*rotateImage(a) =
            [[7, 4, 1],
            [8, 5, 2],
            [9, 6, 3]]*/


    public static int[][] rotateImage(int[][] a) {
        int numberOfRows = a.length;
        int numberOfColumns = a[0].length;
        int newArray[][] = new int[numberOfRows][numberOfColumns];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                newArray[i][j] = a[numberOfColumns-j-1][i];
            }
        }
        return newArray;
    }
    public static void printArray(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int [][]array = { {1,2,3},
                {4,5,6},
                {7,8,9}};
        printArray(array);
        System.out.println();
        printArray(rotateImage(array));

    }

    }

