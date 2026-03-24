package android.widget;

public class MediaController extends android.widget.FrameLayout {
    java.lang.StringBuilder mFormatBuilder;
    java.util.Formatter mFormatter;
    public MediaController(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void onFinishInflate() {}
    public MediaController(android.content.Context p0, boolean p1) { super((android.content.Context)null); }
    public MediaController(android.content.Context p0) { super((android.content.Context)null); }
    public void setMediaPlayer(android.widget.MediaController.MediaPlayerControl p0) {}
    public void setAnchorView(android.view.View p0) {}
    protected android.view.View makeControllerView() { return null; }
    public void show() {}
    public void show(int p0) {}
    public boolean isShowing() { return false; }
    public void hide() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void setEnabled(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void setPrevNextListeners(android.view.View.OnClickListener p0, android.view.View.OnClickListener p1) {}

    public static interface MediaPlayerControl {
        public void start();
        public void pause();
        public int getDuration();
        public int getCurrentPosition();
        public void seekTo(int p0);
        public boolean isPlaying();
        public int getBufferPercentage();
        public boolean canPause();
        public boolean canSeekBackward();
        public boolean canSeekForward();
        public int getAudioSessionId();
    }
}
