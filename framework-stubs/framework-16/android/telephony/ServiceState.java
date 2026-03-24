package android.telephony;

public class ServiceState implements android.os.Parcelable {
    static final java.lang.String LOG_TAG = "PHONE";
    static final boolean DBG = false;
    static final boolean VDBG = false;
    public static final int STATE_IN_SERVICE = 0;
    public static final int STATE_OUT_OF_SERVICE = 1;
    public static final int STATE_EMERGENCY_ONLY = 2;
    public static final int STATE_POWER_OFF = 3;
    public static final int FREQUENCY_RANGE_UNKNOWN = 0;
    public static final int FREQUENCY_RANGE_LOW = 1;
    public static final int FREQUENCY_RANGE_MID = 2;
    public static final int FREQUENCY_RANGE_HIGH = 3;
    public static final int FREQUENCY_RANGE_MMWAVE = 4;
    public static final int FREQUENCY_RANGE_COUNT = 5;
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
    public static final int RIL_RADIO_TECHNOLOGY_IWLAN = 18;
    public static final int RIL_RADIO_TECHNOLOGY_LTE_CA = 19;
    public static final int RIL_RADIO_TECHNOLOGY_NR = 20;
    public static final int RIL_RADIO_CDMA_TECHNOLOGY_BITMASK = 6392;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_NOT_ROAMING = 0;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_UNKNOWN = 1;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_DOMESTIC = 2;
    @android.annotation.SystemApi
    public static final int ROAMING_TYPE_INTERNATIONAL = 3;
    public static final int UNKNOWN_ID = -1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.ServiceState> CREATOR = null;
    public static final java.lang.String getRoamingLogString(int p0) { return null; }
    @android.annotation.NonNull
    public static android.telephony.ServiceState newFromBundle(android.os.Bundle p0) { return null; }
    public ServiceState() {}
    public ServiceState(android.telephony.ServiceState p0) {}
    protected void copyFrom(android.telephony.ServiceState p0) {}
    @java.lang.Deprecated
    public ServiceState(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getState() { return 0; }
    public int getVoiceRegState() { return 0; }
    public int getDataRegState() { return 0; }
    public int getDataRegistrationState() { return 0; }
    public int getDuplexMode() { return 0; }
    public int getChannelNumber() { return 0; }
    public int[] getCellBandwidths() { return null; }
    public boolean getRoaming() { return false; }
    public boolean getVoiceRoaming() { return false; }
    public int getVoiceRoamingType() { return 0; }
    public boolean getDataRoaming() { return false; }
    public void setDataRoamingFromRegistration(boolean p0) {}
    public boolean getDataRoamingFromRegistration() { return false; }
    public int getDataRoamingType() { return 0; }
    public boolean isEmergencyOnly() { return false; }
    public int getCdmaRoamingIndicator() { return 0; }
    public int getCdmaDefaultRoamingIndicator() { return 0; }
    public int getCdmaEriIconIndex() { return 0; }
    public int getCdmaEriIconMode() { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getOperatorAlphaLong() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getVoiceOperatorAlphaLong() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getOperatorAlphaShort() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getVoiceOperatorAlphaShort() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getDataOperatorAlphaShort() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getOperatorAlpha() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getOperatorNumeric() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getVoiceOperatorNumeric() { return null; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public java.lang.String getDataOperatorNumeric() { return null; }
    public boolean getIsManualSelection() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public static java.lang.String roamingTypeToString(int p0) { return null; }
    public static java.lang.String rilRadioTechnologyToString(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String frequencyRangeToString(int p0) { return null; }
    public static java.lang.String rilServiceStateToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public void setStateOutOfService() {}
    public void setStateOff() {}
    public void setOutOfService(boolean p0) {}
    public void setState(int p0) {}
    public void setVoiceRegState(int p0) {}
    public void setDataRegState(int p0) {}
    public void setCellBandwidths(int[] p0) {}
    public void setChannelNumber(int p0) {}
    public void setRoaming(boolean p0) {}
    public void setVoiceRoaming(boolean p0) {}
    public void setVoiceRoamingType(int p0) {}
    public void setDataRoaming(boolean p0) {}
    public void setDataRoamingType(int p0) {}
    public void setEmergencyOnly(boolean p0) {}
    public void setCdmaRoamingIndicator(int p0) {}
    public void setCdmaDefaultRoamingIndicator(int p0) {}
    public void setCdmaEriIconIndex(int p0) {}
    public void setCdmaEriIconMode(int p0) {}
    public void setOperatorName(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void setOperatorAlphaLong(java.lang.String p0) {}
    public void setIsManualSelection(boolean p0) {}
    public void fillInNotifierBundle(android.os.Bundle p0) {}
    public void setRilVoiceRadioTechnology(int p0) {}
    public void setRilDataRadioTechnology(int p0) {}
    public boolean isUsingCarrierAggregation() { return false; }
    public int getNrFrequencyRange() { return 0; }
    public int getNrState() { return 0; }
    public void setNrFrequencyRange(int p0) {}
    public int getArfcnRsrpBoost() { return 0; }
    public void setArfcnRsrpBoost(int p0) {}
    public void setCssIndicator(int p0) {}
    public void setCdmaSystemAndNetworkId(int p0, int p1) {}
    public int getRilVoiceRadioTechnology() { return 0; }
    public int getRilDataRadioTechnology() { return 0; }
    public static int rilRadioTechnologyToNetworkType(int p0) { return 0; }
    public static int rilRadioTechnologyToAccessNetworkType(int p0) { return 0; }
    public static int networkTypeToRilRadioTechnology(int p0) { return 0; }
    public int getDataNetworkType() { return 0; }
    public int getVoiceNetworkType() { return 0; }
    public int getCssIndicator() { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public int getCdmaNetworkId() { return 0; }
    @android.annotation.RequiresPermission(anyOf={"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})
    public int getCdmaSystemId() { return 0; }
    public static boolean isGsm(int p0) { return false; }
    public static boolean isCdma(int p0) { return false; }
    public static boolean isPsOnlyTech(int p0) { return false; }
    public static boolean bearerBitmapHasCdma(int p0) { return false; }
    public static boolean bitmaskHasTech(int p0, int p1) { return false; }
    public static int getBitmaskForTech(int p0) { return 0; }
    public static int getBitmaskFromString(java.lang.String p0) { return 0; }
    public static int convertNetworkTypeBitmaskToBearerBitmask(int p0) { return 0; }
    public static int convertBearerBitmaskToNetworkTypeBitmask(int p0) { return 0; }
    public static android.telephony.ServiceState mergeServiceStates(android.telephony.ServiceState p0, android.telephony.ServiceState p1) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.telephony.NetworkRegistrationInfo> getNetworkRegistrationInfoList() { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<android.telephony.NetworkRegistrationInfo> getNetworkRegistrationInfoListForTransportType(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public java.util.List<android.telephony.NetworkRegistrationInfo> getNetworkRegistrationInfoListForDomain(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.telephony.NetworkRegistrationInfo getNetworkRegistrationInfo(int p0, int p1) { return null; }
    public void addNetworkRegistrationInfo(android.telephony.NetworkRegistrationInfo p0) {}
    @android.annotation.NonNull
    public android.telephony.ServiceState createLocationInfoSanitizedCopy(boolean p0) { return null; }
    public void setOperatorAlphaLongRaw(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getOperatorAlphaLongRaw() { return null; }
    public void setOperatorAlphaShortRaw(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getOperatorAlphaShortRaw() { return null; }
    public void setIwlanPreferred(boolean p0) {}
    public boolean isIwlanPreferred() { return false; }
    public boolean isSearching() { return false; }
    public static boolean isFrequencyRangeValid(int p0) { return false; }
    public boolean isUsingNonTerrestrialNetwork() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DuplexMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrequencyRange {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RegState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RilRadioTechnology {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RoamingType {
    }
}
