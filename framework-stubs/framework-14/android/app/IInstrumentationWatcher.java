package android.app;

public interface IInstrumentationWatcher extends android.os.IInterface {
    public void instrumentationStatus(android.content.ComponentName p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void instrumentationFinished(android.content.ComponentName p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static class Default implements android.app.IInstrumentationWatcher {
        public Default() {}
        public void instrumentationStatus(android.content.ComponentName p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void instrumentationFinished(android.content.ComponentName p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IInstrumentationWatcher {
        public static final java.lang.String DESCRIPTOR = "android.app.IInstrumentationWatcher";
        static final int TRANSACTION_instrumentationStatus = 1;
        static final int TRANSACTION_instrumentationFinished = 2;
        public Stub() { super(); }
        public static android.app.IInstrumentationWatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IInstrumentationWatcher {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void instrumentationStatus(android.content.ComponentName p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void instrumentationFinished(android.content.ComponentName p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        }
    }
}
