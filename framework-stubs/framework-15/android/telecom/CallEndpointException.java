package android.telecom;

public final class CallEndpointException extends java.lang.RuntimeException implements android.os.Parcelable {
    public static final java.lang.String CHANGE_ERROR = "ChangeErrorKey";
    public static final int ERROR_ENDPOINT_DOES_NOT_EXIST = 1;
    public static final int ERROR_REQUEST_TIME_OUT = 2;
    public static final int ERROR_ANOTHER_REQUEST = 3;
    public static final int ERROR_UNSPECIFIED = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.CallEndpointException> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public CallEndpointException(java.lang.String p0, int p1) { super(); }
    public int getCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CallEndpointErrorCode {
    }
}
