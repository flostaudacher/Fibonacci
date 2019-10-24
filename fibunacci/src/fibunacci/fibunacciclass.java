package fibunacci;
import java.util.Scanner;

public class fibunacciclass {
	static Scanner sc=new Scanner(System.in);
	static int Groesse;
	static int Gesamt;
	static int i;
	public static void main(String[] args) {
		laengedef();
		int Start=1;
		System.out.println("Wert an "+Groesse+": "+fibonacci(Start,0));
	}
	static int  fibonacci(int Start, int Wert) {
		Gesamt=Start+Wert;
		if (i<Groesse-2) {
			i++;
			return fibonacci(Start+Wert,Start);
		}
		else {
			return Gesamt;
		}
	}
	static void laengedef() {
	    try {
	    	System.out.println("Groesse eingeben = ");
	    	Groesse=sc.nextInt();
	    } catch (Exception e) {
	    	System.out.println("Something went wrong.");
	    }
	}
}
