

import java.util.Scanner;
public class DrawingShapes {

	public static void main(String[] args) {

		//Declare and initialize variables
		String shape_choice;
		String rectangle = "r";
		String triangle = "t";
		String hexagon = "h";
		String octagon = "o";
		String pentagon = "p";
		//rectangle
		int rect_length = 0;
		int rect_height = 0;
		int rect_row = 0;
		int rect_column = 0;
		//triangle
		int tri_length = 0;
		//hexagon
		int hex_length = 0;
		int num_space = 0;
		//Create Scanner for user input
		Scanner keyboard = new Scanner(System.in);

		//Ask for shape to create and store answer
		System.out.println("Type \"r\" for rectangle");
		System.out.println("Type \"t\" for triangle");
		System.out.println("Type \"h\" for hexagon");
		System.out.println("Type \"o\" for octagon");
		System.out.println("Type \"p\" for pentagon");
		System.out.print("Enter a shape:\t");
		shape_choice = keyboard.next();

		//If-else statements for each shape
		if (shape_choice.equals(rectangle)) {

			System.out.println("Enter a length");
			rect_length = keyboard.nextInt();
			System.out.println("Enter a height");
			rect_height = keyboard.nextInt();

			while (rect_column < rect_height) {
				for (rect_row = 0; rect_row < rect_length; rect_row++) {
					System.out.print("*");
				}
				System.out.print("\n");
				rect_column++;
			}

		} else  if (shape_choice.equals(triangle)) {
			System.out.println("Enter a length");
			tri_length = keyboard.nextInt();


			//check for valid input
			if (tri_length > 1) {
				;
			} else {
				System.out.print("Invalid Input");
				System.exit(0);
			}

			for (int q = 1; q <= tri_length; q++) {
				for (int b = tri_length; b >= q; b--) {
					System.out.print(" ");
				}
				for (int b = 1; b <= q; b++) {
					System.out.print("* ");
				}
				System.out.print("\n");
			}

		} else if (shape_choice.equals(hexagon)) {
			System.out.println("Enter a length");
			hex_length = keyboard.nextInt();

			//check for valid input
			if (hex_length > 1) {
				;
			} else {
				System.out.print("Invalid Input");
				System.exit(0);
			}
			//starting number of spaces
			num_space = hex_length;
			num_space--;
			//creating loop for the top half of the pentagon
			int p = -1;
			while (p < num_space) {
				System.out.print(" ");
				p++;
			
				//creating loop for spaces
				for (int i = 0; num_space > i; i++) {
					System.out.print(" ");
				}
				//creating starting stars
				int q = 0;
				while (hex_length > q) {
					q++;
					System.out.print("*");
				}
				//creating loop for stars after spaces
				
				
				
				
				
				System.out.print("\n");
			}





		} else if (shape_choice.equals(octagon)) {
			;
		} else if (shape_choice.equals(pentagon)) {
			;
		} else {
			System.out.println("Invalid shape\r\n" + "Goodbye!");
		}



	}
}

