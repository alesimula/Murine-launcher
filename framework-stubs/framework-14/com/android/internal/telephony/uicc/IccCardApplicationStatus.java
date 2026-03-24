package com.android.internal.telephony.uicc;

public class IccCardApplicationStatus {
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType app_type;
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppState app_state;
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState perso_substate;
    public java.lang.String aid;
    public java.lang.String app_label;
    public boolean pin1_replaced;
    public com.android.internal.telephony.uicc.IccCardStatus.PinState pin1;
    public com.android.internal.telephony.uicc.IccCardStatus.PinState pin2;
    public IccCardApplicationStatus() {}
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppType AppTypeFromRILInt(int p0) { return null; }
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.AppState AppStateFromRILInt(int p0) { return null; }
    public com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState PersoSubstateFromRILInt(int p0) { return null; }
    public com.android.internal.telephony.uicc.IccCardStatus.PinState PinStateFromRILInt(int p0) { return null; }
    public java.lang.String toString() { return null; }

    public static enum AppState {
        APPSTATE_UNKNOWN,
        APPSTATE_DETECTED,
        APPSTATE_PIN,
        APPSTATE_PUK,
        APPSTATE_SUBSCRIPTION_PERSO,
        APPSTATE_READY;
        boolean isPinRequired() { return false; }
        boolean isPukRequired() { return false; }
        boolean isSubscriptionPersoEnabled() { return false; }
        boolean isAppReady() { return false; }
        boolean isAppNotReady() { return false; }
    }

    public static enum AppType {
        APPTYPE_UNKNOWN,
        APPTYPE_SIM,
        APPTYPE_USIM,
        APPTYPE_RUIM,
        APPTYPE_CSIM,
        APPTYPE_ISIM;
    }

    public static enum PersoSubState {
        PERSOSUBSTATE_UNKNOWN,
        PERSOSUBSTATE_IN_PROGRESS,
        PERSOSUBSTATE_READY,
        PERSOSUBSTATE_SIM_NETWORK,
        PERSOSUBSTATE_SIM_NETWORK_SUBSET,
        PERSOSUBSTATE_SIM_CORPORATE,
        PERSOSUBSTATE_SIM_SERVICE_PROVIDER,
        PERSOSUBSTATE_SIM_SIM,
        PERSOSUBSTATE_SIM_NETWORK_PUK,
        PERSOSUBSTATE_SIM_NETWORK_SUBSET_PUK,
        PERSOSUBSTATE_SIM_CORPORATE_PUK,
        PERSOSUBSTATE_SIM_SERVICE_PROVIDER_PUK,
        PERSOSUBSTATE_SIM_SIM_PUK,
        PERSOSUBSTATE_RUIM_NETWORK1,
        PERSOSUBSTATE_RUIM_NETWORK2,
        PERSOSUBSTATE_RUIM_HRPD,
        PERSOSUBSTATE_RUIM_CORPORATE,
        PERSOSUBSTATE_RUIM_SERVICE_PROVIDER,
        PERSOSUBSTATE_RUIM_RUIM,
        PERSOSUBSTATE_RUIM_NETWORK1_PUK,
        PERSOSUBSTATE_RUIM_NETWORK2_PUK,
        PERSOSUBSTATE_RUIM_HRPD_PUK,
        PERSOSUBSTATE_RUIM_CORPORATE_PUK,
        PERSOSUBSTATE_RUIM_SERVICE_PROVIDER_PUK,
        PERSOSUBSTATE_RUIM_RUIM_PUK,
        PERSOSUBSTATE_SIM_SPN,
        PERSOSUBSTATE_SIM_SPN_PUK,
        PERSOSUBSTATE_SIM_SP_EHPLMN,
        PERSOSUBSTATE_SIM_SP_EHPLMN_PUK,
        PERSOSUBSTATE_SIM_ICCID,
        PERSOSUBSTATE_SIM_ICCID_PUK,
        PERSOSUBSTATE_SIM_IMPI,
        PERSOSUBSTATE_SIM_IMPI_PUK,
        PERSOSUBSTATE_SIM_NS_SP,
        PERSOSUBSTATE_SIM_NS_SP_PUK;
        boolean isPersoSubStateUnknown() { return false; }
        public static boolean isPersoLocked(com.android.internal.telephony.uicc.IccCardApplicationStatus.PersoSubState p0) { return false; }
    }
}
