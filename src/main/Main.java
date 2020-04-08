package main;

import stage1.Stage1;
import stage2.Stage2;
import stage3.Stage3;

public class Main {
    public static void main(String[] args) {
        Stage1 stage1 = new Stage1();
        stage1.greet("Nexa", 2020);
        Stage2 stage2 = new Stage2();
        stage2.guessAge();
        Stage3 stage3 = new Stage3();
        stage3.countNumber();


    }

}
