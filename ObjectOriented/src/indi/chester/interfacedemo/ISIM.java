package indi.chester.interfacedemo;

//SIM�������ӿ�
//�ӿ�: ������Ϊ��һ����׼, ʵ������ӿڵ���������ر�׼
//�ӿڷ��� Ĭ����public, abstract��, ���ǿ��Ÿ�ʵ��������ȥ��д
//�ӿڷ������Ա�default, staticȥ����,�������˲���Ҫ��д
//		��default����,ǿ�����Ǹ��������һ��Ĭ�Ϲ���, ʵ������ӿڵ�����Բ���һһȥ��д
//		��static����ǿ���������������������ӿڵ�һ����������,Ҳ�����豻ʵ�ֽӿڵ���ȥ��д
//�ӿڱ���Ĭ�� public, final, ���ǿ��ų����ı�׼,��Ȼ�Ǳ�׼�Ͳ��ܸľ�Ӧ����final����
public interface ISIM extends INet {
	
	 default void connect() {
		 System.out.println("ʹ��SIM������");
	 }
	
}
