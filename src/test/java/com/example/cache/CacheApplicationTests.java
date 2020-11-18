package com.example.cache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CacheApplicationTests {

	@Test
	public void testAppPutAndGet() {
		RealizationCache myCache = new RealizationCache(4);
		myCache.put(4,"A");
		myCache.put(4, "B");
		assertEquals(myCache.get(4), "B");
	}
	@Test
	public void testAppRemove() {
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(2,"Виталий");
		myCache.remove(2);
		assertNull(myCache.get(2));
	}
	@Test
	public void testAppPutThreeElements(){
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(1,"A");
		myCache.put(2,"B");
		myCache.put(3,"C");
		myCache.put(4,"D");
		assertNull(myCache.get(1));
		assertEquals(myCache.map.get(myCache.list.getFirst()),"D");
	}
	@Test
	public void testAppClear(){
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(1,"A");
		myCache.put("Студент","Илья");
		myCache.put("Выпускник","Cтас");
		myCache.clear();
		assertEquals(myCache.list.size(),0);
	}
	@Test
	public void testAppCapacityIsSetWhenCreating(){
		int res = 3;
		RealizationCache myCache = new RealizationCache(res);
		myCache.put(1,"A");
		myCache.put(2,"B");
		myCache.put(3,"C");
		myCache.put(4,"D");
		myCache.put("Студент","Илья");
		myCache.put("Выпускник","Cтас");
		assertEquals(myCache.list.size(),res);

	}
}
