import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nro1;
		int nro2;
		int nro3;
		String raha;
		int mani;
		String jatka;
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
//		for (int raha=mani; raha > 0; raha--)
//		{
//			nro1 = (r.nextInt(10)+1);
//			nro2 = (r.nextInt(10)+1);
//			nro3 = (r.nextInt(10)+1);
//			System.out.println(nro1);
//			System.out.println(nro2);
//			System.out.println(nro3);
//			if (nro1 == 7 || nro2 ==7 || nro3 ==7)
//			{
//				System.out.println("Onnea voitit");
//				mani = +3;
//				System.out.println("Sinulla on: " + mani + " euroa jäljellä. Uusi yritys maksaa 1 euroa.");
//				break;
//			}
//			else 
//			{
//				System.out.println("Ei ollut onnea tällä kertaa.");
//			}
//		}
		
		System.out.println("Welcome to the game Lucky7!");
		System.out.println("How much money shall be used?");
		raha = in.nextLine();
		mani = Integer.parseInt(raha);
		//System.out.println(mani);
		
		do
		{
		nro1 = (r.nextInt(10)+1);
		nro2 = (r.nextInt(10)+1);
		nro3 = (r.nextInt(10)+1);
		mani = mani-1;
		System.out.println(nro1);
		System.out.println(nro2);
		System.out.println(nro3);
		
		if (nro1 == 7 && nro2 == 7 && nro3 ==7)
		{
			mani = mani+10;
			System.out.println("Voitit 10e");
		}
		else if (nro1 == 7 && nro2 ==7 || nro2 == 7 && nro3 == 7 || nro3 == 7 && nro1 == 7)
		{
			mani = mani+5;
			System.out.println("Voitit 5e");
		}
		else if (nro1==7 || nro2==7 || nro3==7)
		{
			mani = mani+3;
			System.out.println("Voitit 3e");
		}
		
		System.out.println("Haluatko jatkaa? Sinulla on " + mani + " euroa. Jos haluat paina Enter. Jos haluat lopettaa paina n.");
		jatka=in.nextLine();
		
		} while (!jatka.equals("n") && mani >0);
		if (mani==0)
		{
			System.out.println("You are out of money. Please come back when you are not broke!");
		}
		System.out.println("Thanks for playing!");		
	}

}
