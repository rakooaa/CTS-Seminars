package adapter;

public class Student {
    Pen p;

    public void getPen(Pen p){
        this.p = p;
    }

    public void write(){
        System.out.println("happy to have the pen");
    }
}
