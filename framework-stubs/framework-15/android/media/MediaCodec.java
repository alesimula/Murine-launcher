package android.media;

public final class MediaCodec {
    public static final int BUFFER_FLAG_SYNC_FRAME = 1;
    public static final int BUFFER_FLAG_KEY_FRAME = 1;
    public static final int BUFFER_FLAG_CODEC_CONFIG = 2;
    public static final int BUFFER_FLAG_END_OF_STREAM = 4;
    public static final int BUFFER_FLAG_PARTIAL_FRAME = 8;
    public static final int BUFFER_FLAG_MUXER_DATA = 16;
    public static final int BUFFER_FLAG_DECODE_ONLY = 32;
    public static final int CONFIGURE_FLAG_ENCODE = 1;
    public static final int CONFIGURE_FLAG_USE_BLOCK_MODEL = 2;
    public static final int CONFIGURE_FLAG_USE_CRYPTO_ASYNC = 4;
    @android.annotation.FlaggedApi("android.media.codec.null_output_surface")
    public static final int CONFIGURE_FLAG_DETACHED_SURFACE = 8;
    public static final int CRYPTO_MODE_UNENCRYPTED = 0;
    public static final int CRYPTO_MODE_AES_CTR = 1;
    public static final int CRYPTO_MODE_AES_CBC = 2;
    public static final int INFO_TRY_AGAIN_LATER = -1;
    public static final int INFO_OUTPUT_FORMAT_CHANGED = -2;
    public static final int INFO_OUTPUT_BUFFERS_CHANGED = -3;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
    public static final java.lang.String PARAMETER_KEY_VIDEO_BITRATE = "video-bitrate";
    public static final java.lang.String PARAMETER_KEY_SUSPEND = "drop-input-frames";
    public static final java.lang.String PARAMETER_KEY_SUSPEND_TIME = "drop-start-time-us";
    public static final java.lang.String PARAMETER_KEY_OFFSET_TIME = "time-offset-us";
    public static final java.lang.String PARAMETER_KEY_REQUEST_SYNC_FRAME = "request-sync";
    public static final java.lang.String PARAMETER_KEY_HDR10_PLUS_INFO = "hdr10-plus-info";
    public static final java.lang.String PARAMETER_KEY_LOW_LATENCY = "low-latency";
    public static final java.lang.String PARAMETER_KEY_TUNNEL_PEEK = "tunnel-peek";
    @android.annotation.FlaggedApi("android.media.codec.region_of_interest")
    public static final java.lang.String PARAMETER_KEY_QP_OFFSET_MAP = "qp-offset-map";
    @android.annotation.FlaggedApi("android.media.codec.region_of_interest")
    public static final java.lang.String PARAMETER_KEY_QP_OFFSET_RECTS = "qp-offset-rects";
    static boolean GetFlag(java.util.function.Supplier<java.lang.Boolean> p0) { return false; }
    static boolean GetFlag(java.util.function.Supplier<java.lang.Boolean> p0, boolean p1) { return false; }
    @android.annotation.NonNull
    public static android.media.MediaCodec createDecoderByType(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.media.MediaCodec createEncoderByType(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static android.media.MediaCodec createByCodecName(java.lang.String p0) throws java.io.IOException { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.MEDIA_RESOURCE_OVERRIDE_PID")
    public static android.media.MediaCodec createByCodecNameForClient(java.lang.String p0, int p1, int p2) throws java.io.IOException { return null; }
    protected void finalize() {}
    public final void reset() {}
    public final void release() {}
    public void configure(android.media.MediaFormat p0, android.view.Surface p1, android.media.MediaCrypto p2, int p3) {}
    public void configure(android.media.MediaFormat p0, android.view.Surface p1, int p2, android.media.MediaDescrambler p3) {}
    public void setOutputSurface(android.view.Surface p0) {}
    @android.annotation.FlaggedApi("android.media.codec.null_output_surface")
    public void detachOutputSurface() {}
    @android.annotation.NonNull
    public static android.view.Surface createPersistentInputSurface() { return null; }
    public void setInputSurface(android.view.Surface p0) {}
    @android.annotation.NonNull
    public final native android.view.Surface createInputSurface();
    public final void start() {}
    public final void stop() {}
    public final void flush() {}
    public final void queueInputBuffer(int p0, int p1, int p2, long p3, int p4) throws android.media.MediaCodec.CryptoException {}
    @android.annotation.FlaggedApi("com.android.media.codec.flags.large_audio_frame")
    public final void queueInputBuffers(int p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1) {}
    public final void queueSecureInputBuffer(int p0, int p1, android.media.MediaCodec.CryptoInfo p2, long p3, int p4) throws android.media.MediaCodec.CryptoException {}
    @android.annotation.FlaggedApi("com.android.media.codec.flags.large_audio_frame")
    public final void queueSecureInputBuffers(int p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1, java.util.ArrayDeque<android.media.MediaCodec.CryptoInfo> p2) {}
    public final int dequeueInputBuffer(long p0) { return 0; }
    @android.annotation.Nullable
    public static android.media.Image mapHardwareBuffer(android.hardware.HardwareBuffer p0) { return null; }
    @android.annotation.NonNull
    public android.media.MediaCodec.QueueRequest getQueueRequest(int p0) { return null; }
    public final int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo p0, long p1) { return 0; }
    public final void releaseOutputBuffer(int p0, boolean p1) {}
    public final void releaseOutputBuffer(int p0, long p1) {}
    public final native void signalEndOfInputStream();
    @android.annotation.NonNull
    public final android.media.MediaFormat getOutputFormat() { return null; }
    @android.annotation.NonNull
    public final android.media.MediaFormat getInputFormat() { return null; }
    @android.annotation.NonNull
    public final android.media.MediaFormat getOutputFormat(int p0) { return null; }
    @android.annotation.NonNull
    public java.nio.ByteBuffer[] getInputBuffers() { return null; }
    @android.annotation.NonNull
    public java.nio.ByteBuffer[] getOutputBuffers() { return null; }
    @android.annotation.Nullable
    public java.nio.ByteBuffer getInputBuffer(int p0) { return null; }
    @android.annotation.Nullable
    public android.media.Image getInputImage(int p0) { return null; }
    @android.annotation.Nullable
    public java.nio.ByteBuffer getOutputBuffer(int p0) { return null; }
    @android.annotation.Nullable
    public android.media.Image getOutputImage(int p0) { return null; }
    @android.annotation.NonNull
    public android.media.MediaCodec.OutputFrame getOutputFrame(int p0) { return null; }
    public final native void setVideoScalingMode(int p0);
    public void setAudioPresentation(android.media.AudioPresentation p0) {}
    @android.annotation.NonNull
    public final java.lang.String getName() { return null; }
    @android.annotation.NonNull
    public final native java.lang.String getCanonicalName();
    public android.os.PersistableBundle getMetrics() { return null; }
    public final void setParameters(android.os.Bundle p0) {}
    public void setCallback(android.media.MediaCodec.Callback p0, android.os.Handler p1) {}
    public void setCallback(android.media.MediaCodec.Callback p0) {}
    public void setOnFirstTunnelFrameReadyListener(android.os.Handler p0, android.media.MediaCodec.OnFirstTunnelFrameReadyListener p1) {}
    public void setOnFrameRenderedListener(android.media.MediaCodec.OnFrameRenderedListener p0, android.os.Handler p1) {}
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSupportedVendorParameters() { return null; }
    @android.annotation.Nullable
    public android.media.MediaCodec.ParameterDescriptor getParameterDescriptor(java.lang.String p0) { return null; }
    public void subscribeToVendorParameters(java.util.List<java.lang.String> p0) {}
    public void unsubscribeFromVendorParameters(java.util.List<java.lang.String> p0) {}
    @android.annotation.NonNull
    public android.media.MediaCodecInfo getCodecInfo() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BufferFlag {
    }

    public static final class BufferInfo {
        public int offset;
        public int size;
        public long presentationTimeUs;
        public int flags;
        public BufferInfo() {}
        public void set(int p0, int p1, long p2, int p3) {}
        @android.annotation.NonNull
        public android.media.MediaCodec.BufferInfo dup() { return null; }
    }

    private static class BufferMap {
        public void remove(int p0) {}
        public void put(int p0, java.nio.ByteBuffer p1) {}
        public void put(int p0, android.media.Image p1) {}
        public void clear() {}

        private static class CodecBuffer {
            public void free() {}
            public void setImage(android.media.Image p0) {}
            public void setByteBuffer(java.nio.ByteBuffer p0) {}
        }
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onInputBufferAvailable(android.media.MediaCodec p0, int p1);
        public abstract void onOutputBufferAvailable(android.media.MediaCodec p0, int p1, android.media.MediaCodec.BufferInfo p2);
        @android.annotation.FlaggedApi("com.android.media.codec.flags.large_audio_frame")
        public void onOutputBuffersAvailable(android.media.MediaCodec p0, int p1, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p2) {}
        public abstract void onError(android.media.MediaCodec p0, android.media.MediaCodec.CodecException p1);
        public void onCryptoError(android.media.MediaCodec p0, android.media.MediaCodec.CryptoException p1) {}
        public abstract void onOutputFormatChanged(android.media.MediaCodec p0, android.media.MediaFormat p1);
    }

    public static final class CodecException extends java.lang.IllegalStateException {
        public static final int ERROR_INSUFFICIENT_RESOURCE = 1100;
        public static final int ERROR_RECLAIMED = 1101;
        CodecException(int p0, int p1, java.lang.String p2) { super(); }
        public boolean isTransient() { return false; }
        public boolean isRecoverable() { return false; }
        public int getErrorCode() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getDiagnosticInfo() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ReasonCode {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConfigureFlag {
    }

    public static final class CryptoException extends java.lang.RuntimeException implements android.media.MediaDrmThrowable {
        public static final int ERROR_NO_KEY = 1;
        public static final int ERROR_KEY_EXPIRED = 2;
        public static final int ERROR_RESOURCE_BUSY = 3;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
        public static final int ERROR_SESSION_NOT_OPENED = 5;
        public static final int ERROR_UNSUPPORTED_OPERATION = 6;
        public static final int ERROR_INSUFFICIENT_SECURITY = 7;
        public static final int ERROR_FRAME_TOO_LARGE = 8;
        public static final int ERROR_LOST_STATE = 9;
        public CryptoException(int p0, java.lang.String p1) { super(); }
        public CryptoException(java.lang.String p0, int p1, int p2, int p3, int p4, android.media.MediaCodec.CryptoInfo p5) { super(); }
        public int getErrorCode() { return 0; }
        @android.annotation.Nullable
        public android.media.MediaCodec.CryptoInfo getCryptoInfo() { return null; }
        public int getVendorError() { return 0; }
        public int getOemError() { return 0; }
        public int getErrorContext() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface CryptoErrorCode {
        }
    }

    public static final class CryptoInfo {
        public int numSubSamples;
        public int[] numBytesOfClearData;
        public int[] numBytesOfEncryptedData;
        public byte[] key;
        public byte[] iv;
        public int mode;
        public CryptoInfo() {}
        public void set(int p0, int[] p1, int[] p2, byte[] p3, byte[] p4, int p5) {}
        @android.annotation.NonNull
        public android.media.MediaCodec.CryptoInfo.Pattern getPattern() { return null; }
        public void setPattern(android.media.MediaCodec.CryptoInfo.Pattern p0) {}
        public java.lang.String toString() { return null; }

        public static final class Pattern {
            public Pattern(int p0, int p1) {}
            public void set(int p0, int p1) {}
            public int getSkipBlocks() { return 0; }
            public int getEncryptBlocks() { return 0; }
        }
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.MediaCodec p0, android.media.MediaCodec p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public class IncompatibleWithBlockModelException extends java.lang.RuntimeException {
        IncompatibleWithBlockModelException(android.media.MediaCodec p0) { super(); }
        IncompatibleWithBlockModelException(android.media.MediaCodec p0, java.lang.String p1) { super(); }
        IncompatibleWithBlockModelException(android.media.MediaCodec p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
        IncompatibleWithBlockModelException(android.media.MediaCodec p0, java.lang.Throwable p1) { super(); }
    }

    public class InvalidBufferFlagsException extends java.lang.RuntimeException {
        InvalidBufferFlagsException(android.media.MediaCodec p0, java.lang.String p1) { super(); }
    }

    public static final class LinearBlock {
        public boolean isMappable() { return false; }
        @android.annotation.NonNull
        public java.nio.ByteBuffer map() { return null; }
        public void recycle() {}
        protected void finalize() {}
        public static boolean isCodecCopyFreeCompatible(java.lang.String[] p0) { return false; }
        @android.annotation.Nullable
        public static android.media.MediaCodec.LinearBlock obtain(int p0, java.lang.String[] p1) { return null; }
    }

    public static class MediaImage extends android.media.Image {
        public int getFormat() { return 0; }
        public int getHeight() { return 0; }
        public int getWidth() { return 0; }
        public int getTransform() { return 0; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        @android.annotation.NonNull
        public android.media.Image.Plane[] getPlanes() { return null; }
        public void close() {}
        public void setCropRect(android.graphics.Rect p0) {}
        public MediaImage(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, boolean p2, long p3, int p4, int p5, android.graphics.Rect p6) { super(); }
        public MediaImage(java.nio.ByteBuffer[] p0, int[] p1, int[] p2, int p3, int p4, int p5, boolean p6, long p7, int p8, int p9, android.graphics.Rect p10, long p11) { super(); }

        private class MediaPlane extends android.media.Image.Plane {
            public MediaPlane(android.media.MediaCodec.MediaImage p0, java.nio.ByteBuffer p1, int p2, int p3) { super(); }
            public int getRowStride() { return 0; }
            public int getPixelStride() { return 0; }
            @android.annotation.NonNull
            public java.nio.ByteBuffer getBuffer() { return null; }
        }
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
    }

    public static interface OnFirstTunnelFrameReadyListener {
        public void onFirstTunnelFrameReady(android.media.MediaCodec p0);
    }

    public static interface OnFrameRenderedListener {
        public void onFrameRendered(android.media.MediaCodec p0, long p1, long p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OutputBufferInfo {
    }

    public static final class OutputFrame {
        OutputFrame(int p0) {}
        @android.annotation.Nullable
        public android.media.MediaCodec.LinearBlock getLinearBlock() { return null; }
        @android.annotation.Nullable
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public long getPresentationTimeUs() { return 0L; }
        public int getFlags() { return 0; }
        @android.annotation.FlaggedApi("com.android.media.codec.flags.large_audio_frame")
        @android.annotation.NonNull
        public java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> getBufferInfos() { return null; }
        @android.annotation.NonNull
        public android.media.MediaFormat getFormat() { return null; }
        @android.annotation.NonNull
        public java.util.Set<java.lang.String> getChangedKeys() { return null; }
        void clear() {}
        boolean isAccessible() { return false; }
        void setAccessible(boolean p0) {}
        void setBufferInfo(android.media.MediaCodec.BufferInfo p0) {}
        void setBufferInfos(java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p0) {}
        boolean isLoaded() { return false; }
        void setLoaded(boolean p0) {}
    }

    public static class ParameterDescriptor {
        @android.annotation.NonNull
        public java.lang.String getName() { return null; }
        public int getType() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    static class PersistentSurface extends android.view.Surface {
        PersistentSurface() { super(); }
        public void release() {}
    }

    public final class QueueRequest {
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setLinearBlock(android.media.MediaCodec.LinearBlock p0, int p1, int p2) { return null; }
        @android.annotation.FlaggedApi("com.android.media.codec.flags.large_audio_frame")
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setMultiFrameLinearBlock(android.media.MediaCodec.LinearBlock p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setEncryptedLinearBlock(android.media.MediaCodec.LinearBlock p0, int p1, int p2, android.media.MediaCodec.CryptoInfo p3) { return null; }
        @android.annotation.FlaggedApi("com.android.media.codec.flags.large_audio_frame")
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setMultiFrameEncryptedLinearBlock(android.media.MediaCodec.LinearBlock p0, java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> p1, java.util.ArrayDeque<android.media.MediaCodec.CryptoInfo> p2) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setHardwareBuffer(android.hardware.HardwareBuffer p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setPresentationTimeUs(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setIntegerParameter(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setLongParameter(java.lang.String p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setFloatParameter(java.lang.String p0, float p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setByteBufferParameter(java.lang.String p0, java.nio.ByteBuffer p1) { return null; }
        @android.annotation.NonNull
        public android.media.MediaCodec.QueueRequest setStringParameter(java.lang.String p0, java.lang.String p1) { return null; }
        public void queue() {}
        @android.annotation.NonNull
        android.media.MediaCodec.QueueRequest clear() { return null; }
        boolean isAccessible() { return false; }
        @android.annotation.NonNull
        android.media.MediaCodec.QueueRequest setAccessible(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoScalingMode {
    }
}
