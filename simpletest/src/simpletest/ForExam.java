package simpletest;

public class ForExam {

	public static void main(String[] args) {
		int total = 0;
		
		// for �ݺ���, �����ʱ�ȭ, ���ǽ�, �������� ��� ���ٿ� ǥ�õȴ�.
		for(int i = 1; i <= 100; i++) {
			total = total + i;
		}
		
		System.out.println(total);
		
		
		
		int total2 = 0;
		// 1���� 100������ ���߿��� ~
		for(int i2 = 1; i2 <=100; i2++) {
			if(i2 % 2 != 0) {
				continue; // ���� i2�� Ȧ����� �ٷ� �Ʒ��ʿ� �ݺ����� �ش��ϴ� ������ ���������ʴ´�.
			}
			total2 = total2 + i2; // ���� i2�� Ȧ����� ������� �ʰ� �ٷ� i2�� 1����.
		}
		
		System.out.println(total2);
		
		
		int total3 = 0;
		// 1���� 100������ ���߿��� ~
		for(int i3 = 1; i3 <=100; i3++) {
			
			total3 = total3 + i3;
			if(i3 == 50) { // 50���� ����ϰ� �ʹ�.
				break; // break;�� ������ ���� �ٷ� �ݺ������� �������´�.
			}
		}
			
		System.out.println(total3);

	}

}
