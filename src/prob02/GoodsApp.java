package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //객체 생성 
		// 상품 정보 담을 배열 생성
		Goods[] goods = new Goods[COUNT_GOODS]; //객체틀  생성
		
		for(int i=0;i<COUNT_GOODS;i++)
		{ 	//goods는 상품의 정보를 담는 객체 
			
			goods[i]=new Goods(null,0,0); //객체 생성
			String info = scanner.nextLine(); //info에 입력 받음
			//객체를 분리 
			String[] tokens = info.split(" "); //split함수를 사용하여 분리 tokens에 스페이스를 기준으로 담음.
			
			String name = tokens[0]; //0번은 이름을 넣는다.
			
			int price = Integer.parseInt(tokens[1]);//문자열을 정수로 바꿈 
			
			int countStock = Integer.parseInt(tokens[2]); //문자열의 재고량을 정수로 변환.
			
			goods[i].setName(name); //대입 
			
			goods[i].setPrice(price);
			
			goods[i].setCountStock(countStock);
			
		}
		
		for(int i=0;i<COUNT_GOODS;i++){
			System.out.println(goods[i].getName()+"(가격이:"+goods[i].getPrice()+"원)이 "+goods[i].getCountStock()+"개 입고 되었습니다.");
			
		}
//		상품 정보 출력
//		
//		for(Goods g : goods){
//		}
		// 자원정리
		scanner.close();
	}
}
