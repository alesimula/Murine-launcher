package android.net;

public class CaptivePortal implements android.os.Parcelable {
    public static final int APP_REQUEST_REEVALUATION_REQUIRED = 100;
    public static final int APP_RETURN_DISMISSED = 0;
    public static final int APP_RETURN_UNWANTED = 1;
    public static final int APP_RETURN_WANTED_AS_IS = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.CaptivePortal> CREATOR = null;
    CaptivePortal() {}
    public int describeContents() { return 0; }
    public void ignoreNetwork() {}
    @java.lang.Deprecated
    public void logEvent(int p0, java.lang.String p1) {}
    public void reevaluateNetwork() {}
    public void reportCaptivePortalDismissed() {}
    public void useNetwork() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
