import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nro1;
		int nro2;
		int nro3;
		
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		
		for (int i= 1; i <= 1; i++)
		{
			nro1 = (r.nextInt(10)+1);
			nro2 = (r.nextInt(10)+1);
			nro3 = (r.nextInt(10)+1);
			System.out.println(nro1);
			System.out.println(nro2);
			System.out.println(nro3);
			if (nro1 == 7 || nro2 ==7 || nro3 ==7)
			{
				System.out.println("Onnea voitit");
				break;
			}
			else 
			{
				System.out.println("Ei ollut onnea tällä kertaa.");
			}
		}
		
	}

}
