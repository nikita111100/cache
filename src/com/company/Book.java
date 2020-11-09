package com.company;

public interface Book <K, V> extends Iterable<V>{
    public void put(String k, String v);
    public ReferenceBook.Entry get(String k);
    public int size();
    public void clear();
    public void parseMyHashMapToHashMap();
    public void writeMap();
    public void readMap();

}
