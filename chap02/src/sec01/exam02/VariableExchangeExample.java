package sec01.exam02;

public class VariableExchangeExample {
	public static void main (String[]args) {
		int x =3; 
		int y =5;
		System.out.println("x:"+x+",y:"+y);


//y=x; //x에 저장된 값을 y에 복사
	//System.out.println("x:"+x+",y:"+y);
		
		//x와y의 값을 서로교환. 즉, 바꾸고 싶다면
		int temp = x;
		x = y;
		y= temp;
		System.out.println("x:"+x+",y:"+y);
		
}
}