package android.telephony.ims.aidl;

public interface IImsMmTelListener extends android.os.IInterface {
    public void onIncomingCall(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void onVoiceMessageCountUpdate(int p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsMmTelListener {
        public Default() {}
        public void onIncomingCall(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void onVoiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsMmTelListener {
        private static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsMmTelListener";
        static final int TRANSACTION_onIncomingCall = 1;
        static final int TRANSACTION_onRejectedCall = 2;
        static final int TRANSACTION_onVoiceMessageCountUpdate = 3;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsMmTelListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.ims.aidl.IImsMmTelListener p0) { return false; }
        public static android.telephony.ims.aidl.IImsMmTelListener getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.ims.aidl.IImsMmTelListener {
            private android.os.IBinder mRemote;
            public static android.telephony.ims.aidl.IImsMmTelListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onIncomingCall(com.android.ims.internal.IImsCallSession p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
            public void onVoiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
        }
    }
}
