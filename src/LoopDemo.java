
public class LoopDemo {
	public static void main(String[] args) {
		
		for (int  i = 1; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		int i=20;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti");
		
		int j = 20;
		
		do {
			System.out.println(j);
			j++;
		} while (j<10);
		System.out.println("Do-While Döngüsü Bitti");
		
	}

}
