package android.uwb;

public final class RangingSession implements java.lang.AutoCloseable {
    RangingSession() {}
    public void addControlee(android.os.PersistableBundle p0) {}
    public void close() {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
    public void closeLogicalLink(int p0) {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
    public void createLogicalLink(android.uwb.LogicalLinkParams p0) {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
    @android.annotation.NonNull
    public android.uwb.LogicalLinkConnectionParams getLogicalLinkParams(int p0) { return null; }
    public void pause(android.os.PersistableBundle p0) {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
    public int queryLogicalLinkMaxDataSizeBytes(int p0) { return 0; }
    public int queryMaxDataSizeBytes() { return 0; }
    public void reconfigure(android.os.PersistableBundle p0) {}
    public void removeControlee(android.os.PersistableBundle p0) {}
    public void resume(android.os.PersistableBundle p0) {}
    public void sendData(android.uwb.UwbAddress p0, android.os.PersistableBundle p1, byte[] p2) {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.data_transfer_phase_config")
    public void setDataTransferPhaseConfig(android.os.PersistableBundle p0) {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.hybrid_session_support")
    public void setHybridSessionControleeConfiguration(android.os.PersistableBundle p0) {}
    @android.annotation.FlaggedApi("com.android.uwb.flags.hybrid_session_support")
    public void setHybridSessionControllerConfiguration(android.os.PersistableBundle p0) {}
    public void start(android.os.PersistableBundle p0) {}
    public void stop() {}
    public void updatePose(android.os.PersistableBundle p0) {}
    public void updateRangingRoundsDtTag(android.os.PersistableBundle p0) {}

    public static interface Callback {
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        public static final int CONTROLEE_DEVICE_ROLE_INITIATOR = 0;
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        public static final int CONTROLEE_DEVICE_ROLE_RESPONDER = 1;
        public static final int CONTROLEE_FAILURE_REASON_MAX_CONTROLEE_REACHED = 0;
        public static final int DATA_FAILURE_REASON_DATA_SIZE_TOO_LARGE = 10;
        public static final int REASON_BAD_PARAMETERS = 3;
        public static final int REASON_GENERIC_ERROR = 4;
        @android.annotation.FlaggedApi("com.android.uwb.flags.reason_inband_session_stop")
        public static final int REASON_INBAND_SESSION_STOP = 16;
        public static final int REASON_INSUFFICIENT_SLOTS_PER_RR = 14;
        public static final int REASON_LOCAL_REQUEST = 1;
        public static final int REASON_MAX_RR_RETRY_REACHED = 9;
        public static final int REASON_MAX_SESSIONS_REACHED = 5;
        public static final int REASON_PROTOCOL_SPECIFIC_ERROR = 7;
        public static final int REASON_REMOTE_REQUEST = 2;
        public static final int REASON_SERVICE_CONNECTION_FAILURE = 11;
        public static final int REASON_SERVICE_DISCOVERY_FAILURE = 10;
        public static final int REASON_SE_INTERACTION_FAILURE = 13;
        public static final int REASON_SE_NOT_SUPPORTED = 12;
        public static final int REASON_SYSTEM_POLICY = 6;
        public static final int REASON_SYSTEM_REGULATION = 15;
        public static final int REASON_UNKNOWN = 0;
        public void onClosed(int p0, android.os.PersistableBundle p1);
        default public void onControleeAddFailed(int p0, android.os.PersistableBundle p1) {}
        default public void onControleeAdded(android.os.PersistableBundle p0) {}
        default public void onControleeRemoveFailed(int p0, android.os.PersistableBundle p1) {}
        default public void onControleeRemoved(android.os.PersistableBundle p0) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        default public void onControleeRoleChanged(int p0) {}
        default public void onDataReceiveFailed(android.uwb.UwbAddress p0, int p1, android.os.PersistableBundle p2) {}
        default public void onDataReceived(android.uwb.UwbAddress p0, android.os.PersistableBundle p1, byte[] p2) {}
        default public void onDataSendFailed(android.uwb.UwbAddress p0, int p1, android.os.PersistableBundle p2) {}
        default public void onDataSent(android.uwb.UwbAddress p0, android.os.PersistableBundle p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.data_transfer_phase_config")
        default public void onDataTransferPhaseConfigFailed(int p0, android.os.PersistableBundle p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.data_transfer_phase_config")
        default public void onDataTransferPhaseConfigured(android.os.PersistableBundle p0) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.hybrid_session_support")
        default public void onHybridSessionControleeConfigurationFailed(int p0, android.os.PersistableBundle p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.hybrid_session_support")
        default public void onHybridSessionControleeConfigured(android.os.PersistableBundle p0) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.hybrid_session_support")
        default public void onHybridSessionControllerConfigurationFailed(int p0, android.os.PersistableBundle p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.hybrid_session_support")
        default public void onHybridSessionControllerConfigured(android.os.PersistableBundle p0) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        default public void onLogicalLinkCloseFailed(int p0, int p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        default public void onLogicalLinkClosed(int p0, int p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        default public void onLogicalLinkCreateFailed(android.uwb.LogicalLinkParams p0, int p1) {}
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        default public void onLogicalLinkCreated(android.uwb.LogicalLinkParams p0, int p1) {}
        public void onOpenFailed(int p0, android.os.PersistableBundle p1);
        public void onOpened(android.uwb.RangingSession p0);
        default public void onPauseFailed(int p0, android.os.PersistableBundle p1) {}
        default public void onPaused(android.os.PersistableBundle p0) {}
        default public void onRangingRoundsUpdateDtTagStatus(android.os.PersistableBundle p0) {}
        public void onReconfigureFailed(int p0, android.os.PersistableBundle p1);
        public void onReconfigured(android.os.PersistableBundle p0);
        @android.annotation.FlaggedApi("com.android.uwb.flags.uwb_fira_3_0_25q4")
        default public void onRemoteLogicalLinkRequested(android.uwb.LogicalLinkConnectionRequest p0) {}
        public void onReportReceived(android.uwb.RangingReport p0);
        default public void onResumeFailed(int p0, android.os.PersistableBundle p1) {}
        default public void onResumed(android.os.PersistableBundle p0) {}
        default public void onServiceConnected(android.os.PersistableBundle p0) {}
        default public void onServiceDiscovered(android.os.PersistableBundle p0) {}
        public void onStartFailed(int p0, android.os.PersistableBundle p1);
        public void onStarted(android.os.PersistableBundle p0);
        public void onStopFailed(int p0, android.os.PersistableBundle p1);
        public void onStopped(int p0, android.os.PersistableBundle p1);
    }
}
