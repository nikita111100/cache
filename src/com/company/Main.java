package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ReferenceBook MyHashMap = new ReferenceBook();

        MyHashMap.put("1", "Василий Николаевич");
        MyHashMap.put("2", "Аркадий Виктоич");
        MyHashMap.put("3", "Арка Викторович");
        MyHashMap.put("4", "Аркдий Викторович");
        MyHashMap.put("5", "Аркадий В3иктвич");
        MyHashMap.put("6", "Василий Никол5аевич");
        MyHashMap.put("7", "Аркади3й Виктоич");
        MyHashMap.put("8", "Арка Ви5кторович");
        MyHashMap.put("9", "Аркд35ий Викторович");
        MyHashMap.put("f3f34", "Арка Ви5кторович");
        MyHashMap.put("5456", "Аркд35ий Викторович");
        MyHashMap.put("54786", "Аркади45й Виктвич");
        MyHashMap.put("f3r34", "Арка Ви5кторович");
        MyHashMap.put("54456", "Аркд35ий Викторович");
        MyHashMap.put("547786", "Аркади45й Виктвич");
        MyHashMap.put("f3y34", "Арка Ви5кторович");
        MyHashMap.put("57786", "Аркади45й Виктвич");
        MyHashMap.put("dfds", "Аркадий Виктоич");
        MyHashMap.put("f34", "Арка Викторович");
        MyHashMap.put("16", "Аркдий Викторович");
//        MyHashMap.put("577786", "Аркадий В3иктвич");
//        MyHashMap.put("3", "Василий Никол5аевич");
//        MyHashMap.put("sdds", "Аркади3й Виктоич");
//        MyHashMap.put("f3f4", "Арка Ви5кторович");
//        MyHashMap.put("5446", "Аркд35ий Викторович");
//        MyHashMap.put("54786", "Аркади45й Виктвич");
//        MyHashMap.put("f334", "Арка Ви5кторович");
//        MyHashMap.put("556", "Аркд35ий Викторович");
//        MyHashMap.put("5486", "Аркади45й Виктвич");
//        MyHashMap.put("f334", "Арка Ви5кторович");
//        MyHashMap.put("5446", "Аркд35ий Викторович");
//        MyHashMap.put("54786", "Аркади45й Виктвич");
//        MyHashMap.put("fy34", "Арка Ви5кторович");
//        MyHashMap.put("546", "Аркд35ий Викторович");
//        MyHashMap.put("5786", "Аркади45й Виктвич");
//        MyHashMap.put("547786", "Аркади45й Виктвич");
//        MyHashMap.put("f3y34", "Арка Ви5кторович");
//        MyHashMap.put("5456", "Аркд35ий Викторович");
//        MyHashMap.put("57786", "Аркади45й Виктвич");
//        MyHashMap.put("18", "Василий Николаевич");
//        MyHashMap.put("sddds", "Аркадий Виктоич");
//        MyHashMap.put("f384", "Арка Викторович");
//        MyHashMap.put("568", "Аркдий Викторович");
//        MyHashMap.put("57786", "Аркадий В3иктвич");
//        MyHashMap.put("7", "Василий Никол5аевич");
//        MyHashMap.put("sds", "Аркади3й Виктоич");
//        MyHashMap.put("ff4", "Арка Ви5кторович");
//        MyHashMap.put("546", "Аркд35ий Викторович");
//        MyHashMap.put("5786", "Аркади45й Виктвич");
//        MyHashMap.put("f34", "Арка Ви5кторович");
//        MyHashMap.put("56", "Аркд35ий Викторович");
//        MyHashMap.put("546", "Аркади45й Виктвич");
//        MyHashMap.put("f34", "Арка Ви5кторович");
//        MyHashMap.put("546", "Аркд35ий Викторович");
//        MyHashMap.put("5786", "Аркади45й Виктвич");
//        MyHashMap.put("fy4", "Арка Ви5кторович");
//        MyHashMap.put("56", "Аркд35ий Викторович");
//        MyHashMap.put("576", "Аркади45й Виктвич");
//        MyHashMap.put("1", "Василий Николаевич");
//        MyHashMap.put("sdfsdfds", "Аркадий Виктоич");
//        MyHashMap.put("ff34", "Арка Викторович");
//        MyHashMap.put("546", "Аркдий Викторович");
//        MyHashMap.put("5477786", "Аркадий В3иктвич");
//        MyHashMap.put("13", "Василий Никол5аевич");
//        MyHashMap.put("sdfds", "Аркади3й Виктоич");
//        MyHashMap.put("f3f34", "Арка Ви5кторович");
//        MyHashMap.put("54456", "Аркд35ий Викторович");
//        MyHashMap.put("547786", "Аркади45й Виктвич");
//        MyHashMap.put("f3f34", "Арка Ви5кторович");
//        MyHashMap.put("54516", "Аркд35ий Викторович");
//        MyHashMap.put("541786", "Аркади45й Виктвич");
//        MyHashMap.put("f334", "Арка Ви5кторович");
//        MyHashMap.put("541456", "Аркд35ий Викторович");
//        MyHashMap.put("5417786", "Аркади45й Виктвич");
//        MyHashMap.put("f31", "Арка Ви5кторович");
//        MyHashMap.put("51456", "Аркд35ий Викторович");
//        MyHashMap.put("577186", "Аркади45й Виктвич");
//        MyHashMap.put("11", "Василий Николаевич");
//        MyHashMap.put("dfd1s", "Аркадий Виктоич");
//        MyHashMap.put("f314", "Арка Викторович");
//        MyHashMap.put("561", "Аркдий Викторович");
//        MyHashMap.put("5717786", "Аркадий В3иктвич");
//        MyHashMap.put("31", "Василий Никол5аевич");
//        MyHashMap.put("sd1ds", "Аркади3й Виктоич");
//        MyHashMap.put("f31f4", "Арка Ви5кторович");
//        MyHashMap.put("54146", "Аркд35ий Викторович");
//        MyHashMap.put("547186", "Аркади45й Виктвич");
//        MyHashMap.put("f3134", "Арка Ви5кторович");
//        MyHashMap.put("5156", "Аркд35ий Викторович");
//        MyHashMap.put("5486", "Аркади45й Виктвич");
//        MyHashMap.put("f3134", "Арка Ви5кторович");
//        MyHashMap.put("54146", "Аркд35ий Викторович");
//        MyHashMap.put("541786", "Аркади45й Виктвич");
//        MyHashMap.put("fy134", "Арка Ви5кторович");
//        MyHashMap.put("5416", "Аркд35ий Викторович");
//        MyHashMap.put("57186", "Аркади45й Виктвич");
//        MyHashMap.put("5471786", "Аркади45й Виктвич");
//        MyHashMap.put("f314", "Арка Ви5кторович");
//        MyHashMap.put("54156", "Аркд35ий Викторович");
//        MyHashMap.put("571786", "Аркади45й Виктвич");
//        MyHashMap.put("118", "Василий Николаевич");
//        MyHashMap.put("sdds", "Аркадий Виктоич");
//        MyHashMap.put("f3184", "Арка Викторович");
//        MyHashMap.put("5168", "Аркдий Викторович");
//        MyHashMap.put("571786", "Аркадий В3иктвич");
//        MyHashMap.put("1", "Василий Никол5аевич");
//        MyHashMap.put("sd1s", "Аркади3й Виктоич");
//        MyHashMap.put("ff14", "Арка Ви5кторович");
//        MyHashMap.put("5146", "Аркд35ий Викторович");
//        MyHashMap.put("57186", "Аркади45й Виктвич");
//        MyHashMap.put("f34", "Арка Ви5кторович");
//        MyHashMap.put("516", "Аркд35ий Викторович");
//        MyHashMap.put("5416", "Аркади45й Виктвич");
//        MyHashMap.put("f314", "Арка Ви5кторович");
//        MyHashMap.put("5416", "Аркд35ий Викторович");
//        MyHashMap.put("51786", "Аркади45й Виктвич");
//        MyHashMap.put("fy14", "Арка Ви5кторович");
//        MyHashMap.put("561", "Аркд35ий Викторович");
//        MyHashMap.put("5176", "Аркади45й Виктвич");

        ReferenceBook.Entry e = MyHashMap.get("6");
        System.out.println(e.getValue());

        ArrayList arrayList = new ArrayList();
        arrayList.add(MyHashMap.get("546"));

     //   System.out.println(arrayList);

       MyHashMap.parseMyHashMapToHashMap();
       MyHashMap.writeMap();
       MyHashMap.readMap();







    }
}


