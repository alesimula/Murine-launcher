package com.android.internal.app;

public interface IVisualQueryDetectionAttentionListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVisualQueryDetectionAttentionListener";
    public void onAttentionGained(android.service.voice.VisualQueryAttentionResult p0) throws android.os.RemoteException;
    public void onAttentionLost(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVisualQueryDetectionAttentionListener {
        public Default() {}
        public void onAttentionGained(android.service.voice.VisualQueryAttentionResult p0) throws android.os.RemoteException {}
        public void onAttentionLost(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVisualQueryDetectionAttentionListener {
        static final int TRANSACTION_onAttentionGained = 1;
        static final int TRANSACTION_onAttentionLost = 2;
        public Stub() { super(); }
        public static com.android.internal.app.IVisualQueryDetectionAttentionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IVisualQueryDetectionAttentionListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAttentionGained(android.service.voice.VisualQueryAttentionResult p0) throws android.os.RemoteException {}
            public void onAttentionLost(int p0) throws android.os.RemoteException {}
        }
    }
}
