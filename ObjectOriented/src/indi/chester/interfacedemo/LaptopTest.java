package indi.chester.interfacedemo;

//һ���������׸㶮ʲô�ǽӿ�
//�㶮�ӿ��еı���,����ΪʲôĬ��/��Ҫ��default, final,static ����
//�㶮�ӿڵļ̳�, һ����ʵ�ֶ���ӿ�
public class LaptopTest {

	public static void main(String[] args) {
		
		Laptop lp1= new Laptop();
		lp1.connect();
		lp1.chargerType();
		System.out.println("�����������ѹ : "+ICharger.maxVoltage );
 
	}
	
}
