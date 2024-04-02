package com.example.myapplication;

import android.provider.Settings;

public class main {
    public interface showable{
        public void print();
    }
    public interface showable1{
        public void print(int x);
    }
    static void display(showable s){
        s.print();

    }
    public static void main(String[] args){
        RewardClass emp1=new RewardClass();
        RewardClass emp2=new RewardClass();
        RewardClass emp3=new RewardClass();
        emp1.rewardMethod();
        emp2.rewardMethod();
        emp3.rewardMethod();
        //keloun taba3o nafs she
        //bas 2aw2at ana b7aje eno object m3yan yetba3 8eer masln l emp2 yetba3 your reward 20$
        /*emp1.rewardMethod();exmple houn 10$
         emp2.rewardMethod();houn 10$
         emp3.rewardMethod(); houn 15$*/
        //l7al l 2awl 2a3mel class  5ale extend mn l rewardclass w2a3mel lal method rewardmethod overide exmple 5ale l method 15$:
        RewardClass emp4=new RewardClass();//10$
        RewardClass emp5=new overriderewardclass();//15$
        RewardClass emp6=new RewardClass();//10$
        emp4.rewardMethod();//10$
        emp5.rewardMethod();//15$
        emp6.rewardMethod();//10$
        //bas fe she 2aktar e5etsarn mn eno 2a3ml class w 5ale extend w 2a3mel overide
        //tare2a heye eno e5od l method l bade 2a3mela overide w b5ale l object mtl ma howe w b2alba been l curly braces   b7out l overide method w bektob b2alba sho ma bade
        //hay heye tare2a:
        RewardClass emp7=new RewardClass() {
            public void rewardMethod() {
                System.out.println("your reward is 15$");
            }
        };
        emp7.rewardMethod();
        //so bhay l 7ale ana batlt 7aje lal class l esmo overriderewardclass
        //le sar houn ana 3mlt anynmous inner class anynoum ya3ne ma elo esm wazefet heed l class 7a y2ade nafs l 8arad ta3eel l overriderewardclass l extend mn reward class

        //iza bade estad3eha mara wa7de lal method ba3mel hay tare2a:
        //hay heye tare2a:
        new RewardClass() {
            public void rewardMethod() {
                System.out.println("your reward is 15$");
            }
        }.rewardMethod();

        //tare2a tenye eno n5ale l anymoun class ya3mel implement la anynmoun inner class:
        //3araft fou2 interface esmo showable b2albo method esma print
        //la 2a3mel implemnt la hay l method lezm class extend hay l inferface w 2a3mel implimnt
        //bas mba eno b2alb hay l inferface fe method wa7de esma print fa bestafed mn l anymoun class
        //ma fene 2a3ml object mn l interface
        //la tezbat bestafed mn l anynmous inner class
        //tar2a heek
        showable showable=new showable() {
            @Override
            public void print() {
                System.out.println("showable");
            }
        };
        showable.print();
        //so 3mlt implemnt mndoun concrete class w 2a3mel implement showable w ba3den 2a3mel ovveride lal method

        //mn mayzet l anynmous class momken estafed mn she esmo lamda expression:
        // eno mesh darore ehjez houn showable showable = new showable()......
        //ba3mel heek:
        showable Showable;
        Showable=() ->{
            System.out.println("showable");
        };
        showable.print();

        //lamda expression mnasta3mela bas ykoun 3ande single method bas

        //barke l method bte5od parameter 3mlt interface fo2 esmo shwable1 w l print bte5od integer
        //fa iza l method bte5od varible heed btseer
        showable1 showable1;
         showable1=(int y)->{
            System.out.println("showable"+y);
        };
         showable1.print(5);

         //7ata ma fe de3e neb3at data type b2alb l method
        showable1=(y)->{
            System.out.println("showable"+y);
        };
        showable1.print(4);
        //lamda expression ma fene esta3mela ma3 class bas ma3 interface


        //set on click listener bel lamda expression:
        /*button.setOnAction(event->{
            //code to be exuted when button click
            system.out.println("button clicked");
          });
         */

        //3ande method bte5od parameter interface showable w b2lba stad3et l method lb2al l interface
        //houn fene bas estad3e l method display eb3tlna anymoun inner class parameter
        display(new showable() {
            @Override
            public void print() {
                System.out.print("print");
            }
        });
        //hay tare2a nafsa zeta l setonclicklistener
        //3ande method esma setonclicklistener bte5od interface onclickevent w 2abalb hay l interface fe method esma onclcik()

        //iza bade 2a3mela la hay l method ka lamda expresion:
        //bhay tare2a:
        display(()->System.out.println("print"));
        //aw heek
        display(()->{
            System.out.println("print");
        });

        //iza bte5od parameter l print method exmple print(int x)
        //lamda expression heed btsser
        //display(y->System.out.println("print"));
        //aw heek:
        /*display(x->{
            System.out.println("print");
        });*/








    }
}
