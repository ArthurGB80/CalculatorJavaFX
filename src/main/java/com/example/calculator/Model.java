package com.example.calculator;

public class Model {

    public enum Operation {add, sub, mul, div, sqr, sqrt}

    private double firstValue;
    private double secondValue;
    public Operation operation;
    private double MVal = 0;
    private double ANS = 0;

    public double getResult() {
        return switch (operation) {
            case add -> firstValue + secondValue;
            case sub -> firstValue - secondValue;
            case mul -> firstValue * secondValue;
            case div -> firstValue / secondValue;
            case sqr -> Math.pow(firstValue, secondValue);
            case sqrt -> Math.pow(firstValue, 1 / secondValue);
            default -> Double.NaN;
        };
    }

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double getMVal() {
        return MVal;
    }

    public double getANS() {
        return ANS;
    }

    public void setMVal(double MVal) {
        this.MVal = MVal;
    }

    public void setANS(double ANS) {
        this.ANS = ANS;
    }

    public static int Factorial(double f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

}
