package com.android.internal.telephony.metrics;

public class SatelliteStats {
    public SatelliteStats() {}
    public static com.android.internal.telephony.metrics.SatelliteStats getInstance() { return null; }
    public synchronized void onSatelliteControllerMetrics(com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams p0) {}
    public synchronized void onSatelliteSessionMetrics(com.android.internal.telephony.metrics.SatelliteStats.SatelliteSessionParams p0) {}
    public synchronized void onSatelliteIncomingDatagramMetrics(com.android.internal.telephony.metrics.SatelliteStats.SatelliteIncomingDatagramParams p0) {}
    public synchronized void onSatelliteOutgoingDatagramMetrics(com.android.internal.telephony.metrics.SatelliteStats.SatelliteOutgoingDatagramParams p0) {}
    public synchronized void onSatelliteProvisionMetrics(com.android.internal.telephony.metrics.SatelliteStats.SatelliteProvisionParams p0) {}
    public synchronized void onSatelliteSosMessageRecommender(com.android.internal.telephony.metrics.SatelliteStats.SatelliteSosMessageRecommenderParams p0) {}

    public class SatelliteControllerParams {
        public int getCountOfSatelliteServiceEnablementsSuccess() { return 0; }
        public int getCountOfSatelliteServiceEnablementsFail() { return 0; }
        public int getCountOfOutgoingDatagramSuccess() { return 0; }
        public int getCountOfOutgoingDatagramFail() { return 0; }
        public int getCountOfIncomingDatagramSuccess() { return 0; }
        public int getCountOfIncomingDatagramFail() { return 0; }
        public int getCountOfDatagramTypeSosSmsSuccess() { return 0; }
        public int getCountOfDatagramTypeSosSmsFail() { return 0; }
        public int getCountOfDatagramTypeLocationSharingSuccess() { return 0; }
        public int getCountOfDatagramTypeLocationSharingFail() { return 0; }
        public int getCountOfProvisionSuccess() { return 0; }
        public int getCountOfProvisionFail() { return 0; }
        public int getCountOfDeprovisionSuccess() { return 0; }
        public int getCountOfDeprovisionFail() { return 0; }
        public int getTotalServiceUptimeSec() { return 0; }
        public int getTotalBatteryConsumptionPercent() { return 0; }
        public int getTotalBatteryChargedTimeSec() { return 0; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder() {}
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfSatelliteServiceEnablementsSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfSatelliteServiceEnablementsFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfOutgoingDatagramSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfOutgoingDatagramFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfIncomingDatagramSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfIncomingDatagramFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfDatagramTypeSosSmsSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfDatagramTypeSosSmsFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfDatagramTypeLocationSharingSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfDatagramTypeLocationSharingFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfProvisionSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfProvisionFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfDeprovisionSuccess(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setCountOfDeprovisionFail(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setTotalServiceUptimeSec(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setTotalBatteryConsumptionPercent(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams.Builder setTotalBatteryChargedTimeSec(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteControllerParams build() { return null; }
        }
    }

    public class SatelliteIncomingDatagramParams {
        public int getResultCode() { return 0; }
        public int getDatagramSizeBytes() { return 0; }
        public long getDatagramTransferTimeMillis() { return 0L; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder() {}
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteIncomingDatagramParams.Builder setResultCode(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteIncomingDatagramParams.Builder setDatagramSizeBytes(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteIncomingDatagramParams.Builder setDatagramTransferTimeMillis(long p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteIncomingDatagramParams build() { return null; }
        }
    }

    public class SatelliteOutgoingDatagramParams {
        public int getDatagramType() { return 0; }
        public int getResultCode() { return 0; }
        public int getDatagramSizeBytes() { return 0; }
        public long getDatagramTransferTimeMillis() { return 0L; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder() {}
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteOutgoingDatagramParams.Builder setDatagramType(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteOutgoingDatagramParams.Builder setResultCode(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteOutgoingDatagramParams.Builder setDatagramSizeBytes(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteOutgoingDatagramParams.Builder setDatagramTransferTimeMillis(long p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteOutgoingDatagramParams build() { return null; }
        }
    }

    public class SatelliteProvisionParams {
        public int getResultCode() { return 0; }
        public int getProvisioningTimeSec() { return 0; }
        public boolean getIsProvisionRequest() { return false; }
        public boolean getIsCanceled() { return false; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder() {}
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteProvisionParams.Builder setResultCode(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteProvisionParams.Builder setProvisioningTimeSec(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteProvisionParams.Builder setIsProvisionRequest(boolean p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteProvisionParams.Builder setIsCanceled(boolean p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteProvisionParams build() { return null; }
        }
    }

    public class SatelliteSessionParams {
        public int getSatelliteServiceInitializationResult() { return 0; }
        public int getSatelliteTechnology() { return 0; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder() {}
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSessionParams.Builder setSatelliteServiceInitializationResult(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSessionParams.Builder setSatelliteTechnology(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSessionParams build() { return null; }
        }
    }

    public class SatelliteSosMessageRecommenderParams {
        public boolean isDisplaySosMessageSent() { return false; }
        public int getCountOfTimerStarted() { return 0; }
        public boolean isImsRegistered() { return false; }
        public int getCellularServiceState() { return 0; }
        public java.lang.String toString() { return null; }

        public static class Builder {
            public Builder() {}
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSosMessageRecommenderParams.Builder setDisplaySosMessageSent(boolean p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSosMessageRecommenderParams.Builder setCountOfTimerStarted(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSosMessageRecommenderParams.Builder setImsRegistered(boolean p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSosMessageRecommenderParams.Builder setCellularServiceState(int p0) { return null; }
            public com.android.internal.telephony.metrics.SatelliteStats.SatelliteSosMessageRecommenderParams build() { return null; }
        }
    }
}
