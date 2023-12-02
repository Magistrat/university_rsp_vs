package lab_07;

import java.util.Random;

class CounterSixteen {
    private int number;

    CounterSixteen(int number_){
        this.number = number_;
        checkNumber();
    }

    CounterSixteen(){
        Random random = new Random();
        this.number = random.nextInt(16);
        checkNumber();
    }

    void add(){
        this.number += 1;
        checkNumber();
    }

    void pop(){
        this.number -= 1;
        checkNumber();
    }

    int getNumber(){
        return this.number;
    }

    private void checkNumber(){
        if (this.number < 0 || this.number > 16){
            throw new ArithmeticException("Счетчик больше 16 или меньше 0");
        }
    }
}
