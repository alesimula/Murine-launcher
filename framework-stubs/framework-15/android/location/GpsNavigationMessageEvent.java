package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsNavigationMessageEvent implements android.os.Parcelable {
    public static int STATUS_NOT_SUPPORTED;
    public static int STATUS_READY;
    public static int STATUS_GPS_LOCATION_DISABLED;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GpsNavigationMessageEvent> CREATOR = null;
    public GpsNavigationMessageEvent(android.location.GpsNavigationMessage p0) {}
    @android.annotation.NonNull
    public android.location.GpsNavigationMessage getNavigationMessage() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @android.annotation.SystemApi
    public static interface Listener {
        public void onGpsNavigationMessageReceived(android.location.GpsNavigationMessageEvent p0);
        public void onStatusChanged(int p0);
    }
}
