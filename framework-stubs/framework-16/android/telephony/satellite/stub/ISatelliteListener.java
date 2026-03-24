package android.telephony.satellite.stub;

public interface ISatelliteListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.satellite.stub.ISatelliteListener";
    public void onSatelliteDatagramReceived(android.telephony.satellite.stub.SatelliteDatagram p0, int p1) throws android.os.RemoteException;
    public void onPendingDatagrams() throws android.os.RemoteException;
    public void onSatellitePositionChanged(android.telephony.satellite.stub.PointingInfo p0) throws android.os.RemoteException;
    public void onSatelliteModemStateChanged(int p0) throws android.os.RemoteException;
    public void onNtnSignalStrengthChanged(android.telephony.satellite.stub.NtnSignalStrength p0) throws android.os.RemoteException;
    public void onSatelliteCapabilitiesChanged(android.telephony.satellite.stub.SatelliteCapabilities p0) throws android.os.RemoteException;
    public void onSatelliteSupportedStateChanged(boolean p0) throws android.os.RemoteException;
    public void onRegistrationFailure(int p0) throws android.os.RemoteException;
    public void onTerrestrialNetworkAvailableChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.satellite.stub.ISatelliteListener {
        public Default() {}
        public void onSatelliteDatagramReceived(android.telephony.satellite.stub.SatelliteDatagram p0, int p1) throws android.os.RemoteException {}
        public void onPendingDatagrams() throws android.os.RemoteException {}
        public void onSatellitePositionChanged(android.telephony.satellite.stub.PointingInfo p0) throws android.os.RemoteException {}
        public void onSatelliteModemStateChanged(int p0) throws android.os.RemoteException {}
        public void onNtnSignalStrengthChanged(android.telephony.satellite.stub.NtnSignalStrength p0) throws android.os.RemoteException {}
        public void onSatelliteCapabilitiesChanged(android.telephony.satellite.stub.SatelliteCapabilities p0) throws android.os.RemoteException {}
        public void onSatelliteSupportedStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onRegistrationFailure(int p0) throws android.os.RemoteException {}
        public void onTerrestrialNetworkAvailableChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.satellite.stub.ISatelliteListener {
        static final int TRANSACTION_onSatelliteDatagramReceived = 1;
        static final int TRANSACTION_onPendingDatagrams = 2;
        static final int TRANSACTION_onSatellitePositionChanged = 3;
        static final int TRANSACTION_onSatelliteModemStateChanged = 4;
        static final int TRANSACTION_onNtnSignalStrengthChanged = 5;
        static final int TRANSACTION_onSatelliteCapabilitiesChanged = 6;
        static final int TRANSACTION_onSatelliteSupportedStateChanged = 7;
        static final int TRANSACTION_onRegistrationFailure = 8;
        static final int TRANSACTION_onTerrestrialNetworkAvailableChanged = 9;
        public Stub() { super(); }
        public static android.telephony.satellite.stub.ISatelliteListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.satellite.stub.ISatelliteListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSatelliteDatagramReceived(android.telephony.satellite.stub.SatelliteDatagram p0, int p1) throws android.os.RemoteException {}
            public void onPendingDatagrams() throws android.os.RemoteException {}
            public void onSatellitePositionChanged(android.telephony.satellite.stub.PointingInfo p0) throws android.os.RemoteException {}
            public void onSatelliteModemStateChanged(int p0) throws android.os.RemoteException {}
            public void onNtnSignalStrengthChanged(android.telephony.satellite.stub.NtnSignalStrength p0) throws android.os.RemoteException {}
            public void onSatelliteCapabilitiesChanged(android.telephony.satellite.stub.SatelliteCapabilities p0) throws android.os.RemoteException {}
            public void onSatelliteSupportedStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onRegistrationFailure(int p0) throws android.os.RemoteException {}
            public void onTerrestrialNetworkAvailableChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
