package com.example.cache;

import org.junit.jupiter.api.Test;
import org.junit.*;



public class CacheApplicationTests {

	@org.junit.Test
	public void testAppPutAndGet() {
		RealizationCache myCache = new RealizationCache(4);
		myCache.put(4, "A");
		Assert.assertEquals(myCache.get(4), "A");
	}
	@org.junit.Test
	public void testAppPut() {
		RealizationCache myCache = new RealizationCache(1);
		myCache.put(4,"A");
		Assert.assertNotNull(myCache.get(4));
	}
	@org.junit.Test
	public void testAppRemove() {
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(2,"Виталий");
		myCache.remove(2);
		Assert.assertNull(myCache.get(2));
	}
	@org.junit.Test
	public void testAppPutThreeElements(){
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(1,"A");
		myCache.put(2,"B");
		myCache.put(3,"C");
		myCache.put(4,"D");
		Assert.assertEquals(myCache.map.toString(),"{4=D, 2=B, 3=C}");
	}
	@org.junit.Test
	public void testAppPutObjectIdenticalKeys(){
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(1,"A");
		myCache.put(1,"B");
		Assert.assertEquals(myCache.get(1),"B");
	}
	@org.junit.Test
	public void testAppClear(){
		RealizationCache myCache = new RealizationCache(3);
		myCache.put(1,"A");
		myCache.put("Студент","Илья");
		myCache.put("Выпускник","Cтас");
		myCache.clear();
		Assert.assertEquals(myCache.list.size(),0);
	}
	@org.junit.Test
	public void testAppCapacityIsSetWhenCreating(){
		int res = 3;
		RealizationCache myCache = new RealizationCache(res);
		myCache.put(1,"A");
		myCache.put(2,"B");
		myCache.put(3,"C");
		myCache.put(4,"D");
		myCache.put("Студент","Илья");
		myCache.put("Выпускник","Cтас");
		Assert.assertEquals(myCache.list.size(),res);


	}

}
