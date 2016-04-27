package com.java.algorithm.LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 * 将两个有序链表合并成一个有序链表
 * @author zhongyao
 *
 */
public class LinkedListMerge {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		
		List<Integer> list2 = new LinkedList<Integer>();
		
		Collections.addAll(list1, 9,4,3,7);
		Collections.addAll(list2, 5,3,6,2);
		
		test(list1,list2);
	}

	private static void test(List<Integer> list1, List<Integer> list2) {
		list1.removeAll(list2);
		list2.addAll(list1);
		Collections.sort(list2);
		System.out.println("list1:"+list1+"\nlist2:"+list2);
	}

}
