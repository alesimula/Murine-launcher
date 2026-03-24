package android.hardware.devicestate;

public final class DeviceStateRequest {
    public static final int FLAG_CANCEL_WHEN_BASE_CHANGES = 1;
    private final int mRequestedState = 0;
    private final int mFlags = 0;
    public static android.hardware.devicestate.DeviceStateRequest.Builder newBuilder(int p0) { return null; }
    private DeviceStateRequest(int p0, int p1) {}
    public int getState() { return 0; }
    public int getFlags() { return 0; }

    public static final class Builder {
        private final int mRequestedState = 0;
        private int mFlags;
        private Builder(int p0) {}
        public android.hardware.devicestate.DeviceStateRequest.Builder setFlags(int p0) { return null; }
        public android.hardware.devicestate.DeviceStateRequest build() { return null; }
    }

    public static interface Callback {
        default public void onRequestActivated(android.hardware.devicestate.DeviceStateRequest p0) {}
        default public void onRequestSuspended(android.hardware.devicestate.DeviceStateRequest p0) {}
        default public void onRequestCanceled(android.hardware.devicestate.DeviceStateRequest p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestFlags {
    }
}
