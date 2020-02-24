package simpletest;

public class OperatorExam2 {

	public static void main(String[] args) {
//		비교 연산자 == 같다, != 다르다, < 크다, > 작다, <= 크거나 같다, >= 작거나 같다
		int i = 10;
		int j = 10;
		
		System.out.println(i==j);
		System.out.println(i!=j);
		
		i += 10; // i = i +10; 복합대입연산자
		
		System.out.println(i);
		System.out.println(i-=5);

	}

}
