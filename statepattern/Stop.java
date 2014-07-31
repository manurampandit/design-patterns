package com.practice.statepattern;

public class Stop implements MediaPlayerState{

	@Override
	public void pressButton(StateContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("I am stopped now ...Please press again play if u want to play");
		
	}

}
