package com;

class Counter {
	int count1 = 0; 
	static int staticCount; //Static 
	
	public Counter() {
		count1++;
		staticCount++;
		System.out.println("Count1=" + count1 +  " StaticCount=" + staticCount);
	}
}

public class StaticKeyword1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}

}
