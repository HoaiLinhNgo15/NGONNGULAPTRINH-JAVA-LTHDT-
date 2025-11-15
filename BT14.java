import java.util.Scanner;

public class BT14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT VA KHOI TAO
		int n=sc.nextInt(), S=0;
		
		//GIAI THUAT
		for(int i=1; i<=n; i+=2) {
			int p=1;
			for(int j=1; j<=i; j++) {
				p*=j;
			}
			S+=p;
		}
		System.out.print(S); //OUTPUT

	}

}
