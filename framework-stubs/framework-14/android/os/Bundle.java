package android.os;

public final class Bundle extends android.os.BaseBundle implements java.lang.Cloneable, android.os.Parcelable {
    static final int FLAG_HAS_FDS = 256;
    static final int FLAG_HAS_FDS_KNOWN = 512;
    static final int FLAG_ALLOW_FDS = 1024;
    public static final android.os.Bundle EMPTY = null;
    public static final android.os.Bundle STRIPPED = null;
    public static final android.os.Parcelable.Creator<android.os.Bundle> CREATOR = null;
    public Bundle() { super(); }
    public Bundle(android.os.Parcel p0) { super(); }
    public Bundle(android.os.Parcel p0, int p1) { super(); }
    Bundle(android.os.Bundle p0, boolean p1) { super(); }
    public Bundle(java.lang.ClassLoader p0) { super(); }
    public Bundle(int p0) { super(); }
    public Bundle(android.os.Bundle p0) { super(); }
    public Bundle(android.os.PersistableBundle p0) { super(); }
    public static android.os.Bundle forPair(java.lang.String p0, java.lang.String p1) { return null; }
    public void setClassLoader(java.lang.ClassLoader p0) {}
    public java.lang.ClassLoader getClassLoader() { return null; }
    public boolean setAllowFds(boolean p0) { return false; }
    public void setDefusable(boolean p0) {}
    public static android.os.Bundle setDefusable(android.os.Bundle p0, boolean p1) { return null; }
    public java.lang.Object clone() { return null; }
    public android.os.Bundle deepCopy() { return null; }
    public void clear() {}
    public void remove(java.lang.String p0) {}
    public void putAll(android.os.Bundle p0) {}
    public int getSize() { return 0; }
    public boolean hasFileDescriptors() { return false; }
    public void putObject(java.lang.String p0, java.lang.Object p1) {}
    public void putByte(java.lang.String p0, byte p1) {}
    public void putChar(java.lang.String p0, char p1) {}
    public void putShort(java.lang.String p0, short p1) {}
    public void putFloat(java.lang.String p0, float p1) {}
    public void putCharSequence(java.lang.String p0, java.lang.CharSequence p1) {}
    public void putParcelable(java.lang.String p0, android.os.Parcelable p1) {}
    public void putSize(java.lang.String p0, android.util.Size p1) {}
    public void putSizeF(java.lang.String p0, android.util.SizeF p1) {}
    public void putParcelableArray(java.lang.String p0, android.os.Parcelable[] p1) {}
    public void putParcelableArrayList(java.lang.String p0, java.util.ArrayList<? extends android.os.Parcelable> p1) {}
    public void putParcelableList(java.lang.String p0, java.util.List<? extends android.os.Parcelable> p1) {}
    public void putSparseParcelableArray(java.lang.String p0, android.util.SparseArray<? extends android.os.Parcelable> p1) {}
    public void putIntegerArrayList(java.lang.String p0, java.util.ArrayList<java.lang.Integer> p1) {}
    public void putStringArrayList(java.lang.String p0, java.util.ArrayList<java.lang.String> p1) {}
    public void putCharSequenceArrayList(java.lang.String p0, java.util.ArrayList<java.lang.CharSequence> p1) {}
    public void putSerializable(java.lang.String p0, java.io.Serializable p1) {}
    public void putByteArray(java.lang.String p0, byte[] p1) {}
    public void putShortArray(java.lang.String p0, short[] p1) {}
    public void putCharArray(java.lang.String p0, char[] p1) {}
    public void putFloatArray(java.lang.String p0, float[] p1) {}
    public void putCharSequenceArray(java.lang.String p0, java.lang.CharSequence[] p1) {}
    public void putBundle(java.lang.String p0, android.os.Bundle p1) {}
    public void putBinder(java.lang.String p0, android.os.IBinder p1) {}
    @java.lang.Deprecated
    public void putIBinder(java.lang.String p0, android.os.IBinder p1) {}
    public byte getByte(java.lang.String p0) { return 0; }
    public java.lang.Byte getByte(java.lang.String p0, byte p1) { return null; }
    public char getChar(java.lang.String p0) { return 0; }
    public char getChar(java.lang.String p0, char p1) { return 0; }
    public short getShort(java.lang.String p0) { return 0; }
    public short getShort(java.lang.String p0, short p1) { return 0; }
    public float getFloat(java.lang.String p0) { return 0.0f; }
    public float getFloat(java.lang.String p0, float p1) { return 0.0f; }
    public java.lang.CharSequence getCharSequence(java.lang.String p0) { return null; }
    public java.lang.CharSequence getCharSequence(java.lang.String p0, java.lang.CharSequence p1) { return null; }
    public android.util.Size getSize(java.lang.String p0) { return null; }
    public android.util.SizeF getSizeF(java.lang.String p0) { return null; }
    public android.os.Bundle getBundle(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public <T extends android.os.Parcelable> T getParcelable(java.lang.String p0) { return null; }
    public <T extends java.lang.Object> T getParcelable(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public android.os.Parcelable[] getParcelableArray(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public <T extends java.lang.Object> T[] getParcelableArray(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public <T extends android.os.Parcelable> java.util.ArrayList<T> getParcelableArrayList(java.lang.String p0) { return null; }
    @android.annotation.SuppressLint("NullableCollection")
    public <T extends java.lang.Object> java.util.ArrayList<T> getParcelableArrayList(java.lang.String p0, java.lang.Class<? extends T> p1) { return null; }
    @java.lang.Deprecated
    public <T extends android.os.Parcelable> android.util.SparseArray<T> getSparseParcelableArray(java.lang.String p0) { return null; }
    public <T extends java.lang.Object> android.util.SparseArray<T> getSparseParcelableArray(java.lang.String p0, java.lang.Class<? extends T> p1) { return null; }
    @java.lang.Deprecated
    public java.io.Serializable getSerializable(java.lang.String p0) { return null; }
    public <T extends java.io.Serializable> T getSerializable(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    public java.util.ArrayList<java.lang.Integer> getIntegerArrayList(java.lang.String p0) { return null; }
    public java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String p0) { return null; }
    public java.util.ArrayList<java.lang.CharSequence> getCharSequenceArrayList(java.lang.String p0) { return null; }
    public byte[] getByteArray(java.lang.String p0) { return null; }
    public short[] getShortArray(java.lang.String p0) { return null; }
    public char[] getCharArray(java.lang.String p0) { return null; }
    public float[] getFloatArray(java.lang.String p0) { return null; }
    public java.lang.CharSequence[] getCharSequenceArray(java.lang.String p0) { return null; }
    public android.os.IBinder getBinder(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public android.os.IBinder getIBinder(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public synchronized java.lang.String toString() { return null; }
    public synchronized java.lang.String toShortString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
}
