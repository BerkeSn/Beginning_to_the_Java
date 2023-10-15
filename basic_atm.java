package ders1;

import java.util.Scanner;

public class d8_atm_ornegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		
		System.out.println("1: Bakiye Görüntüle ");
		System.out.println("2: Para Yatırma ");
		System.out.println("3: Para Çekme ");
		System.out.println("4 Sistemden Çıkış ");
		
		System.out.println("Yapacağınız işlemi seçiniz: ");
		int islem = scan.nextInt();
		
		switch(islem) {
		case 1:
			System.out.println("Hesabınızdaki bakiye: " + bakiye);
			break;
		
		case 2:
			System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
			int tutar = scan.nextInt();
			System.out.println("İşleminiz başarı ile gerçekleştirildi.\n Güncel bakiyeniz: " + (bakiye+tutar));
			break;
		case 3:
			System.out.println("Çekmek istediğiniz tutarı giriniz: ");
			int tutar2 = scan.nextInt();
			System.out.println("İşleminiz başarı ile gerçekleştirildi. \n Güncel bakiyeniz: "+ (bakiye-tutar2));
			break;
		case 4: 
			System.out.println("Sistemden başarı ile çıktınız.");
		}
	}
}
