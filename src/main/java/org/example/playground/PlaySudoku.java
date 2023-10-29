package org.example.playground;

import org.example.Bloco4Ex22;

import java.util.Arrays;
import java.util.Scanner;

public class PlaySudoku {
    public static void main(String[] args) {
        // example of execution
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };

        System.out.println("|0, 1, 2, 3, 4, 5, 6, 7, 8|");
        System.out.println("---------------------------");
        System.out.println(Arrays.deepToString(gameMatrix).replace("], ",
                "]\n").replace("[[", "[").replace("]]", "]"));

        boolean gameOver = false;

        while (!gameOver) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the row number: ");
            int rowSelected = scanner.nextInt();
            System.out.println("Please enter the column number: ");
            int columnSelected = scanner.nextInt();
            //TODO: remove this
            Bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, 0);
            System.out.println("Please enter the number: ");
            int numberSelected = scanner.nextInt();

            if (Bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected)) {
                gameMatrix = Bloco4Ex22.updateGameMatrix(gameMatrix, rowSelected, columnSelected, numberSelected);
                System.out.println("The game matrix was updated! Your choice was correct!");
            } else {
                System.out.println("The game matrix was not updated! Your choice was incorrect or the slot is already filled!");
            }

            System.out.println("The game matrix is: ");
            System.out.println("|0, 1, 2, 3, 4, 5, 6, 7, 8|");
            System.out.println("---------------------------");
            System.out.println(Arrays.deepToString(gameMatrix).replace("], ",
                    "]\n").replace("[[", "[").replace("]]", "]"));

            gameOver = Bloco4Ex22.checkGameOver(gameMatrix);

            if (gameOver) {
                System.out.println("Game Over!");
            }

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Do you want to continue? (Enter to continue/N to exit)");
            String continueGame = scanner2.nextLine();
            if (continueGame.equals("N") || continueGame.equals("n")) {
                gameOver = true;
            }
        }
    }
}
