package com.rayoy.bookcode.chapter7.sample2;

import com.rayoy.bookcode.chapter7.sample1.SuperClass;

/**
 * 被动使用类字段演示二：
* 通过数组定义来引用类，不会触发此类的初始化
 **/
public class NotInitialization {

	public static void main(String[] args) {
		SuperClass[] sca = new SuperClass[10];
	}

}