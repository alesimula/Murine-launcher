package android.hardware.hdmi;

public final class HdmiUtils {
    static final int TARGET_NOT_UNDER_LOCAL_DEVICE = -1;
    static final int TARGET_SAME_PHYSICAL_ADDRESS = 0;
    public static final int HDMI_RELATIVE_POSITION_UNKNOWN = 0;
    public static final int HDMI_RELATIVE_POSITION_DIRECTLY_BELOW = 1;
    public static final int HDMI_RELATIVE_POSITION_BELOW = 2;
    public static final int HDMI_RELATIVE_POSITION_SAME = 3;
    public static final int HDMI_RELATIVE_POSITION_DIRECTLY_ABOVE = 4;
    public static final int HDMI_RELATIVE_POSITION_ABOVE = 5;
    public static final int HDMI_RELATIVE_POSITION_SIBLING = 6;
    public static final int HDMI_RELATIVE_POSITION_DIFFERENT_BRANCH = 7;
    private static final int NPOS = -1;
    private HdmiUtils() {}
    public static int getLocalPortFromPhysicalAddress(int p0, int p1) { return 0; }
    public static boolean isValidPhysicalAddress(int p0) { return false; }
    public static int getHdmiAddressRelativePosition(int p0, int p1) { return 0; }
    private static int physicalAddressFirstDifferentDigitPos(int p0, int p1) throws java.lang.IllegalArgumentException { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HdmiAddressRelativePosition {
    }
}
