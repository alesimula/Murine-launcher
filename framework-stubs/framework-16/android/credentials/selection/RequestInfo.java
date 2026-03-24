package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class RequestInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final java.lang.String EXTRA_REQUEST_INFO = "android.credentials.selection.extra.REQUEST_INFO";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_UNDEFINED = "android.credentials.selection.TYPE_UNDEFINED";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_GET = "android.credentials.selection.TYPE_GET";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_GET_VIA_REGISTRY = "android.credentials.selection.TYPE_GET_VIA_REGISTRY";
    @android.annotation.NonNull
    public static final java.lang.String TYPE_CREATE = "android.credentials.selection.TYPE_CREATE";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.selection.RequestInfo> CREATOR = null;
    @android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
    @android.annotation.NonNull
    public static android.credentials.selection.RequestInfo newCreateRequestInfo(android.os.IBinder p0, android.credentials.CreateCredentialRequest p1, java.lang.String p2, boolean p3, java.util.List<java.lang.String> p4, boolean p5) { return null; }
    @android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
    @android.annotation.NonNull
    public static android.credentials.selection.RequestInfo newGetRequestInfo(android.os.IBinder p0, android.credentials.GetCredentialRequest p1, java.lang.String p2, boolean p3, boolean p4) { return null; }
    public boolean hasPermissionToOverrideDefault() { return false; }
    @android.annotation.NonNull
    public android.os.IBinder getToken() { return null; }
    @android.annotation.NonNull
    public java.lang.String getType() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.Nullable
    public android.credentials.CreateCredentialRequest getCreateCredentialRequest() { return null; }
    @android.annotation.NonNull
    public android.credentials.selection.RequestToken getRequestToken() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getDefaultProviderIds() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getRegistryProviderIds() { return null; }
    @android.annotation.Nullable
    public android.credentials.GetCredentialRequest getGetCredentialRequest() { return null; }
    public boolean isShowAllOptionsRequested() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }
}
