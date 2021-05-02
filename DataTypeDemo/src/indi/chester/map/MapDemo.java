package indi.chester.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Map
 * 
 * @author Chester_Zhang
 *
 */

//Map �е��������Լ�ֵ�� key-value ����ʽ�洢�ģ� ͨ��key �ҵ�value, key�����ظ�
//key-value��Entry���͵Ķ���ʵ������

public class MapDemo {

	public static void main(String[] args) {
		// ʵ��һ���ʵ�
		Map<String, String> animal = new HashMap<String, String>();

		animal.put("Cat", "è");
		animal.put("Dog", "��");

		System.out.println("============================");

		// ��ӡ���Map��values, ʹ�õ�����
		System.out.println("��ӡ���Map��values, ʹ�õ����� ");
		Iterator<String> it = animal.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("============================");

		// ��ӡ���Map��key��value,ͨ��entrySet����
		// entrySet����ֵ��Set<Entry<key����, value����>>
		System.out.println("ͨ��entrySet�õ�key-value :");
		Set<Entry<String, String>> entrySet = animal.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.print(entry.getKey() + " - ");
			System.out.println(entry.getValue());
		}

		System.out.println("============================");

		// ��ӡ���Map��key��value,ͨ��entrySet����
		String strSearch = "Cat";
		// 1.ȡ��KeySet
		Set<String> keySet = animal.keySet();
		// 2.����keySet
		for (String key : keySet) {
			if (strSearch.equals(key)) {
				System.out.println("�ҵ���,��ֵ��Ϊ : " + key + " - " + animal.get(key));
				break;
			}
		}

	}

}
