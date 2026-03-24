package android.text;

public interface ParcelableSpan extends android.os.Parcelable {
    public int getSpanTypeId();
    public int getSpanTypeIdInternal();
    public void writeToParcelInternal(android.os.Parcel p0, int p1);
}
