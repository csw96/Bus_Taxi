package com.p_trans;

public class Transportation {
    public static void main(String[] args) {
//        Bus bus1 = new Bus();
//        bus1.take(2);
//        bus1.drive(-50);
//        bus1.stopStatus();
//        bus1.drive(10);
//        bus1.take(45);
//        bus1.showInfo();
//        bus1.take(5);
//        bus1.drive(-55);
//        bus1.showInfo();
          Taxi taxi = new Taxi("18가 1234", "19가 4321");

          taxi.riding(2);
          taxi.setDestination("서울역");
          taxi.add_Fee_Per_Distance(2);
          taxi.drive(-80);

          taxi.riding(5);
          taxi.riding(3);
          taxi.setDestination("구로디지털단지역");
          taxi.add_Fee_Per_Distance(12);
          taxi.drive(-20);
    }
}
