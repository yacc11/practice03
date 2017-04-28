package prob03;

public class CurrencyConverter {

	private static double rate;
	private static double rate1; //void setRate끝나면 환율이 사라지므로 새로운 변수 생성 
	
	public static double toDollar(double won) { //1달러에 1197원 
		// 한국 원화를 달러로 변환
		//1: 1197 = x : 1000000
		//입력 변수 1000000원 
		//환율 1197
		//1197x = 1000000
		//x= 1000000/1197
		//System.out.println(rate);
		won=won/rate1;
		return won;
	}
	
	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		//100달러
		//1 : 1197 = 100 : x
		dollar = dollar*rate1;
		return dollar;
	}
	public static void setRate(double rate) {
		// 환율 설정(KRW/$1)
		rate1=rate;
		
	}
}
