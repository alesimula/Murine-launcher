package com.android.internal.statusbar;

public class NotificationVisibility implements android.os.Parcelable {
    private static final java.lang.String TAG = "NoViz";
    private static final int MAX_POOL_SIZE = 25;
    private static int sNexrId;
    public java.lang.String key;
    public int rank;
    public int count;
    public boolean visible;
    public com.android.internal.statusbar.NotificationVisibility.NotificationLocation location;
    int id;
    public static final android.os.Parcelable.Creator<com.android.internal.statusbar.NotificationVisibility> CREATOR = null;
    private NotificationVisibility() {}
    private NotificationVisibility(java.lang.String p0, int p1, int p2, boolean p3, com.android.internal.statusbar.NotificationVisibility.NotificationLocation p4) {}
    public java.lang.String toString() { return null; }
    public com.android.internal.statusbar.NotificationVisibility clone() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public static com.android.internal.statusbar.NotificationVisibility obtain(java.lang.String p0, int p1, int p2, boolean p3) { return null; }
    public static com.android.internal.statusbar.NotificationVisibility obtain(java.lang.String p0, int p1, int p2, boolean p3, com.android.internal.statusbar.NotificationVisibility.NotificationLocation p4) { return null; }
    private static com.android.internal.statusbar.NotificationVisibility obtain(android.os.Parcel p0) { return null; }
    private static com.android.internal.statusbar.NotificationVisibility obtain() { return null; }
    public void recycle() {}

    public static enum NotificationLocation {
        LOCATION_UNKNOWN,
        LOCATION_FIRST_HEADS_UP,
        LOCATION_HIDDEN_TOP,
        LOCATION_MAIN_AREA,
        LOCATION_BOTTOM_STACK_PEEKING,
        LOCATION_BOTTOM_STACK_HIDDEN,
        LOCATION_GONE;
        private final int mMetricsEventNotificationLocation = 0;
        private NotificationLocation() {}
        public int toMetricsEventEnum() { return 0; }
    }
}
