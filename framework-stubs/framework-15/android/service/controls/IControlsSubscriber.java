package android.service.controls;

public interface IControlsSubscriber extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.controls.IControlsSubscriber";
    public void onSubscribe(android.os.IBinder p0, android.service.controls.IControlsSubscription p1) throws android.os.RemoteException;
    public void onNext(android.os.IBinder p0, android.service.controls.Control p1) throws android.os.RemoteException;
    public void onError(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void onComplete(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.service.controls.IControlsSubscriber {
        public Default() {}
        public void onSubscribe(android.os.IBinder p0, android.service.controls.IControlsSubscription p1) throws android.os.RemoteException {}
        public void onNext(android.os.IBinder p0, android.service.controls.Control p1) throws android.os.RemoteException {}
        public void onError(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.controls.IControlsSubscriber {
        static final int TRANSACTION_onSubscribe = 1;
        static final int TRANSACTION_onNext = 2;
        static final int TRANSACTION_onError = 3;
        static final int TRANSACTION_onComplete = 4;
        public Stub() { super(); }
        public static android.service.controls.IControlsSubscriber asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.controls.IControlsSubscriber {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSubscribe(android.os.IBinder p0, android.service.controls.IControlsSubscription p1) throws android.os.RemoteException {}
            public void onNext(android.os.IBinder p0, android.service.controls.Control p1) throws android.os.RemoteException {}
            public void onError(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onComplete(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
