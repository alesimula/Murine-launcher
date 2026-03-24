package android.hardware.radio.data;

public interface IRadioDataResponse extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "6d7a86008ea4fe79ced2a86b526a92618eb4c84a";
    public static final java.lang.String DESCRIPTOR = null;
    public void acknowledgeRequest(int p0) throws android.os.RemoteException;
    public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException;
    public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException;
    public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException;
    public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult p1) throws android.os.RemoteException;
    public void startHandoverResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException;
    public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.data.IRadioDataResponse {
        public Default() {}
        public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
        public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
        public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException {}
        public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
        public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult p1) throws android.os.RemoteException {}
        public void startHandoverResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException {}
        public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioDataResponse {
        static final int TRANSACTION_acknowledgeRequest = 1;
        static final int TRANSACTION_allocatePduSessionIdResponse = 2;
        static final int TRANSACTION_cancelHandoverResponse = 3;
        static final int TRANSACTION_deactivateDataCallResponse = 4;
        static final int TRANSACTION_getDataCallListResponse = 5;
        static final int TRANSACTION_getSlicingConfigResponse = 6;
        static final int TRANSACTION_releasePduSessionIdResponse = 7;
        static final int TRANSACTION_setDataAllowedResponse = 8;
        static final int TRANSACTION_setDataProfileResponse = 9;
        static final int TRANSACTION_setDataThrottlingResponse = 10;
        static final int TRANSACTION_setInitialAttachApnResponse = 11;
        static final int TRANSACTION_setupDataCallResponse = 12;
        static final int TRANSACTION_startHandoverResponse = 13;
        static final int TRANSACTION_startKeepaliveResponse = 14;
        static final int TRANSACTION_stopKeepaliveResponse = 15;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.data.IRadioDataResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.data.IRadioDataResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeRequest(int p0) throws android.os.RemoteException {}
            public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0, int p1) throws android.os.RemoteException {}
            public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult[] p1) throws android.os.RemoteException {}
            public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SlicingConfig p1) throws android.os.RemoteException {}
            public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.SetupDataCallResult p1) throws android.os.RemoteException {}
            public void startHandoverResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.data.KeepaliveStatus p1) throws android.os.RemoteException {}
            public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
