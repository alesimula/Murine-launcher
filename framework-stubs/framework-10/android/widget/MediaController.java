package android.widget;

public class MediaController extends android.widget.FrameLayout {
    @android.annotation.UnsupportedAppUsage
    private android.widget.MediaController.MediaPlayerControl mPlayer;
    @android.annotation.UnsupportedAppUsage
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private android.view.View mAnchor;
    @android.annotation.UnsupportedAppUsage
    private android.view.View mRoot;
    @android.annotation.UnsupportedAppUsage
    private android.view.WindowManager mWindowManager;
    @android.annotation.UnsupportedAppUsage
    private android.view.Window mWindow;
    @android.annotation.UnsupportedAppUsage
    private android.view.View mDecor;
    @android.annotation.UnsupportedAppUsage
    private android.view.WindowManager.LayoutParams mDecorLayoutParams;
    @android.annotation.UnsupportedAppUsage
    private android.widget.ProgressBar mProgress;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.widget.TextView mEndTime;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.widget.TextView mCurrentTime;
    @android.annotation.UnsupportedAppUsage
    private boolean mShowing;
    private boolean mDragging;
    private static final int sDefaultTimeout = 3000;
    private final boolean mUseFastForward = false;
    private boolean mFromXml;
    private boolean mListenersSet;
    private android.view.View.OnClickListener mNextListener;
    private android.view.View.OnClickListener mPrevListener;
    java.lang.StringBuilder mFormatBuilder;
    java.util.Formatter mFormatter;
    @android.annotation.UnsupportedAppUsage
    private android.widget.ImageButton mPauseButton;
    @android.annotation.UnsupportedAppUsage
    private android.widget.ImageButton mFfwdButton;
    @android.annotation.UnsupportedAppUsage
    private android.widget.ImageButton mRewButton;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.widget.ImageButton mNextButton;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.widget.ImageButton mPrevButton;
    private java.lang.CharSequence mPlayDescription;
    private java.lang.CharSequence mPauseDescription;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    private final android.view.View.OnLayoutChangeListener mLayoutChangeListener = null;
    private final android.view.View.OnTouchListener mTouchListener = null;
    private final java.lang.Runnable mFadeOut = null;
    private final java.lang.Runnable mShowProgress = null;
    private final android.view.View.OnClickListener mPauseListener = null;
    @android.annotation.UnsupportedAppUsage
    private final android.widget.SeekBar.OnSeekBarChangeListener mSeekListener = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.View.OnClickListener mRewListener = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.View.OnClickListener mFfwdListener = null;
    public MediaController(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void onFinishInflate() {}
    public MediaController(android.content.Context p0, boolean p1) { super((android.content.Context)null); }
    public MediaController(android.content.Context p0) { super((android.content.Context)null); }
    private void initFloatingWindow() {}
    private void initFloatingWindowLayout() {}
    private void updateFloatingWindowLayout() {}
    public void setMediaPlayer(android.widget.MediaController.MediaPlayerControl p0) {}
    public void setAnchorView(android.view.View p0) {}
    protected android.view.View makeControllerView() { return null; }
    private void initControllerView(android.view.View p0) {}
    public void show() {}
    private void disableUnsupportedButtons() {}
    public void show(int p0) {}
    public boolean isShowing() { return false; }
    public void hide() {}
    private java.lang.String stringForTime(int p0) { return null; }
    private int setProgress() { return 0; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    private void updatePausePlay() {}
    private void doPauseResume() {}
    public void setEnabled(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    private void installPrevNextListeners() {}
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
