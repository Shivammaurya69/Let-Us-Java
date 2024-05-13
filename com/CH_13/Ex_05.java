package com.CH_13;

final class base2{

}
// We can't extend com.CH_15.a class from final class.
class derived /* extends base2 */{
    public void fun(){
        System.out.println("Too much noise, Too little substance");
    }
}
public class Ex_05 {
    public static void main(String[] args) {
        derived d = new derived();
        d.fun();
    }
}
