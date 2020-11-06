package com.abc.di05;

import java.util.*;

public class Some {
    private String[] names;
    private List<String> myList;
    private List<School> schools;
    private Set<String> mySet;
    private Map<String,Object> myMap;
    private Properties mypros;

    public void setNames(String[] names) {
        this.names = names;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, Object> myMap) {
        this.myMap = myMap;
    }

    public void setMypros(Properties mypros) {
        this.mypros = mypros;
    }

    @Override
    public String toString() {
        return "Some{" +
                "names=" + Arrays.toString(names) +
                ", myList=" + myList +
                ", schools=" + schools +
                ", mySet=" + mySet +
                ", myMap=" + myMap +
                ", mypros=" + mypros +
                '}';
    }
}
