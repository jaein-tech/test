package simpletest;

public class OperatorExam4 {

	public static void main(String[] args) {
//		��������;
//		����(and) - A&&B, �ǿ����ڰ� ��� true �϶��� return true;
//		����(or) - A||B (shift + \(��������)), �ǿ����ڰ� �� �� �ϳ��� true ���� return true;
//		������(not) - !A, ����� �ݴ�� ����, �ǿ����� �տ� ����
//		��Ÿ������ - A^B  ����Ʈ �� �ͽ�ũ��ú� ����, �ǿ����ڰ� �ϳ��� true �̰�, �ϳ��� false �϶��� return true;
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2); // false
		System.out.println(b1 && b3); // true
		
		System.out.println(b1 || b3); // true
		System.out.println(b1 || b2); // true
		
		System.out.println(!b3); // false
		
		System.out.println(b1 ^ b2); // true
		System.out.println(b1 ^ b3); // false
		
		// ����
		int number = 68;
		if(number <=100 && number >=70) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}

	}

}
