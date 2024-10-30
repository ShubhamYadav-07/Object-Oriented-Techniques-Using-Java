/*Q1 => WAP in java using classes & objects.Define a class with the name worker.
    private data members
        wid=>int,wname=>string
        hourswork=>int,wgrade=>float
        totwg=>float
    calculate() to calculate
        totalwages=wgrade*hourswork
    public members
        1.void input() to enter wid,wname,hourswork,wgrade,totalwages
        & call calculate() to calculate total wages
        2. void display() to display all data members. */

import java.util.*;

public class Worker {
    private int wid;
    private String wname;
    private int hourswork;
    private float wgrade;
    private float totwg;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter worker id: ");
        wid = sc.nextInt();
        System.out.println("Enter worker name: ");
        wname = sc.next();
        System.out.println("Enter hours worked: ");
        hourswork = sc.nextInt();
        System.out.println("Enter worker grade: ");
        wgrade = sc.nextFloat();
        System.out.println("Enter total wages: ");
        totwg = sc.nextFloat();
        sc.close();
    }

    private void calculate() {
        totwg = wgrade * hourswork;
        System.out.println("Total wage is : " + totwg);
    }

    public void display() {
        System.out.println("Worker id is :" + wid);
        System.out.println("Worker name is :" + wname);
        System.out.println("Hours worked is :" + hourswork);
        System.out.println("Worker grade is :" + wgrade);
        System.out.println("Total wage is :" + totwg);
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        w.input();
        w.calculate();
        w.display();
    }
}
