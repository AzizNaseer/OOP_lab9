package lab9;

public class Clock {
    protected int hours;
    protected int min;
    protected int sec;
    public Clock(){

    }
    public Clock(int  hours,int min,int sec){
        this.hours=hours;
        this.min=min;
        this.sec=sec;
    }
    public void display(){
        System.out.println("24 Hours format");
        System.out.println(hours +" Hours "+min+" min "+sec+" sec");
    }
}
