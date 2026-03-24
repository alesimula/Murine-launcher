package android.opengl;

public class ETC1 {
    public static final int ENCODED_BLOCK_SIZE = 8;
    public static final int DECODED_BLOCK_SIZE = 48;
    public static final int ETC_PKM_HEADER_SIZE = 16;
    public static final int ETC1_RGB8_OES = 36196;
    public ETC1() {}
    public static native void encodeBlock(java.nio.Buffer p0, int p1, java.nio.Buffer p2);
    public static native void decodeBlock(java.nio.Buffer p0, java.nio.Buffer p1);
    public static native int getEncodedDataSize(int p0, int p1);
    public static native void encodeImage(java.nio.Buffer p0, int p1, int p2, int p3, int p4, java.nio.Buffer p5);
    public static native void decodeImage(java.nio.Buffer p0, java.nio.Buffer p1, int p2, int p3, int p4, int p5);
    public static native void formatHeader(java.nio.Buffer p0, int p1, int p2);
    public static native boolean isValid(java.nio.Buffer p0);
    public static native int getWidth(java.nio.Buffer p0);
    public static native int getHeight(java.nio.Buffer p0);
}
