package android.speech.tts;

abstract class AbstractEventLogger {
    protected final java.lang.String mServiceApp = null;
    protected final int mCallerUid = 0;
    protected final int mCallerPid = 0;
    protected final long mReceivedTime = 0L;
    protected long mPlaybackStartTime;
    private volatile long mRequestProcessingStartTime;
    private volatile long mEngineStartTime;
    private volatile long mEngineCompleteTime;
    private boolean mLogWritten;
    AbstractEventLogger(int p0, int p1, java.lang.String p2) {}
    public void onRequestProcessingStart() {}
    public void onEngineDataReceived() {}
    public void onEngineComplete() {}
    public void onAudioDataWritten() {}
    public void onCompleted(int p0) {}
    protected abstract void logFailure(int p0);
    protected abstract void logSuccess(long p0, long p1, long p2);
}
