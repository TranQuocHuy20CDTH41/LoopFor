package basic.dev;
/**
 * lap 08
 * @author TranQuocHuy
 *
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tong cac so tu 1 den 100
		int a, i, S = 0;
		for (i = 1; i <= 100; i++)
			S = S + i;
		System.out.println("Tong cac so tu 1 den 100 la: " +S);
		//Tong cac so chia het cho 3 be hon n
		int n, N = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao gia tri n: ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++)
			if (i % 3 == 0)
				N = N + i;
		System.out.println("Tong cac so tu nhien nho hon n va chia het cho 3 la: " +N);
		//Fibonacci
				long number1 =0 ;
				long number2 =1 ;
				System.out.println("100 so Fibonaci dau tien la:");
				for(int i1 = 1; i1<=100; i1++) {
					System.out.printf("%d\t ",number1);
					long sumNumber1Number2 = number1 + number2;
					number1 = number2;
					number2 = sumNumber1Number2;
				//polinom
			int m,rv,temp,mod;
					
					Scanner Scan = new Scanner(System.in);
					
					System.out.printf("\nNhap vao so m = "); m = Scan.nextInt();
					
					temp = m; rv = 0;
					
				    while (m > 0) {
				    	   mod = m % 10;
				    	   m = m / 10;
				    	   rv= rv * 10 + mod;
				    }
				    
				    if (rv==temp) {
				    	System.out.printf("So %d la so Polinom",temp); 
				    } else {
				                  System.out.printf("So %d kp la so Polinom",temp);
				               //tong cac so tu 100-999 co tong 3 chu so chia het cho 3   
				                int tempMod = 0, tempDiv =0, M = 0;
				      			
				      			System.out.println("\nCac so tu 100 - 999 co tong cac chu so chia het cho 3 la:");
				      			
				      			for(int I = 100; I < 1000 ; I++) {
				      				tempDiv = I;
				      				M = 0;
				      				
				      				while(tempDiv > 0 ) {	
				      				    tempMod = tempDiv%10;
				      				    tempDiv = tempDiv/10;
				      				    M += tempMod;
				      				}
				      				
				      				
				      				if(M %3 == 0) {
				      					System.out.printf(String.format("%d\t",I));
				      	}
				    }
				}
			}
		}
	}

