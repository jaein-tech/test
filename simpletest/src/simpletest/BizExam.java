package simpletest;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		
		// 오류를 발생하는 코드
		try {
			biz.bizMethod(-3);
		}catch(Exception e){
			e.printStackTrace();
		}
		// Exception이 발생했을때 try-catch블록으로 묶어서 처리한다.
		// Biz가 붙은 예제 파일들은 RuntimeException을 상속받고 있는 method를 throw하고 있기 때문에
		// 컴파일상에 반드시 Exception 처리를 하라고 에러를 발생시키지는 않는다.
	}

}
