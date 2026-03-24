package android.telephony;

public class ServiceState implements android.os.Parcelable {
    static final java.lang.String LOG_TAG = "PHONE";
    static final boolean DBG = false;
    static final boolean VDBG = false;
    public static final int STATE_IN_SERVICE = 0;
    public static final int STATE_OUT_OF_SERVICE = 1;
    public static final int STATE_EMERGENCY_ONLY = 2;
    public static final int STATE_POWER_OFF = 3;
    public static final int FREQUENCY_RANGE_UNKNOWN = -1;
    public static final int FREQUENCY_RANGE_LOW = 1;
    public static final int FREQUENCY_RANGE_MID = 2;
    public static final int FREQUENCY_RANGE_HIGH = 3;
    public static final int FREQUENCY_RANGE_MMWAVE = 4;
    private static final java.util.List<java.lang.Integer> FREQUENCY_RANGE_ORDER = null;
    public static final int DUPLEX_MODE_UNKNOWN = 0;
    public static final int DUPLEX_MODE_FDD = 1;
    public static final int DUPLEX_MODE_TDD = 2;
    public static final int RIL_RADIO_TECHNOLOGY_UNKNOWN = 0;
    public static final int RIL_RADIO_TECHNOLOGY_GPRS = 1;
    public static final int RIL_RADIO_TECHNOLOGY_EDGE = 2;
    public static final int RIL_RADIO_TECHNOLOGY_UMTS = 3;
    public static final int RIL_RADIO_TECHNOLOGY_IS95A = 4;
    public static final int RIL_RADIO_TECHNOLOGY_IS95B = 5;
    public static final int RIL_RADIO_TECHNOLOGY_1xRTT = 6;
    public static final int RIL_RADIO_TECHNOLOGY_EVDO_0 = 7;
    public static final int RIL_RADIO_TECHNOLOGY_EVDO_A = 8;
    public static final int RIL_RADIO_TECHNOLOGY_HSDPA = 9;
    public static final int RIL_RADIO_TECHNOLOGY_HSUPA = 10;
    public static final int RIL_RADIO_TECHNOLOGY_HSPA = 11;
    public static final int RIL_RADIO_TECHNOLOGY_EVDO_B = 12;
    public static final int RIL_RADIO_TECHNOLOGY_EHRPD = 13;
    public static final int RIL_RADIO_TECHNOLOGY_LTE = 14;
    public static final int RIL_RADIO_TECHNOLOGY_HSPAP = 15;
    public static final int RIL_RADIO_TECHNOLOGY_GSM = 16;
    public static final int RIL_RADIO_TECHNOLOGY_TD_SCDMA = 17;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final int RIL_RADIO_TECHNOLOGY_IWLAN = 18;
    public static final int RIL_RADIO_TECHNOLOGY_LTE_CA = 19;
    public static final int RIL_RADIO_TECHNOLOGY_NR = 20;
    private static final int NEXT_RIL_RADIO_TECHNOLOGY = 21;
    public static final int RIL_RADIO_CDMA_TECHNOLOGY_BITMASK = 6392;
    private int mVoiceRegState;
    private int mDataRegState;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_NOT_ROAMING = 0;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_UNKNOWN = 1;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_DOMESTIC = 2;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_INTERNATIONAL = 3;
    public static final int UNKNOWN_ID = -1;
    private java.lang.String mVoiceOperatorAlphaLong;
    private java.lang.String mVoiceOperatorAlphaShort;
    private java.lang.String mVoiceOperatorNumeric;
    private java.lang.String mDataOperatorAlphaLong;
    private java.lang.String mDataOperatorAlphaShort;
    private java.lang.String mDataOperatorNumeric;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private boolean mIsManualNetworkSelection;
    private boolean mIsEmergencyOnly;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private boolean mCssIndicator;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mNetworkId;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mSystemId;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mCdmaRoamingIndicator;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mCdmaDefaultRoamingIndicator;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mCdmaEriIconIndex;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mCdmaEriIconMode;
    private int mNrFrequencyRange;
    private int mChannelNumber;
    private int[] mCellBandwidths;
    private int mLteEarfcnRsrpBoost;
    private final java.util.List<android.telephony.NetworkRegistrationInfo> mNetworkRegistrationInfos = null;
    private java.lang.String mOperatorAlphaLongRaw;
    private java.lang.String mOperatorAlphaShortRaw;
    private boolean mIsIwlanPreferred;
    public static final android.os.Parcelable.Creator<android.telephony.ServiceState> CREATOR = null;
    public static final java.lang.String getRoamingLogString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.telephony.ServiceState newFromBundle(android.os.Bundle p0) { return null; }
    public ServiceState() {}
    public ServiceState(android.telephony.ServiceState p0) {}
    protected void copyFrom(android.telephony.ServiceState p0) {}
    @java.lang.Deprecated
    public ServiceState(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getState() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getVoiceRegState() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getDataRegState() { return 0; }
    public int getDuplexMode() { return 0; }
    public int getChannelNumber() { return 0; }
    public int[] getCellBandwidths() { return null; }
    public boolean getRoaming() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean getVoiceRoaming() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getVoiceRoamingType() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean getDataRoaming() { return false; }
    public boolean getDataRoamingFromRegistration() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getDataRoamingType() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean isEmergencyOnly() { return false; }
    @android.annotation.UnsupportedAppUsage
    public int getCdmaRoamingIndicator() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getCdmaDefaultRoamingIndicator() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getCdmaEriIconIndex() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getCdmaEriIconMode() { return 0; }
    public java.lang.String getOperatorAlphaLong() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getVoiceOperatorAlphaLong() { return null; }
    public java.lang.String getDataOperatorAlphaLong() { return null; }
    public java.lang.String getOperatorAlphaShort() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getVoiceOperatorAlphaShort() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDataOperatorAlphaShort() { return null; }
    public java.lang.String getOperatorAlpha() { return null; }
    public java.lang.String getOperatorNumeric() { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public java.lang.String getVoiceOperatorNumeric() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getDataOperatorNumeric() { return null; }
    public boolean getIsManualSelection() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public static java.lang.String roamingTypeToString(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String rilRadioTechnologyToString(int p0) { return null; }
    public static java.lang.String rilServiceStateToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    private void init() {}
    public void setStateOutOfService() {}
    public void setStateOff() {}
    public void setState(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setVoiceRegState(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setDataRegState(int p0) {}
    public void setCellBandwidths(int[] p0) {}
    public void setChannelNumber(int p0) {}
    public void setRoaming(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setVoiceRoaming(boolean p0) {}
    public void setVoiceRoamingType(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setDataRoaming(boolean p0) {}
    public void setDataRoamingType(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setEmergencyOnly(boolean p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setCdmaRoamingIndicator(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setCdmaDefaultRoamingIndicator(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setCdmaEriIconIndex(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setCdmaEriIconMode(int p0) {}
    public void setOperatorName(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void setVoiceOperatorName(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void setDataOperatorName(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    public void setOperatorAlphaLong(java.lang.String p0) {}
    public void setVoiceOperatorAlphaLong(java.lang.String p0) {}
    public void setDataOperatorAlphaLong(java.lang.String p0) {}
    public void setIsManualSelection(boolean p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static boolean equalsHandlesNulls(java.lang.Object p0, java.lang.Object p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    private void setFromNotifierBundle(android.os.Bundle p0) {}
    @android.annotation.UnsupportedAppUsage
    public void fillInNotifierBundle(android.os.Bundle p0) {}
    public void setRilVoiceRadioTechnology(int p0) {}
    public void setRilDataRadioTechnology(int p0) {}
    public boolean isUsingCarrierAggregation() { return false; }
    public void setIsUsingCarrierAggregation(boolean p0) {}
    public int getNrFrequencyRange() { return 0; }
    public int getNrState() { return 0; }
    public void setNrFrequencyRange(int p0) {}
    public int getLteEarfcnRsrpBoost() { return 0; }
    public void setLteEarfcnRsrpBoost(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public void setCssIndicator(int p0) {}
    public void setCdmaSystemAndNetworkId(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getRilVoiceRadioTechnology() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getRilDataRadioTechnology() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getRadioTechnology() { return 0; }
    public static int rilRadioTechnologyToNetworkType(int p0) { return 0; }
    public static int rilRadioTechnologyToAccessNetworkType(int p0) { return 0; }
    public static int networkTypeToRilRadioTechnology(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getDataNetworkType() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getVoiceNetworkType() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public int getCssIndicator() { return 0; }
    public int getCdmaNetworkId() { return 0; }
    public int getCdmaSystemId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isGsm(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isCdma(int p0) { return false; }
    public static boolean isLte(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static boolean bearerBitmapHasCdma(int p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean bitmaskHasTech(int p0, int p1) { return false; }
    public static int getBitmaskForTech(int p0) { return 0; }
    public static int getBitmaskFromString(java.lang.String p0) { return 0; }
    public static int convertNetworkTypeBitmaskToBearerBitmask(int p0) { return 0; }
    public static int convertBearerBitmaskToNetworkTypeBitmask(int p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static android.telephony.ServiceState mergeServiceStates(android.telephony.ServiceState p0, android.telephony.ServiceState p1) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.NetworkRegistrationInfo> getNetworkRegistrationInfoList() { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.NetworkRegistrationInfo> getNetworkRegistrationInfoListForTransportType(int p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.telephony.NetworkRegistrationInfo> getNetworkRegistrationInfoListForDomain(int p0) { return null; }
    @android.annotation.SystemApi
    public android.telephony.NetworkRegistrationInfo getNetworkRegistrationInfo(int p0, int p1) { return null; }
    public void addNetworkRegistrationInfo(android.telephony.NetworkRegistrationInfo p0) {}
    public static final int getBetterNRFrequencyRange(int p0, int p1) { return 0; }
    public android.telephony.ServiceState sanitizeLocationInfo(boolean p0) { return null; }
    public void setOperatorAlphaLongRaw(java.lang.String p0) {}
    public java.lang.String getOperatorAlphaLongRaw() { return null; }
    public void setOperatorAlphaShortRaw(java.lang.String p0) {}
    public java.lang.String getOperatorAlphaShortRaw() { return null; }
    public void setIwlanPreferred(boolean p0) {}
    public boolean isIwlanPreferred() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RoamingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RilRadioTechnology {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrequencyRange {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DuplexMode {
    }
}
