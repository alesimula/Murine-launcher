package android.os;

public interface IExternalVibratorService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IExternalVibratorService";
    public android.os.ExternalVibrationScale onExternalVibrationStart(android.os.ExternalVibration p0) throws android.os.RemoteException;
    public void onExternalVibrationStop(android.os.ExternalVibration p0) throws android.os.RemoteException;

    public static class Default implements android.os.IExternalVibratorService {
        public Default() {}
        public android.os.ExternalVibrationScale onExternalVibrationStart(android.os.ExternalVibration p0) throws android.os.RemoteException { return null; }
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
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IExternalVibratorService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ExternalVibrationScale onExternalVibrationStart(android.os.ExternalVibration p0) throws android.os.RemoteException { return null; }
            public void onExternalVibrationStop(android.os.ExternalVibration p0) throws android.os.RemoteException {}
        }
    }
}
