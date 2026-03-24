package android.telephony.ims.aidl;

public interface IImsMmTelListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.ims.aidl.IImsMmTelListener";
    public android.telephony.ims.aidl.IImsCallSessionListener onIncomingCall(com.android.ims.internal.IImsCallSession p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;
    public void onVoiceMessageCountUpdate(int p0) throws android.os.RemoteException;
    public void onAudioModeIsVoipChanged(int p0) throws android.os.RemoteException;
    public void onTriggerEpsFallback(int p0) throws android.os.RemoteException;
    public void onStartImsTrafficSession(int p0, int p1, int p2, int p3, android.telephony.ims.aidl.IImsTrafficSessionCallback p4) throws android.os.RemoteException;
    public void onModifyImsTrafficSession(int p0, int p1) throws android.os.RemoteException;
    public void onStopImsTrafficSession(int p0) throws android.os.RemoteException;
    public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) throws android.os.RemoteException;

    public static class Default implements android.telephony.ims.aidl.IImsMmTelListener {
        public Default() {}
        public android.telephony.ims.aidl.IImsCallSessionListener onIncomingCall(com.android.ims.internal.IImsCallSession p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
        public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public void onVoiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
        public void onAudioModeIsVoipChanged(int p0) throws android.os.RemoteException {}
        public void onTriggerEpsFallback(int p0) throws android.os.RemoteException {}
        public void onStartImsTrafficSession(int p0, int p1, int p2, int p3, android.telephony.ims.aidl.IImsTrafficSessionCallback p4) throws android.os.RemoteException {}
        public void onModifyImsTrafficSession(int p0, int p1) throws android.os.RemoteException {}
        public void onStopImsTrafficSession(int p0) throws android.os.RemoteException {}
        public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.ims.aidl.IImsMmTelListener {
        static final int TRANSACTION_onIncomingCall = 1;
        static final int TRANSACTION_onRejectedCall = 2;
        static final int TRANSACTION_onVoiceMessageCountUpdate = 3;
        static final int TRANSACTION_onAudioModeIsVoipChanged = 4;
        static final int TRANSACTION_onTriggerEpsFallback = 5;
        static final int TRANSACTION_onStartImsTrafficSession = 6;
        static final int TRANSACTION_onModifyImsTrafficSession = 7;
        static final int TRANSACTION_onStopImsTrafficSession = 8;
        static final int TRANSACTION_onMediaQualityStatusChanged = 9;
        public Stub() { super(); }
        public static android.telephony.ims.aidl.IImsMmTelListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.ims.aidl.IImsMmTelListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.telephony.ims.aidl.IImsCallSessionListener onIncomingCall(com.android.ims.internal.IImsCallSession p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException { return null; }
            public void onRejectedCall(android.telephony.ims.ImsCallProfile p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
            public void onVoiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
            public void onAudioModeIsVoipChanged(int p0) throws android.os.RemoteException {}
            public void onTriggerEpsFallback(int p0) throws android.os.RemoteException {}
            public void onStartImsTrafficSession(int p0, int p1, int p2, int p3, android.telephony.ims.aidl.IImsTrafficSessionCallback p4) throws android.os.RemoteException {}
            public void onModifyImsTrafficSession(int p0, int p1) throws android.os.RemoteException {}
            public void onStopImsTrafficSession(int p0) throws android.os.RemoteException {}
            public void onMediaQualityStatusChanged(android.telephony.ims.MediaQualityStatus p0) throws android.os.RemoteException {}
        }
    }
}
