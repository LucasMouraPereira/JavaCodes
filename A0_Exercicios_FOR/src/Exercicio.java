import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//exercicio1
		
//		int x = sc.nextInt();
//		
//		if(x >= 1 || x <= 1000) {
//			for(int i = 0; i <= x; i++) {
//				if(i%2 != 0) {
//					System.out.println(i);
//				}
//			}
//		}
		//exercicio2
//		int n = sc.nextInt();
//		int in = 0;
//		int out = 0;
//		
//		for(int i = 0; i < n; i++) {
//			int x = sc.nextInt();
//			if(x >= 10 && x <= 20) {
//				in ++;
//			} else {
//				out ++;
//			}
//		}
//		System.out.println3(in + " in");
//		System.out.println(out + " out");
//		
		//exercicio3
//		int n = sc.nextInt();
//		
//		for(int i = 0; i < n; i++) {
//			double x = sc.nextDouble();
//			double y = sc.nextDouble();
//			double z = sc.nextDouble();
//			
//			double mp = ((2 * x) + (3 * y) + (5 * z))/10;
//			System.out.printf("%.1f%n", mp);
//			
//		}
		//exercicio4
//		int n = sc.nextInt();
//		for(int i = 0; i < n; i++) {
//			int x = sc.nextInt();
//			int y = sc.nextInt();
//			
//			if(y == 0) {
//				System.out.println("divisao imposivel");
//			} else {
//				double result = (double) x/y;
//				System.out.printf("%.1f%n", result);
//			}
//		}
		//exercicio5
//		int n = sc.nextInt();;
//		int fatorial = 1;
//		for(int i = 1; i <= n; i++) {
//			fatorial *= i;
//		}
//		System.out.println(fatorial);
		
		//exercicio6
//		int n = sc.nextInt();
//		int div = 0;
//		for(int i = n; i >= 1; i--) {
//			if(n%i == 0) {
//				div = n/i;
//				System.out.println(div);
//			}
//		}
		
		int n = sc.nextInt();
		if(n >= 1) {
			for(int i = 1; i <= n; i++) {
				int num = i;
				int quadrado = (int) Math.pow(i, 2);
				int cubo = (int) Math.pow(i, 3);
				System.out.println(num + " " + quadrado + " " + cubo);
			}
		}
		
		sc.close();
	}
}
