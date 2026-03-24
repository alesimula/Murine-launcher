package android.app.prediction;

public interface IPredictionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.prediction.IPredictionManager";
    public void createPredictionSession(android.app.prediction.AppPredictionContext p0, android.app.prediction.AppPredictionSessionId p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void notifyAppTargetEvent(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.AppTargetEvent p1) throws android.os.RemoteException;
    public void notifyLaunchLocationShown(android.app.prediction.AppPredictionSessionId p0, java.lang.String p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException;
    public void sortAppTargets(android.app.prediction.AppPredictionSessionId p0, android.content.pm.ParceledListSlice p1, android.app.prediction.IPredictionCallback p2) throws android.os.RemoteException;
    public void registerPredictionUpdates(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.IPredictionCallback p1) throws android.os.RemoteException;
    public void unregisterPredictionUpdates(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.IPredictionCallback p1) throws android.os.RemoteException;
    public void requestPredictionUpdate(android.app.prediction.AppPredictionSessionId p0) throws android.os.RemoteException;
    public void onDestroyPredictionSession(android.app.prediction.AppPredictionSessionId p0) throws android.os.RemoteException;

    public static class Default implements android.app.prediction.IPredictionManager {
        public Default() {}
        public void createPredictionSession(android.app.prediction.AppPredictionContext p0, android.app.prediction.AppPredictionSessionId p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void notifyAppTargetEvent(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.AppTargetEvent p1) throws android.os.RemoteException {}
        public void notifyLaunchLocationShown(android.app.prediction.AppPredictionSessionId p0, java.lang.String p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
        public void sortAppTargets(android.app.prediction.AppPredictionSessionId p0, android.content.pm.ParceledListSlice p1, android.app.prediction.IPredictionCallback p2) throws android.os.RemoteException {}
        public void registerPredictionUpdates(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.IPredictionCallback p1) throws android.os.RemoteException {}
        public void unregisterPredictionUpdates(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.IPredictionCallback p1) throws android.os.RemoteException {}
        public void requestPredictionUpdate(android.app.prediction.AppPredictionSessionId p0) throws android.os.RemoteException {}
        public void onDestroyPredictionSession(android.app.prediction.AppPredictionSessionId p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.prediction.IPredictionManager {
        static final int TRANSACTION_createPredictionSession = 1;
        static final int TRANSACTION_notifyAppTargetEvent = 2;
        static final int TRANSACTION_notifyLaunchLocationShown = 3;
        static final int TRANSACTION_sortAppTargets = 4;
        static final int TRANSACTION_registerPredictionUpdates = 5;
        static final int TRANSACTION_unregisterPredictionUpdates = 6;
        static final int TRANSACTION_requestPredictionUpdate = 7;
        static final int TRANSACTION_onDestroyPredictionSession = 8;
        public Stub() { super(); }
        public static android.app.prediction.IPredictionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.prediction.IPredictionManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createPredictionSession(android.app.prediction.AppPredictionContext p0, android.app.prediction.AppPredictionSessionId p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void notifyAppTargetEvent(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.AppTargetEvent p1) throws android.os.RemoteException {}
            public void notifyLaunchLocationShown(android.app.prediction.AppPredictionSessionId p0, java.lang.String p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
            public void sortAppTargets(android.app.prediction.AppPredictionSessionId p0, android.content.pm.ParceledListSlice p1, android.app.prediction.IPredictionCallback p2) throws android.os.RemoteException {}
            public void registerPredictionUpdates(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.IPredictionCallback p1) throws android.os.RemoteException {}
            public void unregisterPredictionUpdates(android.app.prediction.AppPredictionSessionId p0, android.app.prediction.IPredictionCallback p1) throws android.os.RemoteException {}
            public void requestPredictionUpdate(android.app.prediction.AppPredictionSessionId p0) throws android.os.RemoteException {}
            public void onDestroyPredictionSession(android.app.prediction.AppPredictionSessionId p0) throws android.os.RemoteException {}
        }
    }
}
