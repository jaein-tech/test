package simpletest;

public class TruckExam {

	public static void main(String[] args) {
		Truck t = new Truck();
		// = Car3�� �⺻ ������ �Դϴ�. + Truck�� �⺻������ �Դϴ�.
		// Truck�� instanceȭ �ɶ� Truck��ü�� �θ��� Car3��ü�� �޸𸮿� �ö󰣴�.
		
		// superŰ���� - �θ� ��ü�� ��Ÿ���� Ű���� : �θ��� �����ڰ� ȣ��ȴ�.
		
		
		t.run();

// ----------------------------		
		
		Car3 c = new Truck(); // �θ�Ÿ���� Car3 Ÿ������ �ڽ�Ÿ���� Truck�� ����ų �� �ִ�.
		c.run(); // ��밡��
//		c.stop(); // �θ� �ڽ��� ����Ű�� �ִ� �������� �θ� ������ �ִ� ���븸 ����� �� �ִ�.
		
//		class ����ȯ
		Truck truck = (Truck)c; // Truck�� �����ϴ� ��ü�� Car3�̱� ������ ����
		truck.run();
		truck.stop();
		
	}

}
