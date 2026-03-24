package android.devicelock;

public final class DeviceId {
    public static final int DEVICE_ID_TYPE_IMEI = 0;
    public static final int DEVICE_ID_TYPE_MEID = 1;
    @android.annotation.FlaggedApi("com.android.devicelock.flags.device_id_type_serial")
    public static final int DEVICE_ID_TYPE_SERIAL_NUMBER = 2;
    DeviceId() {}
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public int getType() { return 0; }
}
