package android.system.virtualmachine;

public interface VirtualMachineCallback {
    public static final int ERROR_PAYLOAD_CHANGED = 2;
    public static final int ERROR_PAYLOAD_INVALID_CONFIG = 3;
    public static final int ERROR_PAYLOAD_VERIFICATION_FAILED = 1;
    public static final int ERROR_UNKNOWN = 0;
    public static final int STOP_REASON_BOOTLOADER_INSTANCE_IMAGE_CHANGED = 10;
    public static final int STOP_REASON_BOOTLOADER_PUBLIC_KEY_MISMATCH = 9;
    public static final int STOP_REASON_CRASH = 6;
    public static final int STOP_REASON_HANGUP = 16;
    public static final int STOP_REASON_INFRASTRUCTURE_ERROR = 0;
    public static final int STOP_REASON_KILLED = 1;
    public static final int STOP_REASON_MICRODROID_FAILED_TO_CONNECT_TO_VIRTUALIZATION_SERVICE = 11;
    public static final int STOP_REASON_MICRODROID_INVALID_PAYLOAD_CONFIG = 14;
    public static final int STOP_REASON_MICRODROID_PAYLOAD_HAS_CHANGED = 12;
    public static final int STOP_REASON_MICRODROID_PAYLOAD_VERIFICATION_FAILED = 13;
    public static final int STOP_REASON_MICRODROID_UNKNOWN_RUNTIME_ERROR = 15;
    public static final int STOP_REASON_PVM_FIRMWARE_INSTANCE_IMAGE_CHANGED = 8;
    public static final int STOP_REASON_PVM_FIRMWARE_PUBLIC_KEY_MISMATCH = 7;
    public static final int STOP_REASON_REBOOT = 5;
    public static final int STOP_REASON_SHUTDOWN = 3;
    public static final int STOP_REASON_START_FAILED = 4;
    public static final int STOP_REASON_UNKNOWN = 2;
    public static final int STOP_REASON_VIRTUALIZATION_SERVICE_DIED = -1;
    public void onPayloadStarted(android.system.virtualmachine.VirtualMachine p0);
    public void onPayloadReady(android.system.virtualmachine.VirtualMachine p0);
    public void onPayloadFinished(android.system.virtualmachine.VirtualMachine p0, int p1);
    public void onError(android.system.virtualmachine.VirtualMachine p0, int p1, java.lang.String p2);
    public void onStopped(android.system.virtualmachine.VirtualMachine p0, int p1);
}
