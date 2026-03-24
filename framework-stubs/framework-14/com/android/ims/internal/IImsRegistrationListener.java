package com.android.ims.internal;

public interface IImsRegistrationListener extends android.os.IInterface {
    @java.lang.Deprecated
    public void registrationConnected() throws android.os.RemoteException;
    @java.lang.Deprecated
    public void registrationProgressing() throws android.os.RemoteException;
    public void registrationConnectedWithRadioTech(int p0) throws android.os.RemoteException;
    public void registrationProgressingWithRadioTech(int p0) throws android.os.RemoteException;
    public void registrationDisconnected(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException;
    public void registrationResumed() throws android.os.RemoteException;
    public void registrationSuspended() throws android.os.RemoteException;
    public void registrationServiceCapabilityChanged(int p0, int p1) throws android.os.RemoteException;
    public void registrationFeatureCapabilityChanged(int p0, int[] p1, int[] p2) throws android.os.RemoteException;
    public void voiceMessageCountUpdate(int p0) throws android.os.RemoteException;
    public void registrationAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException;
    public void registrationChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsRegistrationListener {
        public Default() {}
        public void registrationConnected() throws android.os.RemoteException {}
        public void registrationProgressing() throws android.os.RemoteException {}
        public void registrationConnectedWithRadioTech(int p0) throws android.os.RemoteException {}
        public void registrationProgressingWithRadioTech(int p0) throws android.os.RemoteException {}
        public void registrationDisconnected(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
        public void registrationResumed() throws android.os.RemoteException {}
        public void registrationSuspended() throws android.os.RemoteException {}
        public void registrationServiceCapabilityChanged(int p0, int p1) throws android.os.RemoteException {}
        public void registrationFeatureCapabilityChanged(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
        public void voiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
        public void registrationAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
        public void registrationChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsRegistrationListener {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsRegistrationListener";
        static final int TRANSACTION_registrationConnected = 1;
        static final int TRANSACTION_registrationProgressing = 2;
        static final int TRANSACTION_registrationConnectedWithRadioTech = 3;
        static final int TRANSACTION_registrationProgressingWithRadioTech = 4;
        static final int TRANSACTION_registrationDisconnected = 5;
        static final int TRANSACTION_registrationResumed = 6;
        static final int TRANSACTION_registrationSuspended = 7;
        static final int TRANSACTION_registrationServiceCapabilityChanged = 8;
        static final int TRANSACTION_registrationFeatureCapabilityChanged = 9;
        static final int TRANSACTION_voiceMessageCountUpdate = 10;
        static final int TRANSACTION_registrationAssociatedUriChanged = 11;
        static final int TRANSACTION_registrationChangeFailed = 12;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsRegistrationListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.ims.internal.IImsRegistrationListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registrationConnected() throws android.os.RemoteException {}
            public void registrationProgressing() throws android.os.RemoteException {}
            public void registrationConnectedWithRadioTech(int p0) throws android.os.RemoteException {}
            public void registrationProgressingWithRadioTech(int p0) throws android.os.RemoteException {}
            public void registrationDisconnected(android.telephony.ims.ImsReasonInfo p0) throws android.os.RemoteException {}
            public void registrationResumed() throws android.os.RemoteException {}
            public void registrationSuspended() throws android.os.RemoteException {}
            public void registrationServiceCapabilityChanged(int p0, int p1) throws android.os.RemoteException {}
            public void registrationFeatureCapabilityChanged(int p0, int[] p1, int[] p2) throws android.os.RemoteException {}
            public void voiceMessageCountUpdate(int p0) throws android.os.RemoteException {}
            public void registrationAssociatedUriChanged(android.net.Uri[] p0) throws android.os.RemoteException {}
            public void registrationChangeFailed(int p0, android.telephony.ims.ImsReasonInfo p1) throws android.os.RemoteException {}
        }
    }
}
