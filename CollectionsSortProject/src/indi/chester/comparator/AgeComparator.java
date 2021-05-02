package indi.chester.comparator;

import java.util.Comparator;

/**
 * ͨ��Comparator�ӿ���дcompare����, ʵ�ֶ�Cat������Age���н�������
 * 
 * @author Chester_Zhang
 *
 */

public class AgeComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		// ��дcompare����
		// compare(T arg1, T arg2) ���ظ�����arg1<arg2, ����0���, ����������arg1>arg2
		int age1 = o1.getMonth();
		int age2 = o2.getMonth();
		
		//��Ϊ�ǽ���, ���ɲ���2-����1 
		return age2 - age1;
	}

}
