package android.hardware.usb;

@android.annotation.SystemApi
public final class DisplayPortAltModeInfo implements android.os.Parcelable {
    public static final int DISPLAYPORT_ALT_MODE_STATUS_UNKNOWN = 0;
    public static final int DISPLAYPORT_ALT_MODE_STATUS_NOT_CAPABLE = 1;
    public static final int DISPLAYPORT_ALT_MODE_STATUS_CAPABLE_DISABLED = 2;
    public static final int DISPLAYPORT_ALT_MODE_STATUS_ENABLED = 3;
    public static final int LINK_TRAINING_STATUS_UNKNOWN = 0;
    public static final int LINK_TRAINING_STATUS_SUCCESS = 1;
    public static final int LINK_TRAINING_STATUS_FAILURE = 2;
    public static final android.os.Parcelable.Creator<android.hardware.usb.DisplayPortAltModeInfo> CREATOR = null;
    public DisplayPortAltModeInfo() {}
    public DisplayPortAltModeInfo(int p0, int p1, int p2, boolean p3, int p4) {}
    public int getPartnerSinkStatus() { return 0; }
    public int getCableStatus() { return 0; }
    public int getNumberOfLanes() { return 0; }
    public boolean isHotPlugDetectActive() { return false; }
    public int getLinkTrainingStatus() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayPortAltModeStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LinkTrainingStatus {
    }
}
