package simpletest;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// do while���� ������ �ѹ��� ����ȴ�.
		int value = 0;
		Scanner scan = new Scanner(System.in); // Ű����� ���� ���� �Է¹޴´�
		
				
		// �׻� do���� ���۵Ǳ� ������ �ѹ��� �����
		do {
			// ������ �ݺ��� �����
			value = scan.nextInt();
			System.out.println("�Է°� :" +value);
			
		}while(value != 10);
		
		System.out.println("�ݺ��� ����");

	}

}
