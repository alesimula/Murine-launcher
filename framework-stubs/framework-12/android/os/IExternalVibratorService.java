package android.os;

public interface IExternalVibratorService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IExternalVibratorService";
    public static final int SCALE_MUTE = -100;
    public static final int SCALE_VERY_LOW = -2;
    public static final int SCALE_LOW = -1;
    public static final int SCALE_NONE = 0;
    public static final int SCALE_HIGH = 1;
    public static final int SCALE_VERY_HIGH = 2;
    public int onExternalVibrationStart(android.os.ExternalVibration p0) throws android.os.RemoteException;
    public void onExternalVibrationStop(android.os.ExternalVibration p0) throws android.os.RemoteException;

    public static class Default implements android.os.IExternalVibratorService {
        public Default() {}
        public int onExternalVibrationStart(android.os.ExternalVibration p0) throws android.os.RemoteException { return 0; }
        public void onExternalVibrationStop(android.os.ExternalVibration p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IExternalVibratorService {
        static final int TRANSACTION_onExternalVibrationStart = 1;
        static final int TRANSACTION_onExternalVibrationStop = 2;
        public Stub() { super(); }
        public static android.os.IExternalVibratorService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IExternalVibratorService p0) { return false; }
        public static android.os.IExternalVibratorService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IExternalVibratorService {
            private android.os.IBinder mRemote;
            public static android.os.IExternalVibratorService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int onExternalVibrationStart(android.os.ExternalVibration p0) throws android.os.RemoteException { return 0; }
            public void onExternalVibrationStop(android.os.ExternalVibration p0) throws android.os.RemoteException {}
        }
    }
}
