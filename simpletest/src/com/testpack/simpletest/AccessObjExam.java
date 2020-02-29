package com.testpack.simpletest;

import simpletest.AccessObj;

public class AccessObjExam extends AccessObj {

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		
		System.out.println(obj.p);    //public
		System.out.println(obj.p2);   //protected 패키지가 다르지만 상속받아서 실행가능
//		System.out.println(obj.k);      private 패키지가 달라 실행 불가
//		System.out.println(obj.i);      default 접근지정자  패키지 같아도 자기 자신이 아니면 실행불가

	}

}
