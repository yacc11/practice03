package prob06;

public class Sub {
	private int a;
	private int b;
	public Sub(int a,int b){//생성자
		this.a=a;
		this.b=b;
	}
	void setValue(int a,int b){//대입 
		this.a=a;
		this.b=b;
		
		
		calculate(this.a,this.b);
	}
	int calculate(int a,int b){ //계산
		this.a=this.a-this.b;
		System.out.println(a);
		return a;
	}

}
