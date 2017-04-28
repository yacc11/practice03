package prob06;

public class Mul {
	private int a;
	private int b;

	public Mul(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void setValue(int a,int b){
		this.a=a;
		this.b=b;
		
		
		
		calculate(this.a,this.b);
	}
	int calculate(int a,int b){
		this.a=this.a*this.b;
		System.out.println(a);
		return a;
	}
}
