package lab9;

public class childClock extends Clock {
    public childClock(int hours, int min,int sec){
        super(hours,min,sec);
    }

    @Override
    public void display() {
        if (hours>0 && hours<12 && min>0 && min<59){
            super.display();
            System.out.println("AM/PM format");
            System.out.print(hours+" hours " +min+" min " +sec+" sec "+"AM");
        }
        else {
            super.display();
            System.out.println("AM/PM format");
            System.out.print(hours+" hours " +min+" min " +sec+" sec "+"PM");
        }
    }
}
