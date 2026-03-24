package android.hardware.radio.network;

public interface IRadioNetwork extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "1b6608f238bd0b1c642df315621a7b605eafc883";
    public static final java.lang.String DESCRIPTOR = null;
    public void getAllowedNetworkTypesBitmap(int p0) throws android.os.RemoteException;
    public void getAvailableBandModes(int p0) throws android.os.RemoteException;
    public void getAvailableNetworks(int p0) throws android.os.RemoteException;
    public void getBarringInfo(int p0) throws android.os.RemoteException;
    public void getCdmaRoamingPreference(int p0) throws android.os.RemoteException;
    public void getCellInfoList(int p0) throws android.os.RemoteException;
    public void getDataRegistrationState(int p0) throws android.os.RemoteException;
    @java.lang.Deprecated
    public void getImsRegistrationState(int p0) throws android.os.RemoteException;
    public void getNetworkSelectionMode(int p0) throws android.os.RemoteException;
    public void getOperator(int p0) throws android.os.RemoteException;
    public void getSignalStrength(int p0) throws android.os.RemoteException;
    public void getSystemSelectionChannels(int p0) throws android.os.RemoteException;
    public void getVoiceRadioTechnology(int p0) throws android.os.RemoteException;
    public void getVoiceRegistrationState(int p0) throws android.os.RemoteException;
    public void isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException;
    public void responseAcknowledgement() throws android.os.RemoteException;
    public void setAllowedNetworkTypesBitmap(int p0, int p1) throws android.os.RemoteException;
    public void setBandMode(int p0, int p1) throws android.os.RemoteException;
    public void setBarringPassword(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void setCdmaRoamingPreference(int p0, int p1) throws android.os.RemoteException;
    public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException;
    public void setIndicationFilter(int p0, int p1) throws android.os.RemoteException;
    public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int p3, int[] p4, int[] p5, int p6) throws android.os.RemoteException;
    public void setLocationUpdates(int p0, boolean p1) throws android.os.RemoteException;
    public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException;
    public void setNetworkSelectionModeManual(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setNrDualConnectivityState(int p0, byte p1) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.network.IRadioNetworkResponse p0, android.hardware.radio.network.IRadioNetworkIndication p1) throws android.os.RemoteException;
    public void setSignalStrengthReportingCriteria(int p0, android.hardware.radio.network.SignalThresholdInfo[] p1) throws android.os.RemoteException;
    public void setSuppServiceNotifications(int p0, boolean p1) throws android.os.RemoteException;
    public void setSystemSelectionChannels(int p0, boolean p1, android.hardware.radio.network.RadioAccessSpecifier[] p2) throws android.os.RemoteException;
    public void startNetworkScan(int p0, android.hardware.radio.network.NetworkScanRequest p1) throws android.os.RemoteException;
    public void stopNetworkScan(int p0) throws android.os.RemoteException;
    public void supplyNetworkDepersonalization(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUsageSetting(int p0, int p1) throws android.os.RemoteException;
    public void getUsageSetting(int p0) throws android.os.RemoteException;
    public void setEmergencyMode(int p0, int p1) throws android.os.RemoteException;
    public void triggerEmergencyNetworkScan(int p0, android.hardware.radio.network.EmergencyNetworkScanTrigger p1) throws android.os.RemoteException;
    public void cancelEmergencyNetworkScan(int p0, boolean p1) throws android.os.RemoteException;
    public void exitEmergencyMode(int p0) throws android.os.RemoteException;
    public void setNullCipherAndIntegrityEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public void isNullCipherAndIntegrityEnabled(int p0) throws android.os.RemoteException;
    public void isN1ModeEnabled(int p0) throws android.os.RemoteException;
    public void setN1ModeEnabled(int p0, boolean p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.network.IRadioNetwork {
        public Default() {}
        public void getAllowedNetworkTypesBitmap(int p0) throws android.os.RemoteException {}
        public void getAvailableBandModes(int p0) throws android.os.RemoteException {}
        public void getAvailableNetworks(int p0) throws android.os.RemoteException {}
        public void getBarringInfo(int p0) throws android.os.RemoteException {}
        public void getCdmaRoamingPreference(int p0) throws android.os.RemoteException {}
        public void getCellInfoList(int p0) throws android.os.RemoteException {}
        public void getDataRegistrationState(int p0) throws android.os.RemoteException {}
        public void getImsRegistrationState(int p0) throws android.os.RemoteException {}
        public void getNetworkSelectionMode(int p0) throws android.os.RemoteException {}
        public void getOperator(int p0) throws android.os.RemoteException {}
        public void getSignalStrength(int p0) throws android.os.RemoteException {}
        public void getSystemSelectionChannels(int p0) throws android.os.RemoteException {}
        public void getVoiceRadioTechnology(int p0) throws android.os.RemoteException {}
        public void getVoiceRegistrationState(int p0) throws android.os.RemoteException {}
        public void isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void setAllowedNetworkTypesBitmap(int p0, int p1) throws android.os.RemoteException {}
        public void setBandMode(int p0, int p1) throws android.os.RemoteException {}
        public void setBarringPassword(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void setCdmaRoamingPreference(int p0, int p1) throws android.os.RemoteException {}
        public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
        public void setIndicationFilter(int p0, int p1) throws android.os.RemoteException {}
        public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int p3, int[] p4, int[] p5, int p6) throws android.os.RemoteException {}
        public void setLocationUpdates(int p0, boolean p1) throws android.os.RemoteException {}
        public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
        public void setNetworkSelectionModeManual(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setNrDualConnectivityState(int p0, byte p1) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.network.IRadioNetworkResponse p0, android.hardware.radio.network.IRadioNetworkIndication p1) throws android.os.RemoteException {}
        public void setSignalStrengthReportingCriteria(int p0, android.hardware.radio.network.SignalThresholdInfo[] p1) throws android.os.RemoteException {}
        public void setSuppServiceNotifications(int p0, boolean p1) throws android.os.RemoteException {}
        public void setSystemSelectionChannels(int p0, boolean p1, android.hardware.radio.network.RadioAccessSpecifier[] p2) throws android.os.RemoteException {}
        public void startNetworkScan(int p0, android.hardware.radio.network.NetworkScanRequest p1) throws android.os.RemoteException {}
        public void stopNetworkScan(int p0) throws android.os.RemoteException {}
        public void supplyNetworkDepersonalization(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setUsageSetting(int p0, int p1) throws android.os.RemoteException {}
        public void getUsageSetting(int p0) throws android.os.RemoteException {}
        public void setEmergencyMode(int p0, int p1) throws android.os.RemoteException {}
        public void triggerEmergencyNetworkScan(int p0, android.hardware.radio.network.EmergencyNetworkScanTrigger p1) throws android.os.RemoteException {}
        public void cancelEmergencyNetworkScan(int p0, boolean p1) throws android.os.RemoteException {}
        public void exitEmergencyMode(int p0) throws android.os.RemoteException {}
        public void setNullCipherAndIntegrityEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public void isNullCipherAndIntegrityEnabled(int p0) throws android.os.RemoteException {}
        public void isN1ModeEnabled(int p0) throws android.os.RemoteException {}
        public void setN1ModeEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.network.IRadioNetwork {
        static final int TRANSACTION_getAllowedNetworkTypesBitmap = 1;
        static final int TRANSACTION_getAvailableBandModes = 2;
        static final int TRANSACTION_getAvailableNetworks = 3;
        static final int TRANSACTION_getBarringInfo = 4;
        static final int TRANSACTION_getCdmaRoamingPreference = 5;
        static final int TRANSACTION_getCellInfoList = 6;
        static final int TRANSACTION_getDataRegistrationState = 7;
        static final int TRANSACTION_getImsRegistrationState = 8;
        static final int TRANSACTION_getNetworkSelectionMode = 9;
        static final int TRANSACTION_getOperator = 10;
        static final int TRANSACTION_getSignalStrength = 11;
        static final int TRANSACTION_getSystemSelectionChannels = 12;
        static final int TRANSACTION_getVoiceRadioTechnology = 13;
        static final int TRANSACTION_getVoiceRegistrationState = 14;
        static final int TRANSACTION_isNrDualConnectivityEnabled = 15;
        static final int TRANSACTION_responseAcknowledgement = 16;
        static final int TRANSACTION_setAllowedNetworkTypesBitmap = 17;
        static final int TRANSACTION_setBandMode = 18;
        static final int TRANSACTION_setBarringPassword = 19;
        static final int TRANSACTION_setCdmaRoamingPreference = 20;
        static final int TRANSACTION_setCellInfoListRate = 21;
        static final int TRANSACTION_setIndicationFilter = 22;
        static final int TRANSACTION_setLinkCapacityReportingCriteria = 23;
        static final int TRANSACTION_setLocationUpdates = 24;
        static final int TRANSACTION_setNetworkSelectionModeAutomatic = 25;
        static final int TRANSACTION_setNetworkSelectionModeManual = 26;
        static final int TRANSACTION_setNrDualConnectivityState = 27;
        static final int TRANSACTION_setResponseFunctions = 28;
        static final int TRANSACTION_setSignalStrengthReportingCriteria = 29;
        static final int TRANSACTION_setSuppServiceNotifications = 30;
        static final int TRANSACTION_setSystemSelectionChannels = 31;
        static final int TRANSACTION_startNetworkScan = 32;
        static final int TRANSACTION_stopNetworkScan = 33;
        static final int TRANSACTION_supplyNetworkDepersonalization = 34;
        static final int TRANSACTION_setUsageSetting = 35;
        static final int TRANSACTION_getUsageSetting = 36;
        static final int TRANSACTION_setEmergencyMode = 37;
        static final int TRANSACTION_triggerEmergencyNetworkScan = 38;
        static final int TRANSACTION_cancelEmergencyNetworkScan = 39;
        static final int TRANSACTION_exitEmergencyMode = 40;
        static final int TRANSACTION_setNullCipherAndIntegrityEnabled = 41;
        static final int TRANSACTION_isNullCipherAndIntegrityEnabled = 42;
        static final int TRANSACTION_isN1ModeEnabled = 43;
        static final int TRANSACTION_setN1ModeEnabled = 44;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.network.IRadioNetwork asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.network.IRadioNetwork {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getAllowedNetworkTypesBitmap(int p0) throws android.os.RemoteException {}
            public void getAvailableBandModes(int p0) throws android.os.RemoteException {}
            public void getAvailableNetworks(int p0) throws android.os.RemoteException {}
            public void getBarringInfo(int p0) throws android.os.RemoteException {}
            public void getCdmaRoamingPreference(int p0) throws android.os.RemoteException {}
            public void getCellInfoList(int p0) throws android.os.RemoteException {}
            public void getDataRegistrationState(int p0) throws android.os.RemoteException {}
            public void getImsRegistrationState(int p0) throws android.os.RemoteException {}
            public void getNetworkSelectionMode(int p0) throws android.os.RemoteException {}
            public void getOperator(int p0) throws android.os.RemoteException {}
            public void getSignalStrength(int p0) throws android.os.RemoteException {}
            public void getSystemSelectionChannels(int p0) throws android.os.RemoteException {}
            public void getVoiceRadioTechnology(int p0) throws android.os.RemoteException {}
            public void getVoiceRegistrationState(int p0) throws android.os.RemoteException {}
            public void isNrDualConnectivityEnabled(int p0) throws android.os.RemoteException {}
            public void responseAcknowledgement() throws android.os.RemoteException {}
            public void setAllowedNetworkTypesBitmap(int p0, int p1) throws android.os.RemoteException {}
            public void setBandMode(int p0, int p1) throws android.os.RemoteException {}
            public void setBarringPassword(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void setCdmaRoamingPreference(int p0, int p1) throws android.os.RemoteException {}
            public void setCellInfoListRate(int p0, int p1) throws android.os.RemoteException {}
            public void setIndicationFilter(int p0, int p1) throws android.os.RemoteException {}
            public void setLinkCapacityReportingCriteria(int p0, int p1, int p2, int p3, int[] p4, int[] p5, int p6) throws android.os.RemoteException {}
            public void setLocationUpdates(int p0, boolean p1) throws android.os.RemoteException {}
            public void setNetworkSelectionModeAutomatic(int p0) throws android.os.RemoteException {}
            public void setNetworkSelectionModeManual(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setNrDualConnectivityState(int p0, byte p1) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.network.IRadioNetworkResponse p0, android.hardware.radio.network.IRadioNetworkIndication p1) throws android.os.RemoteException {}
            public void setSignalStrengthReportingCriteria(int p0, android.hardware.radio.network.SignalThresholdInfo[] p1) throws android.os.RemoteException {}
            public void setSuppServiceNotifications(int p0, boolean p1) throws android.os.RemoteException {}
            public void setSystemSelectionChannels(int p0, boolean p1, android.hardware.radio.network.RadioAccessSpecifier[] p2) throws android.os.RemoteException {}
            public void startNetworkScan(int p0, android.hardware.radio.network.NetworkScanRequest p1) throws android.os.RemoteException {}
            public void stopNetworkScan(int p0) throws android.os.RemoteException {}
            public void supplyNetworkDepersonalization(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void setUsageSetting(int p0, int p1) throws android.os.RemoteException {}
            public void getUsageSetting(int p0) throws android.os.RemoteException {}
            public void setEmergencyMode(int p0, int p1) throws android.os.RemoteException {}
            public void triggerEmergencyNetworkScan(int p0, android.hardware.radio.network.EmergencyNetworkScanTrigger p1) throws android.os.RemoteException {}
            public void cancelEmergencyNetworkScan(int p0, boolean p1) throws android.os.RemoteException {}
            public void exitEmergencyMode(int p0) throws android.os.RemoteException {}
            public void setNullCipherAndIntegrityEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public void isNullCipherAndIntegrityEnabled(int p0) throws android.os.RemoteException {}
            public void isN1ModeEnabled(int p0) throws android.os.RemoteException {}
            public void setN1ModeEnabled(int p0, boolean p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
