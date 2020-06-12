

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
		int space_max = 0;
		int hex_row = 0;
		int hex_star = 0;
		int hex_final_star = 0;
		int num_space = 0;
		//Create Scanner for user input and for user input and store it in variable
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a shape: r t h o p");
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
			
			space_max = hex_length - 1;
			
			for (hex_row = 1; hex_row <= hex_length; hex_row++, space_max--) {
				num_space = 0;
				
				while (num_space < space_max) {
					System.out.print(" ");
					num_space++;
				}
				hex_star = 0;
				hex_final_star = hex_length + (hex_row - 1) * 2;
				while (hex_star < hex_final_star) {
					System.out.print("*");
					hex_star++;
				}
				System.out.print("*");
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

