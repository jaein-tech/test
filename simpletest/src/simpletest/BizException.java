package simpletest;

// ����� ���� Exception
public class BizException extends RuntimeException {
	public BizException(String msg) { // ������� �߻��ߴ��� String������ �޽����� �������� ������
		super(msg); // �θ��� �����ڸ� ȣ���ϴ� super, �Ű������� ���޹��� ���� �θ�Ŭ�������� ������ �ָ� �ȴ�.
	}
	public BizException(Exception ex) { // ���� �߻��� Exception�� �޾Ƶ鿩�� �ش� Exception�� �θ��� �����ڿ��� �Ѱ��ټ� �ִ� ������
		super(ex);
	}
} // �̹� �θ�Ŭ�������� ���� ����� ���� �����ڸ� ������ �ֱ� ������
// ����ڰ� ������ Exception��ü������ �ش� �����ڸ� �θ��� �����ڿ��� ���޸� ���ָ� �ȴ�.





//	Exception�̳� RunTimeExceptionŬ������ ��ӹ޾Ƽ� ���ο� ExceptionŬ������ ���� �� �ִ�.

//	public class Ŭ����aud extends Exception{
//		,,,
//	}

// class�� �̸��� ���� � ������ �߻��ߴ°��� �˷��־� �ڵ��� �������� ���δ�.

// 1. Exception�� ��ӹ��� class���� checked Exception�̶�� �Ѵ�. - ����ó���� ���� ������ ������ ������ �߻�, �ݵ�� ó���ؾ��Ѵ�.
// 2. RuntimeException�� ��ӹ��� class���� Unchecked Exception�̶�� �Ѵ�. - ����ó���� �ٷ� ���� �ʾƵ� �����ϻ󿡼� ������ �߻���Ű���� �ʴ´�.

// ��� ���ܻ�Ȳ�� ���ؼ��� �����ϰ� ó���� ���ִ°��� ���α׷��� ����ɶ� ���� �� ���������� �����ϵ��� �����ش�.