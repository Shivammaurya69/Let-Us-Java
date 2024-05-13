package com.CH_15;
class Stack{
    private int capacity, size;
    private Object[] data;

    public Stack(int cap){
        data = new Object[cap];
        capacity= cap;
        size=0;
    }
    public void push (Object o) throws StackException {
        if (size== capacity) {
            throw new StackException("Stack Full");
        }
            data[size]= o;
            size++;
    }
    public Object pop() throws StackException{
        if (size<=0){
            throw new StackException("Stack Empty");
        }
        size--;
        return data[size];
    }
    public int getSize(){
        return size;
    }
}
class StackException extends Exception{
    private String errormsg;
    public StackException (String msg){
        this.errormsg= msg;
    }
    public void inform(){
        System.out.println(errormsg);
    }
}
public class Ex_06 {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        try{
            s.push("Vinod");
            s.push("Sanjay");
            s.push(25);
            s.push(3.14f);
        }
        catch (StackException se){
            System.out.println("Problem in stack");
            se.inform();
        }
        try{
            while(s.getSize()>0)
                System.out.println(s.pop());
        }
        catch (StackException se){
            System.out.println("Problem in stack");
            se.inform();
        }
    }
}