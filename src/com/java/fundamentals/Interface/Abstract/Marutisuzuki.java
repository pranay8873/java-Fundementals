package com.java.fundamentals.Interface.Abstract;

public class Marutisuzuki extends service{
    String brand;
    public Marutisuzuki(int id,String customername,String vehicle,String model){
        super();
        System.out.println("you have selected maruthi suzuki car serviece");
    }
    void display_details(){
        System.out.println("brand :-"+brand);
    }
    @Override
    viod general(){
        System.out.println("For General Servicing it costs INR:-2000");
    }
    void regular(){
        System.out.println("For regular service it costs INR:- 1500");
    }


}
