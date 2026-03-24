package android.sysprop;

public final class CryptoProperties {
    public static java.util.Optional<android.sysprop.CryptoProperties.type_values> type() { return null; }
    public static void type(android.sysprop.CryptoProperties.type_values p0) {}
    public static java.util.Optional<android.sysprop.CryptoProperties.state_values> state() { return null; }

    public static enum state_values {
        ENCRYPTED,
        UNENCRYPTED,
        UNSUPPORTED;
        public java.lang.String getPropValue() { return null; }
    }

    public static enum type_values {
        BLOCK,
        FILE,
        NONE;
        public java.lang.String getPropValue() { return null; }
    }
}
