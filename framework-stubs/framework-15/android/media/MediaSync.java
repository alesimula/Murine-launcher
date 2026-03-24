package android.media;

public final class MediaSync {
    public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = 1;
    public static final int MEDIASYNC_ERROR_SURFACE_FAIL = 2;
    public MediaSync() {}
    protected void finalize() {}
    public final void release() {}
    public void setCallback(android.media.MediaSync.Callback p0, android.os.Handler p1) {}
    public void setOnErrorListener(android.media.MediaSync.OnErrorListener p0, android.os.Handler p1) {}
    public void setSurface(android.view.Surface p0) {}
    public void setAudioTrack(android.media.AudioTrack p0) {}
    @android.annotation.NonNull
    public final native android.view.Surface createInputSurface();
    public void setPlaybackParams(android.media.PlaybackParams p0) {}
    @android.annotation.NonNull
    public native android.media.PlaybackParams getPlaybackParams();
    public void setSyncParams(android.media.SyncParams p0) {}
    @android.annotation.NonNull
    public native android.media.SyncParams getSyncParams();
    public void flush() {}
    @android.annotation.Nullable
    public android.media.MediaTimestamp getTimestamp() { return null; }
    public void queueAudio(java.nio.ByteBuffer p0, int p1, long p2) {}

    private static class AudioBuffer {
        public java.nio.ByteBuffer mByteBuffer;
        public int mBufferIndex;
        long mPresentationTimeUs;
        public AudioBuffer(java.nio.ByteBuffer p0, int p1, long p2) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onAudioBufferConsumed(android.media.MediaSync p0, java.nio.ByteBuffer p1, int p2);
    }

    public static interface OnErrorListener {
        public void onError(android.media.MediaSync p0, int p1, int p2);
    }
}
