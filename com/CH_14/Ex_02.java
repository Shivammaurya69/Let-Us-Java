package com.CH_14;

interface IListMethods {
    int count();

    void add(Object o);

    void remove(Object o);
}

class MyArray implements IListMethods {
    @Override
    public int count() {
        System.out.println(">>MyArray.count");
        return 0;
    }

    @Override
    public void add(Object o) {
        System.out.println(">>MyArray.add");
    }

    @Override
    public void remove(Object o) {
        System.out.println(">>MyArray.remove");
    }
}

class MyLL implements IListMethods {
    @Override
    public int count() {
        System.out.println(">>MyLL.count");
        return 0;
    }

    @Override
    public void add(Object o) {
        System.out.println(">>MyLL.add");
    }

    @Override
    public void remove(Object o) {
        System.out.println(">>MyLL.remove");
    }
}

public class Ex_02 {
    public static void main(String[] args) {
        IListMethods i;

        i = new MyArray();
        i.add(1);
        i.remove(1);
        i.count();

        i = new MyLL();
        i.add(1);
        i.remove(1);
        i.count();
    }
}