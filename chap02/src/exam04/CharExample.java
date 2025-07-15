package exam04;

public class CharExample {
	public static void main (String[] args) {
	//char(2byte)
	//하나의 문자를 유니코드로 저장
	//유니코드: 세계 각국의 문자들을 2byte(0~65535)범위에 맵핑한 국제 표준 규약
	
	char c1 = 'A';  //실제로는 유니코드 값인 65가 메모리에 저장됨 
	char c2 = 65 ; // 정수타입이라 정수값도 저장 가능 
	//char c3 = -65; // 음수값은 저장안됨, 유니코드는 0부터 시작
	System.out.println(c1);
	System.out.println(c2);
	
	char c4 = '가';
	char c5 = 44032;
	
	//(참고) 문자를 숫자로 변환 
	//문자'0' -> 유니코드 48
	System.out.println('1'-0); // 49-0 
	System.out.println('1'-'0'); // 49-48
	
	//이런 방식은 문자를 숫자로 변환시 사용 
	char digit = '8';
	int numericValue = digit -'0' ;
	System.out.println(numericValue);
	
	/*
	 * 중요
	 * 1)문자와 문자열은 다르다
	 * 2)빈 문자 처리에 대해
	 */
	
	//char c = ''; // 컴파일 에러 (빈문자는 저장이 안된다)
	char c =' ';// 공백 문자는 저장 가능 (유니코드 32존재하므로 저장 가능)
	System.out.println((int)' ');
	String str = ""; // 빈문자열(empty string) 저장 가능

}
}
