package simpletest;

public interface TV {
	// interface는 자체적으로 타입의 역할은 할 수 있지만 구현이 된것이 하나도 없기 때문에 interface 자체가  객체를 생성해 놓지는 못한다.
	
	// interface를 정의할때는 그 객체를 선언하기 전에 '이 객체가 어떤 기능을 가지고 있어야 하는가'라고 생각한 기능들을 모아놓은것이라고 생각하면 된다.
	// 아직 기능을 정의만 했지 실제 구현을 하지는 않음.
	
	public int MIN_VOLUME=0;  // 상수 final이라는 키워드를 붙여줬어야 하는데 그런 키워드가 없어도 동작한다.
	public int MAX_VOLUME=100;
	
	public void turnOn();
//	추상 클래스와 비슷하다.
//	추상 메소드는 abstract를 붙여야 했지만 interface는 그 자체만으로 있어도 괜찮기 때문에 붙이지 않아도 된다.
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	

}
