package indi.chester.controflow;

/**
 * ѭ�����, for ѭ��, While ѭ��, do-while ѭ��
 * @author Chester_Zhang
 */


// break, continue �����java�������Ȼ����,���ﲻ׸��
public class LoopDemo {

	public static void main(String[] args) {
		//�� for ѭ����1��10�ۼ�
		int sum=0;
		for(int i=1; i<=10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//�� while ѭ����1��10�ۼ�
		int i=1;
		sum=0;
		while(i<=10) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
		
		//�� do-while ѭ����1��10�ۼ�
		i=1;
		sum=0;
		do {
			sum=sum+i;
			i=i+1;
		}while(i<=10);
		System.out.println(sum);
		

	}

}
