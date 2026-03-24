package android.os;

public class BytesMatcher implements java.util.function.Predicate<byte[]> {
    private static final java.lang.String TAG = "BytesMatcher";
    private static final char TYPE_EXACT_ACCEPT = '+';
    private static final char TYPE_EXACT_REJECT = '-';
    private static final char TYPE_PREFIX_ACCEPT = (char)0x2286;
    private static final char TYPE_PREFIX_REJECT = (char)0x2288;
    private final java.util.ArrayList<android.os.BytesMatcher.Rule> mRules = null;
    public BytesMatcher() {}
    public void addExactAcceptRule(byte[] p0, byte[] p1) {}
    public void addExactRejectRule(byte[] p0, byte[] p1) {}
    public void addPrefixAcceptRule(byte[] p0, byte[] p1) {}
    public void addPrefixRejectRule(byte[] p0, byte[] p1) {}
    public boolean testBluetoothUuid(android.os.ParcelUuid p0) { return false; }
    public boolean testMacAddress(android.net.MacAddress p0) { return false; }
    public boolean test(byte[] p0) { return false; }
    public boolean test(byte[] p0, boolean p1) { return false; }
    public static java.lang.String encode(android.os.BytesMatcher p0) { return null; }
    public static android.os.BytesMatcher decode(java.lang.String p0) { return null; }

    private static class Rule {
        public final char type = 0;
        public final byte[] value = null;
        public final byte[] mask = null;
        public Rule(char p0, byte[] p1, byte[] p2) {}
        public java.lang.String toString() { return null; }
        public void encode(java.lang.StringBuilder p0) {}
        public boolean test(byte[] p0) { return false; }
    }
}
