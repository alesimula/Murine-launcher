package android.media.soundtrigger_middleware;

public interface IInjectModelEvent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.IInjectModelEvent";
    public void triggerUnloadModel() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.IInjectModelEvent {
        public Default() {}
        public void triggerUnloadModel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.IInjectModelEvent {
        static final int TRANSACTION_triggerUnloadModel = 1;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.IInjectModelEvent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.soundtrigger_middleware.IInjectModelEvent {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void triggerUnloadModel() throws android.os.RemoteException {}
        }
    }
}
