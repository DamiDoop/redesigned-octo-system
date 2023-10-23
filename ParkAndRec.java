/* Maple Baldwin
 * 18/10/23
 * Program to calculate admission costs for Indiana National Park
 */
package IfStatements;

import java.util.Scanner;

public class ParkAndRec {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int age = 0; // age input
		int county = 0; // county user chooses
		int price = 40; // general admission
		int secret = 0; // secret government cheat code
		double seniorDiscount = 0.50; // senior discount
		
		System.out.println("Welcome to Indiana National Park! May I ask how old you are?");
		
		while (!scan.hasNextInt()) {
			System.out.println("\nWhat is your actual age?");
			scan.next();
		}

		age = scan.nextInt();
		
		System.out.println("Can I also ask what county you are coming from?");
		
		while (!scan.hasNextInt()) {
			System.out.println("\nNow, I need to know where you're coming from.\n '1' for Eagleton, '2' for Pawnee, '3' for Campbell, & '0' for not listed");
			scan.next();
		}

		county = scan.nextInt();

		// if statements
	
		// secret government cheat code
			if(age == 8008135 && county == 420) {
				System.out.println("Hey. What'll it be? '1' for changing the price, '2' for nuking eagleton");
				
				while (!scan.hasNextInt()) {
					System.out.println("One, or Two. Red pill, or Blue pill.");
					scan.next();
				}

				secret = scan.nextInt();
				
				if(secret == 1) {
					System.out.println("Alright. What do you want to pay.");
					
					while (!scan.hasNextInt()) {
						System.out.println("Sorry, how much?");
						scan.next();
					}

					price = scan.nextInt();
					
					System.out.println("Alright, I'll take $" + price + " then.");
				}
				
				else if(secret == 2) {
					System.out.println("*nuclear blast in distance*");
					System.out.println("Eagleton is no longer on the map. Have a good day.");
				}
			}// end of government cheating
			
		// Eagleton calculations
			else if(age <= 5 && county == 1) {
				System.out.println("It's free, but what are the parents in Eagleton County doing..");
			}
			else if(age > 5 && county == 1 && age < 65) {
				price = 60;
				System.out.println("Hey. It's gonna cost you Eagleton dwellers about $" + price + " to enter.");
			}
			else if(age >= 65 && county == 1) {
				price = (int) (price * seniorDiscount);
				System.out.println("How did you live so long in Eagleton? Anywho, it'll cost you $" + price + ".");
			}
		
		// Pawnee Calculations
			else if(age <= 5 && county == 2) {
				System.out.println("Your admission is free, but why is a toddler out here on their own? Where are your parents?");
			}
			else if(age <= 14 && county == 2) {
				price = (int) (price * 0.18);
				System.out.println("Hey kids! It's only gonna cost you $" + price + ".");
			}
			else if(age > 5 && county == 2 && age < 65) {
				System.out.println("Hey there you fine Pawnee residents! It's gonna cost you about $" + price + " to enter.");
			}
			else if(age >= 65 && county == 2) {
				price = (int) (price * seniorDiscount);
				System.out.println("How has Pawnee treated you all this time? Anyways, the price is $" + price + ".");
			}
		
		// Campbell Calculations
			else if(age <= 5 && county == 3) {
				System.out.println("Seriously where are your parents at? Nevermind, it's free, head on in.");
			}
			else if(age > 5 && county == 3 && age < 65) {
				System.out.println("You live in Campbell county? Like the soup brand? That's funny, anyways, it'll cost you $" + price + " to get in.");
			}
			else if(age >= 65 && county == 3) {
				price = (int) (price * (seniorDiscount + .075));
				System.out.println("I gotta say welcome, come on in, the price is a low $" + price + "!");
			}
		
		// Normal Calculations
			else if(age <= 5) {
				System.out.println("Your admission is free, but why is a toddler out here on their own? Where are your parents?");
			}
			else if(age > 5 && age < 65) {
				System.out.println("Hey there! It's gonna cost you about $" + price + " to enter.");
			}
			else if(age >= 65) {
				price = (int) (price * seniorDiscount);
				System.out.println("Come on in, it'll cost you $" + price + "!");
			}
			scan.close();
	}// end of main

}//end of ParkAndRec
