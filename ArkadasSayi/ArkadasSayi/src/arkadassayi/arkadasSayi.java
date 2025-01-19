package arkadassayi;

import java.util.Scanner;

public class arkadasSayi {

	public static void main(String[] args) {
		
		//Kendileri hariç pozitif tam bölenlerinin toplamı birbirine eşit olan sayılar arkadaş sayıdır.
		
		Scanner input=new Scanner(System.in);
		
		int sayi1;
		System.out.println("sayi1:");
		sayi1=input.nextInt();
		
		int sayi2;
		System.out.println("sayi1:");
		sayi2=input.nextInt();
		
		int toplam1=0,toplam2=0;
		for(int i=1;i<sayi1;i++) {
			if(sayi1 % i==0) {
				toplam1 += i;
				
			}
		}
		
		for(int i =1;i<sayi2;i++) {
			if(sayi2 % i==0) {
				toplam2+=i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu iki sayı arkadaş sayıdır");
		}else {
			System.out.println("Bu iki sayı arkadaş sayı değildir");
		}
		
		
		
	}

}
