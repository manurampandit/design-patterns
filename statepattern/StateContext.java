package designpatterns.statepattern;

public class StateContext {
	//notice composition-- this might sound similar to state but there is a difference 
	//Refer Play and Pause class for the difference
	private IMediaPlayerState mediaPlayerState;

	public StateContext(IMediaPlayerState mediaPlayerState) {
		this.mediaPlayerState = mediaPlayerState;
	}

	// TODO: remove them.. probably getter nd setters are not required.
	// public void setMediaPlayerState(IMediaPlayerState mediaPlayerState) {
	// this.mediaPlayerState = mediaPlayerState;
	// }
	//
	// public IMediaPlayerState getMediaPlayerState() {
	// return mediaPlayerState;
	// }
	
	public void press() {
		mediaPlayerState.pressButton(this);
	}

}
