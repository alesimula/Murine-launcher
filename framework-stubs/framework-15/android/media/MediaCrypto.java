package android.media;

public final class MediaCrypto {
    public static final boolean isCryptoSchemeSupported(java.util.UUID p0) { return false; }
    public MediaCrypto(java.util.UUID p0, byte[] p1) throws android.media.MediaCryptoException {}
    public final native boolean requiresSecureDecoderComponent(java.lang.String p0);
    public final native void setMediaDrmSession(byte[] p0) throws android.media.MediaCryptoException;
    protected void finalize() {}
    public final native void release();
}
