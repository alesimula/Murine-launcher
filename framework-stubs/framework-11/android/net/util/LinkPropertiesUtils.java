package android.net.util;

public final class LinkPropertiesUtils {
    public LinkPropertiesUtils() {}
    public static android.net.util.LinkPropertiesUtils.CompareResult<android.net.LinkAddress> compareAddresses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return null; }
    public static boolean isIdenticalAddresses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalDnses(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalHttpProxy(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalInterfaceName(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }
    public static boolean isIdenticalRoutes(android.net.LinkProperties p0, android.net.LinkProperties p1) { return false; }

    public static class CompareOrUpdateResult<K extends java.lang.Object, T extends java.lang.Object> {
        public final java.util.List<T> added = null;
        public final java.util.List<T> removed = null;
        public final java.util.List<T> updated = null;
        public CompareOrUpdateResult(java.util.Collection<T> p0, java.util.Collection<T> p1, java.util.function.Function<T, K> p2) {}
        public java.lang.String toString() { return null; }
    }

    public static class CompareResult<T extends java.lang.Object> {
        public final java.util.List<T> removed = null;
        public final java.util.List<T> added = null;
        public CompareResult() {}
        public CompareResult(java.util.Collection<T> p0, java.util.Collection<T> p1) {}
        public java.lang.String toString() { return null; }
    }
}
