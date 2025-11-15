import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[100]; //KHAI BAO MANG
		
		// KHAI BAO KICH THUOC MANG VA NHAP VAO INPUT
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//GIAI THUAT
		int max=arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print(max); //OUTPUT

	}

}
