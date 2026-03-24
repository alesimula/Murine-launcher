package android.os;

@android.annotation.SystemApi
public class HwBlob {
    private static final java.lang.String TAG = "HwBlob";
    private long mNativeContext;
    public HwBlob(int p0) {}
    public final native boolean getBool(long p0);
    public final native byte getInt8(long p0);
    public final native short getInt16(long p0);
    public final native int getInt32(long p0);
    public final native long getInt64(long p0);
    public final native float getFloat(long p0);
    public final native double getDouble(long p0);
    public final native java.lang.String getString(long p0);
    public final native long getFieldHandle(long p0);
    public final native void copyToBoolArray(long p0, boolean[] p1, int p2);
    public final native void copyToInt8Array(long p0, byte[] p1, int p2);
    public final native void copyToInt16Array(long p0, short[] p1, int p2);
    public final native void copyToInt32Array(long p0, int[] p1, int p2);
    public final native void copyToInt64Array(long p0, long[] p1, int p2);
    public final native void copyToFloatArray(long p0, float[] p1, int p2);
    public final native void copyToDoubleArray(long p0, double[] p1, int p2);
    public final native void putBool(long p0, boolean p1);
    public final native void putInt8(long p0, byte p1);
    public final native void putInt16(long p0, short p1);
    public final native void putInt32(long p0, int p1);
    public final native void putInt64(long p0, long p1);
    public final native void putFloat(long p0, float p1);
    public final native void putDouble(long p0, double p1);
    public final native void putString(long p0, java.lang.String p1);
    public final native void putNativeHandle(long p0, android.os.NativeHandle p1);
    public final native void putBoolArray(long p0, boolean[] p1);
    public final native void putInt8Array(long p0, byte[] p1);
    public final native void putInt16Array(long p0, short[] p1);
    public final native void putInt32Array(long p0, int[] p1);
    public final native void putInt64Array(long p0, long[] p1);
    public final native void putFloatArray(long p0, float[] p1);
    public final native void putDoubleArray(long p0, double[] p1);
    public final native void putBlob(long p0, android.os.HwBlob p1);
    public final void putHidlMemory(long p0, android.os.HidlMemory p1) {}
    public final native long handle();
    public static java.lang.Boolean[] wrapArray(boolean[] p0) { return null; }
    public static java.lang.Long[] wrapArray(long[] p0) { return null; }
    public static java.lang.Byte[] wrapArray(byte[] p0) { return null; }
    public static java.lang.Short[] wrapArray(short[] p0) { return null; }
    public static java.lang.Integer[] wrapArray(int[] p0) { return null; }
    public static java.lang.Float[] wrapArray(float[] p0) { return null; }
    public static java.lang.Double[] wrapArray(double[] p0) { return null; }
    private static final native long native_init();
    private final native void native_setup(int p0);
}
