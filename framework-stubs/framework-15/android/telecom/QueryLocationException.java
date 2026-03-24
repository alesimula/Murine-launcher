package android.telecom;

public final class QueryLocationException extends java.lang.RuntimeException implements android.os.Parcelable {
    public static final java.lang.String QUERY_LOCATION_ERROR = "QueryLocationErrorKey";
    public static final int ERROR_REQUEST_TIME_OUT = 1;
    public static final int ERROR_PREVIOUS_REQUEST_EXISTS = 2;
    public static final int ERROR_NOT_PERMITTED = 3;
    public static final int ERROR_NOT_ALLOWED_FOR_NON_EMERGENCY_CONNECTIONS = 4;
    public static final int ERROR_SERVICE_UNAVAILABLE = 5;
    public static final int ERROR_UNSPECIFIED = 6;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telecom.QueryLocationException> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public QueryLocationException(java.lang.String p0) { super(); }
    public QueryLocationException(java.lang.String p0, int p1) { super(); }
    public QueryLocationException(java.lang.String p0, int p1, java.lang.Throwable p2) { super(); }
    public int getCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QueryLocationErrorCode {
    }
}
