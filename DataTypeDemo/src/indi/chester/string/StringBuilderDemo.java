package indi.chester.string;

//StringBuilder ���пɱ�����
//��Ƶ�������ַ���, ����ʹ��StringBuilder
// append, delete, insert, replace, substring����
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str1=new StringBuilder("���");
		System.out.println("StringBuilder str1 hashcode"+str1.hashCode());
		str1.append(',');
		str1.append("Java!");
		System.out.println("StringBuilder str1 hashcode"+str1.hashCode());//��ȫһ��
		System.out.println("str="+str1); 
		
		
		//���ַ�����ɡ����,C++!��
		//���ַ�ʽ
		//1. ʹ��delete����ɾ��mooc, �ٲ���MOOC
		//2.ʹ��replace����ֱ���滻
		System.out.println("�滻��:"+str1.delete(3,8).insert(3, "C++!"));
		System.out.println("�滻��:"+str1.replace(3, 8, "C++!"));
		
		//���ַ�����ȡ��"���"�����
		System.out.println("ȡ�� \"���\" : "+str1.substring(0,2));

	}

}
