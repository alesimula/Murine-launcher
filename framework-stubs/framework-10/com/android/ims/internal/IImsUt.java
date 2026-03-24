package com.android.ims.internal;

public interface IImsUt extends android.os.IInterface {
    public void close() throws android.os.RemoteException;
    public int queryCallBarring(int p0) throws android.os.RemoteException;
    public int queryCallForward(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int queryCallWaiting() throws android.os.RemoteException;
    public int queryCLIR() throws android.os.RemoteException;
    public int queryCLIP() throws android.os.RemoteException;
    public int queryCOLR() throws android.os.RemoteException;
    public int queryCOLP() throws android.os.RemoteException;
    public int transact(android.os.Bundle p0) throws android.os.RemoteException;
    public int updateCallBarring(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException;
    public int updateCallForward(int p0, int p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException;
    public int updateCallWaiting(boolean p0, int p1) throws android.os.RemoteException;
    public int updateCLIR(int p0) throws android.os.RemoteException;
    public int updateCLIP(boolean p0) throws android.os.RemoteException;
    public int updateCOLR(int p0) throws android.os.RemoteException;
    public int updateCOLP(boolean p0) throws android.os.RemoteException;
    public void setListener(com.android.ims.internal.IImsUtListener p0) throws android.os.RemoteException;
    public int queryCallBarringForServiceClass(int p0, int p1) throws android.os.RemoteException;
    public int updateCallBarringForServiceClass(int p0, int p1, java.lang.String[] p2, int p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.ims.internal.IImsUt {
        private static final java.lang.String DESCRIPTOR = "com.android.ims.internal.IImsUt";
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_queryCallBarring = 2;
        static final int TRANSACTION_queryCallForward = 3;
        static final int TRANSACTION_queryCallWaiting = 4;
        static final int TRANSACTION_queryCLIR = 5;
        static final int TRANSACTION_queryCLIP = 6;
        static final int TRANSACTION_queryCOLR = 7;
        static final int TRANSACTION_queryCOLP = 8;
        static final int TRANSACTION_transact = 9;
        static final int TRANSACTION_updateCallBarring = 10;
        static final int TRANSACTION_updateCallForward = 11;
        static final int TRANSACTION_updateCallWaiting = 12;
        static final int TRANSACTION_updateCLIR = 13;
        static final int TRANSACTION_updateCLIP = 14;
        static final int TRANSACTION_updateCOLR = 15;
        static final int TRANSACTION_updateCOLP = 16;
        static final int TRANSACTION_setListener = 17;
        static final int TRANSACTION_queryCallBarringForServiceClass = 18;
        static final int TRANSACTION_updateCallBarringForServiceClass = 19;
        public Stub() { super(); }
        public static com.android.ims.internal.IImsUt asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.ims.internal.IImsUt p0) { return false; }
        public static com.android.ims.internal.IImsUt getDefaultImpl() { return null; }

        private static class Proxy implements com.android.ims.internal.IImsUt {
            private android.os.IBinder mRemote;
            public static com.android.ims.internal.IImsUt sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
            public int queryCallBarring(int p0) throws android.os.RemoteException { return 0; }
            public int queryCallForward(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int queryCallWaiting() throws android.os.RemoteException { return 0; }
            public int queryCLIR() throws android.os.RemoteException { return 0; }
            public int queryCLIP() throws android.os.RemoteException { return 0; }
            public int queryCOLR() throws android.os.RemoteException { return 0; }
            public int queryCOLP() throws android.os.RemoteException { return 0; }
            public int transact(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
            public int updateCallBarring(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException { return 0; }
            public int updateCallForward(int p0, int p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
            public int updateCallWaiting(boolean p0, int p1) throws android.os.RemoteException { return 0; }
            public int updateCLIR(int p0) throws android.os.RemoteException { return 0; }
            public int updateCLIP(boolean p0) throws android.os.RemoteException { return 0; }
            public int updateCOLR(int p0) throws android.os.RemoteException { return 0; }
            public int updateCOLP(boolean p0) throws android.os.RemoteException { return 0; }
            public void setListener(com.android.ims.internal.IImsUtListener p0) throws android.os.RemoteException {}
            public int queryCallBarringForServiceClass(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int updateCallBarringForServiceClass(int p0, int p1, java.lang.String[] p2, int p3) throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements com.android.ims.internal.IImsUt {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public int queryCallBarring(int p0) throws android.os.RemoteException { return 0; }
        public int queryCallForward(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int queryCallWaiting() throws android.os.RemoteException { return 0; }
        public int queryCLIR() throws android.os.RemoteException { return 0; }
        public int queryCLIP() throws android.os.RemoteException { return 0; }
        public int queryCOLR() throws android.os.RemoteException { return 0; }
        public int queryCOLP() throws android.os.RemoteException { return 0; }
        public int transact(android.os.Bundle p0) throws android.os.RemoteException { return 0; }
        public int updateCallBarring(int p0, int p1, java.lang.String[] p2) throws android.os.RemoteException { return 0; }
        public int updateCallForward(int p0, int p1, java.lang.String p2, int p3, int p4) throws android.os.RemoteException { return 0; }
        public int updateCallWaiting(boolean p0, int p1) throws android.os.RemoteException { return 0; }
        public int updateCLIR(int p0) throws android.os.RemoteException { return 0; }
        public int updateCLIP(boolean p0) throws android.os.RemoteException { return 0; }
        public int updateCOLR(int p0) throws android.os.RemoteException { return 0; }
        public int updateCOLP(boolean p0) throws android.os.RemoteException { return 0; }
        public void setListener(com.android.ims.internal.IImsUtListener p0) throws android.os.RemoteException {}
        public int queryCallBarringForServiceClass(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int updateCallBarringForServiceClass(int p0, int p1, java.lang.String[] p2, int p3) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
