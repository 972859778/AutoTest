package org.renpeng.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
	@Test
	public void test1(  ){
		System.out.println("test1");
		System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
	}
	@Test
	public void test2(  ){
		System.out.println("test2");
		System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
	}
	@Test
	public void test3(  ){
		System.out.println("test3");
		System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
	}
}
