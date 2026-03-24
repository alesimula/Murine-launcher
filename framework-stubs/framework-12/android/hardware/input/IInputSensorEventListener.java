package android.hardware.input;

public interface IInputSensorEventListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IInputSensorEventListener";
    public void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) throws android.os.RemoteException;
    public void onInputSensorAccuracyChanged(int p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IInputSensorEventListener {
        public Default() {}
        public void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) throws android.os.RemoteException {}
        public void onInputSensorAccuracyChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IInputSensorEventListener {
        static final int TRANSACTION_onInputSensorChanged = 1;
        static final int TRANSACTION_onInputSensorAccuracyChanged = 2;
        public Stub() { super(); }
        public static android.hardware.input.IInputSensorEventListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.input.IInputSensorEventListener p0) { return false; }
        public static android.hardware.input.IInputSensorEventListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.input.IInputSensorEventListener {
            private android.os.IBinder mRemote;
            public static android.hardware.input.IInputSensorEventListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInputSensorChanged(int p0, int p1, int p2, long p3, float[] p4) throws android.os.RemoteException {}
            public void onInputSensorAccuracyChanged(int p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
