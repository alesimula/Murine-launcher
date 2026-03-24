package android.os;

public interface IExternalVibrationController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IExternalVibrationController";
    public boolean mute() throws android.os.RemoteException;
    public boolean unmute() throws android.os.RemoteException;

    public static class Default implements android.os.IExternalVibrationController {
        public Default() {}
        public boolean mute() throws android.os.RemoteException { return false; }
        public boolean unmute() throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IExternalVibrationController {
        static final int TRANSACTION_mute = 1;
        static final int TRANSACTION_unmute = 2;
        public Stub() { super(); }
        public static android.os.IExternalVibrationController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IExternalVibrationController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean mute() throws android.os.RemoteException { return false; }
            public boolean unmute() throws android.os.RemoteException { return false; }
        }
    }
}
