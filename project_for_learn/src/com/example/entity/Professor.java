package com.example.entity;

import com.example.enums.UserProcessorEvent;
import com.example.listener.Listeners;

public class Professor {

    public final static Professor instance = new Professor();

    public final static String BUSINESS = "business";

    private String name = "ckx";

    public  static Listeners<AccountThread, UserProcessorEvent> poolListeners = new Listeners<>();

    private Professor(){

    }

    public static Professor getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
