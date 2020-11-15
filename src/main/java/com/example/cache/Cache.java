package com.example.cache;

import java.io.IOException;

public interface Cache {

    public void put(Object key, Object val);

    public Object get(Object key);

    public void remove(Object key);

    public void clear();

    public void сacheOnDisk() throws IOException;

    public void fromDiskToCache() throws IOException, ClassNotFoundException;
}
