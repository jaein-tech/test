package simpletest;

public interface TV {
	// interface�� ��ü������ Ÿ���� ������ �� �� ������ ������ �Ȱ��� �ϳ��� ���� ������ interface ��ü��  ��ü�� ������ ������ ���Ѵ�.
	
	// interface�� �����Ҷ��� �� ��ü�� �����ϱ� ���� '�� ��ü�� � ����� ������ �־�� �ϴ°�'��� ������ ��ɵ��� ��Ƴ������̶�� �����ϸ� �ȴ�.
	// ���� ����� ���Ǹ� ���� ���� ������ ������ ����.
	
	public int MIN_VOLUME=0;  // ��� final�̶�� Ű���带 �ٿ����� �ϴµ� �׷� Ű���尡 ��� �����Ѵ�.
	public int MAX_VOLUME=100;
	
	public void turnOn();
//	�߻� Ŭ������ ����ϴ�.
//	�߻� �޼ҵ�� abstract�� �ٿ��� ������ interface�� �� ��ü������ �־ ������ ������ ������ �ʾƵ� �ȴ�.
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);
	

}
