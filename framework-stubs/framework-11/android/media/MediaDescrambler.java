package android.media;

public final class MediaDescrambler implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "MediaDescrambler";
    private android.hardware.cas.V1_0.IDescramblerBase mIDescrambler;
    public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = 0;
    public static final byte SCRAMBLE_CONTROL_RESERVED = 1;
    public static final byte SCRAMBLE_CONTROL_EVEN_KEY = 2;
    public static final byte SCRAMBLE_CONTROL_ODD_KEY = 3;
    public static final byte SCRAMBLE_FLAG_PES_HEADER = 1;
    private long mNativeContext;
    private final void validateInternalStates() {}
    private final void cleanupAndRethrowIllegalState() {}
    public MediaDescrambler(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    android.os.IHwBinder getBinder() { return null; }
    public final boolean requiresSecureDecoderComponent(java.lang.String p0) { return false; }
    public final void setMediaCasSession(android.media.MediaCas.Session p0) {}
    public final int descramble(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, android.media.MediaCodec.CryptoInfo p2) { return 0; }
    public void close() {}
    protected void finalize() {}
    private static final native void native_init();
    private final native void native_setup(android.os.IHwBinder p0);
    private final native void native_release();
    private final native int native_descramble(byte p0, byte p1, int p2, int[] p3, int[] p4, java.nio.ByteBuffer p5, int p6, int p7, java.nio.ByteBuffer p8, int p9, int p10) throws android.os.RemoteException;
}
