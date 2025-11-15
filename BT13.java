import java.util.Scanner;

public class BT13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT
		int n = sc.nextInt(), s=0;
		
		//GIAI THUAT
		for(int i=0; i<=n; i+=2) {
			s+=i;
		}
		
		//OUTPUT
		System.out.print(s);

	}

}
