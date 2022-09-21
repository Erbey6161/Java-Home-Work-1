
public class SayiBulma {
	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		
		int aranacak = 9 ;
		boolean varmi = false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				varmi = true;
				break;
			}
						
		}
		if (varmi) {
			System.out.println("sayı mevcuttur");
		}else {
			System.out.println("sayı mevcut değildir");
		}
		
	}

}
