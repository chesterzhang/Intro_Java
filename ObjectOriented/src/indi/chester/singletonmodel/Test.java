package indi.chester.singletonmodel;

public class Test {

	public static void main(String[] args) {
		// ˽�л����캯���޷�����
		// SingletonOne one=new SingletonOne();

		// ֻ��ͨ�����еľ�̬����ֱ�ӻ�ȡһ����̬ʵ��
		//����ʽ
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);//��Ϊ�ǵ���ģʽ, ���Ե�ַ��ͬ

		System.out.println("\n=============================================\n");
		//����ʽ
		SingletonTwo one1 = SingletonTwo.getInstance();
		SingletonTwo two1 = SingletonTwo.getInstance();
		System.out.println(one1);
		System.out.println(two1);//��Ϊ�ǵ���ģʽ, ���Ե�ַ��ͬ

	}

}
