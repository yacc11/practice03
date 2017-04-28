package prob03;

public class CurrencyConverter {

	private static double rate;
	
	public static double toDollar(double won) { //1달러에 1197원 
		// 한국 원화를 달러로 변환
		//1: 1197 = x : 1000000
		//입력 변수 1000000원 
		//환율 1197
		//1197x = 1000000
		//x= 1000000/1197

		won=won/rate;
		return won;
	}
	
	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		//100달러
		//1 : 1197 = 100 : x
		dollar = dollar*rate;
		return dollar;
	}
	public static void setRate(double r) {
		// 환율 설정(KRW/$1)
		rate=r;
		
		//rate1=rate;
		
	}
}
