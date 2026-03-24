package android.hardware.devicestate;

public final class DeviceStateManagerGlobal {
    private static android.hardware.devicestate.DeviceStateManagerGlobal sInstance;
    private final java.lang.Object mLock = null;
    private final android.hardware.devicestate.IDeviceStateManager mDeviceStateManager = null;
    private android.hardware.devicestate.DeviceStateManagerGlobal.DeviceStateManagerCallback mCallback;
    private final java.util.ArrayList<android.hardware.devicestate.DeviceStateManagerGlobal.DeviceStateCallbackWrapper> mCallbacks = null;
    private final android.util.ArrayMap<android.os.IBinder, android.hardware.devicestate.DeviceStateManagerGlobal.DeviceStateRequestWrapper> mRequests = null;
    private android.hardware.devicestate.DeviceStateInfo mLastReceivedInfo;
    static android.hardware.devicestate.DeviceStateManagerGlobal getInstance() { return null; }
    public DeviceStateManagerGlobal(android.hardware.devicestate.IDeviceStateManager p0) {}
    public int[] getSupportedStates() { return null; }
    public void requestState(android.hardware.devicestate.DeviceStateRequest p0, android.hardware.devicestate.DeviceStateRequest.Callback p1, java.util.concurrent.Executor p2) {}
    public void cancelRequest(android.hardware.devicestate.DeviceStateRequest p0) {}
    public void registerDeviceStateCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0, java.util.concurrent.Executor p1) {}
    public void unregisterDeviceStateCallback(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) {}
    private void registerCallbackIfNeededLocked() {}
    private int findCallbackLocked(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0) { return 0; }
    private android.os.IBinder findRequestTokenLocked(android.hardware.devicestate.DeviceStateRequest p0) { return null; }
    private void handleDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) {}
    private void handleRequestActive(android.os.IBinder p0) {}
    private void handleRequestSuspended(android.os.IBinder p0) {}
    private void handleRequestCanceled(android.os.IBinder p0) {}

    private static final class DeviceStateCallbackWrapper {
        private final android.hardware.devicestate.DeviceStateManager.DeviceStateCallback mDeviceStateCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        DeviceStateCallbackWrapper(android.hardware.devicestate.DeviceStateManager.DeviceStateCallback p0, java.util.concurrent.Executor p1) {}
        void notifySupportedStatesChanged(int[] p0) {}
        void notifyBaseStateChanged(int p0) {}
        void notifyStateChanged(int p0) {}
    }

    private final class DeviceStateManagerCallback extends android.hardware.devicestate.IDeviceStateManagerCallback.Stub {
        private DeviceStateManagerCallback(android.hardware.devicestate.DeviceStateManagerGlobal p0) { super(); }
        public void onDeviceStateInfoChanged(android.hardware.devicestate.DeviceStateInfo p0) {}
        public void onRequestActive(android.os.IBinder p0) {}
        public void onRequestSuspended(android.os.IBinder p0) {}
        public void onRequestCanceled(android.os.IBinder p0) {}
    }

    private static final class DeviceStateRequestWrapper {
        private final android.hardware.devicestate.DeviceStateRequest mRequest = null;
        private final android.hardware.devicestate.DeviceStateRequest.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        DeviceStateRequestWrapper(android.hardware.devicestate.DeviceStateRequest p0, android.hardware.devicestate.DeviceStateRequest.Callback p1, java.util.concurrent.Executor p2) {}
        void notifyRequestActive() {}
        void notifyRequestSuspended() {}
        void notifyRequestCanceled() {}
    }
}
