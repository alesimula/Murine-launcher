package android.media;

public final class MediaDescrambler implements java.lang.AutoCloseable {
    public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = 0;
    public static final byte SCRAMBLE_CONTROL_RESERVED = 1;
    public static final byte SCRAMBLE_CONTROL_EVEN_KEY = 2;
    public static final byte SCRAMBLE_CONTROL_ODD_KEY = 3;
    public static final byte SCRAMBLE_FLAG_PES_HEADER = 1;
    public MediaDescrambler(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    android.os.IHwBinder getBinder() { return null; }
    public final boolean requiresSecureDecoderComponent(java.lang.String p0) { return false; }
    public final void setMediaCasSession(android.media.MediaCas.Session p0) {}
    public final int descramble(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, android.media.MediaCodec.CryptoInfo p2) { return 0; }
    public void close() {}
    protected void finalize() {}
}
