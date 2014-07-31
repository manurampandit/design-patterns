package com.practice.statepattern;

public class StateContext {
	
	private MediaPlayerState mediaPlayerState;
	
	public StateContext(MediaPlayerState mediaPlayerState ){
		this.mediaPlayerState=mediaPlayerState;
	}

	public void setMediaPlayerState(MediaPlayerState mediaPlayerState) {
		this.mediaPlayerState = mediaPlayerState;
	}

	public MediaPlayerState getMediaPlayerState() {
		return mediaPlayerState;
	}
	
	public void press(){
		mediaPlayerState.pressButton(this);
	}

}
