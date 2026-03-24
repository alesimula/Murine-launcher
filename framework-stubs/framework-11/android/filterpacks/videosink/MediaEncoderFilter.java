package android.filterpacks.videosink;

public class MediaEncoderFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="recording", hasDefault=true)
    private boolean mRecording;
    @android.filterfw.core.GenerateFieldPort(name="outputFile", hasDefault=true)
    private java.lang.String mOutputFile;
    @android.filterfw.core.GenerateFieldPort(name="outputFileDescriptor", hasDefault=true)
    private java.io.FileDescriptor mFd;
    @android.filterfw.core.GenerateFieldPort(name="audioSource", hasDefault=true)
    private int mAudioSource;
    @android.filterfw.core.GenerateFieldPort(name="infoListener", hasDefault=true)
    private android.media.MediaRecorder.OnInfoListener mInfoListener;
    @android.filterfw.core.GenerateFieldPort(name="errorListener", hasDefault=true)
    private android.media.MediaRecorder.OnErrorListener mErrorListener;
    @android.filterfw.core.GenerateFieldPort(name="recordingDoneListener", hasDefault=true)
    private android.filterpacks.videosink.MediaEncoderFilter.OnRecordingDoneListener mRecordingDoneListener;
    @android.filterfw.core.GenerateFieldPort(name="orientationHint", hasDefault=true)
    private int mOrientationHint;
    @android.filterfw.core.GenerateFieldPort(name="recordingProfile", hasDefault=true)
    private android.media.CamcorderProfile mProfile;
    @android.filterfw.core.GenerateFieldPort(name="width", hasDefault=true)
    private int mWidth;
    @android.filterfw.core.GenerateFieldPort(name="height", hasDefault=true)
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(name="framerate", hasDefault=true)
    private int mFps;
    @android.filterfw.core.GenerateFieldPort(name="outputFormat", hasDefault=true)
    private int mOutputFormat;
    @android.filterfw.core.GenerateFieldPort(name="videoEncoder", hasDefault=true)
    private int mVideoEncoder;
    @android.filterfw.core.GenerateFieldPort(name="inputRegion", hasDefault=true)
    private android.filterfw.geometry.Quad mSourceRegion;
    @android.filterfw.core.GenerateFieldPort(name="maxFileSize", hasDefault=true)
    private long mMaxFileSize;
    @android.filterfw.core.GenerateFieldPort(name="maxDurationMs", hasDefault=true)
    private int mMaxDurationMs;
    @android.filterfw.core.GenerateFieldPort(name="timelapseRecordingIntervalUs", hasDefault=true)
    private long mTimeBetweenTimeLapseFrameCaptureUs;
    private static final int NO_AUDIO_SOURCE = -1;
    private int mSurfaceId;
    private android.filterfw.core.ShaderProgram mProgram;
    private android.filterfw.core.GLFrame mScreen;
    private boolean mRecordingActive;
    private long mTimestampNs;
    private long mLastTimeLapseFrameRealTimestampNs;
    private int mNumFramesEncoded;
    private boolean mCaptureTimeLapse;
    private boolean mLogVerbose;
    private static final java.lang.String TAG = "MediaEncoderFilter";
    private android.media.MediaRecorder mMediaRecorder;
    public MediaEncoderFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    private void updateSourceRegion() {}
    private void updateMediaRecorderParams() {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    private void startRecording(android.filterfw.core.FilterContext p0) {}
    public boolean skipFrameAndModifyTimestamp(long p0) { return false; }
    public void process(android.filterfw.core.FilterContext p0) {}
    private void stopRecording(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}

    public static interface OnRecordingDoneListener {
        public void onRecordingDone();
    }
}
