package com.android.ims.internal;

public interface IImsUtListener extends android.os.IInterface {
    public void utConfigurationUpdated(com.android.ims.internal.IImsUt p0, int p1) throws android.os.RemoteException;
    public void utConfigurationUpdateFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException;
    public void utConfigurationQueried(com.android.ims.internal.IImsUt p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void utConfigurationQueryFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException;
    public void lineIdentificationSupplementaryServiceResponse(int p0, android.telephony.ims.ImsSsInfo p1) throws android.os.RemoteException;
    public void utConfigurationCallBarringQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException;
    public void utConfigurationCallForwardQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsCallForwardInfo[] p2) throws android.os.RemoteException;
    public void utConfigurationCallWaitingQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException;
    public void onSupplementaryServiceIndication(android.telephony.ims.ImsSsData p0) throws android.os.RemoteException;

    public static class Default implements com.android.ims.internal.IImsUtListener {
        public Default() {}
        public void utConfigurationUpdated(com.android.ims.internal.IImsUt p0, int p1) throws android.os.RemoteException {}
        public void utConfigurationUpdateFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
        public void utConfigurationQueried(com.android.ims.internal.IImsUt p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void utConfigurationQueryFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
        public void lineIdentificationSupplementaryServiceResponse(int p0, android.telephony.ims.ImsSsInfo p1) throws android.os.RemoteException {}
        public void utConfigurationCallBarringQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException {}
        public void utConfigurationCallForwardQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsCallForwardInfo[] p2) throws android.os.RemoteException {}
        public void utConfigurationCallWaitingQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException {}
        public void onSupplementaryServiceIndication(android.telephony.ims.ImsSsData p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsUtListener {
        public static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsUtListener";
        static final int TRANSACTION_utConfigurationUpdated = 1;
        static final int TRANSACTION_utConfigurationUpdateFailed = 2;
        static final int TRANSACTION_utConfigurationQueried = 3;
        static final int TRANSACTION_utConfigurationQueryFailed = 4;
        static final int TRANSACTION_lineIdentificationSupplementaryServiceResponse = 5;
        static final int TRANSACTION_utConfigurationCallBarringQueried = 6;
        static final int TRANSACTION_utConfigurationCallForwardQueried = 7;
        static final int TRANSACTION_utConfigurationCallWaitingQueried = 8;
        static final int TRANSACTION_onSupplementaryServiceIndication = 9;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsUtListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsUtListener p0) { return false; }
        public static com.android.ims.internal.IImsUtListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsUtListener {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsUtListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void utConfigurationUpdated(com.android.ims.internal.IImsUt p0, int p1) throws android.os.RemoteException {}
            public void utConfigurationUpdateFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
            public void utConfigurationQueried(com.android.ims.internal.IImsUt p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void utConfigurationQueryFailed(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsReasonInfo p2) throws android.os.RemoteException {}
            public void lineIdentificationSupplementaryServiceResponse(int p0, android.telephony.ims.ImsSsInfo p1) throws android.os.RemoteException {}
            public void utConfigurationCallBarringQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException {}
            public void utConfigurationCallForwardQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsCallForwardInfo[] p2) throws android.os.RemoteException {}
            public void utConfigurationCallWaitingQueried(com.android.ims.internal.IImsUt p0, int p1, android.telephony.ims.ImsSsInfo[] p2) throws android.os.RemoteException {}
            public void onSupplementaryServiceIndication(android.telephony.ims.ImsSsData p0) throws android.os.RemoteException {}
        }
    }
}
