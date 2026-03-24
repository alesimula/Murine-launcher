package android.media;

public final class MediaSync {
    public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = 1;
    public static final int MEDIASYNC_ERROR_SURFACE_FAIL = 2;
    private static final java.lang.String TAG = "MediaSync";
    private static final int EVENT_CALLBACK = 1;
    private static final int EVENT_SET_CALLBACK = 2;
    private static final int CB_RETURN_AUDIO_BUFFER = 1;
    private final java.lang.Object mCallbackLock = null;
    private android.os.Handler mCallbackHandler;
    private android.media.MediaSync.Callback mCallback;
    private final java.lang.Object mOnErrorListenerLock = null;
    private android.os.Handler mOnErrorListenerHandler;
    private android.media.MediaSync.OnErrorListener mOnErrorListener;
    private java.lang.Thread mAudioThread;
    private android.os.Handler mAudioHandler;
    private android.os.Looper mAudioLooper;
    private final java.lang.Object mAudioLock = null;
    private android.media.AudioTrack mAudioTrack;
    private java.util.List<android.media.MediaSync.AudioBuffer> mAudioBuffers;
    private float mPlaybackRate;
    private long mNativeContext;
    public MediaSync() {}
    private final native void native_setup();
    protected void finalize() {}
    private final native void native_finalize();
    public final void release() {}
    private final native void native_release();
    public void setCallback(android.media.MediaSync.Callback p0, android.os.Handler p1) {}
    public void setOnErrorListener(android.media.MediaSync.OnErrorListener p0, android.os.Handler p1) {}
    public void setSurface(android.view.Surface p0) {}
    private final native void native_setSurface(android.view.Surface p0);
    public void setAudioTrack(android.media.AudioTrack p0) {}
    private final native void native_setAudioTrack(android.media.AudioTrack p0);
    public final native android.view.Surface createInputSurface();
    public void setPlaybackParams(android.media.PlaybackParams p0) {}
    public native android.media.PlaybackParams getPlaybackParams();
    private native float native_setPlaybackParams(android.media.PlaybackParams p0);
    public void setSyncParams(android.media.SyncParams p0) {}
    private native float native_setSyncParams(android.media.SyncParams p0);
    public native android.media.SyncParams getSyncParams();
    public void flush() {}
    private final native void native_flush();
    public android.media.MediaTimestamp getTimestamp() { return null; }
    private final native boolean native_getTimestamp(android.media.MediaTimestamp p0);
    public void queueAudio(java.nio.ByteBuffer p0, int p1, long p2) {}
    private void postRenderAudio(long p0) {}
    private final native void native_updateQueuedAudioData(int p0, long p1);
    private final native long native_getPlayTimeForPendingAudioFrames();
    private final void postReturnByteBuffer(android.media.MediaSync.AudioBuffer p0) {}
    private final void returnAudioBuffers() {}
    private void createAudioThread() {}
    private static final native void native_init();

    public static interface OnErrorListener {
        public void onError(android.media.MediaSync p0, int p1, int p2);
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onAudioBufferConsumed(android.media.MediaSync p0, java.nio.ByteBuffer p1, int p2);
    }

    private static class AudioBuffer {
        public java.nio.ByteBuffer mByteBuffer;
        public int mBufferIndex;
        long mPresentationTimeUs;
        public AudioBuffer(java.nio.ByteBuffer p0, int p1, long p2) {}
    }
}
