package android.content.pm;

abstract class BaseParceledListSlice<T extends java.lang.Object> implements android.os.Parcelable {
    private static java.lang.String TAG;
    private static boolean DEBUG;
    private static final int MAX_IPC_SIZE = Integer.valueOf(0);
    private final java.util.List<T> mList = null;
    private int mInlineCountLimit;
    public BaseParceledListSlice(java.util.List<T> p0) {}
    BaseParceledListSlice(android.os.Parcel p0, java.lang.ClassLoader p1) {}
    private java.lang.Class<?> readVerifyAndAddElement(android.os.Parcelable.Creator<?> p0, android.os.Parcel p1, java.lang.ClassLoader p2, java.lang.Class<?> p3) { return null; }
    private T readCreator(android.os.Parcelable.Creator<?> p0, android.os.Parcel p1, java.lang.ClassLoader p2) { return null; }
    private static void verifySameType(java.lang.Class<?> p0, java.lang.Class<?> p1) {}
    public java.util.List<T> getList() { return null; }
    public void setInlineCountLimit(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected abstract void writeElement(T p0, android.os.Parcel p1, int p2);
    protected abstract void writeParcelableCreator(T p0, android.os.Parcel p1);
    protected abstract android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel p0, java.lang.ClassLoader p1);
}
