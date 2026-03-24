package com.android.internal.app;

public interface IVoiceInteractionSessionListener extends android.os.IInterface {
    public void onVoiceSessionShown() throws android.os.RemoteException;
    public void onVoiceSessionHidden() throws android.os.RemoteException;
    public void onSetUiHints(android.os.Bundle p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVoiceInteractionSessionListener {
        public Default() {}
        public void onVoiceSessionShown() throws android.os.RemoteException {}
        public void onVoiceSessionHidden() throws android.os.RemoteException {}
        public void onSetUiHints(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVoiceInteractionSessionListener {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVoiceInteractionSessionListener";
        static final int TRANSACTION_onVoiceSessionShown = 1;
        static final int TRANSACTION_onVoiceSessionHidden = 2;
        static final int TRANSACTION_onSetUiHints = 3;
        public Stub() { super(); }
        public static com.android.internal.app.IVoiceInteractionSessionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.IVoiceInteractionSessionListener p0) { return false; }
        public static com.android.internal.app.IVoiceInteractionSessionListener getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.IVoiceInteractionSessionListener {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.IVoiceInteractionSessionListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onVoiceSessionShown() throws android.os.RemoteException {}
            public void onVoiceSessionHidden() throws android.os.RemoteException {}
            public void onSetUiHints(android.os.Bundle p0) throws android.os.RemoteException {}
        }
    }
}
