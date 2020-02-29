package simpletest;

public abstract class Bird { // abstract 추상클래스
	// 추상클래스
	public abstract void sing(); // abstract 추상메소드가 하나라도 있으면 추상클래스가 되어야 한다.
	
	public void fly() {
		System.out.println("날다."); // 추상 클래스 내부에는 일반 메소드도 구현가능
	}
}
