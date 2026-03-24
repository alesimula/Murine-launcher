package android.companion;

public interface DeviceFilter<D extends android.os.Parcelable> extends android.os.Parcelable {
    public static final int MEDIUM_TYPE_BLUETOOTH = 0;
    public static final int MEDIUM_TYPE_BLUETOOTH_LE = 1;
    public static final int MEDIUM_TYPE_WIFI = 2;
    @android.annotation.UnsupportedAppUsage
    public boolean matches(D p0);
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDeviceDisplayName(D p0);
    public int getMediumType();
    public static <D extends android.os.Parcelable> boolean matches(android.companion.DeviceFilter<D> p0, D p1) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediumType {
    }
}
