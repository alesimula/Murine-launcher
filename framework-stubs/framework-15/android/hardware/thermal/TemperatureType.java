package android.hardware.thermal;

public @interface TemperatureType {
    public static final int UNKNOWN = -1;
    public static final int CPU = 0;
    public static final int GPU = 1;
    public static final int BATTERY = 2;
    public static final int SKIN = 3;
    public static final int USB_PORT = 4;
    public static final int POWER_AMPLIFIER = 5;
    public static final int BCL_VOLTAGE = 6;
    public static final int BCL_CURRENT = 7;
    public static final int BCL_PERCENTAGE = 8;
    public static final int NPU = 9;
    public static final int TPU = 10;
    public static final int DISPLAY = 11;
    public static final int MODEM = 12;
    public static final int SOC = 13;
    public static final int WIFI = 14;
    public static final int CAMERA = 15;
    public static final int FLASHLIGHT = 16;
    public static final int SPEAKER = 17;
    public static final int AMBIENT = 18;
    public static final int POGO = 19;
}
