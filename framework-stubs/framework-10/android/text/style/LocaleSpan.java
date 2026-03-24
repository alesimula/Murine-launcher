package android.text.style;

public class LocaleSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    private final android.os.LocaleList mLocales = null;
    public LocaleSpan(java.util.Locale p0) { super(); }
    public LocaleSpan(android.os.LocaleList p0) { super(); }
    public LocaleSpan(android.os.Parcel p0) { super(); }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public java.util.Locale getLocale() { return null; }
    public android.os.LocaleList getLocales() { return null; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    private static void apply(android.graphics.Paint p0, android.os.LocaleList p1) {}
}
