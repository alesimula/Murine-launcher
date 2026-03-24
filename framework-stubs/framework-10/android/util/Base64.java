package android.util;

public class Base64 {
    public static final int DEFAULT = 0;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int CRLF = 4;
    public static final int URL_SAFE = 8;
    public static final int NO_CLOSE = 16;
    public static byte[] decode(java.lang.String p0, int p1) { return null; }
    public static byte[] decode(byte[] p0, int p1) { return null; }
    public static byte[] decode(byte[] p0, int p1, int p2, int p3) { return null; }
    public static java.lang.String encodeToString(byte[] p0, int p1) { return null; }
    public static java.lang.String encodeToString(byte[] p0, int p1, int p2, int p3) { return null; }
    public static byte[] encode(byte[] p0, int p1) { return null; }
    public static byte[] encode(byte[] p0, int p1, int p2, int p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    private Base64() {}

    static class Encoder extends android.util.Base64.Coder {
        public static final int LINE_GROUPS = 19;
        private static final byte[] ENCODE = null;
        private static final byte[] ENCODE_WEBSAFE = null;
        private final byte[] tail = null;
        int tailLen;
        private int count;
        public final boolean do_padding = false;
        public final boolean do_newline = false;
        public final boolean do_cr = false;
        private final byte[] alphabet = null;
        public Encoder(int p0, byte[] p1) { super(); }
        public int maxOutputSize(int p0) { return 0; }
        public boolean process(byte[] p0, int p1, int p2, boolean p3) { return false; }
    }

    static class Decoder extends android.util.Base64.Coder {
        private static final int[] DECODE = null;
        private static final int[] DECODE_WEBSAFE = null;
        private static final int SKIP = -1;
        private static final int EQUALS = -2;
        private int state;
        private int value;
        private final int[] alphabet = null;
        public Decoder(int p0, byte[] p1) { super(); }
        public int maxOutputSize(int p0) { return 0; }
        public boolean process(byte[] p0, int p1, int p2, boolean p3) { return false; }
    }

    static abstract class Coder {
        public byte[] output;
        public int op;
        Coder() {}
        public abstract boolean process(byte[] p0, int p1, int p2, boolean p3);
        public abstract int maxOutputSize(int p0);
    }
}
