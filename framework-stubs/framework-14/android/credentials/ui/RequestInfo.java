package android.credentials.ui;

public final class RequestInfo implements android.os.Parcelable {
    public static final java.lang.String EXTRA_REQUEST_INFO = "android.credentials.ui.extra.REQUEST_INFO";
    public static final java.lang.String TYPE_UNDEFINED = "android.credentials.ui.TYPE_UNDEFINED";
    public static final java.lang.String TYPE_GET = "android.credentials.ui.TYPE_GET";
    public static final java.lang.String TYPE_GET_VIA_REGISTRY = "android.credentials.ui.TYPE_GET_VIA_REGISTRY";
    public static final java.lang.String TYPE_CREATE = "android.credentials.ui.TYPE_CREATE";
    public static final android.os.Parcelable.Creator<android.credentials.ui.RequestInfo> CREATOR = null;
    public static android.credentials.ui.RequestInfo newCreateRequestInfo(android.os.IBinder p0, android.credentials.CreateCredentialRequest p1, java.lang.String p2) { return null; }
    public static android.credentials.ui.RequestInfo newCreateRequestInfo(android.os.IBinder p0, android.credentials.CreateCredentialRequest p1, java.lang.String p2, boolean p3, java.util.List<java.lang.String> p4) { return null; }
    public static android.credentials.ui.RequestInfo newGetRequestInfo(android.os.IBinder p0, android.credentials.GetCredentialRequest p1, java.lang.String p2, boolean p3) { return null; }
    public static android.credentials.ui.RequestInfo newGetRequestInfo(android.os.IBinder p0, android.credentials.GetCredentialRequest p1, java.lang.String p2) { return null; }
    public boolean hasPermissionToOverrideDefault() { return false; }
    public android.os.IBinder getToken() { return null; }
    public java.lang.String getType() { return null; }
    public java.lang.String getAppPackageName() { return null; }
    public android.credentials.CreateCredentialRequest getCreateCredentialRequest() { return null; }
    public java.util.List<java.lang.String> getDefaultProviderIds() { return null; }
    public android.credentials.GetCredentialRequest getGetCredentialRequest() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }
}
