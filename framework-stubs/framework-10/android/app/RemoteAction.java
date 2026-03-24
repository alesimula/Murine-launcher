package android.app;

public final class RemoteAction implements android.os.Parcelable {
    private static final java.lang.String TAG = "RemoteAction";
    private final android.graphics.drawable.Icon mIcon = null;
    private final java.lang.CharSequence mTitle = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.app.PendingIntent mActionIntent = null;
    private boolean mEnabled;
    private boolean mShouldShowIcon;
    public static final android.os.Parcelable.Creator<android.app.RemoteAction> CREATOR = null;
    RemoteAction(android.os.Parcel p0) {}
    public RemoteAction(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, java.lang.CharSequence p2, android.app.PendingIntent p3) {}
    public void setEnabled(boolean p0) {}
    public boolean isEnabled() { return false; }
    public void setShouldShowIcon(boolean p0) {}
    public boolean shouldShowIcon() { return false; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.app.PendingIntent getActionIntent() { return null; }
    public android.app.RemoteAction clone() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
}
