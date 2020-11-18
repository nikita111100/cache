package com.example.cache;


import java.io.IOException;

public class CacheApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		RealizationCache myCache = new RealizationCache(4);
		myCache.put(1,"Никита");
		myCache.put(2,"Алеша");
		myCache.put(3,"Евгений");
		myCache.put(4,"Аркадий");
		myCache.put(5,"Юрий");
		myCache.put(6,"Илья");
		System.out.println(myCache.list.toString()+"  "+myCache.map.toString());
		myCache.get(5);
		myCache.get(4);
		System.out.println(myCache.list.toString()+"  "+myCache.map.toString());
		myCache.put(7,"Аркадий");
		myCache.get(6);
		System.out.println(myCache.list.toString()+"  "+myCache.map.toString());
		myCache.get(7);
		myCache.get(7);
		myCache.get(7);
		System.out.println(myCache.list.toString()+"  "+myCache.map.toString());
		myCache.put(7,"Никита1");
		myCache.put(7,"Никита2");
		myCache.get(4);
		myCache.put(7,"Никита3");
		System.out.println(myCache.list.toString()+"  "+myCache.map.toString());
	}
}
