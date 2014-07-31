package com.practice.statepattern;

public class Demo {
public static void main(String[] args) {
	StateContext ctx = new StateContext(new Play());
	ctx.press();
	ctx=new StateContext(new Play());
	ctx.press();
}
}
