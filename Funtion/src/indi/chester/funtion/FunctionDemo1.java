package indi.chester.funtion;

/**
 * Java��������, �������壬�������أ��������ɱ�����б�
 * @author Chester_Zhang
 */

public class FunctionDemo1 {
	
	//��������: �������Ʒ� �������� ������(����1, ����2, ...��
	 
	public  int plus(int a, int b) {
		return a+b;
	}
	
	//��������: ���˲������벻ͬ,����������ͬ,����������: ��һ��������ͬһ���������в�ͬ������
	public  float plus(float a, float b) {
		return a+b;
	}
	
	//�ɱ�����б���Ϊ����
	//���ɱ߲����Ͳ��ɱ��������
	public void  search(int n, int... a) {
		boolean flag=false;
		for(int a1:a) {
			if (a1==n) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("�ҵ��� "+n);
		}else {
			System.out.println("û�ҵ� "+n);
		}
	}
	
	
	public static void main(String[] args) {
		
		int a=1, b=2;
		FunctionDemo1 fd=new FunctionDemo1();
		System.out.println("1+2 = "+fd.plus(a,b));
		
		float c=1.0f, d=2.0f;
		System.out.println("1.0+2.0 = "+fd.plus(a,b));
		
		int[] arr={5,4,3,2,1,0};
		fd.search(1, arr);
		fd.search(1, 5,4,3,2,1,0);
	}
}
