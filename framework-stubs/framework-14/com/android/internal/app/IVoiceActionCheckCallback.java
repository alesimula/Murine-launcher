package com.android.internal.app;

public interface IVoiceActionCheckCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceActionCheckCallback";
    public void onComplete(java.util.List<java.lang.String> p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceActionCheckCallback {
        public Default() {}
        public void onComplete(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceActionCheckCallback {
        static final int TRANSACTION_onComplete = 1;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceActionCheckCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IVoiceActionCheckCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onComplete(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        }
    }
}
