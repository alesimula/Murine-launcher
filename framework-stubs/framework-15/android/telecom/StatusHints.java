package android.telecom;

public final class StatusHints implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.StatusHints> CREATOR = null;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public StatusHints(android.content.ComponentName p0, java.lang.CharSequence p1, int p2, android.os.Bundle p3) {}
    public StatusHints(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, android.os.Bundle p2) {}
    public StatusHints(android.graphics.drawable.Icon p0) {}
    public void setIcon(android.graphics.drawable.Icon p0) {}
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
    public static android.graphics.drawable.Icon validateAccountIconUserBoundary(android.graphics.drawable.Icon p0, android.os.UserHandle p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
