package simpletest;

public class OperatorExam {

	public static void main(String[] args) {
//		operations 연산자 : 연산에 사용되는 기호
//		operand 피연산자 : 연산 대상이 되는 데이터 (변수, 리터럴)
//		+,-,*,/,%  % = 나누고 남은 나머지
//		++,--,증감 연산자 1씩 더하거나 빼기
		int i1 = -5;
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		int i4 = ++i3; // 먼저 더하고 더한값을 i4에 대입한다.
		
		System.out.println(i4); // i3 = i3+1;
		System.out.println(i3);
		
		int i5 = i3++; // 먼저 값을 i5에 대입한 후에 더한다
		System.out.println(i5); // i3 = i3 + 1;
		System.out.println(i3);
		
		int i = 5;
		int j = 2;
		
		System.out.println(i / (double)j); //캐스팅 연산
		System.out.println(i % j);//모듈러 연산
	}

}
