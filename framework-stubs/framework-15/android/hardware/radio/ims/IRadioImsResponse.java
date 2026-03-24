package android.hardware.radio.ims;

public interface IRadioImsResponse extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "ec0dfedf764f3916783848c540ad312a74fa755d";
    public static final java.lang.String DESCRIPTOR = null;
    public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) throws android.os.RemoteException;
    public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.ims.IRadioImsResponse {
        public Default() {}
        public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) throws android.os.RemoteException {}
        public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ims.IRadioImsResponse {
        static final int TRANSACTION_setSrvccCallInfoResponse = 1;
        static final int TRANSACTION_updateImsRegistrationInfoResponse = 2;
        static final int TRANSACTION_startImsTrafficResponse = 3;
        static final int TRANSACTION_stopImsTrafficResponse = 4;
        static final int TRANSACTION_triggerEpsFallbackResponse = 5;
        static final int TRANSACTION_sendAnbrQueryResponse = 6;
        static final int TRANSACTION_updateImsCallStatusResponse = 7;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.radio.ims.IRadioImsResponse asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.radio.ims.IRadioImsResponse {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0, android.hardware.radio.ims.ConnectionFailureInfo p1) throws android.os.RemoteException {}
            public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
