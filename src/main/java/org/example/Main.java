package org.example;



public class Main {
    public static void main(String[] args) {
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2000000).getAnnualGross());
    }
}
class SalaryMan{
    private int salary;

    public SalaryMan() {
        this.salary=1_000_000;
    }

    public SalaryMan(int salary){
        this.salary = salary;
    }


    public int getAnnualGross(){
        return salary*(12+5);
    }
}

