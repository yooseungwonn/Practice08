package com.javaex.ex05;

public class Sub extends CalcApp{

    private int a;
    private int b;
    
    public void setValue(int a, int b) {
    	this.a = a;
    	this.b = b;
    }
    public int calculate() {
		return  a - b;
		
    }

}
