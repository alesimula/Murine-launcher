package android.filterpacks.videosrc;

public class MediaSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="sourceUrl", hasDefault=true)
    private java.lang.String mSourceUrl;
    @android.filterfw.core.GenerateFieldPort(name="sourceAsset", hasDefault=true)
    private android.content.res.AssetFileDescriptor mSourceAsset;
    @android.filterfw.core.GenerateFieldPort(name="context", hasDefault=true)
    private android.content.Context mContext;
    @android.filterfw.core.GenerateFieldPort(name="sourceIsUrl", hasDefault=true)
    private boolean mSelectedIsUrl;
    @android.filterfw.core.GenerateFinalPort(name="waitForNewFrame", hasDefault=true)
    private boolean mWaitForNewFrame;
    @android.filterfw.core.GenerateFieldPort(name="loop", hasDefault=true)
    private boolean mLooping;
    @android.filterfw.core.GenerateFieldPort(name="volume", hasDefault=true)
    private float mVolume;
    @android.filterfw.core.GenerateFieldPort(name="orientation", hasDefault=true)
    private int mOrientation;
    private android.media.MediaPlayer mMediaPlayer;
    private android.filterfw.core.GLFrame mMediaFrame;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private android.filterfw.core.ShaderProgram mFrameExtractor;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private int mWidth;
    private int mHeight;
    private static final int PREP_TIMEOUT = 100;
    private static final int PREP_TIMEOUT_REPEAT = 100;
    private static final int NEWFRAME_TIMEOUT = 100;
    private static final int NEWFRAME_TIMEOUT_REPEAT = 10;
    private final java.lang.String mFrameShader = null;
    private static final float[] mSourceCoords_0 = null;
    private static final float[] mSourceCoords_270 = null;
    private static final float[] mSourceCoords_180 = null;
    private static final float[] mSourceCoords_90 = null;
    private boolean mGotSize;
    private boolean mPrepared;
    private boolean mPlaying;
    private boolean mNewFrameAvailable;
    private boolean mOrientationUpdated;
    private boolean mPaused;
    private boolean mCompleted;
    private final boolean mLogVerbose = false;
    private static final java.lang.String TAG = "MediaSource";
    private android.media.MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener;
    private android.media.MediaPlayer.OnPreparedListener onPreparedListener;
    private android.media.MediaPlayer.OnCompletionListener onCompletionListener;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onMediaFrameAvailableListener;
    public MediaSource(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    private void createFormats() {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public synchronized void pauseVideo(boolean p0) {}
    private synchronized boolean setupMediaPlayer(boolean p0) { return false; }
}
