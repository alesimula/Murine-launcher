package android.os;

public interface IHardwarePropertiesManager extends android.os.IInterface {
    public float[] getDeviceTemperatures(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public android.os.CpuUsageInfo[] getCpuUsages(java.lang.String p0) throws android.os.RemoteException;
    public float[] getFanSpeeds(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.IHardwarePropertiesManager {
        public Default() {}
        public float[] getDeviceTemperatures(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
        public android.os.CpuUsageInfo[] getCpuUsages(java.lang.String p0) throws android.os.RemoteException { return null; }
        public float[] getFanSpeeds(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IHardwarePropertiesManager {
        private static final java.lang.String DESCRIPTOR = "android.os.IHardwarePropertiesManager";
        static final int TRANSACTION_getDeviceTemperatures = 1;
        static final int TRANSACTION_getCpuUsages = 2;
        static final int TRANSACTION_getFanSpeeds = 3;
        public Stub() { super(); }
        public static android.os.IHardwarePropertiesManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IHardwarePropertiesManager p0) { return false; }
        public static android.os.IHardwarePropertiesManager getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IHardwarePropertiesManager {
            private android.os.IBinder mRemote;
            public static android.os.IHardwarePropertiesManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public float[] getDeviceTemperatures(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return null; }
            public android.os.CpuUsageInfo[] getCpuUsages(java.lang.String p0) throws android.os.RemoteException { return null; }
            public float[] getFanSpeeds(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
