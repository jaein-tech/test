package simpletest;

public class Car {

	String name;
	int number;
	// 생성자를 만들어 둔적이 없기 때문에 자동으로 컴파일러는 기본생성자를 만든다.
	// 생성자가 하는일 = 객체가 될때 필드를 초기화 하는 역할
	
	
	// 아래 바로 생성자를 만들어본다.
	
	public Car(String name) {
		this.name = name;
	}
	
	// 객체 자신을 참조하는 this
	// this.methodName
	
	// 생성자 오버로딩
	// method와 마찬가지로 매개변수의 수와 타입이 다르다면 여러개의 생성자를 선언할 수 있다.
	public Car() {
//		this.name = "이름없음";
//		this.number = 0;
		this("이름없음",0); // 위와 같음
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
