package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ReferenceBook implements Book {
    HashMap<String, String> hashMap = new HashMap<>();

    private static final int SIZE = 16;

    private Entry table[] = new Entry[SIZE];

    class Entry {
        final String key;
        String value;
        Entry next;

        Entry(String k, String v) {
            key = k;
            value = v;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key='" + key + '\'' +
                    ", value='" + value + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public void put(String key, String value) {
        int hash = key.hashCode() % SIZE;
        System.out.println(key.hashCode());
        System.out.print("Это изначальынй хэш ключ: " + key);
        System.out.println();
        System.out.print("В таблицу: " + hash);
        System.out.println();

        Entry e = table[hash];

        if (e != null) {

            if (e.key.equals(key)) {
                e.value = value;
            } else {

                while (e.next != null) {
                    e = e.next;
                }
                Entry entryInOldBucket = new Entry(key, value);
                e.next = entryInOldBucket;
                System.out.println("cтарая корзина" + entryInOldBucket);
            }
        } else {

            Entry entryInNewBucket = new Entry(key, value);
            table[hash] = entryInNewBucket;
            System.out.println("Создали новую корзину");
        }

    }

    @Override
    public Entry get(String k) {
        int hash = k.hashCode() % SIZE;
        Entry e = table[hash];

        while (e != null) {
            if (e.key.equals(k)) {
                return e;
            }
            e = e.next;
        }
        return null;
    }

    @Override
    public int size() {
        return table.length;
    }

    @Override
    public void clear() {
        Entry tabletwo[] = new Entry[SIZE];
        table = tabletwo;
    }

    @Override
    public void parseMyHashMapToHashMap() {
        for (Entry value : table) {
            Entry e = value;
            while (e != null) {
                hashMap.put(e.key, e.value);
                e = e.next;
            }
        }
    }
    @Override
    public void writeMap() {
        if(hashMap != null) {
            try (FileWriter writer = new FileWriter("Z:/Example.txt")) {
                for(String key : hashMap.keySet()) {
                    String value = hashMap.get(key);
                    if(value == null) {
                        System.out.println("ключь не найден");
                    }
                    writer.write(key.trim());
                    writer.write('\n');
                    writer.write(value.trim());
                    writer.write('\n');
                }
                writer.close();
            }
            catch(IOException e) {
                System.out.println("проблемма в файле"+ "Z:/Example.txt" );
            }
        }
        else {
            System.out.println("передана пустая коллекция");
        }

    }

    @Override
    public void readMap() {
        HashMap<String, String> map = new HashMap<>();
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("Z:/Example.txt"))) {
            String word;
            word = reader.readLine();
            while(word != null) {
                String response = reader.readLine();
                if(response != null) {
                    response = response.trim();
                    if(response.length() != 0) {
                        map.put(word, response);
                    }
                    else {
                        System.out.println("пустой ответ в файле" +
                                "Z:/Example.txt");
                    }
                }
                else {
                    System.out.println("потеряный ресурс " +
                            "Z:/Example.txt");
                }
                word = reader.readLine();
            }
        }
        catch(IOException e) {
            System.out.println("проблемма чтения файла " + "Z:/Example.txt" );
        }

        hashMap = map;
        System.out.println(map.containsKey("f3r34"));
        System.out.println(map.get("4"));
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
//
//    int test = 0;
//    int i = 0;
//        for (Entry value : table) {
//                System.out.print(i++);
//                Entry e = value;
//                if (e != null) {
//                while (e != null) {
//                Entry re = e.next;
//                String k = e.key;
//                String v = e.value;
//                System.out.println("вывести к : " + k + "  Вывести v :" + v);
//                test++;
//                hm.put(k, v);
//                e = e.next;
//                }
//                } else {
//                System.out.println("этот бакет пустой");
//                }
//                System.out.println(i);
//                }
//
//                System.out.println("всего " + test + "коллекции было занесено из 19");