package com.android.internal.telephony.data;

public class DataRetryManager extends android.os.Handler {
    public DataRetryManager(com.android.internal.telephony.Phone p0, com.android.internal.telephony.data.DataNetworkController p1, android.util.SparseArray<com.android.internal.telephony.data.DataServiceManager> p2, android.os.Looper p3, com.android.internal.telephony.data.DataRetryManager.DataRetryManagerCallback p4) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void onDataNetworkConnected(int p0, android.telephony.data.DataProfile p1) {}
    public void evaluateDataSetupRetry(android.telephony.data.DataProfile p0, int p1, com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p2, int p3, long p4) {}
    public void evaluateDataHandoverRetry(com.android.internal.telephony.data.DataNetwork p0, int p1, long p2) {}
    public boolean isDataNetworkHandoverRetryStopped(com.android.internal.telephony.data.DataNetwork p0) { return false; }
    public boolean isSimilarNetworkRequestRetryScheduled(com.android.internal.telephony.data.TelephonyNetworkRequest p0, int p1) { return false; }
    public boolean isDataProfileThrottled(android.telephony.data.DataProfile p0, int p1) { return false; }
    public void cancelPendingHandoverRetry(com.android.internal.telephony.data.DataNetwork p0) {}
    public boolean isAnyHandoverRetryScheduled(com.android.internal.telephony.data.DataNetwork p0) { return false; }
    public void registerCallback(com.android.internal.telephony.data.DataRetryManager.DataRetryManagerCallback p0) {}
    public void unregisterCallback(com.android.internal.telephony.data.DataRetryManager.DataRetryManagerCallback p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class DataHandoverRetryEntry extends com.android.internal.telephony.data.DataRetryManager.DataRetryEntry {
        public final com.android.internal.telephony.data.DataNetwork dataNetwork = null;
        public DataHandoverRetryEntry(com.android.internal.telephony.data.DataNetwork p0, com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryRule p1, long p2) { super(null, 0L); }
        public java.lang.String toString() { return null; }

        public static class Builder<T extends com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryEntry.Builder<T>> extends com.android.internal.telephony.data.DataRetryManager.DataRetryEntry.Builder<T> {
            public com.android.internal.telephony.data.DataNetwork mDataNetwork;
            public Builder() { super(); }
            public com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryEntry.Builder<T> setDataNetwork(com.android.internal.telephony.data.DataNetwork p0) { return null; }
            public com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryEntry build() { return null; }
        }
    }

    public static class DataHandoverRetryRule extends com.android.internal.telephony.data.DataRetryManager.DataRetryRule {
        public DataHandoverRetryRule(java.lang.String p0) { super(null); }
        public java.lang.String toString() { return null; }
    }

    public static class DataRetryEntry {
        public static final int RETRY_STATE_NOT_RETRIED = 1;
        public static final int RETRY_STATE_FAILED = 2;
        public static final int RETRY_STATE_SUCCEEDED = 3;
        public static final int RETRY_STATE_CANCELLED = 4;
        public final com.android.internal.telephony.data.DataRetryManager.DataRetryRule appliedDataRetryRule = null;
        public final long retryDelayMillis = 0L;
        public final long retryElapsedTime = 0L;
        protected int mRetryState;
        protected long mRetryStateTimestamp;
        public DataRetryEntry(com.android.internal.telephony.data.DataRetryManager.DataRetryRule p0, long p1) {}
        public void setState(int p0) {}
        @com.android.internal.telephony.data.DataRetryManager.DataRetryEntry.DataRetryState
        public int getState() { return 0; }
        public static java.lang.String retryStateToString(int p0) { return null; }

        public static class Builder<T extends com.android.internal.telephony.data.DataRetryManager.DataRetryEntry.Builder<T>> {
            protected long mRetryDelayMillis;
            protected com.android.internal.telephony.data.DataRetryManager.DataRetryRule mAppliedDataRetryRule;
            public Builder() {}
            public T setRetryDelay(long p0) { return null; }
            public T setAppliedRetryRule(com.android.internal.telephony.data.DataRetryManager.DataRetryRule p0) { return null; }
        }

        public static @interface DataRetryState {
        }
    }

    public static class DataRetryManagerCallback extends com.android.internal.telephony.data.DataCallback {
        public DataRetryManagerCallback(java.util.concurrent.Executor p0) { super(null); }
        public void onDataNetworkSetupRetry(com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry p0) {}
        public void onDataNetworkHandoverRetry(com.android.internal.telephony.data.DataRetryManager.DataHandoverRetryEntry p0) {}
        public void onDataNetworkHandoverRetryStopped(com.android.internal.telephony.data.DataNetwork p0) {}
        public void onThrottleStatusChanged(java.util.List<android.telephony.data.ThrottleStatus> p0) {}
    }

    public static class DataRetryRule {
        protected java.util.List<java.lang.Long> mRetryIntervalsMillis;
        protected int mMaxRetries;
        protected java.util.Set<java.lang.Integer> mNetworkCapabilities;
        protected java.util.Set<java.lang.Integer> mFailCauses;
        public DataRetryRule(java.lang.String p0) {}
        public java.util.List<java.lang.Long> getRetryIntervalsMillis() { return null; }
        public int getMaxRetries() { return 0; }
        public java.util.Set<java.lang.Integer> getFailCauses() { return null; }
    }

    public static class DataSetupRetryEntry extends com.android.internal.telephony.data.DataRetryManager.DataRetryEntry {
        public static final int RETRY_TYPE_UNKNOWN = 0;
        public static final int RETRY_TYPE_DATA_PROFILE = 1;
        public static final int RETRY_TYPE_NETWORK_REQUESTS = 2;
        @com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry.SetupRetryType
        public final int setupRetryType = 0;
        public final com.android.internal.telephony.data.DataNetworkController.NetworkRequestList networkRequestList = null;
        public final android.telephony.data.DataProfile dataProfile = null;
        public final int transport = 0;
        DataSetupRetryEntry() { super(null, 0L); }
        public java.lang.String toString() { return null; }

        public static class Builder<T extends com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry.Builder<T>> extends com.android.internal.telephony.data.DataRetryManager.DataRetryEntry.Builder<T> {
            public Builder() { super(); }
            public com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry.Builder<T> setSetupRetryType(int p0) { return null; }
            public com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry.Builder<T> setNetworkRequestList(com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p0) { return null; }
            public com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry.Builder<T> setDataProfile(android.telephony.data.DataProfile p0) { return null; }
            public com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry.Builder<T> setTransport(int p0) { return null; }
            public com.android.internal.telephony.data.DataRetryManager.DataSetupRetryEntry build() { return null; }
        }

        public static @interface SetupRetryType {
        }
    }

    public static class DataSetupRetryRule extends com.android.internal.telephony.data.DataRetryManager.DataRetryRule {
        public DataSetupRetryRule(java.lang.String p0) { super(null); }
        public java.util.Set<java.lang.Integer> getNetworkCapabilities() { return null; }
        public boolean isPermanentFailCauseRule() { return false; }
        public boolean canBeMatched(int p0, int p1) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class DataThrottlingEntry {
        public final android.telephony.data.DataProfile dataProfile = null;
        public final com.android.internal.telephony.data.DataNetworkController.NetworkRequestList networkRequestList = null;
        public final com.android.internal.telephony.data.DataNetwork dataNetwork = null;
        public final int transport = 0;
        @android.telephony.data.ThrottleStatus.RetryType
        public final int retryType = 0;
        public final long expirationTimeMillis = 0L;
        public DataThrottlingEntry(android.telephony.data.DataProfile p0, com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p1, com.android.internal.telephony.data.DataNetwork p2, int p3, int p4, long p5) {}
        public java.lang.String toString() { return null; }
    }

    public static @interface RetryResetReason {
    }
}
