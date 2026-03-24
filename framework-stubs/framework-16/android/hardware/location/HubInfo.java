package android.hardware.location;

@android.annotation.FlaggedApi("android.chre.flags.offload_api")
public final class HubInfo implements android.os.Parcelable {
    public static final int TYPE_CONTEXT_HUB = 0;
    public static final int TYPE_VENDOR_HUB = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.location.HubInfo> CREATOR = null;
    public HubInfo(long p0, android.hardware.location.ContextHubInfo p1) {}
    public HubInfo(long p0, android.hardware.location.VendorHubInfo p1) {}
    public long getId() { return 0L; }
    public int getType() { return 0; }
    @android.annotation.Nullable
    public android.hardware.location.ContextHubInfo getContextHubInfo() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface HubType {
    }
}
