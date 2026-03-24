package com.android.internal.textservice;

public interface ITextServicesSessionListener extends android.os.IInterface {
    public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.textservice.ITextServicesSessionListener {
        public Default() {}
        public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.textservice.ITextServicesSessionListener {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.textservice.ITextServicesSessionListener";
        static final int TRANSACTION_onServiceConnected = 1;
        public Stub() { super(); }
        public static com.android.internal.textservice.ITextServicesSessionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.textservice.ITextServicesSessionListener p0) { return false; }
        public static com.android.internal.textservice.ITextServicesSessionListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.textservice.ITextServicesSessionListener {
            private android.os.IBinder mRemote;
            public static com.android.internal.textservice.ITextServicesSessionListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onServiceConnected(com.android.internal.textservice.ISpellCheckerSession p0) throws android.os.RemoteException {}
        }
    }
}
