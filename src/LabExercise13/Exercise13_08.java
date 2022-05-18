package LabExercise13;

import java.util.ArrayList;

class MyStack implements Cloneable {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list;
    }

    public Object clone() throws CloneNotSupportedException {
        MyStack newStack = (MyStack) super.clone();
        newStack.list = (ArrayList<Object>) list.clone();
        return newStack;
    }
}