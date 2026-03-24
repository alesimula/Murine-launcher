package com.android.internal.telephony.data;

public class DataEvaluation {
    public DataEvaluation(com.android.internal.telephony.data.DataEvaluation.DataEvaluationReason p0) {}
    public void addDataDisallowedReason(com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason p0) {}
    public void removeDataDisallowedReason(com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason p0) {}
    public void addDataAllowedReason(com.android.internal.telephony.data.DataEvaluation.DataAllowedReason p0) {}
    public java.util.List<com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason> getDataDisallowedReasons() { return null; }
    public com.android.internal.telephony.data.DataEvaluation.DataAllowedReason getDataAllowedReason() { return null; }
    public void setCandidateDataProfile(android.telephony.data.DataProfile p0) {}
    public android.telephony.data.DataProfile getCandidateDataProfile() { return null; }
    public boolean containsDisallowedReasons() { return false; }
    public boolean contains(com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason p0) { return false; }
    public boolean containsOnly(com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason p0) { return false; }
    public boolean containsAny(com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason... p0) { return false; }
    public boolean contains(com.android.internal.telephony.data.DataEvaluation.DataAllowedReason p0) { return false; }
    public boolean containsHardDisallowedReasons() { return false; }
    public java.lang.String toString() { return null; }

    public static enum DataAllowedReason {
        NONE,
        NORMAL,
        IN_VOICE_CALL,
        UNMETERED_USAGE,
        MMS_REQUEST,
        RESTRICTED_REQUEST,
        EMERGENCY_SUPL,
        EMERGENCY_REQUEST;
    }

    public static enum DataDisallowedReason {
        DATA_DISABLED,
        ROAMING_DISABLED,
        DEFAULT_DATA_UNSELECTED,
        NOT_IN_SERVICE,
        DATA_CONFIG_NOT_READY,
        SIM_NOT_READY,
        CONCURRENT_VOICE_DATA_NOT_ALLOWED,
        DATA_RESTRICTED_BY_NETWORK,
        RADIO_POWER_OFF,
        PENDING_TEAR_DOWN_ALL,
        RADIO_DISABLED_BY_CARRIER,
        DATA_SERVICE_NOT_READY,
        NO_SUITABLE_DATA_PROFILE,
        DATA_NETWORK_TYPE_NOT_ALLOWED,
        CDMA_EMERGENCY_CALLBACK_MODE,
        RETRY_SCHEDULED,
        DATA_THROTTLED,
        DATA_PROFILE_INVALID,
        DATA_PROFILE_NOT_PREFERRED,
        NOT_ALLOWED_BY_POLICY,
        ILLEGAL_STATE,
        VOPS_NOT_SUPPORTED,
        ONLY_ALLOWED_SINGLE_NETWORK,
        DATA_SETTINGS_NOT_READY,
        HANDOVER_RETRY_STOPPED;
        public boolean isHardReason() { return false; }
    }

    public static enum DataEvaluationReason {
        NEW_REQUEST,
        DATA_CONFIG_CHANGED,
        SIM_LOADED,
        SIM_REMOVAL,
        DATA_PROFILES_CHANGED,
        DATA_SERVICE_STATE_CHANGED,
        DATA_ENABLED_CHANGED,
        DATA_ENABLED_OVERRIDE_CHANGED,
        ROAMING_ENABLED_CHANGED,
        VOICE_CALL_ENDED,
        DATA_RESTRICTED_CHANGED,
        DATA_NETWORK_CAPABILITIES_CHANGED,
        EMERGENCY_CALL_CHANGED,
        RETRY_AFTER_DISCONNECTED,
        DATA_RETRY,
        DATA_HANDOVER,
        PREFERRED_TRANSPORT_CHANGED,
        SLICE_CONFIG_CHANGED,
        SRVCC_STATE_CHANGED,
        SINGLE_DATA_NETWORK_ARBITRATION,
        EXTERNAL_QUERY,
        TAC_CHANGED,
        UNSATISFIED_REQUEST_DETACHED;
        public boolean isConditionBased() { return false; }
    }
}
