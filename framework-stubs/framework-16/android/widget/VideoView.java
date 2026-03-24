package android.widget;

public class VideoView extends android.view.SurfaceView implements android.widget.MediaController.MediaPlayerControl, android.media.SubtitleController.Anchor {
    android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener;
    android.view.SurfaceHolder.Callback mSHCallback;
    public VideoView(android.content.Context p0) { super((android.content.Context)null); }
    public VideoView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public VideoView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public VideoView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int resolveAdjustedSize(int p0, int p1) { return 0; }
    public void setVideoPath(java.lang.String p0) {}
    public void setVideoURI(android.net.Uri p0) {}
    public void setVideoURI(android.net.Uri p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    public void setAudioFocusRequest(int p0) {}
    public void setAudioAttributes(android.media.AudioAttributes p0) {}
    public void addSubtitleSource(java.io.InputStream p0, android.media.MediaFormat p1) {}
    public void stopPlayback() {}
    public void setMediaController(android.widget.MediaController p0) {}
    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener p0) {}
    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener p0) {}
    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener p0) {}
    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public void start() {}
    public void pause() {}
    public void suspend() {}
    public void resume() {}
    public int getDuration() { return 0; }
    public int getCurrentPosition() { return 0; }
    public void seekTo(int p0) {}
    public boolean isPlaying() { return false; }
    public int getBufferPercentage() { return 0; }
    public boolean canPause() { return false; }
    public boolean canSeekBackward() { return false; }
    public boolean canSeekForward() { return false; }
    public int getAudioSessionId() { return 0; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget p0) {}
    public android.os.Looper getSubtitleLooper() { return null; }
}
