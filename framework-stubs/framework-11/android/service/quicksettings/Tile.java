package android.service.quicksettings;

public final class Tile implements android.os.Parcelable {
    private static final java.lang.String TAG = "Tile";
    public static final int STATE_UNAVAILABLE = 0;
    public static final int STATE_INACTIVE = 1;
    public static final int STATE_ACTIVE = 2;
    private android.os.IBinder mToken;
    private android.graphics.drawable.Icon mIcon;
    private java.lang.CharSequence mLabel;
    private java.lang.CharSequence mSubtitle;
    private java.lang.CharSequence mContentDescription;
    private java.lang.CharSequence mStateDescription;
    private int mState;
    private android.service.quicksettings.IQSService mService;
    public static final android.os.Parcelable.Creator<android.service.quicksettings.Tile> CREATOR = null;
    public Tile(android.os.Parcel p0) {}
    public Tile() {}
    public void setService(android.service.quicksettings.IQSService p0, android.os.IBinder p1) {}
    public int getState() { return 0; }
    public void setState(int p0) {}
    public android.graphics.drawable.Icon getIcon() { return null; }
    public void setIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.CharSequence getLabel() { return null; }
    public void setLabel(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getSubtitle() { return null; }
    public void setSubtitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getContentDescription() { return null; }
    public java.lang.CharSequence getStateDescription() { return null; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void setStateDescription(java.lang.CharSequence p0) {}
    public int describeContents() { return 0; }
    public void updateTile() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
}
