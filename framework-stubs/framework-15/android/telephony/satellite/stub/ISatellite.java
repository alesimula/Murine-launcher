package android.telephony.satellite.stub;

public interface ISatellite extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.satellite.stub.ISatellite";
    public void setSatelliteListener(android.telephony.satellite.stub.ISatelliteListener p0) throws android.os.RemoteException;
    public void requestSatelliteListeningEnabled(boolean p0, int p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void enableCellularModemWhileSatelliteModeIsOn(boolean p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void requestSatelliteEnabled(boolean p0, boolean p1, boolean p2, android.telephony.IIntegerConsumer p3) throws android.os.RemoteException;
    public void requestIsSatelliteEnabled(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException;
    public void requestIsSatelliteSupported(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException;
    public void requestSatelliteCapabilities(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.ISatelliteCapabilitiesConsumer p1) throws android.os.RemoteException;
    public void startSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public void stopSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public void provisionSatelliteService(java.lang.String p0, byte[] p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void deprovisionSatelliteService(java.lang.String p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void requestIsSatelliteProvisioned(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException;
    public void pollPendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public void sendSatelliteDatagram(android.telephony.satellite.stub.SatelliteDatagram p0, boolean p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void requestSatelliteModemState(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void requestTimeForNextSatelliteVisibility(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void setSatellitePlmn(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, android.telephony.IIntegerConsumer p3) throws android.os.RemoteException;
    public void setSatelliteEnabledForCarrier(int p0, boolean p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException;
    public void requestIsSatelliteEnabledForCarrier(int p0, android.telephony.IIntegerConsumer p1, android.telephony.IBooleanConsumer p2) throws android.os.RemoteException;
    public void requestSignalStrength(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.INtnSignalStrengthConsumer p1) throws android.os.RemoteException;
    public void startSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public void stopSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public void abortSendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException;
    public void updateSatelliteSubscription(java.lang.String p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void updateSystemSelectionChannels(java.util.List<android.telephony.satellite.stub.SystemSelectionSpecifier> p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.satellite.stub.ISatellite {
        public Default() {}
        public void setSatelliteListener(android.telephony.satellite.stub.ISatelliteListener p0) throws android.os.RemoteException {}
        public void requestSatelliteListeningEnabled(boolean p0, int p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void enableCellularModemWhileSatelliteModeIsOn(boolean p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void requestSatelliteEnabled(boolean p0, boolean p1, boolean p2, android.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
        public void requestIsSatelliteEnabled(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException {}
        public void requestIsSatelliteSupported(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException {}
        public void requestSatelliteCapabilities(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.ISatelliteCapabilitiesConsumer p1) throws android.os.RemoteException {}
        public void startSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public void stopSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public void provisionSatelliteService(java.lang.String p0, byte[] p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void deprovisionSatelliteService(java.lang.String p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void requestIsSatelliteProvisioned(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException {}
        public void pollPendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public void sendSatelliteDatagram(android.telephony.satellite.stub.SatelliteDatagram p0, boolean p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void requestSatelliteModemState(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void requestTimeForNextSatelliteVisibility(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void setSatellitePlmn(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, android.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
        public void setSatelliteEnabledForCarrier(int p0, boolean p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
        public void requestIsSatelliteEnabledForCarrier(int p0, android.telephony.IIntegerConsumer p1, android.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
        public void requestSignalStrength(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.INtnSignalStrengthConsumer p1) throws android.os.RemoteException {}
        public void startSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public void stopSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public void abortSendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
        public void updateSatelliteSubscription(java.lang.String p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void updateSystemSelectionChannels(java.util.List<android.telephony.satellite.stub.SystemSelectionSpecifier> p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.satellite.stub.ISatellite {
        static final int TRANSACTION_setSatelliteListener = 1;
        static final int TRANSACTION_requestSatelliteListeningEnabled = 2;
        static final int TRANSACTION_enableCellularModemWhileSatelliteModeIsOn = 3;
        static final int TRANSACTION_requestSatelliteEnabled = 4;
        static final int TRANSACTION_requestIsSatelliteEnabled = 5;
        static final int TRANSACTION_requestIsSatelliteSupported = 6;
        static final int TRANSACTION_requestSatelliteCapabilities = 7;
        static final int TRANSACTION_startSendingSatellitePointingInfo = 8;
        static final int TRANSACTION_stopSendingSatellitePointingInfo = 9;
        static final int TRANSACTION_provisionSatelliteService = 10;
        static final int TRANSACTION_deprovisionSatelliteService = 11;
        static final int TRANSACTION_requestIsSatelliteProvisioned = 12;
        static final int TRANSACTION_pollPendingSatelliteDatagrams = 13;
        static final int TRANSACTION_sendSatelliteDatagram = 14;
        static final int TRANSACTION_requestSatelliteModemState = 15;
        static final int TRANSACTION_requestTimeForNextSatelliteVisibility = 16;
        static final int TRANSACTION_setSatellitePlmn = 17;
        static final int TRANSACTION_setSatelliteEnabledForCarrier = 18;
        static final int TRANSACTION_requestIsSatelliteEnabledForCarrier = 19;
        static final int TRANSACTION_requestSignalStrength = 20;
        static final int TRANSACTION_startSendingNtnSignalStrength = 21;
        static final int TRANSACTION_stopSendingNtnSignalStrength = 22;
        static final int TRANSACTION_abortSendingSatelliteDatagrams = 23;
        static final int TRANSACTION_updateSatelliteSubscription = 24;
        static final int TRANSACTION_updateSystemSelectionChannels = 25;
        public Stub() { super(); }
        public static android.telephony.satellite.stub.ISatellite asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.satellite.stub.ISatellite {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setSatelliteListener(android.telephony.satellite.stub.ISatelliteListener p0) throws android.os.RemoteException {}
            public void requestSatelliteListeningEnabled(boolean p0, int p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void enableCellularModemWhileSatelliteModeIsOn(boolean p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void requestSatelliteEnabled(boolean p0, boolean p1, boolean p2, android.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
            public void requestIsSatelliteEnabled(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException {}
            public void requestIsSatelliteSupported(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException {}
            public void requestSatelliteCapabilities(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.ISatelliteCapabilitiesConsumer p1) throws android.os.RemoteException {}
            public void startSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public void stopSendingSatellitePointingInfo(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public void provisionSatelliteService(java.lang.String p0, byte[] p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void deprovisionSatelliteService(java.lang.String p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void requestIsSatelliteProvisioned(android.telephony.IIntegerConsumer p0, android.telephony.IBooleanConsumer p1) throws android.os.RemoteException {}
            public void pollPendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public void sendSatelliteDatagram(android.telephony.satellite.stub.SatelliteDatagram p0, boolean p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void requestSatelliteModemState(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void requestTimeForNextSatelliteVisibility(android.telephony.IIntegerConsumer p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void setSatellitePlmn(int p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, android.telephony.IIntegerConsumer p3) throws android.os.RemoteException {}
            public void setSatelliteEnabledForCarrier(int p0, boolean p1, android.telephony.IIntegerConsumer p2) throws android.os.RemoteException {}
            public void requestIsSatelliteEnabledForCarrier(int p0, android.telephony.IIntegerConsumer p1, android.telephony.IBooleanConsumer p2) throws android.os.RemoteException {}
            public void requestSignalStrength(android.telephony.IIntegerConsumer p0, android.telephony.satellite.stub.INtnSignalStrengthConsumer p1) throws android.os.RemoteException {}
            public void startSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public void stopSendingNtnSignalStrength(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public void abortSendingSatelliteDatagrams(android.telephony.IIntegerConsumer p0) throws android.os.RemoteException {}
            public void updateSatelliteSubscription(java.lang.String p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void updateSystemSelectionChannels(java.util.List<android.telephony.satellite.stub.SystemSelectionSpecifier> p0, android.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        }
    }
}
