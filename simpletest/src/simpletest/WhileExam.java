package simpletest;

public class WhileExam {

	public static void main(String[] args) {
		// �ݺ��� while
		int i = 0;
		
		while(i<10) {
			System.out.println(i);
			i++; //i = i+1;
		} //while���� �߸��ϸ� �������� �ݺ��ȴ�.

		int total = 0;
		int e = 1;
		
		while(e<=100) {
			total = total + e;
			e++;
		}
		System.out.println(total);
		
		// while(true){ } ���ѹݺ�
	}

}
