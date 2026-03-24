package android.telecom;

public final class CallEndpoint implements android.os.Parcelable {
    public static final int ENDPOINT_OPERATION_SUCCESS = 0;
    public static final int ENDPOINT_OPERATION_FAILED = 1;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_EARPIECE = 1;
    public static final int TYPE_BLUETOOTH = 2;
    public static final int TYPE_WIRED_HEADSET = 3;
    public static final int TYPE_SPEAKER = 4;
    public static final int TYPE_STREAMING = 5;
    public static final android.os.Parcelable.Creator<android.telecom.CallEndpoint> CREATOR = null;
    public CallEndpoint(java.lang.CharSequence p0, int p1, android.os.ParcelUuid p2) {}
    public CallEndpoint(java.lang.CharSequence p0, int p1) {}
    public CallEndpoint(android.telecom.CallEndpoint p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public java.lang.CharSequence getEndpointName() { return null; }
    public int getEndpointType() { return 0; }
    public android.os.ParcelUuid getIdentifier() { return null; }
    public static java.lang.String endpointTypeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EndpointType {
    }
}
