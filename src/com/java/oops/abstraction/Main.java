package com.java.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        Volkswagon car1=new Volkswagon(1,"pranay","virtus","Top");
        Maruthisuzuki car2=new Maruthisuzuki(2,"Vaishnavi","aulto 800","base");
//        car1.repair();
//        car2.repair();
        car1.general();
        car2.general();
        car2.totalbill();
        car1.totalbill();
    }
}
