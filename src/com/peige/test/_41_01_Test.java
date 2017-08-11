package com.peige.test;

import com.peige.algo._41_StreamMedian_01;

public class _41_01_Test {

	public static void main(String[] args) {
		test1();
		test2();
	}
	
	/**
	 * 功能测试
	 */
	private static void test1() {
		_41_StreamMedian_01 sm = new _41_StreamMedian_01();
		for(int i = 0; i < 10; ++i) {
			sm.Insert(i);
			System.out.print(sm.GetMedian() + "  ");
		}
		System.out.println();
	}
	
	/**
	 * 极端测试
	 * 1.没有元素，要获得中位数
	 */
	private static void test2() {
		_41_StreamMedian_01 sm = new _41_StreamMedian_01();
		System.out.println(sm.GetMedian());
	}
	
}












