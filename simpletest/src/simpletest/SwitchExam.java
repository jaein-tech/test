package simpletest;

public class SwitchExam {

	public static void main(String[] args) {
		// switch, case, default, break
		// switch���� � ������ ���� ���� ������ ������ �� �ֵ��� �ϴ� ���
		
		int value = 2;
		
		
		switch(value) {
			case 1: // 1�� ������� ����
				System.out.println("1");
			case 2: // value�� 2 �̱� ������ 2���� ������ �ָ��� ����
				System.out.println("2");
			case 3:
				System.out.println("3");
				break; // break�� �ֱ� ������ �ؿ� default���� ������� �ʴ´�.
			default:
				System.out.println("�� ��");
				
		} // �ش�Ǵ� ���̽��� ����ϰ� �ʹٸ� �ݵ�� break���
		// jdk 7 ���� ������ value�� ������ �� �� �־���
		// jdk 7 ���ĺ��� value�� ���ڿ��� �� �� �ִ�.
		
		String str = "G";
		switch(str) {
			case "D":
				System.out.println("D");
				break;
			case "G": {
				System.out.println("G");
				break;
			}
		}

	}

}
