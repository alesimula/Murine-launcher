package android.hardware.radio.data;

public interface IRadioData extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "6d7a86008ea4fe79ced2a86b526a92618eb4c84a";
    public static final java.lang.String DESCRIPTOR = null;
    public void allocatePduSessionId(int p0) throws android.os.RemoteException;
    public void cancelHandover(int p0, int p1) throws android.os.RemoteException;
    public void deactivateDataCall(int p0, int p1, int p2) throws android.os.RemoteException;
    public void getDataCallList(int p0) throws android.os.RemoteException;
    public void getSlicingConfig(int p0) throws android.os.RemoteException;
    public void releasePduSessionId(int p0, int p1) throws android.os.RemoteException;
    public void responseAcknowledgement() throws android.os.RemoteException;
    public void setDataAllowed(int p0, boolean p1) throws android.os.RemoteException;
    public void setDataProfile(int p0, android.hardware.radio.data.DataProfileInfo[] p1) throws android.os.RemoteException;
    public void setDataThrottling(int p0, byte p1, long p2) throws android.os.RemoteException;
    public void setInitialAttachApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException;
    public void setResponseFunctions(android.hardware.radio.data.IRadioDataResponse p0, android.hardware.radio.data.IRadioDataIndication p1) throws android.os.RemoteException;
    public void setupDataCall(int p0, int p1, android.hardware.radio.data.DataProfileInfo p2, boolean p3, int p4, android.hardware.radio.data.LinkAddress[] p5, java.lang.String[] p6, int p7, android.hardware.radio.data.SliceInfo p8, boolean p9) throws android.os.RemoteException;
    public void startHandover(int p0, int p1) throws android.os.RemoteException;
    public void startKeepalive(int p0, android.hardware.radio.data.KeepaliveRequest p1) throws android.os.RemoteException;
    public void stopKeepalive(int p0, int p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.data.IRadioData {
        public Default() {}
        public void allocatePduSessionId(int p0) throws android.os.RemoteException {}
        public void cancelHandover(int p0, int p1) throws android.os.RemoteException {}
        public void deactivateDataCall(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void getDataCallList(int p0) throws android.os.RemoteException {}
        public void getSlicingConfig(int p0) throws android.os.RemoteException {}
        public void releasePduSessionId(int p0, int p1) throws android.os.RemoteException {}
        public void responseAcknowledgement() throws android.os.RemoteException {}
        public void setDataAllowed(int p0, boolean p1) throws android.os.RemoteException {}
        public void setDataProfile(int p0, android.hardware.radio.data.DataProfileInfo[] p1) throws android.os.RemoteException {}
        public void setDataThrottling(int p0, byte p1, long p2) throws android.os.RemoteException {}
        public void setInitialAttachApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
        public void setResponseFunctions(android.hardware.radio.data.IRadioDataResponse p0, android.hardware.radio.data.IRadioDataIndication p1) throws android.os.RemoteException {}
        public void setupDataCall(int p0, int p1, android.hardware.radio.data.DataProfileInfo p2, boolean p3, int p4, android.hardware.radio.data.LinkAddress[] p5, java.lang.String[] p6, int p7, android.hardware.radio.data.SliceInfo p8, boolean p9) throws android.os.RemoteException {}
        public void startHandover(int p0, int p1) throws android.os.RemoteException {}
        public void startKeepalive(int p0, android.hardware.radio.data.KeepaliveRequest p1) throws android.os.RemoteException {}
        public void stopKeepalive(int p0, int p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioData {
        static final int TRANSACTION_allocatePduSessionId = 1;
        static final int TRANSACTION_cancelHandover = 2;
        static final int TRANSACTION_deactivateDataCall = 3;
        static final int TRANSACTION_getDataCallList = 4;
        static final int TRANSACTION_getSlicingConfig = 5;
        static final int TRANSACTION_releasePduSessionId = 6;
        static final int TRANSACTION_responseAcknowledgement = 7;
        static final int TRANSACTION_setDataAllowed = 8;
        static final int TRANSACTION_setDataProfile = 9;
        static final int TRANSACTION_setDataThrottling = 10;
        static final int TRANSACTION_setInitialAttachApn = 11;
        static final int TRANSACTION_setResponseFunctions = 12;
        static final int TRANSACTION_setupDataCall = 13;
        static final int TRANSACTION_startHandover = 14;
        static final int TRANSACTION_startKeepalive = 15;
        static final int TRANSACTION_stopKeepalive = 16;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.data.IRadioData asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.data.IRadioData {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void allocatePduSessionId(int p0) throws android.os.RemoteException {}
            public void cancelHandover(int p0, int p1) throws android.os.RemoteException {}
            public void deactivateDataCall(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void getDataCallList(int p0) throws android.os.RemoteException {}
            public void getSlicingConfig(int p0) throws android.os.RemoteException {}
            public void releasePduSessionId(int p0, int p1) throws android.os.RemoteException {}
            public void responseAcknowledgement() throws android.os.RemoteException {}
            public void setDataAllowed(int p0, boolean p1) throws android.os.RemoteException {}
            public void setDataProfile(int p0, android.hardware.radio.data.DataProfileInfo[] p1) throws android.os.RemoteException {}
            public void setDataThrottling(int p0, byte p1, long p2) throws android.os.RemoteException {}
            public void setInitialAttachApn(int p0, android.hardware.radio.data.DataProfileInfo p1) throws android.os.RemoteException {}
            public void setResponseFunctions(android.hardware.radio.data.IRadioDataResponse p0, android.hardware.radio.data.IRadioDataIndication p1) throws android.os.RemoteException {}
            public void setupDataCall(int p0, int p1, android.hardware.radio.data.DataProfileInfo p2, boolean p3, int p4, android.hardware.radio.data.LinkAddress[] p5, java.lang.String[] p6, int p7, android.hardware.radio.data.SliceInfo p8, boolean p9) throws android.os.RemoteException {}
            public void startHandover(int p0, int p1) throws android.os.RemoteException {}
            public void startKeepalive(int p0, android.hardware.radio.data.KeepaliveRequest p1) throws android.os.RemoteException {}
            public void stopKeepalive(int p0, int p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
