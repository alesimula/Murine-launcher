package android.text.style;

public class SpellCheckSpan implements android.text.ParcelableSpan {
    private boolean mSpellCheckInProgress;
    @android.annotation.UnsupportedAppUsage
    public SpellCheckSpan() {}
    @android.annotation.UnsupportedAppUsage
    public SpellCheckSpan(android.os.Parcel p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setSpellCheckInProgress(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isSpellCheckInProgress() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
}
