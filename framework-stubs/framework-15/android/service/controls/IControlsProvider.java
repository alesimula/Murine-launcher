package android.service.controls;

public interface IControlsProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.controls.IControlsProvider";
    public void load(android.service.controls.IControlsSubscriber p0) throws android.os.RemoteException;
    public void loadSuggested(android.service.controls.IControlsSubscriber p0) throws android.os.RemoteException;
    public void subscribe(java.util.List<java.lang.String> p0, android.service.controls.IControlsSubscriber p1) throws android.os.RemoteException;
    public void action(java.lang.String p0, android.service.controls.actions.ControlActionWrapper p1, android.service.controls.IControlsActionCallback p2) throws android.os.RemoteException;

    public static class Default implements android.service.controls.IControlsProvider {
        public Default() {}
        public void load(android.service.controls.IControlsSubscriber p0) throws android.os.RemoteException {}
        public void loadSuggested(android.service.controls.IControlsSubscriber p0) throws android.os.RemoteException {}
        public void subscribe(java.util.List<java.lang.String> p0, android.service.controls.IControlsSubscriber p1) throws android.os.RemoteException {}
        public void action(java.lang.String p0, android.service.controls.actions.ControlActionWrapper p1, android.service.controls.IControlsActionCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.controls.IControlsProvider {
        static final int TRANSACTION_load = 1;
        static final int TRANSACTION_loadSuggested = 2;
        static final int TRANSACTION_subscribe = 3;
        static final int TRANSACTION_action = 4;
        public Stub() { super(); }
        public static android.service.controls.IControlsProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.controls.IControlsProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void load(android.service.controls.IControlsSubscriber p0) throws android.os.RemoteException {}
            public void loadSuggested(android.service.controls.IControlsSubscriber p0) throws android.os.RemoteException {}
            public void subscribe(java.util.List<java.lang.String> p0, android.service.controls.IControlsSubscriber p1) throws android.os.RemoteException {}
            public void action(java.lang.String p0, android.service.controls.actions.ControlActionWrapper p1, android.service.controls.IControlsActionCallback p2) throws android.os.RemoteException {}
        }
    }
}
