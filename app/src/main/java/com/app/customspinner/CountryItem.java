package com.app.customspinner;

public class CountryItem {

    public CountryItem(String value, int country) {
        this.value = value;
        this.country = country;
    }

    private int country;
    private String value;

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
