/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package roboMove;

import java.util.Random;

public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

        int[][] theGrid = new int[10][10];

        //Creating the Grid
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                theGrid[i][j] = 0;
            }
        }

        //Creating the Blocks
        int counter = 0;
        while (counter < 1) {
            Random rand = new Random();
            for (int i = 1; i < 10; i++) {
                theGrid[rand.nextInt(8)][i] = 1;
                counter++;
            }
        }
        //Printing the Grid to see
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (theGrid[i][j] == 1) {
                    System.out.print(ANSI_YELLOW + theGrid[i][j] + "   " + ANSI_RESET);
                } else
                    System.out.print(theGrid[i][j] + "   ");
            }
            System.out.println("\n");
        }

        String move = "";
        int sum = 0;
        int row = 0;
        int col = 0;

        //Move Function

        while (sum < 18) {

            if (theGrid[row][col] == 0 && col<9 && theGrid[row][col+1]==0 ) {
                    move = move + "R ";
                    if (col < 10) col++; else row++;
                    sum = row + col;
                    System.out.println(row + " " + col + " " + sum);
                    System.out.println(move);

                } else if (theGrid[row][col] == 0 && row<9 && theGrid[row+1][col]==0) {
                    move = move + "D ";
                    if (row < 10) row++; else col++;
                    sum = row + col;
                    System.out.println(row + " " + col + " " + sum);
                    System.out.println(move);

            } else if (theGrid[row][col] == 0 && row<9 && theGrid[row+1][col]==1){
                if (row < 10) row--; else col--;
                sum = sum - 1;

            }
            }
        }
    }

