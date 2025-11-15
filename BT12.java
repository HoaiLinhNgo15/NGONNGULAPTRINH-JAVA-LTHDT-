import java.util.Scanner;

public class BT12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// khai bao va nhap vao co so x, va luy thua y
		int x = sc.nextInt(),
			y = sc.nextInt();
		float p=1; // khai bao bien luu tru ket qua theo giai doan
		
		// giai thuat tinh toan
		if(y<0) {
			y = -y;
			for(int i=1; i<=y; i++) {
				p/=(float)x;
			}
		}
		else {
			for(int i=1; i<=y; i++) {
				p*=x;
			}
		}
		
		//OUTPUT
		System.out.print(p);

	}

}
