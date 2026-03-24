package android.net;

public class NetworkMisc implements android.os.Parcelable {
    public boolean allowBypass;
    public boolean explicitlySelected;
    public boolean acceptUnvalidated;
    public boolean acceptPartialConnectivity;
    public boolean provisioningNotificationDisabled;
    public java.lang.String subscriberId;
    public boolean skip464xlat;
    public static final android.os.Parcelable.Creator<android.net.NetworkMisc> CREATOR = null;
    public NetworkMisc() {}
    public NetworkMisc(android.net.NetworkMisc p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
