package com.example.cache;


import java.io.IOException;

public class CacheApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(1,"Никита");
		myCache.put(2,"Алеша");
		myCache.put(3,"Евгений");
		myCache.put(4,"Аркадий");
		myCache.put(5,"Юрий");
		System.out.println(myCache.list.toString()+ "\n" + myCache.map.toString());
		myCache.get(4);
		myCache.get(7);
		myCache.get(2);
		System.out.println(myCache.list.toString()+ "\n" + myCache.map.toString());
		myCache.put(452,"Алеша");
		myCache.put(3,"Евгений");
		myCache.put(44545,"Аркадий");
		myCache.put(5,"Юрий");
		System.out.println(myCache.list.toString()+ "\n" + myCache.map.toString());
		myCache.put(44545,"Аerркадий");
		myCache.put(44545,"Аркадrrий");
		System.out.println(myCache.list.toString()+ "\n" + myCache.map.toString());
		myCache.put(1,"A");
		myCache.put(782,"B");
		myCache.put(36,"C");
		myCache.put(4,"D");
		System.out.println(myCache.list.toString()+ "\n" + myCache.map.toString());
		myCache.put(36,"Z");
		System.out.println(myCache.list.toString()+ "\n" + myCache.map.toString());


	}



}
