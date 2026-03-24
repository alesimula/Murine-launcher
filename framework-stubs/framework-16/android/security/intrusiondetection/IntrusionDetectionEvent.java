package android.security.intrusiondetection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.security.afl_api")
public final class IntrusionDetectionEvent implements android.os.Parcelable {
    public static final int SECURITY_EVENT = 0;
    public static final int NETWORK_EVENT_DNS = 1;
    public static final int NETWORK_EVENT_CONNECT = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.security.intrusiondetection.IntrusionDetectionEvent> CREATOR = null;
    @android.annotation.NonNull
    public static android.security.intrusiondetection.IntrusionDetectionEvent createForSecurityEvent(android.app.admin.SecurityLog.SecurityEvent p0) { return null; }
    @android.annotation.NonNull
    public static android.security.intrusiondetection.IntrusionDetectionEvent createForDnsEvent(android.app.admin.DnsEvent p0) { return null; }
    @android.annotation.NonNull
    public static android.security.intrusiondetection.IntrusionDetectionEvent createForConnectEvent(android.app.admin.ConnectEvent p0) { return null; }
    @android.annotation.NonNull
    public int getType() { return 0; }
    @android.annotation.NonNull
    public android.app.admin.SecurityLog.SecurityEvent getSecurityEvent() { return null; }
    @android.annotation.NonNull
    public android.app.admin.DnsEvent getDnsEvent() { return null; }
    @android.annotation.NonNull
    public android.app.admin.ConnectEvent getConnectEvent() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.FlaggedApi("android.security.afl_api")
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}
