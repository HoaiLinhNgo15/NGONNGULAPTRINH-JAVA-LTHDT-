import java.util.Scanner;

public class BT8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[100];
		
		//INPUT
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//GIAI THUAT
		int cnt=0;
		for(int i=0; i<n; i++) {
			if(arr[i]>0)
				cnt++;
		}
		System.out.print(cnt); //OUTPUT

	}

}
