package indi.chester.animal;

//һ������˵�� ������� ��װ���̳У���̬

//private�÷�: 1.�����г�Ա��������Ϊprivate, ���г�Ա��������ͨ������������
//					   2.����ϣ������չʾ�ķ���Ҳ��private ����
//protected �÷�:1. ���෽������Ϊprotected, ������д��������Ϊpublic���Թ��������
// 				   �÷�: 2. ���෽������Ϊprotected,  ���෽�����������
//public �÷�:   ����ϣ������չʾ�ķ���ȫ����public����
//abstract �÷�: 1.�����࣬��ʾһ��������, ���ܱ�ʵ����, ��Ŀ�ľ���������ȥ�̳� 

//����ʵ����һ��������Animal, ��ϣ������ʵ����,ֻϣ�������̳�
//����abstract ����Aanimal
//�ʽ�setter �� getter ��������Ϊprotected, ��ϣ��ͨ����ֱ�ӵ���,��ϣ��ͨ��������Ķ���������

//���ж��ﶼ��˯����,�� Animal.sleep������static����
//���ж��ﶼ��Զ���,���ǲ�ͬ�Ķ���ԵĲ�һ��,��Animal.eat������protected����
//ϣ��������дAnimal.eat����, ����abstract����
public abstract class Animal {

	private String name;
	private int month;
	private String species;

	protected Animal(String name, int month,String species) {
		this.setName(name);
		this.setMonth(month);
		this.setSpecies(species);
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getMonth() {
		return month;
	}

	protected void setMonth(int month) {
		this.month = month;
	}

	protected String getSpecies() {
		return species;
	}

	protected void setSpecies(String species) {
		this.species = species;
	}

	// ˯��������
	public static void sleep() {
		System.out.println("���ﶼ��˯����!");
	}

	protected abstract void eat() ;

	// ��дObject���equals����,�����ж�"����"�����Ƿ���һ������
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		try {
			Animal temp = (Animal) obj;// Ҫ��֤obj ����ת��ΪAnimal ����
			if (this.getName() == (temp.getName()) && this.getMonth() == temp.getMonth()
					&& this.getSpecies() == temp.getSpecies()) {
				return true;
			} else {
				return false;
			}
		} catch (java.lang.ClassCastException e) {
			e.printStackTrace();
			return false;
		}

	}

	// ����Animal���equals����
	public boolean equals(Animal obj) {
	 
		if (this.getName() == (obj.getName()) && this.getMonth() == obj.getMonth()
				&& this.getSpecies() == obj.getSpecies()) {
			return true;
		} else {
			return false;
		}

	}

	// ��дtoString����
	@Override
	public String toString() {
		return "�ǳ� : " + this.getName() + " , Ʒ�� : "+this.getSpecies()+" , ���� : " + this.getMonth() + "����";
	}

}
