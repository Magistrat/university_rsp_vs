package lab_08;

public abstract class BaseCounter {
    protected int number;

    protected BaseCounter(int number_){
        this.number = number_;
    }

    protected void checkAnyCounter(int minOfCounter, int maxOfCounter){
        if (this.number < minOfCounter || this.number > maxOfCounter){
            throw new ArithmeticException("Счетчик больше " + maxOfCounter + " или меньше " + minOfCounter);
        }
    }
    protected abstract void checkNumber();
}
