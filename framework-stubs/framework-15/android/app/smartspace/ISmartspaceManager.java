package android.app.smartspace;

public interface ISmartspaceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.smartspace.ISmartspaceManager";
    public void createSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1) throws android.os.RemoteException;
    public void requestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException;
    public void registerSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException;
    public void unregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException;
    public void destroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException;

    public static class Default implements android.app.smartspace.ISmartspaceManager {
        public Default() {}
        public void createSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1) throws android.os.RemoteException {}
        public void requestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
        public void registerSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
        public void unregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
        public void destroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.smartspace.ISmartspaceManager {
        static final int TRANSACTION_createSmartspaceSession = 1;
        static final int TRANSACTION_notifySmartspaceEvent = 2;
        static final int TRANSACTION_requestSmartspaceUpdate = 3;
        static final int TRANSACTION_registerSmartspaceUpdates = 4;
        static final int TRANSACTION_unregisterSmartspaceUpdates = 5;
        static final int TRANSACTION_destroySmartspaceSession = 6;
        public Stub() { super(); }
        public static android.app.smartspace.ISmartspaceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.smartspace.ISmartspaceManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1) throws android.os.RemoteException {}
            public void requestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
            public void registerSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
            public void unregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
            public void destroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
        }
    }
}
