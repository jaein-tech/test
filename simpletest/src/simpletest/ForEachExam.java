package simpletest;

public class ForEachExam {

	public static void main(String[] args) {
		// for each
		
		int[] iarr = {10,20,30,40,50};
		
		for(int i = 0; i < iarr.length; i++) {
			int value = iarr[i];
			System.out.println(value);
		}
		
		
		// for each������ �ٲ㺸��
		// :�տ� ���� �޾Ƴ� ����
		// :�ڿ� ����ϰ� ���� �ڷᱸ���� �Է�
		for(int value:iarr) {
			System.out.println(value);
		}
		// ���� ����� ����.
	}

}
