package com.android.internal.app;

public interface IVoiceInteractionSessionShowCallback extends android.os.IInterface {
    public void onFailed() throws android.os.RemoteException;
    public void onShown() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionSessionShowCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionSessionShowCallback";
        static final int TRANSACTION_onFailed = 1;
        static final int TRANSACTION_onShown = 2;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractionSessionShowCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IVoiceInteractionSessionShowCallback p0) { return false; }
        public static com.android.internal.app.IVoiceInteractionSessionShowCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractionSessionShowCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IVoiceInteractionSessionShowCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailed() throws android.os.RemoteException {}
            public void onShown() throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.app.IVoiceInteractionSessionShowCallback {
        public Default() {}
        public void onFailed() throws android.os.RemoteException {}
        public void onShown() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
