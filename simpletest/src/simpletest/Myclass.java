package simpletest;

public class Myclass {
//	method는 class 내부에 선언해야 한다ㅏ.
//	선언방법
//	public returnType methodName (parameter){
//		필요한 기능들을 여기안에 구현 
//	}
	
//	return type = method가 실행된 후에 결과값을 되돌려 주는 부분, 어떤 타입으로 돌려줄 것인가 
//	methodName = 이름 
//	(parameter) = 매개변수를 넣는다.
	
	
	
	// return type이 없는 경우 - public 뒤에 void
	public void method1() {
		System.out.println("m1이 실행되면...");
	}
	
	// int(즉, 정수)값을 받아들이고 return 하지 않는 경우
	public void method2(int x) {
		System.out.println(x + "를 이용한 m2 실행");
	}
	
	// 아무값도 받아들이지 않았지만 뭔가를 수행해서 값을 돌려주는 경우
	public int method3() {
		System.out.println("m3이 실행");
		return 10;
	}
	
	// int값을 2개 받아들이고 return 하지 않는경우
	public void method4(int x, int y) {
		System.out.println(x + y + "를 이용한 m4 실행");
	}
	
	// int값을 받아들이고 int를 return 하는 경우
	public int method5(int u) {
		System.out.println(u + "를 이용한  m5 실행");
		return u+2;
	}
	
}
