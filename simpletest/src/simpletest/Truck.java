package simpletest;

public class Truck extends Car3 {
	public Truck() {
		super("트레일러"); // 컴파일러는 자동으로 이 생성자를 생성한다. 부모의 생성자 호출

//		super();
		
//		부모의 생성자를 내가 호출하지 않으면 컴파일러는 기본 생성자만 호출하게 되어있다.
//		상속받은 부모 Car3를 살펴보면 기본생성자를 가지고 있지 않고
//		String값을 받아들이는 생성자만 가지고 있기 때문에
//		super()로 이름을 받는 부모의 생성자를 호출해줘야 오류가 발생하지 않는다.
		
		System.out.println("Truck의 기본 생성자 입니다.");

	}
	

//	Overriding
//	부모가 가지고 있는 method를 자식이 가져와 재정의 하는것
	public void run() {
		super.run();
//		위와같이 super를 통해 명시적으로 호출을 해주면 부모가 가진 run 메소드도 실행이 가능하다.
// 		또한 부모의 메소드도 사라지지 않고 같이 호출이 된다.
		
		System.out.println("Truck의 run method");
	}
	
}
