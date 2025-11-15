import java.util.Scanner;
public class BT11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//INPUT
		int m = sc.nextInt(),
			n = sc.nextInt();
		
		//GIAI THUAT
		for(int i=m; i<=n; i++) {
			if(i<2) {
				continue;
			}
			int cnt=0; 
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0)
					cnt++; // cnt > 1 i KHONG PHAI LA SO NGUYEN TO
			}
			if(cnt==0) System.out.print(i + " ");
		}

	}

}
