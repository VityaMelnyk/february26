package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static class TestClass{
        void probe(Object x){System.out.println("In Object");}
        void probe(Number x){System.out.println("In Number");}
        void probe(Integer x){System.out.println("In Integer");}
        void probe(Long x){System.out.println("In Long");}
    }
    public static void main(String[] args) {
        byte a = 10;
        TestClass testClass = new TestClass();
        testClass.probe(a);
    }
}
