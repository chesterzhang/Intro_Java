package indi.chester.animal;

public class CatTest {

	public static void main(String[] args) {
		
		Animal.sleep();
		
		Cat cat1= new Cat("����",3, "�𽥲�","С���");
		Cat cat2= new Cat("̩��",4, "����","�����ͷ");
		
		cat1.eat();
		cat2.eat();
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		System.out.println("cat1 �� cat2 ��ͬһ��������? "+ cat1.equals(cat2));
		System.out.println("cat1 �� �ַ��� \"cat1\" ��ͬһ��������? "+ cat1.equals("cat1"));
		
		System.out.println("cat1 �� Animal��ʵ������ ? "+ (cat1 instanceof  Animal)); 
		
		//���಻��ʵ����, ֻ��ͨ������������ת��
		Animal tempCat = (Animal) cat1;
		//Animal a1= new Animal("����",10,"��ë"); //����ʵ����ֱ�ӱ���
 
	 
	}

}
