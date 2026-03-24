package android.widget;

public class VideoView extends android.view.SurfaceView implements android.widget.MediaController.MediaPlayerControl, android.media.SubtitleController.Anchor {
    private static final java.lang.String TAG = "VideoView";
    private static final int STATE_ERROR = -1;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static final int STATE_IDLE = 0;
    private static final int STATE_PREPARING = 1;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private final java.util.Vector<android.util.Pair<java.io.InputStream, android.media.MediaFormat>> mPendingSubtitleTracks = null;
    @android.annotation.UnsupportedAppUsage
    private android.net.Uri mUri;
    @android.annotation.UnsupportedAppUsage
    private java.util.Map<java.lang.String, java.lang.String> mHeaders;
    @android.annotation.UnsupportedAppUsage
    private int mCurrentState;
    @android.annotation.UnsupportedAppUsage
    private int mTargetState;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.view.SurfaceHolder mSurfaceHolder;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaPlayer mMediaPlayer;
    private int mAudioSession;
    @android.annotation.UnsupportedAppUsage
    private int mVideoWidth;
    @android.annotation.UnsupportedAppUsage
    private int mVideoHeight;
    private int mSurfaceWidth;
    private int mSurfaceHeight;
    @android.annotation.UnsupportedAppUsage
    private android.widget.MediaController mMediaController;
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    @android.annotation.UnsupportedAppUsage
    private int mCurrentBufferPercentage;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnInfoListener mOnInfoListener;
    private int mSeekWhenPrepared;
    private boolean mCanPause;
    private boolean mCanSeekBack;
    private boolean mCanSeekForward;
    private android.media.AudioManager mAudioManager;
    private int mAudioFocusType;
    private android.media.AudioAttributes mAudioAttributes;
    private android.media.SubtitleTrack.RenderingWidget mSubtitleWidget;
    private android.media.SubtitleTrack.RenderingWidget.OnChangedListener mSubtitlesChangedListener;
    android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener;
    @android.annotation.UnsupportedAppUsage
    android.media.MediaPlayer.OnPreparedListener mPreparedListener;
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener;
    private android.media.MediaPlayer.OnInfoListener mInfoListener;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.media.MediaPlayer.OnErrorListener mErrorListener;
    private android.media.MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener;
    @android.annotation.UnsupportedAppUsage
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
    private void openVideo() {}
    public void setMediaController(android.widget.MediaController p0) {}
    private void attachMediaController() {}
    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener p0) {}
    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener p0) {}
    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener p0) {}
    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener p0) {}
    @android.annotation.UnsupportedAppUsage
    private void release(boolean p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    private void toggleMediaControlsVisiblity() {}
    public void start() {}
    public void pause() {}
    public void suspend() {}
    public void resume() {}
    public int getDuration() { return 0; }
    public int getCurrentPosition() { return 0; }
    public void seekTo(int p0) {}
    public boolean isPlaying() { return false; }
    public int getBufferPercentage() { return 0; }
    private boolean isInPlaybackState() { return false; }
    public boolean canPause() { return false; }
    public boolean canSeekBackward() { return false; }
    public boolean canSeekForward() { return false; }
    public int getAudioSessionId() { return 0; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    private void measureAndLayoutSubtitleWidget() {}
    public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget p0) {}
    public android.os.Looper getSubtitleLooper() { return null; }
}
