package indi.chester.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * ��Cat��Ķ��������Ա����name������������, age���н�������
 * ͨ��Collections.sort(List<T> list, Comparator<? super T> c)����super T ��ʾ: T������
 * �����T����Cat
 */

public class CatTest {

	public static void main(String[] args) {

		Cat huahua = new Cat("huahua", 5, "Ӣ��");
		Cat fanfan = new Cat("fanfan", 2, "�л���԰è");

		List<Cat> catList = new ArrayList<Cat>();

		catList.add(huahua);
		catList.add(fanfan);

		// ����ǰ
		System.out.println("����������ǰ:");
		for (Cat cat : catList) {
			System.out.println(cat + " ");
		}
		System.out.println();

		// ����������
		Collections.sort(catList, new NameComparator());

		// �����
		System.out.println("�����������:");
		for (Cat cat : catList) {
			System.out.println(cat + " ");
		}
		System.out.println();

		// �����併������
		System.out.println("����������ǰ:");
		for (Cat cat : catList) {
			System.out.println(cat + " ");
		}
		System.out.println();

		// �����併������
		Collections.sort(catList, new AgeComparator());

		// �����
		System.out.println("�����������:");
		for (Cat cat : catList) {
			System.out.println(cat + " ");
		}
		System.out.println();

	}

}
