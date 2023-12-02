package lab_08;

import java.util.Random;

class CounterSixteen extends BaseCounter implements CounterSixteenInterface{

    CounterSixteen(int number_){
        super(number_);
        checkNumber();
    }

    CounterSixteen(){
        super(new Random().nextInt(MAX_OF_SIXTEEN_COUNTERS));
        checkNumber();
    }

    public void add(){
        this.number += 1;
        checkNumber();
    }

    public void pop(){
        this.number -= 1;
        checkNumber();
    }

    public int getNumber(){
        return this.number;
    }

    public void checkNumber(){
        checkAnyCounter(0, MAX_OF_SIXTEEN_COUNTERS);
    }
}
