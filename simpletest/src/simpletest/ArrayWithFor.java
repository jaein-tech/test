package simpletest;

public class ArrayWithFor {

	public static void main(String[] args) {
		// 
		int [] iarray = new int[100];
		// iarray[0] = 1;
		// iarray[1] = 2;
		
		// �迭�� �迭�� ũ�⸦ �˾Ƴ� �� �ִ�. (.length) = ũ�� �� ���̸� �˷���
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		}
		System.out.println(iarray[50]);

		
		// ������ ������ ������ ���Ŀ� ���� �� ������ ����� �� �ִ� ������ �޶��� (������ ������)
		// �⺻������ ������ ����� ������ ���ΰ� �ִ� ��ȣ���� �� ������ ������
		// ������ ����ɴ� �����Ǿ��ٰ� �ش���� ������ �Ҹ��Ѵ�.
		int sum = 0;
		for(int i = 0; i < iarray.length; i++) {
			sum = sum + iarray[i];
		}
		System.out.println(sum);
	}

}
