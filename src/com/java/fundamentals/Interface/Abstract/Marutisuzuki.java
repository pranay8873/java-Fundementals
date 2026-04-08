package com.java.fundamentals.Interface.Abstract;

public class Marutisuzuki extends service{
    String brand;
    public Marutisuzuki(int id,String customername,String vehicle,String model){
        super(id,customername,vehicle,model);
        System.out.println("you have selected maruthisuzuki car service");
    }
    void display_details(){
        System.out.println("brand :-"+brand);
    }
    @Override
    public viod general(){
        System.out.println("For General Servicing it costs INR: 2000.00");
    }
    @Override
    void regular(){

        System.out.println("For regular service it costs INR: 1500");
    }


}
