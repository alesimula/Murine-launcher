package android.net.thread;

@android.annotation.FlaggedApi("com.android.net.thread.flags.thread_enabled")
public final class ThreadNetworkController {
    public static final int DEVICE_ROLE_CHILD = 2;
    public static final int DEVICE_ROLE_DETACHED = 1;
    public static final int DEVICE_ROLE_LEADER = 4;
    public static final int DEVICE_ROLE_ROUTER = 3;
    public static final int DEVICE_ROLE_STOPPED = 0;
    @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
    public static final int EPHEMERAL_KEY_DISABLED = 0;
    @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
    public static final int EPHEMERAL_KEY_ENABLED = 1;
    @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
    public static final int EPHEMERAL_KEY_IN_USE = 2;
    public static final int MAX_POWER_CHANNEL_DISABLED = -2147483648;
    public static final int STATE_DISABLED = 0;
    public static final int STATE_DISABLING = 2;
    public static final int STATE_ENABLED = 1;
    public static final int THREAD_VERSION_1_3 = 4;
    ThreadNetworkController() {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
    public void activateEphemeralKeyMode(java.time.Duration p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    public void createRandomizedDataset(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.net.thread.ActiveOperationalDataset, android.net.thread.ThreadNetworkException> p2) {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
    public void deactivateEphemeralKeyMode(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p1) {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
    @android.annotation.NonNull
    public java.time.Duration getMaxEphemeralKeyLifetime() { return null; }
    public int getThreadVersion() { return 0; }
    public static boolean isAttached(int p0) { return false; }
    public void join(android.net.thread.ActiveOperationalDataset p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    public void leave(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p1) {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.configuration_enabled")
    public void registerConfigurationCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<android.net.thread.ThreadConfiguration> p1) {}
    public void registerOperationalDatasetCallback(java.util.concurrent.Executor p0, android.net.thread.ThreadNetworkController.OperationalDatasetCallback p1) {}
    public void registerStateCallback(java.util.concurrent.Executor p0, android.net.thread.ThreadNetworkController.StateCallback p1) {}
    public void scheduleMigration(android.net.thread.PendingOperationalDataset p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.channel_max_powers_enabled")
    public void setChannelMaxPowers(android.util.SparseIntArray p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.set_nat64_configuration_enabled")
    public void setConfiguration(android.net.thread.ThreadConfiguration p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    public void setEnabled(boolean p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Void, android.net.thread.ThreadNetworkException> p2) {}
    @android.annotation.FlaggedApi("com.android.net.thread.flags.configuration_enabled")
    public void unregisterConfigurationCallback(java.util.function.Consumer<android.net.thread.ThreadConfiguration> p0) {}
    public void unregisterOperationalDatasetCallback(android.net.thread.ThreadNetworkController.OperationalDatasetCallback p0) {}
    public void unregisterStateCallback(android.net.thread.ThreadNetworkController.StateCallback p0) {}

    public static interface OperationalDatasetCallback {
        public void onActiveOperationalDatasetChanged(android.net.thread.ActiveOperationalDataset p0);
        default public void onPendingOperationalDatasetChanged(android.net.thread.PendingOperationalDataset p0) {}
    }

    public static interface StateCallback {
        public void onDeviceRoleChanged(int p0);
        @android.annotation.FlaggedApi("com.android.net.thread.flags.epskc_enabled")
        default public void onEphemeralKeyStateChanged(int p0, java.lang.String p1, java.time.Instant p2) {}
        default public void onPartitionIdChanged(long p0) {}
        default public void onThreadEnableStateChanged(int p0) {}
    }
}
