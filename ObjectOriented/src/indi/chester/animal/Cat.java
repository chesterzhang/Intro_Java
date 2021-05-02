package indi.chester.animal;

//Cat �̳��� Animal
//��ϣ��Cat���̳�, ����ʹ��final����
//������һ��private����food
//��д�˸����getName, getMonth����, ������Ϊprotected, ��дΪpublic�������
//��д�˸����eat����

public final class Cat extends Animal {
	
	private String food;

	public Cat(String name, int month, String species,String food ) {
		//���๹��Ĭ�ϵ��ø�����޲ι��췽��
		//����ͨ��super()���ø����������ʵĴ��ι���
		//super()������ڵ�һ��
		super(name,month,species);
		this.setFood(food);
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}


	@Override
	public void eat() {
		System.out.println(this.getName() + "ϲ����"+this.getFood()+"!");
	}
	

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public  int getMonth() {
		return super.getMonth();
	}

	 
	
}
