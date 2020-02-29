package simpletest;

// 사용자 정의 Exception
public class BizException extends RuntimeException {
	public BizException(String msg) { // 어떤오류가 발생했는지 String값으로 메시지를 가져오는 생성자
		super(msg); // 부모의 생성자를 호출하는 super, 매개변수로 전달받은 값만 부모클래스에게 전달해 주면 된다.
	}
	public BizException(Exception ex) { // 실제 발생할 Exception을 받아들여서 해당 Exception을 부모의 생성자에게 넘겨줄수 있는 생성자
		super(ex);
	}
} // 이미 부모클래스에서 같은 기능을 가진 생성자를 가지고 있기 때문에
// 사용자가 정의한 Exception객체에서는 해당 생성자를 부모의 생성자에게 전달만 해주면 된다.





//	Exception이나 RunTimeException클래스를 상속받아서 새로운 Exception클래스를 만들 수 있다.

//	public class 클래스aud extends Exception{
//		,,,
//	}

// class의 이름만 봐도 어떤 오류가 발생했는가를 알려주어 코드의 직관성을 높인다.

// 1. Exception을 상속받은 class들은 checked Exception이라고 한다. - 오류처리를 하지 않으면 컴파일 오류가 발생, 반드시 처리해야한다.
// 2. RuntimeException을 상속받은 class들은 Unchecked Exception이라고 한다. - 오류처리를 바로 하지 않아도 컴파일상에서 오류를 발생시키지는 않는다.

// 모든 예외상황에 대해서는 적절하게 처리를 해주는것이 프로그램이 수행될때 조금 더 안정적으로 수행하도록 도와준다.