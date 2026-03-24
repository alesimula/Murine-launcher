package android.hardware.contexthub;

public class HubInfo implements android.os.Parcelable {
    public long hubId;
    public android.hardware.contexthub.HubInfo.HubDetails hubDetails;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubInfo> CREATOR = null;
    public static final long HUB_ID_INVALID = 0L;
    public static final long HUB_ID_RESERVED = -1L;
    public HubInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static final class HubDetails implements android.os.Parcelable {
        public static final int contextHubInfo = 0;
        public static final int vendorHubInfo = 1;
        public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubInfo.HubDetails> CREATOR = null;
        public HubDetails() {}
        public int getTag() { return 0; }
        public static android.hardware.contexthub.HubInfo.HubDetails contextHubInfo(android.hardware.contexthub.ContextHubInfo p0) { return null; }
        public android.hardware.contexthub.ContextHubInfo getContextHubInfo() { return null; }
        public void setContextHubInfo(android.hardware.contexthub.ContextHubInfo p0) {}
        public static android.hardware.contexthub.HubInfo.HubDetails vendorHubInfo(android.hardware.contexthub.VendorHubInfo p0) { return null; }
        public android.hardware.contexthub.VendorHubInfo getVendorHubInfo() { return null; }
        public void setVendorHubInfo(android.hardware.contexthub.VendorHubInfo p0) {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }

        public static @interface Tag {
            public static final int contextHubInfo = 0;
            public static final int vendorHubInfo = 1;
        }
    }
}
