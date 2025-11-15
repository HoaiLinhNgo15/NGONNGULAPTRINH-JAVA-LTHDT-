import java.util.Scanner;
public class BT10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//KHOI TAO BIEN LUU KQ, BIEN DIEU KIEN DUNG
		int found=0, Sum=0, n;
		
		while(found==0) {
			n = sc.nextInt();
			if(n%4==0) {
				found=1;
				Sum+=n;
				break;
			}
			Sum+=n;
		}
		System.out.print(Sum);

	}

}

