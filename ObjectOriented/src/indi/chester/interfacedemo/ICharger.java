package indi.chester.interfacedemo;

//���ӿ�
//�ӿ�: ������Ϊ��һ����׼, ʵ������ӿڵ���������ر�׼
//�ӿڷ��� Ĭ����public, abstract��, ���ǿ��Ÿ�ʵ��������ȥ��д
//�ӿڷ������Ա�default, staticȥ����,�������˲���Ҫ��д
//		��default����,ǿ�����Ǹ��������һ��Ĭ�Ϲ���, ʵ������ӿڵ�����Բ���һһȥ��д
//		��static����ǿ���������������������ӿڵ�һ����������,Ҳ�����豻ʵ�ֽӿڵ���ȥ��д
//�ӿڱ���Ĭ�� public, final, ���ǿ��ų����ı�׼,��Ȼ�Ǳ�׼�Ͳ��ܸľ�Ӧ����final����
public interface ICharger {
	int maxVoltage=220;
	
	static void chargerVoltage() {
		System.out.println("Ĭ�ϳ���ѹ : "+maxVoltage +" V.");
	}
	
	//��static, ��default����,һ��Ҫ��д
	void chargerType() ;
	
}
