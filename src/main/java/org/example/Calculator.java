package org.example;

import static java.lang.Math.pow;

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
        this.nr /= other;
        return this;
    }

    public Calculator squareRoot(){
        this.nr = (float) pow(this.nr , 1/2.0);
        return this;
    }

    public float getResult(){
        return nr;
    }
}
