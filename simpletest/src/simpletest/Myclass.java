package simpletest;

public class Myclass {
//	method�� class ���ο� �����ؾ� �Ѵ٤�.
//	������
//	public returnType methodName (parameter){
//		�ʿ��� ��ɵ��� ����ȿ� ���� 
//	}
	
//	return type = method�� ����� �Ŀ� ������� �ǵ��� �ִ� �κ�, � Ÿ������ ������ ���ΰ� 
//	methodName = �̸� 
//	(parameter) = �Ű������� �ִ´�.
	
	
	
	// return type�� ���� ��� - public �ڿ� void
	public void method1() {
		System.out.println("m1�� ����Ǹ�...");
	}
	
	// int(��, ����)���� �޾Ƶ��̰� return ���� �ʴ� ���
	public void method2(int x) {
		System.out.println(x + "�� �̿��� m2 ����");
	}
	
	// �ƹ����� �޾Ƶ����� �ʾ����� ������ �����ؼ� ���� �����ִ� ���
	public int method3() {
		System.out.println("m3�� ����");
		return 10;
	}
	
	// int���� 2�� �޾Ƶ��̰� return ���� �ʴ°��
	public void method4(int x, int y) {
		System.out.println(x + y + "�� �̿��� m4 ����");
	}
	
	// int���� �޾Ƶ��̰� int�� return �ϴ� ���
	public int method5(int u) {
		System.out.println(u + "�� �̿���  m5 ����");
		return u+2;
	}
	
}
