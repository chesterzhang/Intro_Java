package indi.chester.interfacedemo;

public class Laptop implements IWifi, ISIM, ICharger {
	
 
	//���ڽӿ��з�default,��static, �����ж��default�����ķ���������д
	@Override
	public void connect() {
		System.out.print("�ʼǱ�");
		ISIM.super.connect();
		System.out.print("�ʼǱ�");
		IWifi.super.connect();
		
	}

	@Override
	public void chargerType() {
		System.out.println("�ʼǱ�ʹ�����׳����");
	}
	
}
