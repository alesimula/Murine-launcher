package android.net.wifi;

public class WpsResult implements android.os.Parcelable {
    public android.net.wifi.WpsResult.Status status;
    public java.lang.String pin;
    public static final android.os.Parcelable.Creator<android.net.wifi.WpsResult> CREATOR = null;
    public WpsResult() {}
    public WpsResult(android.net.wifi.WpsResult.Status p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public WpsResult(android.net.wifi.WpsResult p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum Status {
        SUCCESS,
        FAILURE,
        IN_PROGRESS;
        private Status() {}
    }
}
