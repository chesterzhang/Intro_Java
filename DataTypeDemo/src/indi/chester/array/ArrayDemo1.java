package indi.chester.array;

//һά����, ����Ҳ�������ͱ���
public class ArrayDemo1 {

	public static void main(String[] args) {
		//������ʽ: ����[] ������ = new ����[����]
		//��ʼ����ʽ: ������={Ԫ��1, Ԫ��2, ......, Ԫ��n}
		
		// ����������һ����������
		int[] intArray = new int[5];// Ĭ�ϳ�ʼֵΪ0

		// ����������һ���ַ�������
		String[] strArray = new String[10];// Ĭ�ϳ�ʼֵΪnull
		// ����������һ��float������
		float[] floatArray = new float[5];// Ĭ�ϳ�ʼֵΪ0

		// ��ʼ���ַ�����
		char[] ch = { 'a', 'b', 'c', 'd' };
		
		//��ǿ��forѭ���������ch
		for (char c:ch) {
			System.out.print(c+" ");
		}
		System.out.println();

		System.out.println("ch���鳤��Ϊ:" + ch.length);
		System.out.println("intArray����ĵ�2��Ԫ��Ϊ:" + intArray[1]);
		System.out.println("strArray����ĵ�5��Ԫ��Ϊ:" + strArray[4]);
		System.out.println("floatArray��������1��Ԫ��Ϊ:" + floatArray[floatArray.length - 1]);

	}

}
