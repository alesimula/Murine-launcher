package android.hardware.radio.voice;

public @interface EmergencyServiceCategory {
    public static final int UNSPECIFIED = 0;
    public static final int POLICE = 1;
    public static final int AMBULANCE = 2;
    public static final int FIRE_BRIGADE = 4;
    public static final int MARINE_GUARD = 8;
    public static final int MOUNTAIN_RESCUE = 16;
    public static final int MIEC = 32;
    public static final int AIEC = 64;
}
