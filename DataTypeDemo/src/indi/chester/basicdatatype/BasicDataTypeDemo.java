package indi.chester.basicdatatype;

//������ʾJava ������������:
//1. ���� byte,short, int, long
//2. ������ float double
//3. �ַ��� char
//4. ������ boolean

public class BasicDataTypeDemo {

	public static void main(String[] args) {
		byte a= 20;
		short b=20;
		int c=20;
		long d1=20;
		long d2=024;//�˽���: ����0��ͷ
		long d3=0X14L;//ʮ������: 0X��ͷ
		float e=20f;
		double f=20d;
		
		char g=20;//��Ӧ��ASCII��
		
		boolean h=false;
		
		System.out.println("byte ���� 20 : "+a);
		System.out.println("short  ���� 20 : "+b);
		System.out.println("int   ���� 20 : "+c);
		System.out.println("long ʮ���� ���� 20 : "+d1);
		System.out.println("long �˽��� ���� 20 : "+d2);
		System.out.println("long ʮ������ ����  20 : "+d3);
		System.out.println("float ����  20 : "+e);
		System.out.println("double ����  20 : "+f);
		System.out.println("char   ���� 20 : "+g);
		System.out.println("boolean   ���� false: "+h);


	}

}
