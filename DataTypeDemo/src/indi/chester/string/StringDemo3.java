package indi.chester.string;

//String ����Ĳ��ɱ���
public class StringDemo3 {

	public static void main(String[] args) {
		String s1="java";//s1ָ����������java"
		s1="hello,"+s1;//s1ָ�����������"hello,java"
		System.out.println("s1="+s1);
		
		//String ����һ���� new �����������ɱ�
		//�����ַ������¸�ֵ�����൱��new��һ���¶���

		//�ö���==����
		System.out.println("s1 ��ַ"+s1==(s1="python"));
		
		//�ö���hashcode����,����hashcode�������java�ĵ�
		System.out.println(s1.hashCode());
		s1="C++";
		System.out.println(s1.hashCode());
	 
	}

}
