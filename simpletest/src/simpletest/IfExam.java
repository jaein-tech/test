package simpletest;

public class IfExam {
	
	public static void main(String[] args) {
		// ���ǹ�
		int x = 50;
		int y = 60;
		
		if (x < y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}
		
		// ���ǿ� �Ҹ����Ͽ� ���� �Ұ�
		if (x > y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}
		
		if (x == y) {
			System.out.println("x�� y�� �����ϴ�.");
		}else if (x < y){
			System.out.println("x�� y���� �۽��ϴ�.");
		}else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}

	}
}
