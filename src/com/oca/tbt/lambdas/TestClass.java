package com.oca.tbt.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestClass {
    public static boolean checkList(List list, Predicate<List> p){
        return p.test(list);
    }

    public static void main(String[] args){
        //T1 Q43
        boolean a = checkList(new ArrayList(), al -> al.isEmpty());
        boolean b = checkList(new ArrayList(), al -> al.add("hei"));
        boolean c = checkList(new ArrayList(), (List al) -> al.isEmpty());

        System.out.println(a + " " + b + " " + c);
    }
}
