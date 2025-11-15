import java.util.Scanner;
public class BT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT
		int a = sc.nextInt(), 
			b = sc.nextInt();
		float x;
		
		// GIAI THUAT
		if(a==0) {
			if(b==0) {
				System.out.print("PT vo so nghiem"); //Output
			}
			else System.out.print("PT vo nghiem"); //Output
		}
		else {
			x = (float)-b/a;
			System.out.print("x = " + x); //Output
		}

	}

}
