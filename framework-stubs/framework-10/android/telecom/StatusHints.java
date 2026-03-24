package android.telecom;

public final class StatusHints implements android.os.Parcelable {
    private final java.lang.CharSequence mLabel = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.telecom.StatusHints> CREATOR = null;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public StatusHints(android.content.ComponentName p0, java.lang.CharSequence p1, int p2, android.os.Bundle p3) {}
    public StatusHints(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, android.os.Bundle p2) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.content.ComponentName getPackageName() { return null; }
    public java.lang.CharSequence getLabel() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getIconResId() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getIcon(android.content.Context p0) { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private StatusHints(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
