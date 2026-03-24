package android.media.tv.interactive;

public final class TvInteractiveAppServiceInfo implements android.os.Parcelable {
    public static final int INTERACTIVE_APP_TYPE_HBBTV = 1;
    public static final int INTERACTIVE_APP_TYPE_ATSC = 2;
    public static final int INTERACTIVE_APP_TYPE_GINGA = 4;
    public static final int INTERACTIVE_APP_TYPE_TARGETED_AD = 8;
    public static final int INTERACTIVE_APP_TYPE_OTHER = -2147483648;
    public static final android.os.Parcelable.Creator<android.media.tv.interactive.TvInteractiveAppServiceInfo> CREATOR = null;
    public TvInteractiveAppServiceInfo(android.content.Context p0, android.content.ComponentName p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getId() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public android.content.pm.ServiceInfo getServiceInfo() { return null; }
    public int getSupportedTypes() { return 0; }
    public java.util.List<java.lang.String> getCustomSupportedTypes() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractiveAppType {
    }
}
