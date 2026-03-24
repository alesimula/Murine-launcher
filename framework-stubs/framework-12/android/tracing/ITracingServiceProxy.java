package android.tracing;

public interface ITracingServiceProxy extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.tracing.ITracingServiceProxy";
    public void notifyTraceSessionEnded(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.tracing.ITracingServiceProxy {
        public Default() {}
        public void notifyTraceSessionEnded(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.tracing.ITracingServiceProxy {
        static final int TRANSACTION_notifyTraceSessionEnded = 1;
        public Stub() { super(); }
        public static android.tracing.ITracingServiceProxy asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.tracing.ITracingServiceProxy p0) { return false; }
        public static android.tracing.ITracingServiceProxy getDefaultImpl() { return null; }

        private static class Proxy implements android.tracing.ITracingServiceProxy {
            private android.os.IBinder mRemote;
            public static android.tracing.ITracingServiceProxy sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyTraceSessionEnded(boolean p0) throws android.os.RemoteException {}
        }
    }
}
