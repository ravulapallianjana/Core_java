package consoleBasedApp;

import java.util.Scanner;

public class TicTocToeGame {
	static char[][] board = new char[3][3];
	static char Currentplayer = 'x';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		initiliser();

		while (true) {
			printboard();
			System.out.println("enter your row value:");
			int row = sc.nextInt();

			System.out.println("enter your column value:");
			int col = sc.nextInt();

			board[row][col] = Currentplayer;
			if ( towin()) {
			    printboard();
			    System.out.println("Player " + Currentplayer + " wins!");
			    break;
			}
			if(isBoardFull()) {
				printboard();
				System.out.println("draw match");
			    break;
				
			}
			Currentplayer = (Currentplayer == 'X') ? 'O' : 'X';

		}
	}

	

	private static void initiliser() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	private static void printboard() {
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------");

			for (int j = 0; j < 3; j++) {
				System.out.print("| " + board[i][j] + " ");
			}

			System.out.println("|");
		}
		System.out.println("-------------");
	}

	private static boolean winrow() {
		for (int i = 0; i < 3; i++) {

			if (board[i][0] == Currentplayer && board[i][1] == Currentplayer && board[i][2] == Currentplayer) {
				return true;
				}
			
		}
		return false;
	}	 
	private static boolean wincol() {
			for (int i = 0; i < 3; i++) {


			if (board[0][i] == Currentplayer && board[1][i] == Currentplayer && board[2][i] == Currentplayer) {
				return true;
			}
			
			}
			return false;
	}
			private static boolean windia () {
					if (board[0][0] == Currentplayer && board[1][1] == Currentplayer && board[2][2] == Currentplayer) {
			return true;
		}
		if (board[0][2] == Currentplayer && board[1][1] == Currentplayer && board[2][0] == Currentplayer) {
			return true;
		}
		return false;
			}
			static  boolean  towin() {
				if(winrow()||wincol () ||windia ()) {
					return true;
				}
				 return false;
			}


static boolean isBoardFull() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                return false; 
            }
        }
    }
    return true;
    }
}







