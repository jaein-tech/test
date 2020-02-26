package simpletest;

public class EnumExam {
	public static final String MALE="MALE"; // 상수를 선언할때는 전체의 변수명을 대문자로 쓰는것이 관례
	public static final String FEMALE="FEMALE";
	
	public static void main(String[] args) {
		// 열거형타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있다.
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;
		
		gender1 = "boy"; // complie error는 발생하지 않지만 문제가 있음
		
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;
		
//		gender2 = "boy"; = complie error
		
		// 특정 값만 가져다 사용해야 한다면 열거형을 사용하는것이 좋다.
	}

}
//enum 이름 {값1,값2;}
enum Gender{
	MALE, FEMALE;
}