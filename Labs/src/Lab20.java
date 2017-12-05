import java.util.Scanner; // import the scanner

/**
 * For this assignment you will be finishing a tic-tac-toe program. Download the
 * attached source code and implement the checkWinner() method based on the
 * javadoc documentation.
 * 
 * November 12, 2015
 * 
 * @author Jonathan Winters
 *
 */
public class Lab20 {

	public static final int EMPTY = 0;
	public static final int X = 1;
	public static final int Y = 2;

	/**
	 * Entry point for program
	 * 
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {

		// 2d array to represent the tic tac toe board
		int[][] board = { { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY }, { EMPTY, EMPTY, EMPTY } };

		int count = 0;

		while (!checkWinner(board)) {
			printBoard(board);

			if (count % 2 == 0) {
				System.out.println("X's turn");
				move(X, board);
			} else {
				System.out.println("Y's turn");
				move(Y, board);
			}

			System.out.println();
			count++;
		}

	}

	/**
	 * Check the board for a winner vertically, horizontally, and diagonally.
	 * 
	 * @param board
	 *            2-D array that represents the tic-tac-toe board
	 * @return true if there is a winner or all positions are taken; otherwise
	 *         false
	 */
	public static boolean checkWinner(int[][] board) {
		// put your code here

		// check all rows to see if any three have "X" in them
		if (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		} else if (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		} else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		}
		// check all columns to see if any three have "X" in them
		if (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		} else if (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		} else if (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		}
		// check to see if there are any three X's forming a diagonal
		if (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		} else if (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) {
			printBoard(board);
			System.out.println("X is the winner!");
			return true;
		}

		// check all rows to see if any three have "Y" in them
		if (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		} else if (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		} else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		}
		// check all columns to see if any three have "Y" in them
		if (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		} else if (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		} else if (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		}
		// check to see if there are any 3 Y's forming a diagonal
		if (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		} else if (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) {
			printBoard(board);
			System.out.println("Y is the winner!");
			return true;
		}
		// check to see if there are any spots left on the board for someone to be able to win
		while (board[0][0] != 0 && board[1][0] != 0 && board[2][0] != 0 && board[0][1] != 0 && board[1][1] != 0
				&& board[2][1] != 0 && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0) {
			printBoard(board);
			System.out.println("It's a draw!");
			return true;
		}
		return false;
	}

	/**
	 * Prints out the tic tac toe board to the console.
	 * 
	 * @param board
	 *            2-D array that represents the tic-tac-toe board
	 */
	public static void printBoard(int[][] board) {
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == Lab20.X) {
					System.out.print("X");
				} else if (board[i][j] == Lab20.Y) {
					System.out.print("Y");
				} else {
					System.out.print("-");
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

	/**
	 * Prompt the user for a position to move to
	 * 
	 * @param player
	 *            the id of the player
	 * @param board
	 *            2-D array that represents the tic-tac-toe board
	 */
	public static void move(int player, int[][] board) {
		Scanner myScan = new Scanner(System.in);
		int x = -1;
		int y = -1;
		boolean repeat = false;
		do {
			if (repeat)
				System.out.println("Invalid move!  Try again...");

			System.out.print("Row: ");
			x = myScan.nextInt();
			System.out.print("Column: ");
			y = myScan.nextInt();
			repeat = true;
		} while (board[x][y] != 0);
		board[x][y] = player;
		myScan.close();
	}
}
