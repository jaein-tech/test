package simpletest;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i, j);
		System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
	}

	public static int divide(int i, int j) throws ArithmeticException,ClassCastException{
		int k = i/j;  // 여기서 try-catch를 사용하지 않고 위에서 사용한다.
		return k;
	}
	// throws 발생할Exception, 호출하는쪽에서 오류를 처리해라
}
