package simpletest;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(5);
		
		// ������ �߻��ϴ� �ڵ�
		try {
			biz.bizMethod(-3);
		}catch(Exception e){
			e.printStackTrace();
		}
		// Exception�� �߻������� try-catch������� ��� ó���Ѵ�.
		// Biz�� ���� ���� ���ϵ��� RuntimeException�� ��ӹް� �ִ� method�� throw�ϰ� �ֱ� ������
		// �����ϻ� �ݵ�� Exception ó���� �϶�� ������ �߻���Ű���� �ʴ´�.
	}

}
