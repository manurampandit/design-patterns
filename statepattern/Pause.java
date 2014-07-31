package com.practice.statepattern;

public class Pause implements MediaPlayerState{

	@Override
	public void pressButton(StateContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("I am paused now..going to stop!!!");
		ctx= new StateContext(new Stop());
		ctx.press();
	}

}
