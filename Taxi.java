package com.p_trans;

public class Taxi {
    static int total;
    String taxiNum1;
    String taxiNum2;
    int oilcheck = 100;
    int speed;
    String arrival;
    int basicDistance;
    int money=3000;
    String destination;
    int b_distance=1;
    int arrivalDistance;
    int maxpassenger = 4;
    int passenger;
    String nowStatus;
    String ingStatus;
    String stopStatus;
    boolean start = false;
    int fuel=0;
    String statement;
    int sum;


    public Taxi(String taxiNum1, String taxiNum2)
    {
        this.taxiNum1 =taxiNum1;
        this.taxiNum1 =taxiNum2;

        System.out.println("택시1 번호 : " + taxiNum1);
        System.out.println("택시2 번호 : " + taxiNum1);
        System.out.println("주유량 :"+oilcheck);
        nowStatus();
    }

    public void changeSpeed(int speed) {
        this.speed+=speed;
    }

    public void add_Fee_Per_Distance(int arrivalDistance){

        this.arrivalDistance = arrivalDistance;

        if(arrivalDistance > b_distance){
            sum=money+1000*(arrivalDistance-b_distance);
        }
        total += sum;
        System.out.println("기본요금확인 : "+ money);
        System.out.println("지불할 요금 : "+ sum);
        System.out.println("목적지까지 거리 : "+arrivalDistance+"km");
    }

    public void setDestination(String destination){
        System.out.println("목적지 : "+ destination);
    }
    public void nowStatus()
    {
        statement = "일반";
        System.out.println(statement);

    }

    public void ingStatus()
    {
        statement = "운행중";
        System.out.println(statement);

    }
    public void stopStatus(){
        statement = "운행불가";
        System.out.println(statement);
    }

    public void drive(int oil) {
        oilcheck+=oil;
        if (oilcheck < 10) {
            stopStatus();
            System.out.println("주유 필요");
            System.out.println("누적 요금 : "+total);
        }else {
            ingStatus();
        }
        System.out.println("주유량 : "+oilcheck);
    }



    public void riding(int passenger) { //운행할때 승객이 타면 승객수 추가 운행중상태 띄우고 나머지는 운행불가!
        if(passenger>maxpassenger){
            System.out.println("최대 승객 수 초과");
            stopStatus();
        }
        else{
            int respassneger = maxpassenger-passenger;
            System.out.println("탑승 승객 수 : " + passenger);
            System.out.println("잔여 승객 수 : " + respassneger);
            if(passenger>0){ingStatus();}
        }

    }

}
