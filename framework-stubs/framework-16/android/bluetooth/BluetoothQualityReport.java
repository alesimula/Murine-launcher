package android.bluetooth;

public final class BluetoothQualityReport implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport> CREATOR = null;
    public static final int QUALITY_REPORT_ID_A2DP_CHOPPY = 3;
    public static final int QUALITY_REPORT_ID_APPROACH_LSTO = 2;
    public static final int QUALITY_REPORT_ID_CONN_FAIL = 8;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
    public static final int QUALITY_REPORT_ID_ENERGY_MONITOR = 6;
    public static final int QUALITY_REPORT_ID_MONITOR = 1;
    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
    public static final int QUALITY_REPORT_ID_RF_STATS = 9;
    public static final int QUALITY_REPORT_ID_SCO_CHOPPY = 4;
    BluetoothQualityReport() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothClass getBluetoothClass() { return null; }
    @android.annotation.Nullable
    public android.bluetooth.BluetoothQualityReport.BqrCommon getBqrCommon() { return null; }
    @android.annotation.Nullable
    public android.os.Parcelable getBqrEvent() { return null; }
    public int getLmpSubVersion() { return 0; }
    public int getLmpVersion() { return 0; }
    public int getManufacturerId() { return 0; }
    public int getQualityReportId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getRemoteAddress() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRemoteName() { return null; }
    @android.annotation.NonNull
    public static java.lang.String qualityReportIdToString(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class BqrCommon implements android.os.Parcelable {
        public static final int CONNECTION_ROLE_CENTRAL = 0;
        public static final int CONNECTION_ROLE_PERIPHERAL = 1;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrCommon> CREATOR = null;
        BqrCommon() {}
        @android.annotation.NonNull
        public static java.lang.String connectionRoleToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public int getAfhSelectUnidealChannelCount() { return 0; }
        public int getCalFailedItemCount() { return 0; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public int getCoexInfoMask() { return 0; }
        public int getConnectionHandle() { return 0; }
        public int getConnectionRole() { return 0; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getCrcErrorPackets() { return 0L; }
        public long getFlowOffCount() { return 0L; }
        public long getLastFlowOnTimestamp() { return 0L; }
        public long getLastTxAckTimestamp() { return 0L; }
        public int getLsto() { return 0; }
        public long getNakCount() { return 0L; }
        public long getNoRxCount() { return 0L; }
        public long getOverflowCount() { return 0L; }
        public int getPacketType() { return 0; }
        public long getPiconetClock() { return 0L; }
        public long getRetransmissionCount() { return 0L; }
        public int getRssi() { return 0; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getRxDupPackets() { return 0L; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getRxUnRecvPackets() { return 0L; }
        public int getSnr() { return 0; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getTxFlushPackets() { return 0L; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getTxLastSubeventPackets() { return 0L; }
        public int getTxPowerLevel() { return 0; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getTxTotalPackets() { return 0L; }
        @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
        public long getTxUnackPackets() { return 0L; }
        public long getUnderflowCount() { return 0L; }
        public int getUnusedAfhChannelCount() { return 0; }
        @android.annotation.Nullable
        public static java.lang.String packetTypeToString(int p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class BqrConnectFail implements android.os.Parcelable {
        public static final int CONNECT_FAIL_ID_ACL_ALREADY_EXIST = 11;
        public static final int CONNECT_FAIL_ID_CONNECTION_TIMEOUT = 8;
        public static final int CONNECT_FAIL_ID_CONTROLLER_BUSY = 58;
        public static final int CONNECT_FAIL_ID_NO_ERROR = 0;
        public static final int CONNECT_FAIL_ID_PAGE_TIMEOUT = 4;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrConnectFail> CREATOR = null;
        BqrConnectFail() {}
        @android.annotation.NonNull
        public static java.lang.String connectFailIdToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public int getFailReason() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
    public static final class BqrEnergyMonitor implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrEnergyMonitor> CREATOR = null;
        BqrEnergyMonitor() {}
        public int describeContents() { return 0; }
        public long getActiveStateEnterCount() { return 0L; }
        public long getActiveStateTotalTimeMillis() { return 0L; }
        public int getAverageCurrentConsumptionMicroamps() { return 0; }
        public int getBredrAverageTxPowerLeveldBm() { return 0; }
        public long getBredrRxStateEnterCount() { return 0L; }
        public long getBredrRxTotalTimeMillis() { return 0L; }
        public long getBredrTxStateEnterCount() { return 0L; }
        public long getBredrTxTotalTimeMillis() { return 0L; }
        public long getIdleStateEnterCount() { return 0L; }
        public long getIdleStateTotalTimeMillis() { return 0L; }
        public int getLeAverageTxPowerLeveldBm() { return 0; }
        public long getLeRxStateEnterCount() { return 0L; }
        public long getLeRxTotalTimeMillis() { return 0L; }
        public long getLeTsTotalTimeMillis() { return 0L; }
        public long getLeTxStateEnterCount() { return 0L; }
        public long getPowerDataTotalTimeMillis() { return 0L; }
        public long getRxDualChainActiveDurationMillis() { return 0L; }
        public long getRxSingleChainActiveDurationMillis() { return 0L; }
        public long getTxExternalPaDualChainActiveDurationMillis() { return 0L; }
        public long getTxExternalPaSingleChainActiveDurationMillis() { return 0L; }
        public long getTxInternalPaDualChainActiveDurationMillis() { return 0L; }
        public long getTxInternalPaSingleChainActiveDurationMillis() { return 0L; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @android.annotation.FlaggedApi("com.android.bluetooth.flags.support_bluetooth_quality_report_v6")
    public static final class BqrRfStats implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrRfStats> CREATOR = null;
        BqrRfStats() {}
        public int describeContents() { return 0; }
        public int getExtensionInfo() { return 0; }
        public long getPacketsWithRssi50To55dBm() { return 0L; }
        public long getPacketsWithRssi55To60dBm() { return 0L; }
        public long getPacketsWithRssi60To65dBm() { return 0L; }
        public long getPacketsWithRssi65To70dBm() { return 0L; }
        public long getPacketsWithRssi70To75dBm() { return 0L; }
        public long getPacketsWithRssi75To80dBm() { return 0L; }
        public long getPacketsWithRssi80To85dBm() { return 0L; }
        public long getPacketsWithRssi85To90dBm() { return 0L; }
        public long getPacketsWithRssiAboveMinus50dBm() { return 0L; }
        public long getPacketsWithRssiBelowMinus90dBm() { return 0L; }
        public long getPacketsWithRssiDelta2To5dBm() { return 0L; }
        public long getPacketsWithRssiDelta5To8dBm() { return 0L; }
        public long getPacketsWithRssiDelta8To11dBm() { return 0L; }
        public long getPacketsWithRssiDeltaAbove11dBm() { return 0L; }
        public long getPacketsWithRssiDeltaBelow2dBm() { return 0L; }
        public long getPerformanceDurationMillis() { return 0L; }
        public long getTxPowerExternalPaBeamformingCount() { return 0L; }
        public long getTxPowerExternalPaDiversityCount() { return 0L; }
        public long getTxPowerInternalPaBeamformingCount() { return 0L; }
        public long getTxPowerInternalPaDiversityCount() { return 0L; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class BqrVsA2dpChoppy implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrVsA2dpChoppy> CREATOR = null;
        BqrVsA2dpChoppy() {}
        public int describeContents() { return 0; }
        public int getAclTxQueueLength() { return 0; }
        public long getArrivalTime() { return 0L; }
        public int getGlitchCount() { return 0; }
        public int getLinkQuality() { return 0; }
        public int getRxCxmDenials() { return 0; }
        public long getScheduleTime() { return 0L; }
        public int getTxCxmDenials() { return 0; }
        @android.annotation.Nullable
        public static java.lang.String linkQualityToString(int p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class BqrVsLsto implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrVsLsto> CREATOR = null;
        BqrVsLsto() {}
        @android.annotation.Nullable
        public static java.lang.String connStateToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public long getBasebandStats() { return 0L; }
        public int getConnState() { return 0; }
        public int getCxmDenials() { return 0; }
        public long getLastTxAckTimestamp() { return 0L; }
        public long getNativeClock() { return 0L; }
        public int getRfLoss() { return 0; }
        public long getSlotsUsed() { return 0L; }
        public int getTxSkipped() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class BqrVsScoChoppy implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.bluetooth.BluetoothQualityReport.BqrVsScoChoppy> CREATOR = null;
        BqrVsScoChoppy() {}
        @android.annotation.Nullable
        public static java.lang.String airFormatToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public int getAirFormat() { return 0; }
        public int getGlitchCount() { return 0; }
        public int getGoodRxFrameCount() { return 0; }
        public int getInstanceCount() { return 0; }
        public int getIntervalEsco() { return 0; }
        public int getLateDispatch() { return 0; }
        public int getLpaIntrMiss() { return 0; }
        public int getMicIntrMiss() { return 0; }
        public int getMissedInstanceCount() { return 0; }
        public int getPlcDiscardCount() { return 0; }
        public int getPlcFillCount() { return 0; }
        public int getRxCxmDenials() { return 0; }
        public int getRxRetransmitSlotCount() { return 0; }
        public int getSprIntrMiss() { return 0; }
        public int getTxAbortCount() { return 0; }
        public int getTxCxmDenials() { return 0; }
        public int getTxRetransmitSlotCount() { return 0; }
        public int getWindowEsco() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Builder {
        public Builder(byte[] p0) {}
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport.Builder setBluetoothClass(android.bluetooth.BluetoothClass p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport.Builder setLmpSubVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport.Builder setLmpVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport.Builder setManufacturerId(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport.Builder setRemoteAddress(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.BluetoothQualityReport.Builder setRemoteName(java.lang.String p0) { return null; }
    }
}
