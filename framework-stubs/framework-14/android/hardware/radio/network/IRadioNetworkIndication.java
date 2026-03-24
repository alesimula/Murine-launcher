package android.hardware.radio.network;

public interface IRadioNetworkIndication extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "1b6608f238bd0b1c642df315621a7b605eafc883";
    public static final java.lang.String DESCRIPTOR = null;
    public void barringInfoChanged(int p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) throws android.os.RemoteException;
    public void cdmaPrlChanged(int p0, int p1) throws android.os.RemoteException;
    public void cellInfoList(int p0, android.hardware.radio.network.CellInfo[] p1) throws android.os.RemoteException;
    public void currentLinkCapacityEstimate(int p0, android.hardware.radio.network.LinkCapacityEstimate p1) throws android.os.RemoteException;
    public void currentPhysicalChannelConfigs(int p0, android.hardware.radio.network.PhysicalChannelConfig[] p1) throws android.os.RemoteException;
    public void currentSignalStrength(int p0, android.hardware.radio.network.SignalStrength p1) throws android.os.RemoteException;
    public void imsNetworkStateChanged(int p0) throws android.os.RemoteException;
    public void networkScanResult(int p0, android.hardware.radio.network.NetworkScanResult p1) throws android.os.RemoteException;
    public void networkStateChanged(int p0) throws android.os.RemoteException;
    public void nitzTimeReceived(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException;
    public void registrationFailed(int p0, android.hardware.radio.network.CellIdentity p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException;
    public void restrictedStateChanged(int p0, int p1) throws android.os.RemoteException;
    public void suppSvcNotify(int p0, android.hardware.radio.network.SuppSvcNotification p1) throws android.os.RemoteException;
    public void voiceRadioTechChanged(int p0, int p1) throws android.os.RemoteException;
    public void emergencyNetworkScanResult(int p0, android.hardware.radio.network.EmergencyRegResult p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.network.IRadioNetworkIndication {
        public Default() {}
        public void barringInfoChanged(int p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) throws android.os.RemoteException {}
        public void cdmaPrlChanged(int p0, int p1) throws android.os.RemoteException {}
        public void cellInfoList(int p0, android.hardware.radio.network.CellInfo[] p1) throws android.os.RemoteException {}
        public void currentLinkCapacityEstimate(int p0, android.hardware.radio.network.LinkCapacityEstimate p1) throws android.os.RemoteException {}
        public void currentPhysicalChannelConfigs(int p0, android.hardware.radio.network.PhysicalChannelConfig[] p1) throws android.os.RemoteException {}
        public void currentSignalStrength(int p0, android.hardware.radio.network.SignalStrength p1) throws android.os.RemoteException {}
        public void imsNetworkStateChanged(int p0) throws android.os.RemoteException {}
        public void networkScanResult(int p0, android.hardware.radio.network.NetworkScanResult p1) throws android.os.RemoteException {}
        public void networkStateChanged(int p0) throws android.os.RemoteException {}
        public void nitzTimeReceived(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException {}
        public void registrationFailed(int p0, android.hardware.radio.network.CellIdentity p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        public void restrictedStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public void suppSvcNotify(int p0, android.hardware.radio.network.SuppSvcNotification p1) throws android.os.RemoteException {}
        public void voiceRadioTechChanged(int p0, int p1) throws android.os.RemoteException {}
        public void emergencyNetworkScanResult(int p0, android.hardware.radio.network.EmergencyRegResult p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.network.IRadioNetworkIndication {
        static final int TRANSACTION_barringInfoChanged = 1;
        static final int TRANSACTION_cdmaPrlChanged = 2;
        static final int TRANSACTION_cellInfoList = 3;
        static final int TRANSACTION_currentLinkCapacityEstimate = 4;
        static final int TRANSACTION_currentPhysicalChannelConfigs = 5;
        static final int TRANSACTION_currentSignalStrength = 6;
        static final int TRANSACTION_imsNetworkStateChanged = 7;
        static final int TRANSACTION_networkScanResult = 8;
        static final int TRANSACTION_networkStateChanged = 9;
        static final int TRANSACTION_nitzTimeReceived = 10;
        static final int TRANSACTION_registrationFailed = 11;
        static final int TRANSACTION_restrictedStateChanged = 12;
        static final int TRANSACTION_suppSvcNotify = 13;
        static final int TRANSACTION_voiceRadioTechChanged = 14;
        static final int TRANSACTION_emergencyNetworkScanResult = 15;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.network.IRadioNetworkIndication asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.network.IRadioNetworkIndication {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void barringInfoChanged(int p0, android.hardware.radio.network.CellIdentity p1, android.hardware.radio.network.BarringInfo[] p2) throws android.os.RemoteException {}
            public void cdmaPrlChanged(int p0, int p1) throws android.os.RemoteException {}
            public void cellInfoList(int p0, android.hardware.radio.network.CellInfo[] p1) throws android.os.RemoteException {}
            public void currentLinkCapacityEstimate(int p0, android.hardware.radio.network.LinkCapacityEstimate p1) throws android.os.RemoteException {}
            public void currentPhysicalChannelConfigs(int p0, android.hardware.radio.network.PhysicalChannelConfig[] p1) throws android.os.RemoteException {}
            public void currentSignalStrength(int p0, android.hardware.radio.network.SignalStrength p1) throws android.os.RemoteException {}
            public void imsNetworkStateChanged(int p0) throws android.os.RemoteException {}
            public void networkScanResult(int p0, android.hardware.radio.network.NetworkScanResult p1) throws android.os.RemoteException {}
            public void networkStateChanged(int p0) throws android.os.RemoteException {}
            public void nitzTimeReceived(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException {}
            public void registrationFailed(int p0, android.hardware.radio.network.CellIdentity p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException {}
            public void restrictedStateChanged(int p0, int p1) throws android.os.RemoteException {}
            public void suppSvcNotify(int p0, android.hardware.radio.network.SuppSvcNotification p1) throws android.os.RemoteException {}
            public void voiceRadioTechChanged(int p0, int p1) throws android.os.RemoteException {}
            public void emergencyNetworkScanResult(int p0, android.hardware.radio.network.EmergencyRegResult p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
