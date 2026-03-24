package android.text.style;

public class SuggestionRangeSpan extends android.text.style.CharacterStyle implements android.text.ParcelableSpan {
    private int mBackgroundColor;
    @android.annotation.UnsupportedAppUsage
    public SuggestionRangeSpan() { super(); }
    @android.annotation.UnsupportedAppUsage
    public SuggestionRangeSpan(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void setBackgroundColor(int p0) {}
    public void updateDrawState(android.text.TextPaint p0) {}
}
