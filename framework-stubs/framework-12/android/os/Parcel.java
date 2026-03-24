package android.os;

public final class Parcel {
    private static final boolean DEBUG_RECYCLE = false;
    private static final boolean DEBUG_ARRAY_MAP = false;
    private static final java.lang.String TAG = "Parcel";
    private long mNativePtr;
    private boolean mOwnsNativeParcelObject;
    private long mNativeSize;
    private android.util.ArrayMap<java.lang.Class, java.lang.Object> mClassCookies;
    private java.lang.RuntimeException mStack;
    private static boolean sParcelExceptionStackTrace;
    private static final java.lang.Object sPoolSync = null;
    private android.os.Parcel mPoolNext;
    private static android.os.Parcel sOwnedPool;
    private static android.os.Parcel sHolderPool;
    private static int sOwnedPoolSize;
    private static int sHolderPoolSize;
    private static final int POOL_SIZE = 32;
    private static final int VAL_NULL = -1;
    private static final int VAL_STRING = 0;
    private static final int VAL_INTEGER = 1;
    private static final int VAL_MAP = 2;
    private static final int VAL_BUNDLE = 3;
    private static final int VAL_PARCELABLE = 4;
    private static final int VAL_SHORT = 5;
    private static final int VAL_LONG = 6;
    private static final int VAL_FLOAT = 7;
    private static final int VAL_DOUBLE = 8;
    private static final int VAL_BOOLEAN = 9;
    private static final int VAL_CHARSEQUENCE = 10;
    private static final int VAL_LIST = 11;
    private static final int VAL_SPARSEARRAY = 12;
    private static final int VAL_BYTEARRAY = 13;
    private static final int VAL_STRINGARRAY = 14;
    private static final int VAL_IBINDER = 15;
    private static final int VAL_PARCELABLEARRAY = 16;
    private static final int VAL_OBJECTARRAY = 17;
    private static final int VAL_INTARRAY = 18;
    private static final int VAL_LONGARRAY = 19;
    private static final int VAL_BYTE = 20;
    private static final int VAL_SERIALIZABLE = 21;
    private static final int VAL_SPARSEBOOLEANARRAY = 22;
    private static final int VAL_BOOLEANARRAY = 23;
    private static final int VAL_CHARSEQUENCEARRAY = 24;
    private static final int VAL_PERSISTABLEBUNDLE = 25;
    private static final int VAL_SIZE = 26;
    private static final int VAL_SIZEF = 27;
    private static final int VAL_DOUBLEARRAY = 28;
    private static final int EX_SECURITY = -1;
    private static final int EX_BAD_PARCELABLE = -2;
    private static final int EX_ILLEGAL_ARGUMENT = -3;
    private static final int EX_NULL_POINTER = -4;
    private static final int EX_ILLEGAL_STATE = -5;
    private static final int EX_NETWORK_MAIN_THREAD = -6;
    private static final int EX_UNSUPPORTED_OPERATION = -7;
    private static final int EX_SERVICE_SPECIFIC = -8;
    private static final int EX_PARCELABLE = -9;
    public static final int EX_HAS_NOTED_APPOPS_REPLY_HEADER = -127;
    private static final int EX_HAS_STRICTMODE_REPLY_HEADER = -128;
    private static final int EX_TRANSACTION_FAILED = -129;
    private static volatile long sLastWriteExceptionStackTrace;
    private static final int WRITE_EXCEPTION_STACK_TRACE_THRESHOLD_MS = 1000;
    public static final android.os.Parcelable.Creator<java.lang.String> STRING_CREATOR = null;
    private android.os.Parcel.ReadWriteHelper mReadWriteHelper;
    private static final int OK = 0;
    private android.util.ArrayMap<android.os.Parcelable, java.lang.Integer> mWrittenSquashableParcelables;
    private boolean mAllowSquashing;
    private android.util.SparseArray<android.os.Parcelable> mReadSquashableParcelables;
    private static final java.util.HashMap<java.lang.ClassLoader, java.util.HashMap<java.lang.String, android.os.Parcelable.Creator<?>>> mCreators = null;
    private static native void nativeMarkSensitive(long p0);
    private static native int nativeDataSize(long p0);
    private static native int nativeDataAvail(long p0);
    private static native int nativeDataPosition(long p0);
    private static native int nativeDataCapacity(long p0);
    private static native void nativeSetDataSize(long p0, int p1);
    private static native void nativeSetDataPosition(long p0, int p1);
    private static native void nativeSetDataCapacity(long p0, int p1);
    private static native boolean nativePushAllowFds(long p0, boolean p1);
    private static native void nativeRestoreAllowFds(long p0, boolean p1);
    private static native void nativeWriteByteArray(long p0, byte[] p1, int p2, int p3);
    private static native void nativeWriteBlob(long p0, byte[] p1, int p2, int p3);
    private static native int nativeWriteInt(long p0, int p1);
    private static native int nativeWriteLong(long p0, long p1);
    private static native int nativeWriteFloat(long p0, float p1);
    private static native int nativeWriteDouble(long p0, double p1);
    private static native void nativeSignalExceptionForError(int p0);
    private static native void nativeWriteString8(long p0, java.lang.String p1);
    private static native void nativeWriteString16(long p0, java.lang.String p1);
    private static native void nativeWriteStrongBinder(long p0, android.os.IBinder p1);
    private static native void nativeWriteFileDescriptor(long p0, java.io.FileDescriptor p1);
    private static native byte[] nativeCreateByteArray(long p0);
    private static native boolean nativeReadByteArray(long p0, byte[] p1, int p2);
    private static native byte[] nativeReadBlob(long p0);
    private static native int nativeReadInt(long p0);
    private static native long nativeReadLong(long p0);
    private static native float nativeReadFloat(long p0);
    private static native double nativeReadDouble(long p0);
    private static native java.lang.String nativeReadString8(long p0);
    private static native java.lang.String nativeReadString16(long p0);
    private static native android.os.IBinder nativeReadStrongBinder(long p0);
    private static native java.io.FileDescriptor nativeReadFileDescriptor(long p0);
    private static native long nativeCreate();
    private static native void nativeFreeBuffer(long p0);
    private static native void nativeDestroy(long p0);
    private static native byte[] nativeMarshall(long p0);
    private static native void nativeUnmarshall(long p0, byte[] p1, int p2, int p3);
    private static native int nativeCompareData(long p0, long p1);
    private static native void nativeAppendFrom(long p0, long p1, int p2, int p3);
    private static native boolean nativeHasFileDescriptors(long p0);
    private static native void nativeWriteInterfaceToken(long p0, java.lang.String p1);
    private static native void nativeEnforceInterface(long p0, java.lang.String p1);
    private static native boolean nativeReplaceCallingWorkSourceUid(long p0, int p1);
    private static native int nativeReadCallingWorkSourceUid(long p0);
    private static native long nativeGetBlobAshmemSize(long p0);
    public static android.os.Parcel obtain() { return null; }
    public final void recycle() {}
    public void setReadWriteHelper(android.os.Parcel.ReadWriteHelper p0) {}
    public boolean hasReadWriteHelper() { return false; }
    public static native long getGlobalAllocSize();
    public static native long getGlobalAllocCount();
    public final void markSensitive() {}
    public final int dataSize() { return 0; }
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
    public final int compareData(android.os.Parcel p0) { return 0; }
    public final void setClassCookie(java.lang.Class p0, java.lang.Object p1) {}
    public final java.lang.Object getClassCookie(java.lang.Class p0) { return null; }
    public final void adoptClassCookies(android.os.Parcel p0) {}
    public java.util.Map<java.lang.Class, java.lang.Object> copyClassCookies() { return null; }
    public void putClassCookies(java.util.Map<java.lang.Class, java.lang.Object> p0) {}
    public final boolean hasFileDescriptors() { return false; }
    public final void writeInterfaceToken(java.lang.String p0) {}
    public final void enforceInterface(java.lang.String p0) {}
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
    public final void writeCharSequenceArray(java.lang.CharSequence[] p0) {}
    public final void writeCharSequenceList(java.util.ArrayList<java.lang.CharSequence> p0) {}
    public final android.os.IBinder[] createBinderArray() { return null; }
    public final void readBinderArray(android.os.IBinder[] p0) {}
    public final <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> p0) {}
    public final <T extends android.os.Parcelable> void writeTypedSparseArray(android.util.SparseArray<T> p0, int p1) {}
    public <T extends android.os.Parcelable> void writeTypedList(java.util.List<T> p0, int p1) {}
    public final void writeStringList(java.util.List<java.lang.String> p0) {}
    public final void writeBinderList(java.util.List<android.os.IBinder> p0) {}
    public final <T extends android.os.Parcelable> void writeParcelableList(java.util.List<T> p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedArray(T[] p0, int p1) {}
    public final <T extends android.os.Parcelable> void writeTypedObject(T p0, int p1) {}
    public final void writeValue(java.lang.Object p0) {}
    public final void writeParcelable(android.os.Parcelable p0, int p1) {}
    public final void writeParcelableCreator(android.os.Parcelable p0) {}
    private void ensureWrittenSquashableParcelables() {}
    public boolean allowSquashing() { return false; }
    public void restoreAllowSquashing(boolean p0) {}
    private void resetSqaushingState() {}
    private void ensureReadSquashableParcelables() {}
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
    private java.lang.Exception createException(int p0, java.lang.String p1) { return null; }
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
    public final void readMap(java.util.Map p0, java.lang.ClassLoader p1) {}
    public final void readList(java.util.List p0, java.lang.ClassLoader p1) {}
    public final java.util.HashMap readHashMap(java.lang.ClassLoader p0) { return null; }
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
    public final java.util.ArrayList readArrayList(java.lang.ClassLoader p0) { return null; }
    public final java.lang.Object[] readArray(java.lang.ClassLoader p0) { return null; }
    public final <T extends java.lang.Object> android.util.SparseArray<T> readSparseArray(java.lang.ClassLoader p0) { return null; }
    public final android.util.SparseBooleanArray readSparseBooleanArray() { return null; }
    public final android.util.SparseIntArray readSparseIntArray() { return null; }
    public final <T extends java.lang.Object> java.util.ArrayList<T> createTypedArrayList(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> void readTypedList(java.util.List<T> p0, android.os.Parcelable.Creator<T> p1) {}
    public final <T extends android.os.Parcelable> android.util.SparseArray<T> createTypedSparseArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends android.os.Parcelable> android.util.ArrayMap<java.lang.String, T> createTypedArrayMap(android.os.Parcelable.Creator<T> p0) { return null; }
    public final java.util.ArrayList<java.lang.String> createStringArrayList() { return null; }
    public final java.util.ArrayList<android.os.IBinder> createBinderArrayList() { return null; }
    public final void readStringList(java.util.List<java.lang.String> p0) {}
    public final void readBinderList(java.util.List<android.os.IBinder> p0) {}
    public final <T extends android.os.Parcelable> java.util.List<T> readParcelableList(java.util.List<T> p0, java.lang.ClassLoader p1) { return null; }
    public final <T extends java.lang.Object> T[] createTypedArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> void readTypedArray(T[] p0, android.os.Parcelable.Creator<T> p1) {}
    @java.lang.Deprecated
    public final <T extends java.lang.Object> T[] readTypedArray(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends java.lang.Object> T readTypedObject(android.os.Parcelable.Creator<T> p0) { return null; }
    public final <T extends android.os.Parcelable> void writeParcelableArray(T[] p0, int p1) {}
    public final java.lang.Object readValue(java.lang.ClassLoader p0) { return null; }
    public final <T extends android.os.Parcelable> T readParcelable(java.lang.ClassLoader p0) { return null; }
    public final <T extends android.os.Parcelable> T readCreator(android.os.Parcelable.Creator<?> p0, java.lang.ClassLoader p1) { return null; }
    public final android.os.Parcelable.Creator<?> readParcelableCreator(java.lang.ClassLoader p0) { return null; }
    public final android.os.Parcelable[] readParcelableArray(java.lang.ClassLoader p0) { return null; }
    public final <T extends android.os.Parcelable> T[] readParcelableArray(java.lang.ClassLoader p0, java.lang.Class<T> p1) { return null; }
    public final java.io.Serializable readSerializable() { return null; }
    private final java.io.Serializable readSerializable(java.lang.ClassLoader p0) { return null; }
    protected static final android.os.Parcel obtain(int p0) { return null; }
    protected static final android.os.Parcel obtain(long p0) { return null; }
    private Parcel(long p0) {}
    private void init(long p0) {}
    private void freeBuffer() {}
    private void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    void readMapInternal(java.util.Map p0, int p1, java.lang.ClassLoader p2) {}
    void readArrayMapInternal(android.util.ArrayMap p0, int p1, java.lang.ClassLoader p2) {}
    void readArrayMapSafelyInternal(android.util.ArrayMap p0, int p1, java.lang.ClassLoader p2) {}
    public void readArrayMap(android.util.ArrayMap p0, java.lang.ClassLoader p1) {}
    public android.util.ArraySet<? extends java.lang.Object> readArraySet(java.lang.ClassLoader p0) { return null; }
    private void readListInternal(java.util.List p0, int p1, java.lang.ClassLoader p2) {}
    private void readArrayInternal(java.lang.Object[] p0, int p1, java.lang.ClassLoader p2) {}
    private void readSparseArrayInternal(android.util.SparseArray p0, int p1, java.lang.ClassLoader p2) {}
    private void readSparseBooleanArrayInternal(android.util.SparseBooleanArray p0, int p1) {}
    private void readSparseIntArrayInternal(android.util.SparseIntArray p0, int p1) {}
    public long getBlobAshmemSize() { return 0L; }

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
