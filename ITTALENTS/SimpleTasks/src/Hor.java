import java.util.Scanner;

public class Hor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of rows for the field");
		int fieldRows = sc.nextInt();
		System.out.println("Please enter the number of columns for the field");
		int fieldCols = sc.nextInt();

		char[][] field = new char[fieldRows][fieldCols];
		
		// fill with spaces

		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col++) {
				field[row][col] = ' ';
			}
		}

		System.out.println("Please enter the rows for the first point");
		int startRow = sc.nextInt();

		System.out.println("Please enter the column for the first point");
		int startCol = sc.nextInt();

		checkAllHorseMoves(startRow - 1, startCol - 1, field);

		// print
		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col++) {
				System.out.print(field[row][col] + "|");
			}
			System.out.println();
		}
		sc.close();
	}

	static void checkAllHorseMoves(int row, int col, char[][] field) {

		if (row > (field.length - 1) || row < 0 || col > (field[0].length - 1)
				|| col < 0 || field[row][col] == '.') {
			return;
		} else {
			field[row][col] = '.';

			if (!(row - 2 > (field.length - 1) || row - 2 < 0
					|| col + 1 > (field[0].length - 1) || col + 1 < 0)) {
				checkAllHorseMoves(row - 2, col + 1, field);
			}

			if (!(row - 2 > (field.length - 1) || row - 2 < 0
					|| col - 1 > (field[0].length - 1) || col - 1 < 0)) {
				checkAllHorseMoves(row - 2, col - 1, field);
			}
			if (!(row + 2 > (field.length - 1) || row + 2 < 0
					|| col + 1 > (field[0].length - 1) || col + 1 < 0)) {
				checkAllHorseMoves(row + 2, col + 1, field);
			}
			if (!(row + 2 > (field.length - 1) || row + 2 < 0
					|| col - 1 > (field[0].length - 1) || col + 1 < 0)) {
				checkAllHorseMoves(row + 2, col - 1, field);
			}

			if (!(row + 1 > (field.length - 1) || row + 1 < 0
					|| col + 2 > (field[0].length - 1) || col + 2 < 0)) {
				checkAllHorseMoves(row + 1, col + 2, field);
			}
			if (!(row - 1 > (field.length - 1) || row - 1 < 0
					|| col + 2 > (field[0].length + 2) || col + 2 < 0)) {
				checkAllHorseMoves(row - 1, col + 2, field);
			}
			if (!(row + 1 > (field.length - 1) || row + 1 < 0
					|| col - 2 > (field[0].length - 1) || col - 2 < 0)) {
				checkAllHorseMoves(row + 1, col - 2, field);
			}
			if (!(row - 1 > (field.length - 1) || row - 1 < 0
					|| col - 2 > (field[0].length - 1) || col - 2 < 0)) {
				checkAllHorseMoves(row - 1, col - 2, field);
			}

		}

	}

}