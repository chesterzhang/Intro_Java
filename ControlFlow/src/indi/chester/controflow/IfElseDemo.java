package indi.chester.controflow;

import java.util.Scanner;
/**
 * If else ���
 * @author Chester_Zhang
 */
public class IfElseDemo {

	public static void main(String[] args) {
		System.out.println("������1-7 :");
		
		Scanner sc= new Scanner(System.in);
		int weekDay=sc.nextInt();
		
		if (weekDay == 1) {
			System.out.println("��һ");
		}else if(weekDay == 2) {
			System.out.println("�ܶ�");
		}else if(weekDay == 3) {
			System.out.println("����");
		}else if(weekDay == 4) {
			System.out.println("����");
		}else if(weekDay == 5) {
			System.out.println("����");
		}else if(weekDay == 6) {
			System.out.println("����");
		}else if(weekDay == 7) {
			System.out.println("����");
		}else {
			System.out.println("һ��ֻ��7��, ������1-7��");
		}


			
	}

}
