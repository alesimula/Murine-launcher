package android.companion;

@android.annotation.FlaggedApi("android.companion.device_presence")
public final class DevicePresenceEvent implements android.os.Parcelable {
    public static final int NO_ASSOCIATION = -1;
    public static final int EVENT_BLE_APPEARED = 0;
    public static final int EVENT_BLE_DISAPPEARED = 1;
    public static final int EVENT_BT_CONNECTED = 2;
    public static final int EVENT_BT_DISCONNECTED = 3;
    public static final int EVENT_SELF_MANAGED_APPEARED = 4;
    public static final int EVENT_SELF_MANAGED_DISAPPEARED = 5;
    @android.annotation.FlaggedApi("android.companion.notify_association_removed")
    public static final int EVENT_ASSOCIATION_REMOVED = 6;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.DevicePresenceEvent> CREATOR = null;
    public DevicePresenceEvent(int p0, int p1, android.os.ParcelUuid p2) {}
    public int getAssociationId() { return 0; }
    public int getEvent() { return 0; }
    @android.annotation.Nullable
    public android.os.ParcelUuid getUuid() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }
}
