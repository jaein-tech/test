package simpletest;

public class MyCalTest {

	public static void main(String[] args) {
		
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(7, 8);
//		interface�� default method�� .���� �ҷ��� �� �ִ�.
		System.out.println(i);
		
		int x = Calculator.exec2(3, 4);
//		interface�� static method�� .���δ� �ҷ��� �� ���� �������̽���.�޼ҵ��();���� ȣ���ؾ� �Ѵ�.
		System.out.println(x);

	}

}
