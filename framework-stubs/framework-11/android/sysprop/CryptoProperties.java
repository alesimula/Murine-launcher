package android.sysprop;

public final class CryptoProperties {
    private CryptoProperties() {}
    private static java.lang.Boolean tryParseBoolean(java.lang.String p0) { return null; }
    private static java.lang.Integer tryParseInteger(java.lang.String p0) { return null; }
    private static java.lang.Long tryParseLong(java.lang.String p0) { return null; }
    private static java.lang.Double tryParseDouble(java.lang.String p0) { return null; }
    private static java.lang.String tryParseString(java.lang.String p0) { return null; }
    private static <T extends java.lang.Enum<T>> T tryParseEnum(java.lang.Class<T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Object> java.util.List<T> tryParseList(java.util.function.Function<java.lang.String, T> p0, java.lang.String p1) { return null; }
    private static <T extends java.lang.Enum<T>> java.util.List<T> tryParseEnumList(java.lang.Class<T> p0, java.lang.String p1) { return null; }
    private static java.lang.String escape(java.lang.String p0) { return null; }
    private static <T extends java.lang.Object> java.lang.String formatList(java.util.List<T> p0) { return null; }
    private static <T extends java.lang.Enum<T>> java.lang.String formatEnumList(java.util.List<T> p0, java.util.function.Function<T, java.lang.String> p1) { return null; }
    public static java.util.Optional<android.sysprop.CryptoProperties.type_values> type() { return null; }
    public static void type(android.sysprop.CryptoProperties.type_values p0) {}
    public static java.util.Optional<android.sysprop.CryptoProperties.state_values> state() { return null; }

    public static enum state_values {
        ENCRYPTED,
        UNENCRYPTED,
        UNSUPPORTED;
        private final java.lang.String propValue = null;
        private state_values() {}
        public java.lang.String getPropValue() { return null; }
    }

    public static enum type_values {
        BLOCK,
        FILE,
        NONE;
        private final java.lang.String propValue = null;
        private type_values() {}
        public java.lang.String getPropValue() { return null; }
    }
}
