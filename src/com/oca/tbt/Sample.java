package com.oca.tbt;
import com.oca.tbt.interfaces.*;
public class Sample implements IInt {
    public static void main(String[] args) {
        Sample s = new Sample();
        int i = s.theValue;
        int k = IInt.theValue;
        int l = theValue;
        System.out.println(i + " " +  k + l);
    }
}
