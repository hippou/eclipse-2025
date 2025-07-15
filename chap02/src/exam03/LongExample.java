package exam03;

public class LongExample {

	public static void main(String[] args) {
		// long(8byte)
		long var1 = 10;
		long var2 = 20L; //L을 붙이거나 안붙이거나 문제 없음
		//long var3 = 2000000000; //자바 컴파일러는 정수 리터럴을 기본적으로 int타입으로 해석
		//200억이 int 타입의 범위를 넘기 때문에 컴파일 에러 발생
		//컴파일러에게 int타입이 아니라 long타입의 숫자임을 알려줘야함
		long var4 = 2000000000L; //L 또는 l을 붙임
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
