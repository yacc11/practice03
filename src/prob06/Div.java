package prob06;

public class Div {
	private int a;
	private int b;

	public Div(int a,int b){//생성자 
		this.a=a;
		this.b=b;
	}
	
	void setValue(int a,int b){//대입
		this.a=a;
		this.b=b;
		
		
		calculate(this.a,this.b);
	}
	int calculate(int a,int b){ //계산
		if(a<b){
			System.out.println("나누는 수가 더 큽니다. 다시 입력해주세요 : ");
		}
		this.a=this.a/this.b;
		System.out.println(a);
		return a;
	}
}
