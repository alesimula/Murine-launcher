package android.hardware.radio.network;

public interface IRadioNetworkResponse extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "57e8e923513d80a26102e450d335e89b4346be66";
    public static final java.lang.String DESCRIPTOR = null;
    public void acknowledgeRequest(int p0) throws android.os.RemoteException;
    public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) throws android.os.RemoteException;
    public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.OperatorInfo[] p1) throws android.os.RemoteException;
    public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) throws android.os.RemoteException;
    public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellInfo[] p1) throws android.os.RemoteException;
    public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) throws android.os.RemoteException;
    public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException;
    public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void getOperatorResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.SignalStrength p1) throws android.os.RemoteException;
    public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RadioAccessSpecifier[] p1) throws android.os.RemoteException;
    public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) throws android.os.RemoteException;
    public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException;
    public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setBandModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.network.IRadioNetworkResponse {
        public Default() {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) throws android.os.RemoteException {}
        public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.OperatorInfo[] p1) throws android.os.RemoteException {}
        public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) throws android.os.RemoteException {}
        public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellInfo[] p1) throws android.os.RemoteException {}
        public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) throws android.os.RemoteException {}
        public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void getOperatorResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.SignalStrength p1) throws android.os.RemoteException {}
        public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RadioAccessSpecifier[] p1) throws android.os.RemoteException {}
        public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) throws android.os.RemoteException {}
        public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
        public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setBandModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.network.IRadioNetworkResponse {
        static final int TRANSACTION_acknowledgeRequest = 1;
        static final int TRANSACTION_getAllowedNetworkTypesBitmapResponse = 2;
        static final int TRANSACTION_getAvailableBandModesResponse = 3;
        static final int TRANSACTION_getAvailableNetworksResponse = 4;
        static final int TRANSACTION_getBarringInfoResponse = 5;
        static final int TRANSACTION_getCdmaRoamingPreferenceResponse = 6;
        static final int TRANSACTION_getCellInfoListResponse = 7;
        static final int TRANSACTION_getDataRegistrationStateResponse = 8;
        static final int TRANSACTION_getImsRegistrationStateResponse = 9;
        static final int TRANSACTION_getNetworkSelectionModeResponse = 10;
        static final int TRANSACTION_getOperatorResponse = 11;
        static final int TRANSACTION_getSignalStrengthResponse = 12;
        static final int TRANSACTION_getSystemSelectionChannelsResponse = 13;
        static final int TRANSACTION_getVoiceRadioTechnologyResponse = 14;
        static final int TRANSACTION_getVoiceRegistrationStateResponse = 15;
        static final int TRANSACTION_isNrDualConnectivityEnabledResponse = 16;
        static final int TRANSACTION_setAllowedNetworkTypesBitmapResponse = 17;
        static final int TRANSACTION_setBandModeResponse = 18;
        static final int TRANSACTION_setBarringPasswordResponse = 19;
        static final int TRANSACTION_setCdmaRoamingPreferenceResponse = 20;
        static final int TRANSACTION_setCellInfoListRateResponse = 21;
        static final int TRANSACTION_setIndicationFilterResponse = 22;
        static final int TRANSACTION_setLinkCapacityReportingCriteriaResponse = 23;
        static final int TRANSACTION_setLocationUpdatesResponse = 24;
        static final int TRANSACTION_setNetworkSelectionModeAutomaticResponse = 25;
        static final int TRANSACTION_setNetworkSelectionModeManualResponse = 26;
        static final int TRANSACTION_setNrDualConnectivityStateResponse = 27;
        static final int TRANSACTION_setSignalStrengthReportingCriteriaResponse = 28;
        static final int TRANSACTION_setSuppServiceNotificationsResponse = 29;
        static final int TRANSACTION_setSystemSelectionChannelsResponse = 30;
        static final int TRANSACTION_startNetworkScanResponse = 31;
        static final int TRANSACTION_stopNetworkScanResponse = 32;
        static final int TRANSACTION_supplyNetworkDepersonalizationResponse = 33;
        static final int TRANSACTION_setUsageSettingResponse = 34;
        static final int TRANSACTION_getUsageSettingResponse = 35;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.network.IRadioNetworkResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.network.IRadioNetworkResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
            public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo p0, int[] p1) throws android.os.RemoteException {}
            public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.OperatorInfo[] p1) throws android.os.RemoteException {}
            public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) throws android.os.RemoteException {}
            public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.CellInfo[] p1) throws android.os.RemoteException {}
            public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) throws android.os.RemoteException {}
            public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void getOperatorResponse(android.hardware.radio.RadioResponseInfo p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.SignalStrength p1) throws android.os.RemoteException {}
            public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RadioAccessSpecifier[] p1) throws android.os.RemoteException {}
            public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.network.RegStateResult p1) throws android.os.RemoteException {}
            public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo p0, boolean p1) throws android.os.RemoteException {}
            public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setBandModeResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
