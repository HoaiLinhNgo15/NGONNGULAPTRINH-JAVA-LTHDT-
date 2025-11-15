import java.util.Scanner;

public class BT9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[100]; //KHAI BAO MANG
		
		// nhap du lieu INPUT
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//Giai thuat
		for(int i=0; i<n; i++) {
			if(arr[i]<0)
				System.out.print(arr[i] + " "); //OUTPUT
		}
		

	}

}
