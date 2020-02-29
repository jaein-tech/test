package simpletest;

public class AccessObj {
	// 접근제한자
	public int p = 3; // public 모두에게 공개
	protected int p2 = 4; // protected 같은 패키지인 경우 접근허용, 다른패키지라도 상속을 받은경우 접근 허용
	int k = 2; // default 접근지정자. 아무것도 쓰지 않는경우 자기 자신과 같은 패키지 내에서 접근허용
	private int i = 1; // 자기 자신만 접근가능
}
