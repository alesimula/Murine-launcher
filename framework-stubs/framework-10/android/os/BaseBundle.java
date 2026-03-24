package android.os;

public class BaseBundle {
    private static final java.lang.String TAG = "Bundle";
    static final boolean DEBUG = false;
    private static final int BUNDLE_MAGIC = 1279544898;
    private static final int BUNDLE_MAGIC_NATIVE = 1279544900;
    static final int FLAG_DEFUSABLE = 1;
    private static final boolean LOG_DEFUSABLE = false;
    private static volatile boolean sShouldDefuse;
    @android.annotation.UnsupportedAppUsage
    android.util.ArrayMap<java.lang.String, java.lang.Object> mMap;
    @android.annotation.UnsupportedAppUsage
    android.os.Parcel mParcelledData;
    private boolean mParcelledByNative;
    private java.lang.ClassLoader mClassLoader;
    public int mFlags;
    public static void setShouldDefuse(boolean p0) {}
    BaseBundle(java.lang.ClassLoader p0, int p1) {}
    BaseBundle() {}
    BaseBundle(android.os.Parcel p0) {}
    BaseBundle(android.os.Parcel p0, int p1) {}
    BaseBundle(java.lang.ClassLoader p0) {}
    BaseBundle(int p0) {}
    BaseBundle(android.os.BaseBundle p0) {}
    BaseBundle(boolean p0) {}
    public java.lang.String getPairValue() { return null; }
    void setClassLoader(java.lang.ClassLoader p0) {}
    java.lang.ClassLoader getClassLoader() { return null; }
    @android.annotation.UnsupportedAppUsage
    void unparcel() {}
    private void initializeFromParcelLocked(android.os.Parcel p0, boolean p1, boolean p2) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isParcelled() { return false; }
    public boolean isEmptyParcel() { return false; }
    private static boolean isEmptyParcel(android.os.Parcel p0) { return false; }
    private static void recycleParcel(android.os.Parcel p0) {}
    android.util.ArrayMap<java.lang.String, java.lang.Object> getMap() { return null; }
    public int size() { return 0; }
    public boolean isEmpty() { return false; }
    public boolean maybeIsEmpty() { return false; }
    public static boolean kindofEquals(android.os.BaseBundle p0, android.os.BaseBundle p1) { return false; }
    public boolean kindofEquals(android.os.BaseBundle p0) { return false; }
    public void clear() {}
    void copyInternal(android.os.BaseBundle p0, boolean p1) {}
    java.lang.Object deepCopyValue(java.lang.Object p0) { return null; }
    java.util.ArrayList deepcopyArrayList(java.util.ArrayList p0) { return null; }
    public boolean containsKey(java.lang.String p0) { return false; }
    public java.lang.Object get(java.lang.String p0) { return null; }
    public void remove(java.lang.String p0) {}
    public void putAll(android.os.PersistableBundle p0) {}
    void putAll(android.util.ArrayMap p0) {}
    public java.util.Set<java.lang.String> keySet() { return null; }
    public void putBoolean(java.lang.String p0, boolean p1) {}
    void putByte(java.lang.String p0, byte p1) {}
    void putChar(java.lang.String p0, char p1) {}
    void putShort(java.lang.String p0, short p1) {}
    public void putInt(java.lang.String p0, int p1) {}
    public void putLong(java.lang.String p0, long p1) {}
    void putFloat(java.lang.String p0, float p1) {}
    public void putDouble(java.lang.String p0, double p1) {}
    public void putString(java.lang.String p0, java.lang.String p1) {}
    void putCharSequence(java.lang.String p0, java.lang.CharSequence p1) {}
    void putIntegerArrayList(java.lang.String p0, java.util.ArrayList<java.lang.Integer> p1) {}
    void putStringArrayList(java.lang.String p0, java.util.ArrayList<java.lang.String> p1) {}
    void putCharSequenceArrayList(java.lang.String p0, java.util.ArrayList<java.lang.CharSequence> p1) {}
    void putSerializable(java.lang.String p0, java.io.Serializable p1) {}
    public void putBooleanArray(java.lang.String p0, boolean[] p1) {}
    void putByteArray(java.lang.String p0, byte[] p1) {}
    void putShortArray(java.lang.String p0, short[] p1) {}
    void putCharArray(java.lang.String p0, char[] p1) {}
    public void putIntArray(java.lang.String p0, int[] p1) {}
    public void putLongArray(java.lang.String p0, long[] p1) {}
    void putFloatArray(java.lang.String p0, float[] p1) {}
    public void putDoubleArray(java.lang.String p0, double[] p1) {}
    public void putStringArray(java.lang.String p0, java.lang.String[] p1) {}
    void putCharSequenceArray(java.lang.String p0, java.lang.CharSequence[] p1) {}
    public boolean getBoolean(java.lang.String p0) { return false; }
    void typeWarning(java.lang.String p0, java.lang.Object p1, java.lang.String p2, java.lang.Object p3, java.lang.ClassCastException p4) {}
    void typeWarning(java.lang.String p0, java.lang.Object p1, java.lang.String p2, java.lang.ClassCastException p3) {}
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    byte getByte(java.lang.String p0) { return 0; }
    java.lang.Byte getByte(java.lang.String p0, byte p1) { return null; }
    char getChar(java.lang.String p0) { return 0; }
    char getChar(java.lang.String p0, char p1) { return 0; }
    short getShort(java.lang.String p0) { return 0; }
    short getShort(java.lang.String p0, short p1) { return 0; }
    public int getInt(java.lang.String p0) { return 0; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public long getLong(java.lang.String p0) { return 0L; }
    public long getLong(java.lang.String p0, long p1) { return 0L; }
    float getFloat(java.lang.String p0) { return 0.0f; }
    float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public double getDouble(java.lang.String p0) { return 0.0; }
    public double getDouble(java.lang.String p0, double p1) { return 0.0; }
    public java.lang.String getString(java.lang.String p0) { return null; }
    public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    java.lang.CharSequence getCharSequence(java.lang.String p0) { return null; }
    java.lang.CharSequence getCharSequence(java.lang.String p0, java.lang.CharSequence p1) { return null; }
    java.io.Serializable getSerializable(java.lang.String p0) { return null; }
    java.util.ArrayList<java.lang.Integer> getIntegerArrayList(java.lang.String p0) { return null; }
    java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String p0) { return null; }
    java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayList(java.lang.String p0) { return null; }
    public boolean[] getBooleanArray(java.lang.String p0) { return null; }
    byte[] getByteArray(java.lang.String p0) { return null; }
    short[] getShortArray(java.lang.String p0) { return null; }
    char[] getCharArray(java.lang.String p0) { return null; }
    public int[] getIntArray(java.lang.String p0) { return null; }
    public long[] getLongArray(java.lang.String p0) { return null; }
    float[] getFloatArray(java.lang.String p0) { return null; }
    public double[] getDoubleArray(java.lang.String p0) { return null; }
    public java.lang.String[] getStringArray(java.lang.String p0) { return null; }
    java.lang.CharSequence[] getCharSequenceArray(java.lang.String p0) { return null; }
    void writeToParcelInner(android.os.Parcel p0, int p1) {}
    void readFromParcelInner(android.os.Parcel p0) {}
    private void readFromParcelInner(android.os.Parcel p0, int p1) {}
    public static void dumpStats(com.android.internal.util.IndentingPrintWriter p0, java.lang.String p1, java.lang.Object p2) {}
    public static void dumpStats(com.android.internal.util.IndentingPrintWriter p0, android.util.SparseArray p1) {}
    public static void dumpStats(com.android.internal.util.IndentingPrintWriter p0, android.os.BaseBundle p1) {}

    static final class NoImagePreloadHolder {
        public static final android.os.Parcel EMPTY_PARCEL = null;
        NoImagePreloadHolder() {}
    }
}
