package android.location;

public interface IGnssStatusListener extends android.os.IInterface {
    public void onGnssStarted() throws android.os.RemoteException;
    public void onGnssStopped() throws android.os.RemoteException;
    public void onFirstFix(int p0) throws android.os.RemoteException;
    public void onSvStatusChanged(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5, float[] p6) throws android.os.RemoteException;
    public void onNmeaReceived(long p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.location.IGnssStatusListener {
        public Default() {}
        public void onGnssStarted() throws android.os.RemoteException {}
        public void onGnssStopped() throws android.os.RemoteException {}
        public void onFirstFix(int p0) throws android.os.RemoteException {}
        public void onSvStatusChanged(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5, float[] p6) throws android.os.RemoteException {}
        public void onNmeaReceived(long p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.IGnssStatusListener {
        private static final java.lang.String DESCRIPTOR = "android.location.IGnssStatusListener";
        static final int TRANSACTION_onGnssStarted = 1;
        static final int TRANSACTION_onGnssStopped = 2;
        static final int TRANSACTION_onFirstFix = 3;
        static final int TRANSACTION_onSvStatusChanged = 4;
        static final int TRANSACTION_onNmeaReceived = 5;
        public Stub() { super(); }
        public static android.location.IGnssStatusListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.location.IGnssStatusListener p0) { return false; }
        public static android.location.IGnssStatusListener getDefaultImpl() { return null; }

        private static class Proxy implements android.location.IGnssStatusListener {
            private android.os.IBinder mRemote;
            public static android.location.IGnssStatusListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGnssStarted() throws android.os.RemoteException {}
            public void onGnssStopped() throws android.os.RemoteException {}
            public void onFirstFix(int p0) throws android.os.RemoteException {}
            public void onSvStatusChanged(int p0, int[] p1, float[] p2, float[] p3, float[] p4, float[] p5, float[] p6) throws android.os.RemoteException {}
            public void onNmeaReceived(long p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
