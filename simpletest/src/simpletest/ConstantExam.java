package simpletest;

public class ConstantExam {

	public static void main(String[] args) {
//		final 상수를 선언할때, 상수는 대문자를 사용하는 것이 관례
		final int J;
		J = 10;
		
//		J = 5;
		
		double circleArea;
		final double PI = 3.14159;
		circleArea = 3 * 3 * PI;
		
		System.out.println(circleArea);
		
//		상수는 단어와 단어 사이를 under bar '_'를 통해서 구분
		final int APPLE_PRICE = 2000;
		
		System.out.println(APPLE_PRICE);

	}

}
