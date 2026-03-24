package android.window;

public interface ITransitionMetricsReporter extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITransitionMetricsReporter";
    public void reportAnimationStart(android.os.IBinder p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.window.ITransitionMetricsReporter {
        public Default() {}
        public void reportAnimationStart(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITransitionMetricsReporter {
        static final int TRANSACTION_reportAnimationStart = 1;
        public Stub() { super(); }
        public static android.window.ITransitionMetricsReporter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.ITransitionMetricsReporter {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void reportAnimationStart(android.os.IBinder p0, long p1) throws android.os.RemoteException {}
        }
    }
}
