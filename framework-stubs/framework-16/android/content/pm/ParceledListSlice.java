package android.content.pm;

public class ParceledListSlice<T extends android.os.Parcelable> extends android.content.pm.BaseParceledListSlice<T> {
    public static final android.os.Parcelable.ClassLoaderCreator<android.content.pm.ParceledListSlice> CREATOR = null;
    public ParceledListSlice(java.util.List<T> p0) { super((java.util.List)null); }
    public static <T extends android.os.Parcelable> android.content.pm.ParceledListSlice<T> emptyList() { return null; }
    public int describeContents() { return 0; }
    protected void writeElement(T p0, android.os.Parcel p1, int p2) {}
    protected void writeParcelableCreator(T p0, android.os.Parcel p1) {}
    protected android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel p0, java.lang.ClassLoader p1) { return null; }
}
