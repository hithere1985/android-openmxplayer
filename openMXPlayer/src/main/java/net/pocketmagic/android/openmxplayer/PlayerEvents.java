package net.pocketmagic.android.openmxplayer;


public interface PlayerEvents {
	void onStart(String mime, int sampleRate, int channels, long duration);
	void onPlay();
	void onPlayUpdate(int percent, long currentms, long totalms);
	void onStop();
	void onError();
}
 