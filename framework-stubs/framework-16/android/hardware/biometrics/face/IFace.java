package android.hardware.biometrics.face;

public interface IFace extends android.os.IInterface {
    public static final int VERSION = 4;
    public static final java.lang.String HASH = "c43fbb9be4a662cc9ace640dba21cccdb84c6c21";
    public static final java.lang.String DESCRIPTOR = null;
    public android.hardware.biometrics.face.SensorProps[] getSensorProps() throws android.os.RemoteException;
    public android.hardware.biometrics.face.ISession createSession(int p0, int p1, android.hardware.biometrics.face.ISessionCallback p2) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.face.IFace {
        public Default() {}
        public android.hardware.biometrics.face.SensorProps[] getSensorProps() throws android.os.RemoteException { return null; }
        public android.hardware.biometrics.face.ISession createSession(int p0, int p1, android.hardware.biometrics.face.ISessionCallback p2) throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.face.IFace {
        static final int TRANSACTION_getSensorProps = 1;
        static final int TRANSACTION_createSession = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.biometrics.face.IFace asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.biometrics.face.IFace {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.biometrics.face.SensorProps[] getSensorProps() throws android.os.RemoteException { return null; }
            public android.hardware.biometrics.face.ISession createSession(int p0, int p1, android.hardware.biometrics.face.ISessionCallback p2) throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
