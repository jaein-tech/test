package simpletest;

public class MyClassExam {

	public static void main(String[] args) {
		// class�� ���� method�� ����ϱ� ���ؼ��� ��ü�� ������ ��� �� �� �ִ�.
		
		Myclass myclass = new Myclass();
		
		myclass.method1(); // m1�� ����Ǹ�...
		
		myclass.method2(1); // (1), 1�� �̿��� m2 ����
		
		int value = myclass.method3(); // m3�� ����
		System.out.println("m3�� return�� �� : " + value); // m3�� return�� �� : 10
		
		myclass.method4(2,3); // (2+3), 5�� �̿��� m4 ����
		
		int value2 = myclass.method5(4); // (4), 4�� �̿���  m5 ����
		System.out.println("m5�� ruturn�� �� : " + value2); // m5�� ruturn�� �� : 6
	}

}
