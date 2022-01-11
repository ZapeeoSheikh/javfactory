//Even number check at certain range 

	import java .util.Scanner;public class Main {

	public static void main(String[] args) {

		Scanner zap = new Scanner (System.in);

		System.out.println("Please Enter Starting Number : ");

		int Slimit = zap.nextInt();

			System.out.println("Please Enter Ending Number : ");

		int Elimit = zap.nextInt();

		System.out.println("The even  number include \n " );

		

			if (Slimit % 2  != 0)

			{ 

				Slimit++;

			}

		while ( Slimit<= Elimit)

	{

				System.out.println(Slimit);

					Slimit+=2 ;

		}	}}
