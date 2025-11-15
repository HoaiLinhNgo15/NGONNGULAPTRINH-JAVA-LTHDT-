import java.util.Scanner;
import java.text.DecimalFormat;
public class BT5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		DecimalFormat tp = new DecimalFormat("#.##"); // IN 2 CHU SO THAP PHAN
		
		// khai bao bien nhap vao cac he so a , b, c
		int a = sc.nextInt(), 
			b = sc.nextInt(),
			c = sc.nextInt();
		float x1, x2; // khai bao bien la nghiem cua pt
		
		if(a==0) {
			//a=0 la pt bac 1 
			if(b==0) {
				if(c==0) { // b=c=0 pt co vo so nghiem
					System.out.print("PT vo so nghiem");
				}
				else { //b=0, c!=0 pt vo nghiem
					System.out.print("PT vo nghiem");
				}
			}
			else { // b!=0 pt bac 1 co nghiem
				x1 = (float)-c/b;
				System.out.print("x = " + tp.format(x1));
			}
		}
		else {
			float delta = b*b - 4*a*c; // tinh delta 
			
			// so sanh gia tri cua delta
			if(delta < 0) {
				System.out.print("PT vo nghiem");
			}
			else if(delta==0) {
				x1=(float)-b/(2*a);
			}
			else {
				x1 = (float)(-b + Math.sqrt(delta))/(2*a);
				x2 = (float)(-b - Math.sqrt(delta))/(2*a);
				
				if(x1>x2) {
					System.out.print("x = " + tp.format(x2) + " or x = " + tp.format(x1));
				}
				else 
					System.out.print("x = " + tp.format(x1) + " or x = " + tp.format(x2));
			}
		}

		
	}

}
