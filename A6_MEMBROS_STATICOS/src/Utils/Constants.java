package Utils;

public class Constants {
	
	public static final double IOF = 0.06;
	
	public static  double currency (double dollarNow, double qtdDollar ) {
		return dollarNow * qtdDollar * (1.0 + IOF);
	}
		
}
