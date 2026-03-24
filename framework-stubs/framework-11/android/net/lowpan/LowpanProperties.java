package android.net.lowpan;

public final class LowpanProperties {
    public static final android.net.lowpan.LowpanProperty<int[]> KEY_CHANNEL_MASK = null;
    public static final android.net.lowpan.LowpanProperty<java.lang.Integer> KEY_MAX_TX_POWER = null;
    private LowpanProperties() {}

    static final class LowpanStandardProperty<T extends java.lang.Object> extends android.net.lowpan.LowpanProperty<T> {
        private final java.lang.String mName = null;
        private final java.lang.Class<T> mType = null;
        LowpanStandardProperty(java.lang.String p0, java.lang.Class<T> p1) { super(); }
        public java.lang.String getName() { return null; }
        public java.lang.Class<T> getType() { return null; }
        public java.lang.String toString() { return null; }
    }
}
