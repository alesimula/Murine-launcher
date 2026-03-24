package com.android.modules.utils;

public interface ISynchronousResultReceiver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.modules.utils.ISynchronousResultReceiver";
    public void send(com.android.modules.utils.SynchronousResultReceiver.Result p0) throws android.os.RemoteException;

    public static class Default implements com.android.modules.utils.ISynchronousResultReceiver {
        public Default() {}
        public void send(com.android.modules.utils.SynchronousResultReceiver.Result p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.modules.utils.ISynchronousResultReceiver {
        static final int TRANSACTION_send = 1;
        public Stub() { super(); }
        public static com.android.modules.utils.ISynchronousResultReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements com.android.modules.utils.ISynchronousResultReceiver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void send(com.android.modules.utils.SynchronousResultReceiver.Result p0) throws android.os.RemoteException {}
        }
    }
}
