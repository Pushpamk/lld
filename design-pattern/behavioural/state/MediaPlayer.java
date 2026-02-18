public class MediaPlayer {
    private MediaPlayerState playerState;

    MediaPlayer() {
        this.playerState = new StopState();
    }

    public void setState(MediaPlayerState playerState) {
        this.playerState = playerState;
    }

    void play() {
        playerState.play(this);
    }

    void pause() {
        playerState.pause(this);
    }

    void stop() {
        playerState.stop(this);
    }

    void nextSong() {
        playerState.nextSong(this);
    }
}