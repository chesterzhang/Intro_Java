package indi.chester.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
	
	public static void main(String[] args) {
		
		// ����洢book��ص�List
		List<Book> books=new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());

		//����GoodsSeller ������ɶ���Ʒ�б�books ������
		GoodsSeller gs1= new GoodsSeller();
 
		gs1.sellGoods(books);
	 

	}

}
