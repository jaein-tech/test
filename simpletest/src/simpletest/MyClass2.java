package simpletest;

public class MyClass2 {
	// Method Overloading
	
	// �Ű������� ������ Ÿ���� ���ݾ� �ٸ����� ����� ����� �ϴ� method���� �������� ���� �� �ִ�.
	// �� method���� ���� �ٸ��̸����� ���ǵǾ� �ִٸ� ���� � method�� ����ؾ� �ϴ��� �����ϱ� ����� ��찡 �ִ�.
	// �Ű������� ���� Ÿ���� �ٸ���� ������ �̸����� method�� �������� ���� �� �� �ִ�.
	
	
	// �Ʒ��� �Ȱ��� �̸����� method�� 3�� ������ ���Ҵ�. 
	// method overloading���� �߿��Ѱ��� �Ű������� ���� Ÿ���̴�. 
	public int plus (int x, int y) {
		return x + y;
	}
	
	public int plus(int x, int y, int z) {  // ���� method�� �Ű������� ���� �ٸ����� Ÿ���� int�� ���� ������ ����
		return x + y + z;
		
	}
	
	public String plus(String x, String y) {  // ù��°�� method�� Ÿ���� ���� �ٸ����� �Ű������� ���� ���Ƽ� ����
		return x + y;
	}
	
//	�Ʒ�ó�� �Ű������� �̸��� �ٸ��ٰ� �ؼ� ù��° method�� �ٸ��ٰ� �Ǵ������� �ʴ´�. Ÿ���� �߿��ϴ�.
//	public int plus (int i, int u) {
//		return i + u;
//	}	
}
