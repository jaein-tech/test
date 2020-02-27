package simpletest;

public class Fid1 {

	public static void main(String[] args) {
		// class의 속성을 field라고 한다.
		// 타입, 변수명, 필드명
		
		Car c1 = new Car("");
		Car c2 = new Car("");
		
		// .을 누르면 Car 객체가 가지고 있는것을 사용할 수 있다.
		c1.name = "자동차";
		c1.number = 5123;
		
		c2.name = "오토바이";
		c2.number = 5513;
		
		System.out.println(c1.name);
		System.out.println(c2.name);

	}

}
