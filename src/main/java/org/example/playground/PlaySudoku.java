package org.example.playground;

import org.example.Bloco4Ex22;

import java.util.Arrays;
import java.util.Scanner;

public class PlaySudoku {
    public static void main(String[] args) {
        // example of execution
        int[][] gameMatrix = {
                {9, 4, 6, 2, 8, 7, 3, 5, 0},
                {5, 8, 3, 6, 0, 9, 7, 4, 2},
                {2, 0, 7, 5, 4, 3, 6, 9, 8},
                {8, 6, 5, 4, 3, 2, 0, 7, 9},
                {7, 2, 0, 9, 6, 5, 4, 8, 3},
                {4, 3, 9, 0, 7, 8, 5, 2, 6},
                {6, 7, 8, 3, 2, 4, 9, 0, 5},
                {3, 9, 4, 8, 5, 0, 2, 6, 7},
                {0, 5, 2, 7, 9, 6, 8, 3, 4}
        };

        System.out.println("|0, 1, 2, 3, 4, 5, 6, 7, 8|");
        System.out.println("---------------------------");
        System.out.println(Arrays.deepToString(gameMatrix).replace("], ",
                "]\n").replace("[[", "[").replace("]]", "]"));

        boolean gameOver = false;

        while (!gameOver) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the row number (\"Q\" or \"q\" to quit): ");
            String selection = scanner.nextLine();
            if (selection.equals("Q") || selection.equals("q")) gameOver = true;
            if (gameOver) break;
            int rowSelected;
            try{
                rowSelected = Integer.parseInt(selection.trim());
            } catch (NumberFormatException e) {
                System.out.println("Could not convert the provided number. Please try again.");
                rowSelected = scanner.nextInt();
            }

            System.out.println("Please enter the column number: ");
            int columnSelected = scanner.nextInt();

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
        }
    }
}
