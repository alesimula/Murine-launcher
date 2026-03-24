package android.os;

public final class Parcel {
    public static final int FLAG_IS_REPLY_FROM_BLOCKING_ALLOWED_OBJECT = 1;
    public static final int FLAG_PROPAGATE_ALLOW_BLOCKING = 2;
    public static final int EX_HAS_NOTED_APPOPS_REPLY_HEADER = -127;
    public static final android.os.Parcelable.Creator<java.lang.String> STRING_CREATOR = null;
    public static android.os.Parcel obtain() { return null; }
    public static android.os.Parcel obtain(android.os.IBinder p0) { return null; }
    public final void recycle() {}
    public void setReadWriteHelper(android.os.Parcel.ReadWriteHelper p0) {}
    public boolean hasReadWriteHelper() { return false; }
    public static native long getGlobalAllocSize();
    public static native long getGlobalAllocCount();
    public final void markSensitive() {}
    public int getFlags() { return 0; }
    public void setFlags(int p0) {}
    public void addFlags(int p0) {}
    public void setPropagateAllowBlocking() {}
    public int dataSize() { return 0; }
    public final int dataAvail() { return 0; }
    public final int dataPosition() { return 0; }
    public final int dataCapacity() { return 0; }
    public final void setDataSize(int p0) {}
    public final void setDataPosition(int p0) {}
    public final void setDataCapacity(int p0) {}
    public final boolean pushAllowFds(boolean p0) { return false; }
    public final void restoreAllowFds(boolean p0) {}
    public final byte[] marshall() { return null; }
    public final void unmarshall(byte[] p0, int p1, int p2) {}
    public final void appendFrom(android.os.Parcel p0, int p1, int p2) {}
    public int compareData(android.os.Parcel p0) { return 0; }
    public static boolean compareData(android.os.Parcel p0, int p1, android.os.Parcel p2, int p3, int p4) { return false; }
    public final void setClassCookie(java.lang.Class p0, java.lang.Object p1) {}
    public final java.lang.Object getClassCookie(java.lang.Class p0) { return null; }
    public final void adoptClassCookies(android.os.Parcel p0) {}
    public java.util.Map<java.lang.Class, java.lang.Object> copyClassCookies() { return null; }
    public void putClassCookies(java.util.Map<java.lang.Class, java.lang.Object> p0) {}
    public boolean hasFileDescriptors() { return false; }
    public boolean hasFileDescriptors(int p0, int p1) { return false; }
    public static boolean hasFileDescriptors(java.lang.Object p0) { return false; }
    public final void writeInterfaceToken(java.lang.String p0) {}
    public final void enforceInterface(java.lang.String p0) {}
    public void enforceNoDataAvail() {}
    public boolean replaceCallingWorkSourceUid(int p0) { return false; }
    public int readCallingWorkSourceUid() { return 0; }
    public final void writeByteArray(byte[] p0) {}
    public final void writeByteArray(byte[] p0, int p1, int p2) {}
    public final void writeBlob(byte[] p0) {}
    public final void writeBlob(byte[] p0, int p1, int p2) {}
    public final void writeInt(int p0) {}
    public final void writeLong(long p0) {}
    public final void writeFloat(float p0) {}
    public final void writeDouble(double p0) {}
    public final void writeString(java.lang.String p0) {}
    public final void writeString8(java.lang.String p0) {}
    public final void writeString16(java.lang.String p0) {}
    public void writeStringNoHelper(java.lang.String p0) {}
    public void writeString8NoHelper(java.lang.String p0) {}
    public void writeString16NoHelper(java.lang.String p0) {}
    public final void writeBoolean(boolean p0) {}
    public final void writeCharSequence(java.lang.CharSequence p0) {}
    public final void writeStrongBinder(android.os.IBinder p0) {}
    public final void writeStrongInterface(android.os.IInterface p0) {}
    public final void writeFileDescriptor(java.io.FileDescriptor p0) {}
    public final void writeRawFileDescriptor(java.io.FileDescriptor p0) {}
    public final void writeRawFileDescriptorArray(java.io.FileDescriptor[] p0) {}
    public final void writeByte(byte p0) {}
    public final void writeMap(java.util.Map p0) {}
    void writeMapInternal(java.util.Map<java.lang.String, java.lang.Object> p0) {}
    void writeArrayMapInternal(android.util.ArrayMap<java.lang.String, java.lang.Object> p0) {}
    public void writeArrayMap(android.util.ArrayMap<java.lang.String, java.lang.Object> p0) {}
    public <T extends android.os.Parcelable> void writeTypedArrayMap(android.util.ArrayMap<java.lang.String, T> p0, int p1) {}
    public void writeArraySet(android.util.ArraySet<? extends java.lang.Object> p0) {}
    public final void writeBundle(android.os.Bundle p0) {}
    public final void writePersistableBundle(android.os.PersistableBundle p0) {}
    public final void writeSize(android.util.Size p0) {}
    public final void writeSizeF(android.util.SizeF p0) {}
    public final void writeList(java.util.List p0) {}
    public final void writeArray(java.lang.Object[] p0) {}
    public final <T extends java.lang.Object> void writeSparseArray(android.util.SparseArray<T> p0) {}
    public final void writeSparseBooleanArray(android.util.SparseBooleanArray p0) {}
    public final void writeSparseIntArray(android.util.SparseIntArray p0) {}
    public final void writeBooleanArray(boolean[] p0) {}
    public final boolean[] createBooleanArray() { return null; }
    public final void readBooleanArray(boolean[] p0) {}
    public void writeShortArray(short[] p0) {}
    public short[] createShortArray() { return null; }
    public void readShortArray(short[] p0) {}
    public final void writeCharArray(char[] p0) {}
    public final char[] createCharArray() { return null; }
    public final void readCharArray(char[] p0) {}
    public final void writeIntArray(int[] p0) {}
    public final int[] createIntArray() { return null; }
    public final void readIntArray(int[] p0) {}
    public final void writeLongArray(long[] p0) {}
    public final long[] createLongArray() { return null; }
    public final void readLongArray(long[] p0) {}
    public final void writeFloatArray(float[] p0) {}
    public final float[] createFloatArray() { return null; }
    public final void readFloatArray(float[] p0) {}
    public final void writeDoubleArray(double[] p0) {}
    public final double[] createDoubleArray() { return null; }
    public final void readDoubleArray(double[] p0) {}
    public final void writeStringArray(java.lang.String[] p0) {}
    public final java.lang.String[] createStringArray() { return null; }
    public final void readStringArray(java.lang.String[] p0) {}
    public final void writeString8Array(java.lang.String[] p0) {}
    public final java.lang.String[] createString8Array() { return null; }
    public final void readString8Array(java.lang.String[] p0) {}
    public final void writeString16Array(java.lang.String[] p0) {}
    public final java.lang.String[] createString16Array() { return null; }
    public final void readString16Array(java.lang.String[] p0) {}
    public final void writeBinderArray(android.os.IBinder[] p0) {}
    public final <T extends android.os.IInterface> void writeInterfaceArray(T[] p0) {}
    public final void writeCharSequenceArray(java.lang.CharSequence[] p0) {}
    public final void writeCharSequenceList(java.util.ArrayList<java.lang.CharSequence> p0) {}
    public final android.os.IBinder[] createBinderArray() { return null; }
    public final void readBinderArray(android.os.IBinder[] p0) {}
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection", "SamShouldBeLast"})
    public final <T extends android.os.IInterface> T[] createInterfaceArray(java.util.function.IntFunction<T[]> p0, java.util.function.Function<android.os.IBinder, T> p1) { return null; }
    public final <T extends android.os.IInterface> void readInterfaceArray(T[] p0, java.util.function.Function<android.os.IBinder, T> p1) {}
    public final <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> p0) {}
    public final <T extends android.os.Parcelable> void writeTypedSparseArray(android.util.SparseArray<T> p0, int p1) {}
    public <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> p0, int p1) {}
    public final void writeStringList(java.util.List<java.lang.String> p0) {}
    public final void writeBinderList(java.util.List<android.os.IBinder> p0) {}
    public final <T extends android.os.IInterface> void writeInterfaceList(java.util.List<T> p0) {}
    public final <T extends android.os.Parcelable> void writeParcelableList(java.util.List<T> p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedArray(T[] p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedObject(T p0, int p1) {}
    public <T extends java.lang.Object> void writeFixedArray(T p0, int p1, int... p2) {}
    public final void writeValue(java.lang.Object p0) {}
    public static int getValueType(java.lang.Object p0) { return 0; }
    public void writeValue(int p0, java.lang.Object p1) {}
    public final void writeParcelable(android.os.Parcelable p0, int p1) {}
    public final void writeParcelableCreator(android.os.Parcelable p0) {}
    public boolean allowSquashing() { return false; }
    public void restoreAllowSquashing(boolean p0) {}
    public boolean maybeWriteSquashed(android.os.Parcelable p0) { return false; }
    public <T extends android.os.Parcelable> T readSquashed(android.os.Parcel.SquashReadHelper<T> p0) { return null; }
    public final void writeSerializable(java.io.Serializable p0) {}
    public static void setStackTraceParceling(boolean p0) {}
    public final void writeException(java.lang.Exception p0) {}
    public static int getExceptionCode(java.lang.Throwable p0) { return 0; }
    public void writeStackTrace(java.lang.Throwable p0) {}
    public final void writeNoException() {}
    public final void readException() {}
    public final int readExceptionCode() { return 0; }
    public final void readException(int p0, java.lang.String p1) {}
    public java.lang.Exception createExceptionOrNull(int p0, java.lang.String p1) { return null; }
    public final int readInt() { return 0; }
    public final long readLong() { return 0L; }
    public final float readFloat() { return 0.0f; }
    public final double readDouble() { return 0.0; }
    public final java.lang.String readString() { return null; }
    public final java.lang.String readString8() { return null; }
    public final java.lang.String readString16() { return null; }
    public java.lang.String readStringNoHelper() { return null; }
    public java.lang.String readString8NoHelper() { return null; }
    public java.lang.String readString16NoHelper() { return null; }
    public final boolean readBoolean() { return false; }
    public final java.lang.CharSequence readCharSequence() { return null; }
    public final android.os.IBinder readStrongBinder() { return null; }
    public final android.os.ParcelFileDescriptor readFileDescriptor() { return null; }
    public final java.io.FileDescriptor readRawFileDescriptor() { return null; }
    public final java.io.FileDescriptor[] createRawFileDescriptorArray() { return null; }
    public final void readRawFileDescriptorArray(java.io.FileDescriptor[] p0) {}
    public final byte readByte() { return 0; }
    @java.lang.Deprecated
    public final void readMap(java.util.Map p0, java.lang.ClassLoader p1) {}
    public <K extends java.lang.Object, V extends java.lang.Object> void readMap(java.util.Map<? super K, ? super V> p0, java.lang.ClassLoader p1, java.lang.Class<K> p2, java.lang.Class<V> p3) {}
    @java.lang.Deprecated
    public final void readList(java.util.List p0, java.lang.ClassLoader p1) {}
    public <T extends java.lang.Object> void readList(java.util.List<? super T> p0, java.lang.ClassLoader p1, java.lang.Class<T> p2) {}
    @java.lang.Deprecated
    public java.util.HashMap readHashMap(java.lang.ClassLoader p0) { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public <K extends java.lang.Object, V extends java.lang.Object> java.util.HashMap<K, V> readHashMap(java.lang.ClassLoader p0, java.lang.Class<? extends K> p1, java.lang.Class<? extends V> p2) { return null; }
    public final android.os.Bundle readBundle() { return null; }
    public final android.os.Bundle readBundle(java.lang.ClassLoader p0) { return null; }
    public final android.os.PersistableBundle readPersistableBundle() { return null; }
    public final android.os.PersistableBundle readPersistableBundle(java.lang.ClassLoader p0) { return null; }
    public final android.util.Size readSize() { return null; }
    public final android.util.SizeF readSizeF() { return null; }
    public final byte[] createByteArray() { return null; }
    public final void readByteArray(byte[] p0) {}
    public final byte[] readBlob() { return null; }
    public final java.lang.String[] readStringArray() { return null; }
    public final java.lang.CharSequence[] readCharSequenceArray() { return null; }
    public final java.util.ArrayList<java.lang.CharSequence> readCharSequenceList() { return null; }
    @java.lang.Deprecated
    public java.util.ArrayList readArrayList(java.lang.ClassLoader p0) { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public <T extends java.lang.Object> java.util.ArrayList<T> readArrayList(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1) { return null; }
    @java.lang.Deprecated
    public java.lang.Object[] readArray(java.lang.ClassLoader p0) { return null; }
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public <T extends java.lang.Object> T[] readArray(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public <T extends java.lang.Object> android.util.SparseArray<T> readSparseArray(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> android.util.SparseArray<T> readSparseArray(java.lang.ClassLoader p0, java.lang.Class<? extends T> p1) { return null; }
    public final android.util.SparseBooleanArray readSparseBooleanArray() { return null; }
    public final android.util.SparseIntArray readSparseIntArray() { return null; }
    public final <T extends java.lang.Object> java.util.ArrayList<T> createTypedArrayList(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> void readTypedList(java.util.List<T> p0, android.os.Parcelable.Creator<T> p1) {}
    public final <T extends android.os.Parcelable> android.util.SparseArray<T> createTypedSparseArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends android.os.Parcelable> android.util.ArrayMap<java.lang.String, T> createTypedArrayMap(android.os.Parcelable.Creator<T> p0) { return null; }
    public final java.util.ArrayList<java.lang.String> createStringArrayList() { return null; }
    public final java.util.ArrayList<android.os.IBinder> createBinderArrayList() { return null; }
    @android.annotation.SuppressLint({"ConcreteCollection", "NullableCollection"})
    public final <T extends android.os.IInterface> java.util.ArrayList<T> createInterfaceArrayList(java.util.function.Function<android.os.IBinder, T> p0) { return null; }
    public final void readStringList(java.util.List<java.lang.String> p0) {}
    public final void readBinderList(java.util.List<android.os.IBinder> p0) {}
    public final <T extends android.os.IInterface> void readInterfaceList(java.util.List<T> p0, java.util.function.Function<android.os.IBinder, T> p1) {}
    @java.lang.Deprecated
    public final <T extends android.os.Parcelable> java.util.List<T> readParcelableList(java.util.List<T> p0, java.lang.ClassLoader p1) { return null; }
    public <T extends java.lang.Object> java.util.List<T> readParcelableList(java.util.List<T> p0, java.lang.ClassLoader p1, java.lang.Class<? extends T> p2) { return null; }
    public final <T extends java.lang.Object> T[] createTypedArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> void readTypedArray(T[] p0, android.os.Parcelable.Creator<T> p1) {}
    @java.lang.Deprecated
    public final <T extends java.lang.Object> T[] readTypedArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> T readTypedObject(android.os.Parcelable.Creator<T> p0) { return null; }
    public <T extends java.lang.Object> void readFixedArray(T p0) {}
    public <T extends java.lang.Object, S extends android.os.IInterface> void readFixedArray(T p0, java.util.function.Function<android.os.IBinder, S> p1) {}
    public <T extends java.lang.Object, S extends android.os.Parcelable> void readFixedArray(T p0, android.os.Parcelable.Creator<S> p1) {}
    public <T extends java.lang.Object> T createFixedArray(java.lang.Class<T> p0, int... p1) { return null; }
    public <T extends java.lang.Object, S extends android.os.IInterface> T createFixedArray(java.lang.Class<T> p0, java.util.function.Function<android.os.IBinder, S> p1, int... p2) { return null; }
    public <T extends java.lang.Object, S extends android.os.Parcelable> T createFixedArray(java.lang.Class<T> p0, android.os.Parcelable.Creator<S> p1, int... p2) { return null; }
    public final <T extends android.os.Parcelable> void writeParcelableArray(T[] p0, int p1) {}
    public final java.lang.Object readValue(java.lang.ClassLoader p0) { return null; }
    public java.lang.Object readLazyValue(java.lang.ClassLoader p0) { return null; }
    @java.lang.Deprecated
    public final <T extends android.os.Parcelable> T readParcelable(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> T readParcelable(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    public final <T extends android.os.Parcelable> T readCreator(android.os.Parcelable.Creator<?> p0, java.lang.ClassLoader p1) { return null; }
    @java.lang.Deprecated
    public final android.os.Parcelable.Creator<?> readParcelableCreator(java.lang.ClassLoader p0) { return null; }
    public <T extends java.lang.Object> android.os.Parcelable.Creator<T> readParcelableCreator(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public android.os.Parcelable[] readParcelableArray(java.lang.ClassLoader p0) { return null; }
    @android.annotation.SuppressLint({"ArrayReturn", "NullableCollection"})
    public <T extends java.lang.Object> T[] readParcelableArray(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    @java.lang.Deprecated
    public java.io.Serializable readSerializable() { return null; }
    public <T extends java.lang.Object> T readSerializable(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    protected static final android.os.Parcel obtain(int p0) { return null; }
    protected static final android.os.Parcel obtain(long p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    void readMapInternal(java.util.Map p0, int p1, java.lang.ClassLoader p2) {}
    boolean readArrayMap(android.util.ArrayMap<? super java.lang.String, java.lang.Object> p0, int p1, boolean p2, boolean p3, java.lang.ClassLoader p4) { return false; }
    public void readArrayMap(android.util.ArrayMap<? super java.lang.String, java.lang.Object> p0, java.lang.ClassLoader p1) {}
    public android.util.ArraySet<? extends java.lang.Object> readArraySet(java.lang.ClassLoader p0) { return null; }
    public long getOpenAshmemSize() { return 0L; }

    private static final class LazyValue implements java.util.function.BiFunction<java.lang.Class<?>, java.lang.Class<?>[], java.lang.Object> {
        LazyValue(android.os.Parcel p0, int p1, int p2, int p3, java.lang.ClassLoader p4) {}
        public java.lang.Object apply(java.lang.Class<?> p0, java.lang.Class<?>[] p1) { return null; }
        public void writeToParcel(android.os.Parcel p0) {}
        public boolean hasFileDescriptors() { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParcelFlags {
    }

    public static class ReadWriteHelper {
        public static final android.os.Parcel.ReadWriteHelper DEFAULT = null;
        public ReadWriteHelper() {}
        public void writeString8(android.os.Parcel p0, java.lang.String p1) {}
        public void writeString16(android.os.Parcel p0, java.lang.String p1) {}
        public java.lang.String readString8(android.os.Parcel p0) { return null; }
        public java.lang.String readString16(android.os.Parcel p0) { return null; }
    }

    public static interface SquashReadHelper<T extends java.lang.Object> {
        public T readRawParceled(android.os.Parcel p0);
    }
}
