package com.android.internal.app;

public interface IVisualQueryRecognitionStatusListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.IVisualQueryRecognitionStatusListener";
    public void onStartPerceiving() throws android.os.RemoteException;
    public void onStopPerceiving() throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.IVisualQueryRecognitionStatusListener {
        public Default() {}
        public void onStartPerceiving() throws android.os.RemoteException {}
        public void onStopPerceiving() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.IVisualQueryRecognitionStatusListener {
        static final int TRANSACTION_onStartPerceiving = 1;
        static final int TRANSACTION_onStopPerceiving = 2;
        public Stub() { super(); }
        public static com.android.internal.app.IVisualQueryRecognitionStatusListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.IVisualQueryRecognitionStatusListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStartPerceiving() throws android.os.RemoteException {}
            public void onStopPerceiving() throws android.os.RemoteException {}
        }
    }
}
