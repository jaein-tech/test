package simpletest;

public interface Calculator {
//	java 8부터는 default method와 static method 정의 가능
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) {
		return i + j;
	}
	
	public static int exec2(int i, int j) {
		return i * j;
	}
}
