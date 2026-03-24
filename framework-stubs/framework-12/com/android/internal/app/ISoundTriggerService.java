package com.android.internal.app;

public interface ISoundTriggerService extends android.os.IInterface {
    public com.android.internal.app.ISoundTriggerSession attachAsOriginator(android.media.permission.Identity p0, android.os.IBinder p1) throws android.os.RemoteException;
    public com.android.internal.app.ISoundTriggerSession attachAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1, android.os.IBinder p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.ISoundTriggerService {
        public Default() {}
        public com.android.internal.app.ISoundTriggerSession attachAsOriginator(android.media.permission.Identity p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
        public com.android.internal.app.ISoundTriggerSession attachAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.ISoundTriggerService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.app.ISoundTriggerService";
        static final int TRANSACTION_attachAsOriginator = 1;
        static final int TRANSACTION_attachAsMiddleman = 2;
        public Stub() { super(); }
        public static com.android.internal.app.ISoundTriggerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.app.ISoundTriggerService p0) { return false; }
        public static com.android.internal.app.ISoundTriggerService getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.app.ISoundTriggerService {
            private android.os.IBinder mRemote;
            public static com.android.internal.app.ISoundTriggerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.internal.app.ISoundTriggerSession attachAsOriginator(android.media.permission.Identity p0, android.os.IBinder p1) throws android.os.RemoteException { return null; }
            public com.android.internal.app.ISoundTriggerSession attachAsMiddleman(android.media.permission.Identity p0, android.media.permission.Identity p1, android.os.IBinder p2) throws android.os.RemoteException { return null; }
        }
    }
}
