package patikaOrnekler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double pi=3.14;
		int r, alfa;
		
		Scanner inp = new Scanner(System.in);
		System.out.print("Dairenin yar��ap�n� giriniz: " );
		r = inp.nextInt();
		System.out.print("Dairenin merkez a��s�n� giriniz: ");
		alfa = inp.nextInt();
		double alan = (pi*(r*r)*alfa)/360;
		System.out.print("Dairenin alan�: " +alan);
		
	}
}
