package com.example.cache;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;

public class RealizationCache implements Cache {
    int cacheSize;
    HashMap map;
    LinkedList list;

    public RealizationCache(int cacheSize) {
        this.cacheSize = cacheSize;
        map = new HashMap(cacheSize);
        list = new LinkedList();
    }
    @Override
    public void put(Object key, Object val) {
        boolean res = list.remove(key);
        if (res){
            list.addLast(key);
            map.put(key,val);
            return;
        }

        if (list.size() == this.cacheSize) {
            this.pruning();
        }
        list.addLast(key);
        map.put(key, val);
    }
    @Override
    public Object get(Object key) {
        if (list.contains(key)) {
            return map.get(key);
        }
        return null;
    }

    @Override
    public void remove(Object key) {
        list.remove(key);
        map.remove(key);
    }

    @Override
    public void clear() {
        map = new HashMap(cacheSize);
        list = new LinkedList();
    }

    @Override
    public void сacheOnDisk () throws IOException {
        FileOutputStream fos = new FileOutputStream("Z:/Example.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(map);
        oos.close();
    }

    @Override
    public void fromDiskToCache() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Z:/Example.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        HashMap anotherMap = (HashMap) ois.readObject();
        ois.close();
        map = anotherMap;
    }
    public void pruning()
    {
        Object key = list.removeFirst();
        map.remove(key);
    }
}
