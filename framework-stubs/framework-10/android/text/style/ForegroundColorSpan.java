package android.text.style;

public class ForegroundColorSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance, android.text.ParcelableSpan {
    private final int mColor = 0;
    public ForegroundColorSpan(int p0) { super(); }
    public ForegroundColorSpan(android.os.Parcel p0) { super(); }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getForegroundColor() { return 0; }
    public void updateDrawState(android.text.TextPaint p0) {}
}
