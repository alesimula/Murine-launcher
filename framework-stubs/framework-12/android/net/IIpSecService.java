package android.net;

public interface IIpSecService extends android.os.IInterface {
    public android.net.IpSecSpiResponse allocateSecurityParameterIndex(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void releaseSecurityParameterIndex(int p0) throws android.os.RemoteException;
    public android.net.IpSecUdpEncapResponse openUdpEncapsulationSocket(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void closeUdpEncapsulationSocket(int p0) throws android.os.RemoteException;
    public android.net.IpSecTunnelInterfaceResponse createTunnelInterface(java.lang.String p0, java.lang.String p1, android.net.Network p2, android.os.IBinder p3, java.lang.String p4) throws android.os.RemoteException;
    public void addAddressToTunnelInterface(int p0, android.net.LinkAddress p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeAddressFromTunnelInterface(int p0, android.net.LinkAddress p1, java.lang.String p2) throws android.os.RemoteException;
    public void setNetworkForTunnelInterface(int p0, android.net.Network p1, java.lang.String p2) throws android.os.RemoteException;
    public void deleteTunnelInterface(int p0, java.lang.String p1) throws android.os.RemoteException;
    public android.net.IpSecTransformResponse createTransform(android.net.IpSecConfig p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException;
    public void deleteTransform(int p0) throws android.os.RemoteException;
    public void applyTransportModeTransform(android.os.ParcelFileDescriptor p0, int p1, int p2) throws android.os.RemoteException;
    public void applyTunnelModeTransform(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void removeTransportModeTransforms(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;

    public static class Default implements android.net.IIpSecService {
        public Default() {}
        public android.net.IpSecSpiResponse allocateSecurityParameterIndex(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        public void releaseSecurityParameterIndex(int p0) throws android.os.RemoteException {}
        public android.net.IpSecUdpEncapResponse openUdpEncapsulationSocket(int p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public void closeUdpEncapsulationSocket(int p0) throws android.os.RemoteException {}
        public android.net.IpSecTunnelInterfaceResponse createTunnelInterface(java.lang.String p0, java.lang.String p1, android.net.Network p2, android.os.IBinder p3, java.lang.String p4) throws android.os.RemoteException { return null; }
        public void addAddressToTunnelInterface(int p0, android.net.LinkAddress p1, java.lang.String p2) throws android.os.RemoteException {}
        public void removeAddressFromTunnelInterface(int p0, android.net.LinkAddress p1, java.lang.String p2) throws android.os.RemoteException {}
        public void setNetworkForTunnelInterface(int p0, android.net.Network p1, java.lang.String p2) throws android.os.RemoteException {}
        public void deleteTunnelInterface(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.net.IpSecTransformResponse createTransform(android.net.IpSecConfig p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void deleteTransform(int p0) throws android.os.RemoteException {}
        public void applyTransportModeTransform(android.os.ParcelFileDescriptor p0, int p1, int p2) throws android.os.RemoteException {}
        public void applyTunnelModeTransform(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
        public void removeTransportModeTransforms(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.IIpSecService {
        public static final java.lang.String DESCRIPTOR = "android.net.IIpSecService";
        static final int TRANSACTION_allocateSecurityParameterIndex = 1;
        static final int TRANSACTION_releaseSecurityParameterIndex = 2;
        static final int TRANSACTION_openUdpEncapsulationSocket = 3;
        static final int TRANSACTION_closeUdpEncapsulationSocket = 4;
        static final int TRANSACTION_createTunnelInterface = 5;
        static final int TRANSACTION_addAddressToTunnelInterface = 6;
        static final int TRANSACTION_removeAddressFromTunnelInterface = 7;
        static final int TRANSACTION_setNetworkForTunnelInterface = 8;
        static final int TRANSACTION_deleteTunnelInterface = 9;
        static final int TRANSACTION_createTransform = 10;
        static final int TRANSACTION_deleteTransform = 11;
        static final int TRANSACTION_applyTransportModeTransform = 12;
        static final int TRANSACTION_applyTunnelModeTransform = 13;
        static final int TRANSACTION_removeTransportModeTransforms = 14;
        public Stub() { super(); }
        public static android.net.IIpSecService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.IIpSecService p0) { return false; }
        public static android.net.IIpSecService getDefaultImpl() { return null; }

        private static class Proxy implements android.net.IIpSecService {
            private android.os.IBinder mRemote;
            public static android.net.IIpSecService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.IpSecSpiResponse allocateSecurityParameterIndex(java.lang.String p0, int p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
            public void releaseSecurityParameterIndex(int p0) throws android.os.RemoteException {}
            public android.net.IpSecUdpEncapResponse openUdpEncapsulationSocket(int p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public void closeUdpEncapsulationSocket(int p0) throws android.os.RemoteException {}
            public android.net.IpSecTunnelInterfaceResponse createTunnelInterface(java.lang.String p0, java.lang.String p1, android.net.Network p2, android.os.IBinder p3, java.lang.String p4) throws android.os.RemoteException { return null; }
            public void addAddressToTunnelInterface(int p0, android.net.LinkAddress p1, java.lang.String p2) throws android.os.RemoteException {}
            public void removeAddressFromTunnelInterface(int p0, android.net.LinkAddress p1, java.lang.String p2) throws android.os.RemoteException {}
            public void setNetworkForTunnelInterface(int p0, android.net.Network p1, java.lang.String p2) throws android.os.RemoteException {}
            public void deleteTunnelInterface(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public android.net.IpSecTransformResponse createTransform(android.net.IpSecConfig p0, android.os.IBinder p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void deleteTransform(int p0) throws android.os.RemoteException {}
            public void applyTransportModeTransform(android.os.ParcelFileDescriptor p0, int p1, int p2) throws android.os.RemoteException {}
            public void applyTunnelModeTransform(int p0, int p1, int p2, java.lang.String p3) throws android.os.RemoteException {}
            public void removeTransportModeTransforms(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        }
    }
}
