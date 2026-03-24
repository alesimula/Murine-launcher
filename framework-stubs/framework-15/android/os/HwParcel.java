package android.os;

@android.annotation.SystemApi
public class HwParcel {
    public static final int STATUS_SUCCESS = 0;
    public HwParcel() {}
    public final native void writeInterfaceToken(java.lang.String p0);
    public final native void writeBool(boolean p0);
    public final native void writeInt8(byte p0);
    public final native void writeInt16(short p0);
    public final native void writeInt32(int p0);
    public final native void writeInt64(long p0);
    public final native void writeFloat(float p0);
    public final native void writeDouble(double p0);
    public final native void writeString(java.lang.String p0);
    public final native void writeNativeHandle(android.os.NativeHandle p0);
    public final void writeBoolVector(java.util.ArrayList<java.lang.Boolean> p0) {}
    public final void writeInt8Vector(java.util.ArrayList<java.lang.Byte> p0) {}
    public final void writeInt16Vector(java.util.ArrayList<java.lang.Short> p0) {}
    public final void writeInt32Vector(java.util.ArrayList<java.lang.Integer> p0) {}
    public final void writeInt64Vector(java.util.ArrayList<java.lang.Long> p0) {}
    public final void writeFloatVector(java.util.ArrayList<java.lang.Float> p0) {}
    public final void writeDoubleVector(java.util.ArrayList<java.lang.Double> p0) {}
    public final void writeStringVector(java.util.ArrayList<java.lang.String> p0) {}
    public final void writeNativeHandleVector(java.util.ArrayList<android.os.NativeHandle> p0) {}
    public final native void writeStrongBinder(android.os.IHwBinder p0);
    public final native void writeHidlMemory(android.os.HidlMemory p0);
    public final native void enforceInterface(java.lang.String p0);
    public final native boolean readBool();
    public final native byte readInt8();
    public final native short readInt16();
    public final native int readInt32();
    public final native long readInt64();
    public final native float readFloat();
    public final native double readDouble();
    public final native java.lang.String readString();
    @android.annotation.Nullable
    public final native android.os.NativeHandle readNativeHandle();
    @android.annotation.Nullable
    public final native android.os.NativeHandle readEmbeddedNativeHandle(long p0, long p1);
    public final java.util.ArrayList<java.lang.Boolean> readBoolVector() { return null; }
    public final java.util.ArrayList<java.lang.Byte> readInt8Vector() { return null; }
    public final java.util.ArrayList<java.lang.Short> readInt16Vector() { return null; }
    public final java.util.ArrayList<java.lang.Integer> readInt32Vector() { return null; }
    public final java.util.ArrayList<java.lang.Long> readInt64Vector() { return null; }
    public final java.util.ArrayList<java.lang.Float> readFloatVector() { return null; }
    public final java.util.ArrayList<java.lang.Double> readDoubleVector() { return null; }
    public final java.util.ArrayList<java.lang.String> readStringVector() { return null; }
    @android.annotation.NonNull
    public final java.util.ArrayList<android.os.NativeHandle> readNativeHandleVector() { return null; }
    public final native android.os.IHwBinder readStrongBinder();
    @android.annotation.NonNull
    public final native android.os.HidlMemory readHidlMemory();
    @android.annotation.NonNull
    public final native android.os.HidlMemory readEmbeddedHidlMemory(long p0, long p1, long p2);
    public final native android.os.HwBlob readBuffer(long p0);
    public final native android.os.HwBlob readEmbeddedBuffer(long p0, long p1, long p2, boolean p3);
    public final native void writeBuffer(android.os.HwBlob p0);
    public final native void writeStatus(int p0);
    public final native void verifySuccess();
    public final native void releaseTemporaryStorage();
    public final native void release();
    public final native void send();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
