import java.util.Scanner;
public class BT6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT
		int a = sc.nextInt(),
			b = sc.nextInt(),
			c = sc.nextInt();
		
		//GIAI THUAT
		int max;
		max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		System.out.print(max); //OUTPUT

	}

}
