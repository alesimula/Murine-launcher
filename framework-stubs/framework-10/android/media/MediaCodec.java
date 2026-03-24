package android.media;

public final class MediaCodec {
    public static final int BUFFER_FLAG_SYNC_FRAME = 1;
    public static final int BUFFER_FLAG_KEY_FRAME = 1;
    public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
    public static final int BUFFER_FLAG_END_OF_STREAM = 4;
    public static final int BUFFER_FLAG_PARTIAL_FRAME = 8;
    public static final int BUFFER_FLAG_MUXER_DATA = 16;
    private android.media.MediaCodec.EventHandler mEventHandler;
    private android.media.MediaCodec.EventHandler mOnFrameRenderedHandler;
    private android.media.MediaCodec.EventHandler mCallbackHandler;
    private android.media.MediaCodec.Callback mCallback;
    private android.media.MediaCodec.OnFrameRenderedListener mOnFrameRenderedListener;
    private final java.lang.Object mListenerLock = null;
    private android.media.MediaCodecInfo mCodecInfo;
    private final java.lang.Object mCodecInfoLock = null;
    private android.media.MediaCrypto mCrypto;
    private static final int EVENT_CALLBACK = 1;
    private static final int EVENT_SET_CALLBACK = 2;
    private static final int EVENT_FRAME_RENDERED = 3;
    private static final int CB_INPUT_AVAILABLE = 1;
    private static final int CB_OUTPUT_AVAILABLE = 2;
    private static final int CB_ERROR = 3;
    private static final int CB_OUTPUT_FORMAT_CHANGE = 4;
    private boolean mHasSurface;
    private java.lang.String mNameAtCreation;
    public static final int CONFIGURE_FLAG_ENCODE = 1;
    public static final int CRYPTO_MODE_UNENCRYPTED = 0;
    public static final int CRYPTO_MODE_AES_CTR = 1;
    public static final int CRYPTO_MODE_AES_CBC = 2;
    public static final int INFO_TRY_AGAIN_LATER = -1;
    public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
    public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
    private java.nio.ByteBuffer[] mCachedInputBuffers;
    private java.nio.ByteBuffer[] mCachedOutputBuffers;
    private final android.media.MediaCodec.BufferMap mDequeuedInputBuffers = null;
    private final android.media.MediaCodec.BufferMap mDequeuedOutputBuffers = null;
    private final java.util.Map<java.lang.Integer, android.media.MediaCodec.BufferInfo> mDequeuedOutputInfos = null;
    private final java.lang.Object mBufferLock = null;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    public static final java.lang.String PARAMETER_KEY_VIDEO_BITRATE = "video-bitrate";
    public static final java.lang.String PARAMETER_KEY_SUSPEND = "drop-input-frames";
    public static final java.lang.String PARAMETER_KEY_SUSPEND_TIME = "drop-start-time-us";
    public static final java.lang.String PARAMETER_KEY_OFFSET_TIME = "time-offset-us";
    public static final java.lang.String PARAMETER_KEY_REQUEST_SYNC_FRAME = "request-sync";
    public static final java.lang.String PARAMETER_KEY_HDR10_PLUS_INFO = "hdr10-plus-info";
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private long mNativeContext;
    private final java.util.concurrent.locks.Lock mNativeContextLock = null;
    public static android.media.MediaCodec createDecoderByType(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.media.MediaCodec createEncoderByType(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.media.MediaCodec createByCodecName(java.lang.String p0) throws java.io.IOException { return null; }
    private MediaCodec(java.lang.String p0, boolean p1, boolean p2) {}
    protected void finalize() {}
    public final void reset() {}
    private final native void native_reset();
    public final void release() {}
    private final native void native_release();
    public void configure(android.media.MediaFormat p0, android.view.Surface p1, android.media.MediaCrypto p2, int p3) {}
    public void configure(android.media.MediaFormat p0, android.view.Surface p1, int p2, android.media.MediaDescrambler p3) {}
    private void configure(android.media.MediaFormat p0, android.view.Surface p1, android.media.MediaCrypto p2, android.os.IHwBinder p3, int p4) {}
    public void setOutputSurface(android.view.Surface p0) {}
    private native void native_setSurface(android.view.Surface p0);
    public static android.view.Surface createPersistentInputSurface() { return null; }
    public void setInputSurface(android.view.Surface p0) {}
    private static final native android.media.MediaCodec.PersistentSurface native_createPersistentInputSurface();
    private static final native void native_releasePersistentInputSurface(android.view.Surface p0);
    private final native void native_setInputSurface(android.view.Surface p0);
    private final native void native_setCallback(android.media.MediaCodec.Callback p0);
    private final native void native_configure(java.lang.String[] p0, java.lang.Object[] p1, android.view.Surface p2, android.media.MediaCrypto p3, android.os.IHwBinder p4, int p5);
    public final native android.view.Surface createInputSurface();
    public final void start() {}
    private final native void native_start();
    public final void stop() {}
    private final native void native_stop();
    public final void flush() {}
    private final native void native_flush();
    public final void queueInputBuffer(int p0, int p1, int p2, long p3, int p4) throws android.media.MediaCodec.CryptoException {}
    private final native void native_queueInputBuffer(int p0, int p1, int p2, long p3, int p4) throws android.media.MediaCodec.CryptoException;
    public final void queueSecureInputBuffer(int p0, int p1, android.media.MediaCodec.CryptoInfo p2, long p3, int p4) throws android.media.MediaCodec.CryptoException {}
    private final native void native_queueSecureInputBuffer(int p0, int p1, android.media.MediaCodec.CryptoInfo p2, long p3, int p4) throws android.media.MediaCodec.CryptoException;
    public final int dequeueInputBuffer(long p0) { return 0; }
    private final native int native_dequeueInputBuffer(long p0);
    public final int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo p0, long p1) { return 0; }
    private final native int native_dequeueOutputBuffer(android.media.MediaCodec.BufferInfo p0, long p1);
    public final void releaseOutputBuffer(int p0, boolean p1) {}
    public final void releaseOutputBuffer(int p0, long p1) {}
    @android.annotation.UnsupportedAppUsage
    private final native void releaseOutputBuffer(int p0, boolean p1, boolean p2, long p3);
    public final native void signalEndOfInputStream();
    public final android.media.MediaFormat getOutputFormat() { return null; }
    public final android.media.MediaFormat getInputFormat() { return null; }
    public final android.media.MediaFormat getOutputFormat(int p0) { return null; }
    private final native java.util.Map<java.lang.String, java.lang.Object> getFormatNative(boolean p0);
    private final native java.util.Map<java.lang.String, java.lang.Object> getOutputFormatNative(int p0);
    private final void invalidateByteBuffer(java.nio.ByteBuffer[] p0, int p1) {}
    private final void validateInputByteBuffer(java.nio.ByteBuffer[] p0, int p1) {}
    private final void revalidateByteBuffer(java.nio.ByteBuffer[] p0, int p1) {}
    private final void validateOutputByteBuffer(java.nio.ByteBuffer[] p0, int p1, android.media.MediaCodec.BufferInfo p2) {}
    private final void invalidateByteBuffers(java.nio.ByteBuffer[] p0) {}
    private final void freeByteBuffer(java.nio.ByteBuffer p0) {}
    private final void freeByteBuffers(java.nio.ByteBuffer[] p0) {}
    private final void freeAllTrackedBuffers() {}
    private final void cacheBuffers(boolean p0) {}
    public java.nio.ByteBuffer[] getInputBuffers() { return null; }
    public java.nio.ByteBuffer[] getOutputBuffers() { return null; }
    public java.nio.ByteBuffer getInputBuffer(int p0) { return null; }
    public android.media.Image getInputImage(int p0) { return null; }
    public java.nio.ByteBuffer getOutputBuffer(int p0) { return null; }
    public android.media.Image getOutputImage(int p0) { return null; }
    public final native void setVideoScalingMode(int p0);
    public void setAudioPresentation(android.media.AudioPresentation p0) {}
    private native void native_setAudioPresentation(int p0, int p1);
    public final java.lang.String getName() { return null; }
    public final native java.lang.String getCanonicalName();
    public android.os.PersistableBundle getMetrics() { return null; }
    private native android.os.PersistableBundle native_getMetrics();
    public final void setParameters(android.os.Bundle p0) {}
    public void setCallback(android.media.MediaCodec.Callback p0, android.os.Handler p1) {}
    public void setCallback(android.media.MediaCodec.Callback p0) {}
    public void setOnFrameRenderedListener(android.media.MediaCodec.OnFrameRenderedListener p0, android.os.Handler p1) {}
    private native void native_enableOnFrameRenderedListener(boolean p0);
    private android.media.MediaCodec.EventHandler getEventHandlerOn(android.os.Handler p0, android.media.MediaCodec.EventHandler p1) { return null; }
    private void postEventFromNative(int p0, int p1, int p2, java.lang.Object p3) {}
    @android.annotation.UnsupportedAppUsage
    private final native void setParameters(java.lang.String[] p0, java.lang.Object[] p1);
    public android.media.MediaCodecInfo getCodecInfo() { return null; }
    private final native android.media.MediaCodecInfo getOwnCodecInfo();
    @android.annotation.UnsupportedAppUsage
    private final native java.nio.ByteBuffer[] getBuffers(boolean p0);
    private final native java.nio.ByteBuffer getBuffer(boolean p0, int p1);
    private final native android.media.Image getImage(boolean p0, int p1);
    private static final native void native_init();
    private final native void native_setup(java.lang.String p0, boolean p1, boolean p2);
    private final native void native_finalize();
    private final long lockAndGetContext() { return 0L; }
    private final void setAndUnlockContext(long p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoScalingMode {
    }

    static class PersistentSurface extends android.view.Surface {
        private long mPersistentObject;
        PersistentSurface() { super(); }
        public void release() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OutputBufferInfo {
    }

    public static interface OnFrameRenderedListener {
        public void onFrameRendered(android.media.MediaCodec p0, long p1, long p2);
    }

    public static final class MetricsConstants {
        public static final java.lang.String CODEC = "android.media.mediacodec.codec";
        public static final java.lang.String MIME_TYPE = "android.media.mediacodec.mime";
        public static final java.lang.String MODE = "android.media.mediacodec.mode";
        public static final java.lang.String MODE_AUDIO = "audio";
        public static final java.lang.String MODE_VIDEO = "video";
        public static final java.lang.String ENCODER = "android.media.mediacodec.encoder";
        public static final java.lang.String SECURE = "android.media.mediacodec.secure";
        public static final java.lang.String WIDTH = "android.media.mediacodec.width";
        public static final java.lang.String HEIGHT = "android.media.mediacodec.height";
        public static final java.lang.String ROTATION = "android.media.mediacodec.rotation";
        private MetricsConstants() {}
    }

    public static class MediaImage extends android.media.Image {
        private final boolean mIsReadOnly = false;
        private final int mWidth = 0;
        private final int mHeight = 0;
        private final int mFormat = 0;
        private long mTimestamp;
        private final android.media.Image.Plane[] mPlanes = null;
        private final java.nio.ByteBuffer mBuffer = null;
        private final java.nio.ByteBuffer mInfo = null;
        private final int mXOffset = 0;
        private final int mYOffset = 0;
        private static final int TYPE_YUV = 1;
        private final int mTransform = 0;
        private final int mScalingMode = 0;
        public int getFormat() { return 0; }
        public int getHeight() { return 0; }
        public int getWidth() { return 0; }
        public int getTransform() { return 0; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        public android.media.Image.Plane[] getPlanes() { return null; }
        public void close() {}
        public void setCropRect(android.graphics.Rect p0) {}
        public MediaImage(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, boolean p2, long p3, int p4, int p5, android.graphics.Rect p6) { super(); }

        private class MediaPlane extends android.media.Image.Plane {
            private final int mRowInc = 0;
            private final int mColInc = 0;
            private final java.nio.ByteBuffer mData = null;
            public MediaPlane(android.media.MediaCodec.MediaImage p0, java.nio.ByteBuffer p1, int p2, int p3) { super(); }
            public int getRowStride() { return 0; }
            public int getPixelStride() { return 0; }
            public java.nio.ByteBuffer getBuffer() { return null; }
        }
    }

    private class EventHandler extends android.os.Handler {
        private android.media.MediaCodec mCodec;
        public EventHandler(android.media.MediaCodec p0, android.media.MediaCodec p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
        private void handleCallback(android.os.Message p0) {}
    }

    public static final class CryptoInfo {
        public int numSubSamples;
        public int[] numBytesOfClearData;
        public int[] numBytesOfEncryptedData;
        public byte[] key;
        public byte[] iv;
        public int mode;
        private final android.media.MediaCodec.CryptoInfo.Pattern zeroPattern = null;
        private android.media.MediaCodec.CryptoInfo.Pattern pattern;
        public CryptoInfo() {}
        public void set(int p0, int[] p1, int[] p2, byte[] p3, byte[] p4, int p5) {}
        public void setPattern(android.media.MediaCodec.CryptoInfo.Pattern p0) {}
        private void setPattern(int p0, int p1) {}
        public java.lang.String toString() { return null; }

        public static final class Pattern {
            private int mEncryptBlocks;
            private int mSkipBlocks;
            public Pattern(int p0, int p1) {}
            public void set(int p0, int p1) {}
            public int getSkipBlocks() { return 0; }
            public int getEncryptBlocks() { return 0; }
        }
    }

    public static final class CryptoException extends java.lang.RuntimeException {
        public static final int ERROR_NO_KEY = 1;
        public static final int ERROR_KEY_EXPIRED = 2;
        public static final int ERROR_RESOURCE_BUSY = 3;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
        public static final int ERROR_SESSION_NOT_OPENED = 5;
        public static final int ERROR_UNSUPPORTED_OPERATION = 6;
        public static final int ERROR_INSUFFICIENT_SECURITY = 7;
        public static final int ERROR_FRAME_TOO_LARGE = 8;
        public static final int ERROR_LOST_STATE = 9;
        private int mErrorCode;
        public CryptoException(int p0, java.lang.String p1) { super(); }
        public int getErrorCode() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CryptoErrorCode {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfigureFlag {
    }

    public static final class CodecException extends java.lang.IllegalStateException {
        public static final int ERROR_INSUFFICIENT_RESOURCE = 1100;
        public static final int ERROR_RECLAIMED = 1101;
        private static final int ACTION_TRANSIENT = 1;
        private static final int ACTION_RECOVERABLE = 2;
        private final java.lang.String mDiagnosticInfo = null;
        private final int mErrorCode = 0;
        private final int mActionCode = 0;
        @android.annotation.UnsupportedAppUsage
        CodecException(int p0, int p1, java.lang.String p2) { super(); }
        public boolean isTransient() { return false; }
        public boolean isRecoverable() { return false; }
        public int getErrorCode() { return 0; }
        public java.lang.String getDiagnosticInfo() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ReasonCode {
        }
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onInputBufferAvailable(android.media.MediaCodec p0, int p1);
        public abstract void onOutputBufferAvailable(android.media.MediaCodec p0, int p1, android.media.MediaCodec.BufferInfo p2);
        public abstract void onError(android.media.MediaCodec p0, android.media.MediaCodec.CodecException p1);
        public abstract void onOutputFormatChanged(android.media.MediaCodec p0, android.media.MediaFormat p1);
    }

    private static class BufferMap {
        private final java.util.Map<java.lang.Integer, android.media.MediaCodec.BufferMap.CodecBuffer> mMap = null;
        private BufferMap() {}
        public void remove(int p0) {}
        public void put(int p0, java.nio.ByteBuffer p1) {}
        public void put(int p0, android.media.Image p1) {}
        public void clear() {}

        private static class CodecBuffer {
            private android.media.Image mImage;
            private java.nio.ByteBuffer mByteBuffer;
            private CodecBuffer() {}
            public void free() {}
            public void setImage(android.media.Image p0) {}
            public void setByteBuffer(java.nio.ByteBuffer p0) {}
        }
    }

    public static final class BufferInfo {
        public int offset;
        public int size;
        public long presentationTimeUs;
        public int flags;
        public BufferInfo() {}
        public void set(int p0, int p1, long p2, int p3) {}
        public android.media.MediaCodec.BufferInfo dup() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BufferFlag {
    }
}
