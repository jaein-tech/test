package com.testpack.simpletest;

import simpletest.AccessObj;

public class AccessObjExam extends AccessObj {

	public static void main(String[] args) {
		AccessObjExam obj = new AccessObjExam();
		
		System.out.println(obj.p);    //public
		System.out.println(obj.p2);   //protected ��Ű���� �ٸ����� ��ӹ޾Ƽ� ���డ��
//		System.out.println(obj.k);      private ��Ű���� �޶� ���� �Ұ�
//		System.out.println(obj.i);      default ����������  ��Ű�� ���Ƶ� �ڱ� �ڽ��� �ƴϸ� ����Ұ�

	}

}
