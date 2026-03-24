package android.service.smartspace;

public interface ISmartspaceService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.smartspace.ISmartspaceService";
    public void onCreateSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1) throws android.os.RemoteException;
    public void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1) throws android.os.RemoteException;
    public void requestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException;
    public void registerSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException;
    public void unregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException;
    public void onDestroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException;

    public static class Default implements android.service.smartspace.ISmartspaceService {
        public Default() {}
        public void onCreateSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1) throws android.os.RemoteException {}
        public void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1) throws android.os.RemoteException {}
        public void requestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
        public void registerSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
        public void unregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
        public void onDestroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.smartspace.ISmartspaceService {
        static final int TRANSACTION_onCreateSmartspaceSession = 1;
        static final int TRANSACTION_notifySmartspaceEvent = 2;
        static final int TRANSACTION_requestSmartspaceUpdate = 3;
        static final int TRANSACTION_registerSmartspaceUpdates = 4;
        static final int TRANSACTION_unregisterSmartspaceUpdates = 5;
        static final int TRANSACTION_onDestroySmartspaceSession = 6;
        public Stub() { super(); }
        public static android.service.smartspace.ISmartspaceService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.smartspace.ISmartspaceService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCreateSmartspaceSession(android.app.smartspace.SmartspaceConfig p0, android.app.smartspace.SmartspaceSessionId p1) throws android.os.RemoteException {}
            public void notifySmartspaceEvent(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.SmartspaceTargetEvent p1) throws android.os.RemoteException {}
            public void requestSmartspaceUpdate(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
            public void registerSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
            public void unregisterSmartspaceUpdates(android.app.smartspace.SmartspaceSessionId p0, android.app.smartspace.ISmartspaceCallback p1) throws android.os.RemoteException {}
            public void onDestroySmartspaceSession(android.app.smartspace.SmartspaceSessionId p0) throws android.os.RemoteException {}
        }
    }
}
