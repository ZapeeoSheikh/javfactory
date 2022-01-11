// Its a Number guessing Game between Vomputer and You , Computer will Get Some number betwwwn [ 1 , 100]  you just  have guess such number in the reserved 10 moves.

import java.util.*;

public class Main {

	public static void main(String[] args) {	Scanner zap = new Scanner(System.in);

	Random ram = new Random();

			int computerInput = ram.nextInt(100);

	//Please uncomment the Computer guess so that you may get better experience 		

	//	System.out.println(computerInput);

							System.out.println(" A number is randomly chosen between [1,100]");

							//		System.out.println("\u000C");

			System.out.println(" Now it’s your turn to guess the number ,\n you have 10 guesses left .");

			

	for ( int i= 1; i<= 10; i++ ){						

				int guess = zap.nextInt();

				System.out.println(" Your " + i + " guess is : " + guess);

			if ( computerInput == guess ) 

			{

				System.out.println("Congratulations!!! Both Guesses are the same");

					break;	

			}				

			else if ( guess > computerInput ){

		System.out.println("Your guess is Greater then Computer's Guess");

	   	}

			else if ( guess < computerInput ){

		System.out.println("Your guess is Smaller then Computer's Guess");

			}

	if ( i == 10){

	 if( guess != computerInput){

		System.out.println("Secret number is : "+computerInput+" You loss the match");

	}

	}}

	}

}
