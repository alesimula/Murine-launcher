package android.health.connect.datatypes;

public final class Device {
    public static final int DEVICE_TYPE_CHEST_STRAP = 7;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_CONSUMER_MEDICAL_DEVICE = 9;
    public static final int DEVICE_TYPE_FITNESS_BAND = 6;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_FITNESS_EQUIPMENT = 13;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_FITNESS_MACHINE = 12;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_GLASSES = 10;
    public static final int DEVICE_TYPE_HEAD_MOUNTED = 5;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_HEARABLE = 11;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_METER = 15;
    public static final int DEVICE_TYPE_PHONE = 2;
    @android.annotation.FlaggedApi("com.android.healthfitness.flags.new_device_types")
    public static final int DEVICE_TYPE_PORTABLE_COMPUTER = 14;
    public static final int DEVICE_TYPE_RING = 4;
    public static final int DEVICE_TYPE_SCALE = 3;
    public static final int DEVICE_TYPE_SMART_DISPLAY = 8;
    public static final int DEVICE_TYPE_UNKNOWN = 0;
    public static final int DEVICE_TYPE_WATCH = 1;
    Device() {}
    @android.annotation.Nullable
    public java.lang.String getManufacturer() { return null; }
    @android.annotation.Nullable
    public java.lang.String getModel() { return null; }
    public int getType() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.Device build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Device.Builder setManufacturer(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Device.Builder setModel(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Device.Builder setType(int p0) { return null; }
    }
}
