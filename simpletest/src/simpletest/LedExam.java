package simpletest;

// �������̽� ����ϱ�
public class LedExam {

	public static void main(String[] args) {
//		�������̽��� Ÿ���� �� �� �ִ�
		TV tv = new LedTV();
		
//		��ӿ��� ����� ����� ����ϴ�.
		tv.turnOn();
		tv.turnOff();
		tv.changeChannel(15);
		tv.changeVolume(20);
		
	}	

}
