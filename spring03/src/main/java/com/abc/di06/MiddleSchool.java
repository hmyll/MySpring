package com.abc.di06;

public class MiddleSchool extends School {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MiddleSchool{" +
                "address='" + address + '\'' +
                '}';
    }
}
