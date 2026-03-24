package android.net;

public class CaptivePortal implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final int APP_RETURN_DISMISSED = 0;
    @android.annotation.SystemApi
    public static final int APP_RETURN_UNWANTED = 1;
    @android.annotation.SystemApi
    public static final int APP_RETURN_WANTED_AS_IS = 2;
    private final android.os.IBinder mBinder = null;
    public static final android.os.Parcelable.Creator<android.net.CaptivePortal> CREATOR = null;
    public CaptivePortal(android.os.IBinder p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void reportCaptivePortalDismissed() {}
    public void ignoreNetwork() {}
    @android.annotation.SystemApi
    public void useNetwork() {}
    @android.annotation.SystemApi
    public void logEvent(int p0, java.lang.String p1) {}
}
