package indi.chester.string;

import java.io.UnsupportedEncodingException;

//String ��������, String��ͬ��һ��Ļ����������ͣ��䱾������һ����, ����������������
// length, substring,charAt, indexOf, lastIndexOf����
//String ��byte ������໥ת��
public class StringDemo1 {

	public static void main(String[] args) {
		// ����һ���ַ���"Java ��� ����"
		String str = new String("Java ��� ����");
		//String str = "Java ��� ����"; //������һ��ȼ�

		// length ��ӡ����ַ����ĳ���
		System.out.println("�ַ����ĳ����� : " + str.length());

		// substring ȥ���ִ�"��� ����"�����
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));

		// substring ȡ���ַ� "��" �����
		System.out.println(str.charAt(6));

		// index ����'a'�ַ����е�һ�γ��ֵ�λ��
		System.out.println("�ַ�'a'���ַ����е�һ�γ��ֵ�λ�� : " + str.indexOf('a'));

		// lastIndexOf ����'a'�ַ��������һ�γ��ֵ�λ��
		System.out.println("�ַ�'a'���ַ����е�һ�γ��ֵ�λ�� : " + str.lastIndexOf('a'));

		// ��λ��3��ʼ������'a'�ַ����е�һ�γ��ֵ�λ��
		System.out.println("��λ��8��ʼ���ַ�'a'���ַ����е�һ�γ��ֵ�λ�� : " + str.indexOf('a', 3));
		
		System.out.println("=============================");
		
		// ���ַ���ת��Ϊbyte����,����ӡ���
		byte[] arrs=null;
		try {
			arrs = str.getBytes("GBK");// Ҳ���Բ�ָ�������ʽ,winĬ��GBK��macĬ��UTF-8
			for (int i = 0; i < arrs.length; i++) {
				System.out.print(arrs[i]+" ");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		System.out.println();
		System.out.println("=============================");
		
		//��byte����ת��Ϊ�ַ���
		String str1=new String(arrs);//Ҳ���Բ�ָ�������ʽ,winĬ��GBK
		System.out.println(str1);
 
		


	}

}
