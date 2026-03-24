package android.service.quicksettings;

public final class Tile implements android.os.Parcelable {
    public static final int STATE_UNAVAILABLE = 0;
    public static final int STATE_INACTIVE = 1;
    public static final int STATE_ACTIVE = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.quicksettings.Tile> CREATOR = null;
    public Tile(android.os.Parcel p0) {}
    public Tile() {}
    public void setService(android.service.quicksettings.IQSService p0, android.os.IBinder p1) {}
    public int getState() { return 0; }
    public void setState(int p0) {}
    public android.graphics.drawable.Icon getIcon() { return null; }
    public void setIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.CharSequence getLabel() { return null; }
    public java.lang.CharSequence getCustomLabel() { return null; }
    public void setDefaultLabel(java.lang.CharSequence p0) {}
    public void setLabel(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getSubtitle() { return null; }
    public void setSubtitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getContentDescription() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getStateDescription() { return null; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    public void setStateDescription(java.lang.CharSequence p0) {}
    public int describeContents() { return 0; }
    public void updateTile() {}
    @android.annotation.Nullable
    public android.app.PendingIntent getActivityLaunchForClick() { return null; }
    public void setActivityLaunchForClick(android.app.PendingIntent p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
