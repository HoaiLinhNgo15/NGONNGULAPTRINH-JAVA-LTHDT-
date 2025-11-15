import java.util.Scanner;
public class BT4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p=1; //INPUT
		
		//GIAI THUAT
		for(int i=1; i<=n; i++)
			p*=i;
		
		System.out.print(p); //OUTPUT
		
	}

}
