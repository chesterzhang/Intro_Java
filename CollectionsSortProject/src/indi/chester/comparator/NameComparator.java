package indi.chester.comparator;

/**
 * ͨ��Comparator�ӿ���дcompare����, ʵ�ֶ�Cat������Name������������
 * @author Chester_Zhang
 *
 */

import java.util.Comparator;

public class NameComparator implements Comparator<Cat>{
	
	@Override
	public int compare(Cat o1, Cat o2) {
		//��дcompare����
		//compare(T arg1, T arg2) ���ظ�����arg1<arg2, ����0���, ����������arg1>arg2
		String name1=o1.getName();
		String name2=o2.getName();
		
		//�����ַ���compareTo ��������ַ��������
		int n=name1.compareTo(name2);
		
		return n;
	}
}
