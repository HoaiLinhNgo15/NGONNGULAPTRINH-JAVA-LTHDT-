import java.util.Scanner;
public class BT3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //INPUT
		
		//GIAI THUAT
		if(n<2) { //SO NGUYUEN <2 KHONG LA SNT
			System.out.print( n + " khong phai la so nguyen to");
			System.exit(0);
		} 
		// N >=2 BAT DAU TIM SO LUONG UOC KHAC 1 VA N
		int cnt=0;
		for(int i=2; i<=Math.sqrt(n); i++)
			if(n%i==0)
				cnt++;
		if(cnt==0) // KHONG CO UOC NAO KHAC NGOAI 1 VA N (HAY LA SNT)
			System.out.print(n + " la so nguyen to");
		else System.out.print(n + " khong phai la so nguyen to");

	}

}
