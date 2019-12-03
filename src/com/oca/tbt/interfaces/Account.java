package com.oca.tbt.interfaces;

public interface Account {
    public default String getId(){
        return "00";
    }
}
