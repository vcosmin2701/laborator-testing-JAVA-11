package org.example;

public class Calculator {
    float nr;
    public Calculator(float nr) {
        this.nr = nr;
    }

    public Calculator multiply(float other){
        this.nr *= other;
        return this;
    }

    public Calculator addition(float other){
        this.nr += other;
        return this;
    }

    public Calculator division(float other){
        if(other==0){
            throw new IllegalArgumentException("Can't divide by zero");
        }
        this.nr /= other;
        return this;
    }

    public Calculator squareRoot() {
        if (this.nr< 0) {
            throw new IllegalArgumentException("Can't calculate square root of a negative number");
        }
        this.nr = (float) Math.sqrt((this.nr));
        return this;
    }

    public float getResult(){
        return nr;
    }
}
