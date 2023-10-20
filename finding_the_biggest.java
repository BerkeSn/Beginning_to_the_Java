package p3;

import java.util.Scanner;

public class week3Pr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Alinin yaşını giriniz:");
		int ali = scan.nextInt();
		
		System.out.println("Zeynep'in yaşını giriniz");
		int zeynep = scan.nextInt();
		
		System.out.println("Ahmet'in yaşını giriniz");
		int ahmet = scan.nextInt();	
		
		if (ali>zeynep) {
			if (ali>ahmet) {
				System.out.println("Ali en büyüktür");
			}
			else {
				System.out.println("Ahmet en büyüktür");
			}
		}
		
		else if (zeynep>ali) {
			if (zeynep>ahmet) {
				System.out.println("Zeynep en büyüktür");
			}
			else {
				System.out.println("Ahmet en büyüktür");
			}
		}
		
		else if (ali == zeynep) {
			if (ali<ahmet) {
				System.out.println("Ahmet en büyüktür");
			}
			else if (ali>ahmet) {
				System.out.println("Ali ile Zeynep en büyüktür.");
			}
			else {
				System.out.println("Hepsinin yaşları eşittir.");
			}
		}
		else if (zeynep == ahmet) {
			if (zeynep > ali) {
				System.out.println("Zeynep ve Ahmet en büyüktür");
			}
			else if (zeynep<ali) {
				System.out.println("Ali en büyüktür.");
			}
		}
		
	}
}
