public interface MediaPlayerState {
    void play(MediaPlayer context);
    void pause(MediaPlayer context);
    void stop(MediaPlayer context);
    void nextSong(MediaPlayer context);
}