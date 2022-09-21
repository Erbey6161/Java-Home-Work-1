
public class ReCapDemo2 {
	public static void main(String[] args) {
		
		double [] mylist = {1,2,3,4,5,6};
		double total = 0;
		double max = mylist[0];
		for (double number : mylist) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toıplam = "+ total);
		System.out.println("En büyük = "+ max );
	}

}
