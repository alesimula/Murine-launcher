package android.media;

public final class MediaDescrambler implements java.lang.AutoCloseable {
    public static final byte SCRAMBLE_CONTROL_UNSCRAMBLED = 0;
    public static final byte SCRAMBLE_CONTROL_RESERVED = 1;
    public static final byte SCRAMBLE_CONTROL_EVEN_KEY = 2;
    public static final byte SCRAMBLE_CONTROL_ODD_KEY = 3;
    public static final byte SCRAMBLE_FLAG_PES_HEADER = 1;
    public MediaDescrambler(int p0) throws android.media.MediaCasException.UnsupportedCasException {}
    public boolean isAidlHal() { return false; }
    android.os.IHwBinder getBinder() { return null; }
    public final boolean requiresSecureDecoderComponent(java.lang.String p0) { return false; }
    public final void setMediaCasSession(android.media.MediaCas.Session p0) {}
    public final int descramble(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, android.media.MediaCodec.CryptoInfo p2) { return 0; }
    public void close() {}
    protected void finalize() {}

    private class AidlDescrambler implements android.media.MediaDescrambler.DescramblerWrapper {
        android.hardware.cas.IDescrambler mAidlDescrambler;
        AidlDescrambler(android.media.MediaDescrambler p0, android.hardware.cas.IDescrambler p1) throws java.lang.Exception {}
        public android.os.IHwBinder asBinder() { return null; }
        public int descramble(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, android.media.MediaCodec.CryptoInfo p2) throws android.os.RemoteException { return 0; }
        public boolean requiresSecureDecoderComponent(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setMediaCasSession(byte[] p0) throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
    }

    private static interface DescramblerWrapper {
        public android.os.IHwBinder asBinder();
        public int descramble(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, android.media.MediaCodec.CryptoInfo p2) throws android.os.RemoteException;
        public boolean requiresSecureDecoderComponent(java.lang.String p0) throws android.os.RemoteException;
        public void setMediaCasSession(byte[] p0) throws android.os.RemoteException;
        public void release() throws android.os.RemoteException;
    }

    private class HidlDescrambler implements android.media.MediaDescrambler.DescramblerWrapper {
        android.hardware.cas.V1_0.IDescramblerBase mHidlDescrambler;
        HidlDescrambler(android.media.MediaDescrambler p0, android.hardware.cas.V1_0.IDescramblerBase p1) throws java.lang.Exception {}
        public android.os.IHwBinder asBinder() { return null; }
        public int descramble(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1, android.media.MediaCodec.CryptoInfo p2) throws android.os.RemoteException { return 0; }
        public boolean requiresSecureDecoderComponent(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setMediaCasSession(byte[] p0) throws android.os.RemoteException {}
        public void release() throws android.os.RemoteException {}
    }
}
