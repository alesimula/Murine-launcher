package android.media;

@android.annotation.SuppressLint({"UnflaggedApi", "StaticUtils"})
public class Utils {
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final java.lang.String VIBRATION_URI_PARAM = "vibration_uri";
    @android.annotation.SuppressLint("UnflaggedApi")
    public static final java.lang.String SYNCHRONIZED_VIBRATION = "synchronized";
    public Utils() {}
    public static <T extends java.lang.Comparable<? super T>> void sortDistinctRanges(android.util.Range<T>[] p0) {}
    public static <T extends java.lang.Comparable<? super T>> android.util.Range<T>[] intersectSortedDistinctRanges(android.util.Range<T>[] p0, android.util.Range<T>[] p1) { return null; }
    public static <T extends java.lang.Comparable<? super T>> int binarySearchDistinctRanges(android.util.Range<T>[] p0, T p1) { return 0; }
    static int gcd(int p0, int p1) { return 0; }
    static android.util.Range<java.lang.Integer> factorRange(android.util.Range<java.lang.Integer> p0, int p1) { return null; }
    static android.util.Range<java.lang.Long> factorRange(android.util.Range<java.lang.Long> p0, long p1) { return null; }
    static android.util.Range<android.util.Rational> scaleRange(android.util.Range<android.util.Rational> p0, int p1, int p2) { return null; }
    static android.util.Range<java.lang.Integer> alignRange(android.util.Range<java.lang.Integer> p0, int p1) { return null; }
    static int divUp(int p0, int p1) { return 0; }
    static long divUp(long p0, long p1) { return 0L; }
    static android.util.Range<java.lang.Integer> intRangeFor(double p0) { return null; }
    static android.util.Range<java.lang.Long> longRangeFor(double p0) { return null; }
    static android.util.Size parseSize(java.lang.Object p0, android.util.Size p1) { return null; }
    static int parseIntSafely(java.lang.Object p0, int p1) { return 0; }
    static android.util.Range<java.lang.Integer> parseIntRange(java.lang.Object p0, android.util.Range<java.lang.Integer> p1) { return null; }
    static android.util.Range<java.lang.Long> parseLongRange(java.lang.Object p0, android.util.Range<java.lang.Long> p1) { return null; }
    static android.util.Range<android.util.Rational> parseRationalRange(java.lang.Object p0, android.util.Range<android.util.Rational> p1) { return null; }
    static android.util.Pair<android.util.Size, android.util.Size> parseSizeRange(java.lang.Object p0) { return null; }
    public static java.io.File getUniqueExternalFile(android.content.Context p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    static java.lang.String getFileDisplayNameFromUri(android.content.Context p0, android.net.Uri p1) { return null; }
    @android.annotation.Nullable
    public static java.lang.String anonymizeBluetoothAddress(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public static java.lang.String anonymizeBluetoothAddress(int p0, java.lang.String p1) { return null; }
    public static boolean isRingtoneVibrationSettingsSupported(android.content.Context p0) { return false; }
    public static boolean hasVibration(android.net.Uri p0) { return false; }
    @android.annotation.Nullable
    public static android.net.Uri getVibrationUri(android.net.Uri p0) { return null; }
    public static android.os.VibrationEffect parseVibrationEffect(android.os.Vibrator p0, android.net.Uri p1) { return null; }

    public static class ListenerList<V extends java.lang.Object> {
        public ListenerList() {}
        public ListenerList(boolean p0, boolean p1, boolean p2) {}
        public void add(java.lang.Object p0, java.util.concurrent.Executor p1, android.media.Utils.ListenerList.Listener<V> p2) {}
        public void remove(java.lang.Object p0) {}
        public void notify(int p0, V p1) {}

        public static interface Listener<V extends java.lang.Object> {
            public void onEvent(int p0, V p1);
        }

        private static interface ListenerWithCancellation<V extends java.lang.Object> extends android.media.Utils.ListenerList.Listener<V> {
            public void cancel();
        }
    }
}
