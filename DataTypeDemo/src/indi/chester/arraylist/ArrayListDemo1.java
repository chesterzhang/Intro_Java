package indi.chester.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList ��������
 * @author Chester_Zhang
 *
 */


//ArrayList ��������, ��һ����
//�ײ�������ʵ��
//���Զ�̬����
//���б�β�������ɾ�����ݷǳ���Ч
//���ʺϲ��Һ͸���Ԫ��
//���÷��� add, get, remove


public class ArrayListDemo1 {

	public static void main(String[] args) {
		// ��ArrayList�洢������Ե�����,�����
				List<String> list=new ArrayList<String>();	
				list.add("Java");
				list.add("C");
				list.add("C++");
				list.add("Go");
				list.add("Swift");

				//����б���Ԫ�ظ���
				System.out.println("�б���Ԫ�ظ���Ϊ : "+list.size());
				
				System.out.println("==============================");
				
				//����setԪ��
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i)+ " ");
				}
				
				System.out.println();
				System.out.println("==============================");
				
				//��list��������
				Collections.sort(list);
				System.out.println("list�����:");
				for(int i=0;i<list.size();i++) {
					System.out.print(list.get(i)+ " ");
				}
				
				System.out.println();
				System.out.println("==============================");
				
				
				//�Ƴ��б��е�C++
				System.out.println();
				//list.remove(2);
				list.remove("C++");
				System.out.println("==============================");
				System.out.println("�Ƴ��б���C++�Ժ��Ԫ��Ϊ:");
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i)+ " ");
				}
				
				

	}

}
