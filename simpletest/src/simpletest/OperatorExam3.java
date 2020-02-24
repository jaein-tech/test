package simpletest;

public class OperatorExam3 {

	public static void main(String[] args) {
		// 연산자 우선순위, 위에서 아래로
		// 최우선 [], (),
		// 단항 연산자 ++, -- !, ~, +/- : 부정, bit변환 > 부호 > 증감
		// 산술연산자 *, /, %, >, +, -, > shift/시프트 연산자 >>, <<, >>>
		// 비교연산자 >, <, >=, <=, ==, !=
		// 비트연산자 &, |, ^, ~
		// 논리연산자 &&(논리곱 and 연산자) > ||(논리합 or 연산자)
		// 삼항 연산자 조건식?
		// 대입 연산자 =, *=, /=, +=, -=, %=
		
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		
		System.out.println(a > 5 && b > 5);
		System.out.println(a > 4 && b > 5);
		System.out.println(a > 5 || b > 5);
		
		System.out.println(++a - 5); // 1
		System.out.println(a); // 6
		System.out.println(a++ - 5); // 1
		System.out.println(a); // 7
	}

}
