package indi.chester.string;

// String �����equals �� == ��������
public class StringDemo2 {

	public static void main(String[] args) {
		String str1="java se";//str1��ջ�ռ�d��һ�����ã�ָ�������е�"java se"
		String str2="java se";//str2��ջ�ռ�d��һ�����ã�Ҳָ�������е�"java se"
		String str3=new String("java se");//str3��ջ�ռ�d��һ������, ָ��ѿռ��new�����Ķ���
		
		// 	String ����丸��� equals������������д���Ƚϵ����ַ�����ֵ
		System.out.println("str1 �� str2 ���� ��ͬ��? : "+(str1.equals(str2)));//true
		System.out.println("str1 �� str3 ���� ��ͬ��? : "+(str1.equals(str3)));//true
		
		System.out.println("str1 �� str2 ��ַ ��ͬ��? : "+(str1==str2));//true
		System.out.println("str1 �� str3 ��ַ ��ͬ��? : "+(str1==str3));//false

	}

}
