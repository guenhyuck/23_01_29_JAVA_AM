package com.KoreaIT.jav.AM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== ���α׷� ���� ==");
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("��ɾ�) ");
		String cmd;
		cmd = sc.next();
		System.out.printf("�Է� �� ��ɾ� : %s\n", cmd);
		int num = sc.nextInt();
		System.out.printf("�Էõ� ���� : %d\n" , num);
		
		sc.close();
		System.out.println("== ���α׷� ���� ==");
		
		

	}

}
