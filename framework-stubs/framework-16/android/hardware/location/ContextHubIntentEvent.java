package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubIntentEvent {
    @android.annotation.NonNull
    public static android.hardware.location.ContextHubIntentEvent fromIntent(android.content.Intent p0) { return null; }
    public int getEventType() { return 0; }
    @android.annotation.NonNull
    public android.hardware.location.ContextHubInfo getContextHubInfo() { return null; }
    public long getNanoAppId() { return 0L; }
    public int getNanoAppAbortCode() { return 0; }
    @android.annotation.NonNull
    public android.hardware.location.NanoAppMessage getNanoAppMessage() { return null; }
    public int getClientAuthorizationState() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
