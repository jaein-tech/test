package simpletest;

public class ActionExam {

	public static void main(String[] args) {
		// ����Ŭ���� - �͸�Ŭ����
//		Action action = new MyAction();
//		action.exec();
		
		Action action = new Action() {  // ������ ������ ������ {}�� �ش� ������ �̸��� �ش��ϴ� Ŭ������ ��ӹ��� �̸����� ��ü�� ����ٴ°��� �ǹ�
//			method�� �����ϰų� �߰��� �� �ִ�.
//			�̷��� ������ �̸����� ��ü�� action�̶�� ���������� �����ϵ��� �Ͽ���.
			@Override
			public void exec() {
				System.out.println("exec");
			}
		};
		action.exec();
		
//		�͸�Ŭ������ ����ϴ� ���� ��ӹ޴� Ŭ������ ���� ���� �ʿ䰡 ���°�쿡 ����� �� �ִ�.
//		ex) �ش�Ŭ���� �ȿ����� ���ǰ� �ٸ�Ŭ���������� ���� �ʿ���� ���
	}

}
