public class PlayState implements MediaPlayerState {
    @Override
    public void play(MediaPlayer context) {
        System.out.println("Already playing");
        context.setState(new PlayState());
    }

    @Override
    public void pause(MediaPlayer context) {
        System.out.println("Paused...");
        context.setState(new PauseState());
    }

    @Override
    public void stop(MediaPlayer context) {
        System.out.println("Stopped.");
        context.setState(new StopState());
    }

    @Override
    public void nextSong(MediaPlayer context) {
        System.out.println("Playing next song");
        context.setState(new NextSongState());
    }
}