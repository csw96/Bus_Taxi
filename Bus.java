package com.p_trans;


import javax.swing.*;
import java.util.Scanner;

public class Bus {

    Scanner in = new Scanner(System.in);
    int maxPassenger= 30; //최대 승객수
    int currPassenger;
    int nowPassenger; //탑승 승객 수
    int oilStatus = 100;
    int resPassenger ; // 잔여승객수
    int money; //요금
    int changespeed ; // 변경할 속도
    int busNum1;  // 버스번호
    int busNum2;  // 버스번호
    int oil; // 주유량
    int speed ; // 현재 속도
    String nowStatus  ; //현재상태
    String stopStatus;  //차고지행 상태


    public Bus() { //버스번호 넣기
        busNum1 = 1000;
        busNum2 = 1001;
        System.out.println("버스1 :"+ busNum1);
        System.out.println("버스2 :"+busNum2);
        nowStatus();
    }

    public void nowStatus(){   //현재상태 알림
        System.out.println("운행중");
    }
    public void stopStatus(){ //멈춤 상태 알림
        System.out.println("차고지 행");
        money = 0;
    }

    public  void  drive(int oil){
        oilStatus += oil;
        if (oilStatus>10){
            System.out.println("주유량:"+oilStatus);
            nowStatus();
        }
        else if(oilStatus<10){
            stopStatus();
            System.out.println("주유가 필요!");
        }
    }

    public void take(int nowPassenger) {   // 승객 탑승시
        // 버스 요금 (매개변수 money)만큼 버스 수입이 증가

        if (nowPassenger <= maxPassenger)
        {


            resPassenger = maxPassenger - nowPassenger;
            money += 1000*nowPassenger;
            System.out.println("탑승 승객 수 : " + nowPassenger);
            System.out.println("잔여 승객 수 : " + resPassenger);
            System.out.println("요금 확인 : " + money);
        }else{
            System.out.println("최대 승객 수 초과!");

        }

    }

    public void showInfo(){

        System.out.println("주유량:" + oilStatus);
        System.out.println("잔여승객수:"+resPassenger);
    }

}