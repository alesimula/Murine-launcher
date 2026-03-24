package android.text.style;

public class TypefaceSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    public TypefaceSpan(java.lang.String p0) { super(); }
    public TypefaceSpan(android.graphics.Typeface p0) { super(); }
    public TypefaceSpan(android.os.Parcel p0) { super(); }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public java.lang.String getFamily() { return null; }
    @android.annotation.Nullable
    public android.graphics.Typeface getTypeface() { return null; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    public java.lang.String toString() { return null; }
}
