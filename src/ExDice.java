package jp.ac.uryukyu.ie.ex3.pair01;

public class ExDice extends Dice{

    private int minValue;
    private int maxValue;



    public int getminValue(){ return minValue;}
    public int getmaxValue(){ return maxValue;}


    public ExDice(int minValue, int maxValue){
        this. minValue = minValue;
        this. maxValue = maxValue;
        play();
    }

    public void play(){
        int a = getmaxValue()-getminValue();
        int b = a+1;
        int val = (int)(Math.random()*b) + getminValue();
        setValue(val);

    }
}