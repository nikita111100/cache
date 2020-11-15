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
		System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
		System.out.println(myCache.get(5));
		myCache.remove(5);
		System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
		System.out.println(myCache.get(5));
		myCache.clear();
		System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
		System.out.println(myCache.get(5));
		System.out.println(myCache.list.size());
		myCache.put(1,"Никита");
		myCache.put(2,"Алеша");
		myCache.put(3,"Евгений");
		myCache.put(4,"Аркадий");
		myCache.put(5,"Юрий");
		myCache.put(6,"Илья");
		myCache.put(7,"Аркадий");
		myCache.put(8,"Дмитрий");
		myCache.put(9,"Полина");
		myCache.put(10,"Илья");
		System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
		System.out.println(myCache.get(5));
		myCache.clear();
		myCache.put(1,"Никита");
		myCache.put(2,"Алеша");
		myCache.put(3,"Евгений");
		myCache.put(4,"Аркадий");
		myCache.put(5,"Юрий");
		myCache.put(6,"Илья");
		System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
		System.out.println(myCache.get(5));
		myCache.сacheOnDisk();
		myCache.fromDiskToCache();
		System.out.println("победа?");
		System.out.println(myCache.map.toString());
		myCache.put(1,"Никита");
		myCache.put(2,"Алеша");
		myCache.put(3,"Евгений");
		System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
		System.out.println(myCache.get(5));
		myCache.put(1,"Никита2");System.out.println(myCache.list.toString());
		System.out.println(myCache.map.toString());
	}



}
