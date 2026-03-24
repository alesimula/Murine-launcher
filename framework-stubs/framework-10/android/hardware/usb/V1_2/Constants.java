package android.hardware.usb.V1_2;

public class Constants {
    public Constants() {}

    public final class ContaminantProtectionStatus {
        public static final int NONE = 0;
        public static final int FORCE_SINK = 1;
        public static final int FORCE_SOURCE = 2;
        public static final int FORCE_DISABLE = 4;
        public static final int DISABLED = 8;
        public ContaminantProtectionStatus(android.hardware.usb.V1_2.Constants p0) {}
    }

    public final class ContaminantProtectionMode {
        public static final int NONE = 0;
        public static final int FORCE_SINK = 1;
        public static final int FORCE_SOURCE = 2;
        public static final int FORCE_DISABLE = 4;
        public ContaminantProtectionMode(android.hardware.usb.V1_2.Constants p0) {}
    }

    public final class ContaminantDetectionStatus {
        public static final int NOT_SUPPORTED = 0;
        public static final int DISABLED = 1;
        public static final int NOT_DETECTED = 2;
        public static final int DETECTED = 3;
        public ContaminantDetectionStatus(android.hardware.usb.V1_2.Constants p0) {}
    }
}
