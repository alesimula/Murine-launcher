package com.android.internal.telephony.metrics;

public class RcsStats {
    public static final int NONE = -1;
    public static final int STATE_REGISTERED = 0;
    public static final int STATE_DEREGISTERED = 1;
    public static final int STATE_DENIED = 2;
    protected final java.util.Map<java.lang.Integer, com.android.internal.telephony.nano.PersistAtomsProto.ImsDedicatedBearerListenerEvent> mDedicatedBearerListenerEventMap = null;
    protected final java.util.List<com.android.internal.telephony.nano.PersistAtomsProto.RcsAcsProvisioningStats> mRcsAcsProvisioningStatsList = null;
    protected final java.util.HashMap<java.lang.Integer, com.android.internal.telephony.metrics.RcsStats.RcsProvisioningCallback> mRcsProvisioningCallbackMap = null;
    protected final java.util.List<com.android.internal.telephony.nano.PersistAtomsProto.ImsRegistrationServiceDescStats> mImsRegistrationServiceDescStatsList = null;
    protected RcsStats() {}
    public static com.android.internal.telephony.metrics.RcsStats getInstance() { return null; }
    public void registerUceCallback() {}
    public void onImsRegistrationFeatureTagStats(int p0, java.util.List<java.lang.String> p1, int p2) {}
    public void onStoreCompleteImsRegistrationFeatureTagStats(int p0) {}
    public void onFlushIncompleteImsRegistrationFeatureTagStats() {}
    public synchronized void onRcsClientProvisioningStats(int p0, int p1) {}
    public void onRcsAcsProvisioningStats(int p0, int p1, int p2, boolean p3) {}
    public void onStoreCompleteRcsAcsProvisioningStats(int p0) {}
    public void onFlushIncompleteRcsAcsProvisioningStats() {}
    public synchronized void createSipDelegateStats(int p0, java.util.Set<java.lang.String> p1) {}
    public synchronized void onSipDelegateStats(int p0, java.util.Set<java.lang.String> p1, int p2) {}
    public synchronized void onSipTransportFeatureTagStats(int p0, java.util.Set<android.telephony.ims.FeatureTagState> p1, java.util.Set<android.telephony.ims.FeatureTagState> p2, java.util.Set<java.lang.String> p3) {}
    public synchronized void concludeSipTransportFeatureTagsStat() {}
    public synchronized void onSipMessageRequest(java.lang.String p0, java.lang.String p1, int p2) {}
    public synchronized void invalidatedMessageResult(int p0, java.lang.String p1, int p2, int p3) {}
    public synchronized void onSipMessageResponse(int p0, java.lang.String p1, int p2, int p3) {}
    public synchronized void earlySipTransportSession(java.lang.String p0, java.lang.String p1, int p2) {}
    public synchronized void confirmedSipTransportSession(java.lang.String p0, int p1) {}
    public synchronized void onSipTransportSessionClosed(int p0, java.lang.String p1, int p2, boolean p3) {}
    public synchronized void onImsDedicatedBearerListenerAdded(int p0, int p1, int p2, int p3) {}
    public synchronized void onImsDedicatedBearerListenerUpdateSession(int p0, int p1, int p2, int p3, boolean p4) {}
    public synchronized void onImsDedicatedBearerListenerRemoved(int p0) {}
    public synchronized void onImsDedicatedBearerEvent(int p0, int p1, int p2, int p3, boolean p4, boolean p5, boolean p6) {}
    public void onImsRegistrationServiceDescStats(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, int p3) {}
    public void onFlushIncompleteImsRegistrationServiceDescStats() {}
    public synchronized void onUceEventStats(int p0, int p1, boolean p2, int p3, int p4) {}
    public synchronized void onPresenceNotifyEvent(int p0, java.lang.String p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
    public void onStoreCompleteImsRegistrationServiceDescStats(int p0) {}
    public synchronized void onGbaSuccessEvent(int p0) {}
    public synchronized void onGbaFailureEvent(int p0, int p1) {}
    public synchronized com.android.internal.telephony.metrics.RcsStats.RcsProvisioningCallback getRcsProvisioningCallback(int p0, boolean p1) { return null; }
    public synchronized void setEnableSingleRegistration(int p0, boolean p1) {}
    protected boolean isValidCarrierId(int p0) { return false; }
    protected int getSlotId(int p0) { return 0; }
    protected int getCarrierId(int p0) { return 0; }
    protected long getWallTimeMillis() { return 0L; }
    protected void logd(java.lang.String p0) {}
    protected int getSubId(int p0) { return 0; }
    public int convertTagNameToValue(java.lang.String p0) { return 0; }
    public int convertServiceIdToValue(java.lang.String p0) { return 0; }
    public int convertMessageTypeToValue(java.lang.String p0) { return 0; }
    public int convertPresenceNotifyReason(java.lang.String p0) { return 0; }
    public synchronized void printAllMetrics(java.io.PrintWriter p0) {}

    private class LastSipDelegateStat {
        public int mSubId;
        public com.android.internal.telephony.nano.PersistAtomsProto.SipDelegateStats mLastStat;
        LastSipDelegateStat(int p0, java.util.Set<java.lang.String> p1) {}
        public void createSipDelegateStat(int p0) {}
        public void setSipDelegateDestroyReason(int p0) {}
        public boolean isDestroyed() { return false; }
        public void conclude(long p0) {}
        public boolean compare(int p0, java.util.Set<java.lang.String> p1) { return false; }
    }

    public class RcsProvisioningCallback extends android.telephony.ims.aidl.IRcsConfigCallback.Stub {
        RcsProvisioningCallback(com.android.internal.telephony.metrics.RcsStats p0, com.android.internal.telephony.metrics.RcsStats p1, int p2, boolean p3) { super(); }
        public synchronized void setEnableSingleRegistration(boolean p0) {}
        public boolean getRegistered() { return false; }
        public void setRegistered(boolean p0) {}
        public void onConfigurationChanged(byte[] p0) {}
        public void onAutoConfigurationErrorReceived(int p0, java.lang.String p1) {}
        public void onConfigurationReset() {}
        public void onRemoved() {}
        public void onPreProvisioningReceived(byte[] p0) {}
    }

    private class SipMessageArray {
        SipMessageArray(com.android.internal.telephony.metrics.RcsStats p0, java.lang.String p1, int p2, java.lang.String p3) {}
    }

    private class SipTransportFeatureTags {
        SipTransportFeatureTags(com.android.internal.telephony.metrics.RcsStats p0, int p1) {}
        public java.util.HashMap<java.lang.String, com.android.internal.telephony.metrics.RcsStats.SipTransportFeatureTags.LastFeatureTagState> getLastTagStates() { return null; }
        public synchronized void updateLastFeatureTagState(java.lang.String p0, int p1, int p2, long p3) {}
        public synchronized void conclude(long p0) {}

        private class LastFeatureTagState {
            public long timeStamp;
            public int carrierId;
            public int slotId;
            public int state;
            public int reason;
            LastFeatureTagState(com.android.internal.telephony.metrics.RcsStats.SipTransportFeatureTags p0, int p1, int p2, int p3, int p4, long p5) {}
            public void update(int p0, int p1, long p2) {}
            public void update(long p0) {}
        }
    }

    private class SipTransportSessionArray {
        SipTransportSessionArray(com.android.internal.telephony.metrics.RcsStats p0, java.lang.String p1, int p2, java.lang.String p3) {}
    }

    class UceStatsWriterCallback {
        UceStatsWriterCallback(com.android.internal.telephony.metrics.RcsStats p0, com.android.internal.telephony.metrics.RcsStats p1) {}
        public void onImsRegistrationFeatureTagStats(int p0, java.util.List<java.lang.String> p1, int p2) {}
        public void onStoreCompleteImsRegistrationFeatureTagStats(int p0) {}
        public void onImsRegistrationServiceDescStats(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, int p3) {}
        public void onSubscribeResponse(int p0, long p1, int p2) {}
        public void onUceEvent(int p0, int p1, boolean p2, int p3, int p4) {}
        public void onSubscribeTerminated(int p0, long p1, java.lang.String p2) {}
        public void onPresenceNotifyEvent(int p0, long p1, java.util.List<android.telephony.ims.RcsContactUceCapability> p2) {}
        public void onStoreCompleteImsRegistrationServiceDescStats(int p0) {}
    }
}
