import java.util.Scanner;
import java.util.Random;
public class oyun {
private static int tahmin;
private static int sayi;
private static boolean durum=false;


	public static void oyunbasla() {
		oyunilkadim();
	}
	
	private static void oyunilkadim() {
		tahmin=rasgelesayi();
		while(durum==false) {
			sayi=sayial();
			durum=kontrol();
		}
		if(durum==true) {
			System.out.println("Tebrikler Buldunuz !");
		}
  
	}
	private static int rasgelesayi () {
		Random ras=new Random();
		return ras.nextInt(100);
	}
	private static int sayial(){
		Scanner k=new Scanner(System.in);
		System.out.println("Bir say� giriniz.");
		return k.nextInt();
	}
	private static boolean kontrol(){
		if(sayi>tahmin) {
			System.out.println("Biraz a�a��");
			return false;
			
		}else if(sayi < tahmin) {
			System.out.println("Biraz yukar�");
			return false;
			
		}else {
			return true;
		}
	}
	
	
}
