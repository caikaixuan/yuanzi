package com.ygbc.brain.common.enums;

import com.ygbc.brain.base.enums.BaseIntEnum;

public enum TrueFalse implements BaseIntEnum {

    TRUE(1, "真"),

    FALSE(0, "假");

    private int value;

    private String desc;

    TrueFalse(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public byte getByte() {
        return (byte) this.value;
    }
}
