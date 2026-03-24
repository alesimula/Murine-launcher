package android.hardware.iris;

public interface IIrisService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.iris.IIrisService";
    public void registerAuthenticators(java.util.List<android.hardware.biometrics.SensorPropertiesInternal> p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.iris.IIrisService {
        public Default() {}
        public void registerAuthenticators(java.util.List<android.hardware.biometrics.SensorPropertiesInternal> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.iris.IIrisService {
        static final int TRANSACTION_registerAuthenticators = 1;
        public Stub() { super(); }
        public static android.hardware.iris.IIrisService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.iris.IIrisService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerAuthenticators(java.util.List<android.hardware.biometrics.SensorPropertiesInternal> p0) throws android.os.RemoteException {}
        }
    }
}
