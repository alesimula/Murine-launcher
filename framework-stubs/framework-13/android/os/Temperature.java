package android.os;

public final class Temperature implements android.os.Parcelable {
    public static final int THROTTLING_NONE = 0;
    public static final int THROTTLING_LIGHT = 1;
    public static final int THROTTLING_MODERATE = 2;
    public static final int THROTTLING_SEVERE = 3;
    public static final int THROTTLING_CRITICAL = 4;
    public static final int THROTTLING_EMERGENCY = 5;
    public static final int THROTTLING_SHUTDOWN = 6;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_CPU = 0;
    public static final int TYPE_GPU = 1;
    public static final int TYPE_BATTERY = 2;
    public static final int TYPE_SKIN = 3;
    public static final int TYPE_USB_PORT = 4;
    public static final int TYPE_POWER_AMPLIFIER = 5;
    public static final int TYPE_BCL_VOLTAGE = 6;
    public static final int TYPE_BCL_CURRENT = 7;
    public static final int TYPE_BCL_PERCENTAGE = 8;
    public static final int TYPE_NPU = 9;
    public static final android.os.Parcelable.Creator<android.os.Temperature> CREATOR = null;
    public static boolean isValidType(int p0) { return false; }
    public static boolean isValidStatus(int p0) { return false; }
    public Temperature(float p0, int p1, java.lang.String p2, int p3) {}
    public float getValue() { return 0.0f; }
    public int getType() { return 0; }
    public java.lang.String getName() { return null; }
    public int getStatus() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThrottlingStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
