package ders1;

import java.util.Scanner;

public class d7_kullanici_girisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Kullanıcı Girişi
		
		String sys_kul_adı = "Berke";
		String parola = "12345";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kullanıcı Adı: ");
		String ad = scan.nextLine();
		
		System.out.println("Şifre: ");
		String p2 = scan.nextLine();
		
		if ((sys_kul_adı.equals(ad)) && (parola.equals(p2))) {
			System.out.println("Başarıyla Giriş Yaptınız.");
		}
		else if (!(sys_kul_adı.equals(ad)) && (parola.equals(p2))) {
			System.out.println("Girdiğiniz Kullanıcı adı yanlış.");
		}
		else if ((sys_kul_adı.equals(ad)) && !(parola.equals(p2))) {
			System.out.println("Girdiğiniz şifre yanlış.");
		}
		else {
			System.out.println("Girdiğiniz bilgilerin ikiside yanlış.");
		}
    
	}
}
