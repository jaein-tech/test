package simpletest;

public class Car {

	String name;
	int number;
	// �����ڸ� ����� ������ ���� ������ �ڵ����� �����Ϸ��� �⺻�����ڸ� �����.
	// �����ڰ� �ϴ��� = ��ü�� �ɶ� �ʵ带 �ʱ�ȭ �ϴ� ����
	
	
	// �Ʒ� �ٷ� �����ڸ� ������.
	
	public Car(String name) {
		this.name = name;
	}
	
	// ��ü �ڽ��� �����ϴ� this
	// this.methodName
	
	// ������ �����ε�
	// method�� ���������� �Ű������� ���� Ÿ���� �ٸ��ٸ� �������� �����ڸ� ������ �� �ִ�.
	public Car() {
//		this.name = "�̸�����";
//		this.number = 0;
		this("�̸�����",0); // ���� ����
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
