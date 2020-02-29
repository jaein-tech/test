package simpletest;

public class ExceptionExam3 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
		int k = divide(i, j);
		System.out.println(k);
		}catch(IllegalArgumentException e) {
			System.out.println(e.toString());
		}
	}

//	throw를 이용해서 직접 exception 발생시키기 - throws와 throw는 보통 함께 쓰인다.
	public static int divide(int i, int j) throws IllegalArgumentException{
		if(j == 0) {
			throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
		}
		int k = i/j;
		return k;  // 잘못된값이 return되어서 넘어가는 경우도 문제가 발생할 수 있기 때문에 exception을 발생시켜야 할 상황도 필요하다.
	}

}
