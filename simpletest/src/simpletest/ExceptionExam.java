package simpletest;

public class ExceptionExam {

	public static void main(String[] args) {
		// 예외처리 - 프로그램실행중 예기치 못한 사건을 예외라고 한다.
		int i = 10;
		int j = 0;
		try {
			int k = i/j;
			// 자바는 정수를 0으로 나눌때 exception을 발생시킨다.
			System.out.println(k); // exception이 발생하면 발생지점부터 프로그램이 종료된다. 아래에 코드는 동작하지 않는다.
		}catch(ArithmeticException a) {
			System.out.println("0으로는 나눌 수 없습니다."+a.toString()); // .toString();예외에 대한 정보를 알려주는 method
		}finally {
			System.out.println("반드시 실행된다.");
		}
		System.out.println("lalala");
		
//		Exception 클래스들은 모두 exception이라는 클래스를 상속받게 되는데 
//		예외 클래스에 exception이라고 두게 된다면 어떤 오류를 발생하던지간에 하나의 catch블록에서 모든 오류를 처리할 수 있다.
		
		
		
//		try-catch-finally(finally생략가능)

//		try {                               수행할 코드
//			,,,                             예외 발생 가능성이 있는 블록
//		}catch(예외클래스 변수명) {
//			,,,                             예외 처리 블록,, 오류가 여러개 발생한다면 catch블록을 여러개 둘 수 있다.
//		}finally {
//			,,,                             예외 발생여부와 상관없이 반드시 실행
//		}                                   (생략가능)
		

	}

}
