package simpletest;

public class OperatorExam5 {

	public static void main(String[] args) {
		// ���׿�����, if ������ �����
		int a1 = (3 > 4) ? 50 : 40;
		// a1�� ����� �´ٸ� (?) return 50
		// a1�� ����� Ʋ���ٸ� (:) return 40
		System.out.println(a1); // 40

		
		int a2 = 0;
		if(3 > 4) {
			a2 = 50;
		}else {
			a2 = 40;
		}
		
		System.out.println(a2);
	}

}
