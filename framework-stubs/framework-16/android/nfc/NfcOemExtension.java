package android.nfc;

@android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
public final class NfcOemExtension {
    public static final int COMMIT_ROUTING_STATUS_FAILED = 3;
    public static final int COMMIT_ROUTING_STATUS_FAILED_UPDATE_IN_PROGRESS = 6;
    public static final int COMMIT_ROUTING_STATUS_OK = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int DISABLE = 0;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int ENABLE_DEFAULT = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int ENABLE_EE = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int ENABLE_TRANSPARENT = 2;
    public static final int HCE_ACTIVATE = 1;
    public static final int HCE_DATA_TRANSFERRED = 2;
    public static final int HCE_DEACTIVATE = 3;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int NFCEE_TECH_A = 1;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int NFCEE_TECH_B = 2;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int NFCEE_TECH_F = 4;
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public static final int NFCEE_TECH_NONE = 0;
    public static final int POLLING_STATE_CHANGE_ALREADY_IN_REQUESTED_STATE = 2;
    public static final int POLLING_STATE_CHANGE_SUCCEEDED = 1;
    public static final int STATUS_OK = 0;
    public static final int STATUS_UNKNOWN_ERROR = 1;
    NfcOemExtension() {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void clearPreference() {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public int forceRoutingTableCommit() { return 0; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, java.lang.Integer> getActiveNfceeList() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public long getMaxPausePollingTimeoutMills() { return 0L; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    @android.annotation.NonNull
    public android.nfc.RoutingStatus getRoutingStatus() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    @android.annotation.NonNull
    public java.util.List<android.nfc.NfcRoutingTableEntry> getRoutingTable() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    @android.annotation.NonNull
    public android.nfc.T4tNdefNfcee getT4tNdefNfcee() { return null; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public boolean hasUserEnabledNfc() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public boolean isAutoChangeEnabled() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public boolean isTagPresent() { return false; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void maybeTriggerFirmwareUpdate() {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void overwriteRoutingTable(int p0, int p1, int p2, int p3) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public int pausePolling(long p0) { return 0; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void registerCallback(java.util.concurrent.Executor p0, android.nfc.NfcOemExtension.Callback p1) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public int resumePolling() { return 0; }
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void setAutoChangeEnabled(boolean p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void setControllerAlwaysOnMode(int p0) {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void synchronizeScreenState() {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void triggerInitialization() {}
    @android.annotation.FlaggedApi("android.nfc.nfc_oem_extension")
    public void unregisterCallback(android.nfc.NfcOemExtension.Callback p0) {}

    public static interface Callback {
        public void onApplyRouting(java.util.function.Consumer<java.lang.Boolean> p0);
        public void onBootFinished(int p0);
        public void onBootStarted();
        public void onCardEmulationActivated(boolean p0);
        public void onDisableFinished(int p0);
        public void onDisableRequested(java.util.function.Consumer<java.lang.Boolean> p0);
        public void onDisableStarted();
        public void onEeListenActivated(boolean p0);
        public void onEeUpdated();
        public void onEnableFinished(int p0);
        public void onEnableRequested(java.util.function.Consumer<java.lang.Boolean> p0);
        public void onEnableStarted();
        public void onExtractOemPackages(android.nfc.NdefMessage p0, java.util.function.Consumer<java.util.List<java.lang.String>> p1);
        public void onGetOemAppSearchIntent(java.util.List<java.lang.String> p0, java.util.function.Consumer<android.content.Intent> p1);
        public void onHceEventReceived(int p0);
        public void onLaunchHceAppChooserActivity(java.lang.String p0, java.util.List<android.nfc.cardemulation.ApduServiceInfo> p1, android.content.ComponentName p2, java.lang.String p3);
        public void onLaunchHceTapAgainDialog(android.nfc.cardemulation.ApduServiceInfo p0, java.lang.String p1);
        public void onLogEventNotified(android.nfc.OemLogItems p0);
        public void onNdefMessage(android.nfc.Tag p0, android.nfc.NdefMessage p1, java.util.function.Consumer<java.lang.Boolean> p2);
        public void onNdefRead(java.util.function.Consumer<java.lang.Boolean> p0);
        public void onReaderOptionChanged(boolean p0);
        public void onRfDiscoveryStarted(boolean p0);
        public void onRfFieldDetected(boolean p0);
        @android.annotation.FlaggedApi("com.android.nfc.module.flags.oem_extension_25q4")
        default public void onRoutingChangeCompleted() {}
        public void onRoutingChanged(java.util.function.Consumer<java.lang.Boolean> p0);
        public void onRoutingTableFull();
        public void onStateUpdated(int p0);
        public void onTagConnected(boolean p0);
        public void onTagDispatch(java.util.function.Consumer<java.lang.Boolean> p0);
    }
}
