package android.uwb;

public interface IUwbAdapter extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.uwb.IUwbAdapter";
    public static final int RANGING_SESSION_OPEN_THRESHOLD_MS = 3000;
    public static final int RANGING_SESSION_START_THRESHOLD_MS = 3000;
    public static final int RANGING_SESSION_CLOSE_THRESHOLD_MS = 3000;
    public void registerAdapterStateCallbacks(android.uwb.IUwbAdapterStateCallbacks p0) throws android.os.RemoteException;
    public void unregisterAdapterStateCallbacks(android.uwb.IUwbAdapterStateCallbacks p0) throws android.os.RemoteException;
    public long getTimestampResolutionNanos() throws android.os.RemoteException;
    public android.os.PersistableBundle getSpecificationInfo() throws android.os.RemoteException;
    public void openRanging(android.content.AttributionSource p0, android.uwb.SessionHandle p1, android.uwb.IUwbRangingCallbacks p2, android.os.PersistableBundle p3) throws android.os.RemoteException;
    public void startRanging(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException;
    public void reconfigureRanging(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException;
    public void stopRanging(android.uwb.SessionHandle p0) throws android.os.RemoteException;
    public void closeRanging(android.uwb.SessionHandle p0) throws android.os.RemoteException;
    public void setEnabled(boolean p0) throws android.os.RemoteException;
    public int getAdapterState() throws android.os.RemoteException;

    public static class Default implements android.uwb.IUwbAdapter {
        public Default() {}
        public void registerAdapterStateCallbacks(android.uwb.IUwbAdapterStateCallbacks p0) throws android.os.RemoteException {}
        public void unregisterAdapterStateCallbacks(android.uwb.IUwbAdapterStateCallbacks p0) throws android.os.RemoteException {}
        public long getTimestampResolutionNanos() throws android.os.RemoteException { return 0L; }
        public android.os.PersistableBundle getSpecificationInfo() throws android.os.RemoteException { return null; }
        public void openRanging(android.content.AttributionSource p0, android.uwb.SessionHandle p1, android.uwb.IUwbRangingCallbacks p2, android.os.PersistableBundle p3) throws android.os.RemoteException {}
        public void startRanging(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public void reconfigureRanging(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
        public void stopRanging(android.uwb.SessionHandle p0) throws android.os.RemoteException {}
        public void closeRanging(android.uwb.SessionHandle p0) throws android.os.RemoteException {}
        public void setEnabled(boolean p0) throws android.os.RemoteException {}
        public int getAdapterState() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.uwb.IUwbAdapter {
        static final int TRANSACTION_registerAdapterStateCallbacks = 1;
        static final int TRANSACTION_unregisterAdapterStateCallbacks = 2;
        static final int TRANSACTION_getTimestampResolutionNanos = 3;
        static final int TRANSACTION_getSpecificationInfo = 4;
        static final int TRANSACTION_openRanging = 5;
        static final int TRANSACTION_startRanging = 6;
        static final int TRANSACTION_reconfigureRanging = 7;
        static final int TRANSACTION_stopRanging = 8;
        static final int TRANSACTION_closeRanging = 9;
        static final int TRANSACTION_setEnabled = 10;
        static final int TRANSACTION_getAdapterState = 11;
        public Stub() { super(); }
        public static android.uwb.IUwbAdapter asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.uwb.IUwbAdapter p0) { return false; }
        public static android.uwb.IUwbAdapter getDefaultImpl() { return null; }

        private static class Proxy implements android.uwb.IUwbAdapter {
            private android.os.IBinder mRemote;
            public static android.uwb.IUwbAdapter sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerAdapterStateCallbacks(android.uwb.IUwbAdapterStateCallbacks p0) throws android.os.RemoteException {}
            public void unregisterAdapterStateCallbacks(android.uwb.IUwbAdapterStateCallbacks p0) throws android.os.RemoteException {}
            public long getTimestampResolutionNanos() throws android.os.RemoteException { return 0L; }
            public android.os.PersistableBundle getSpecificationInfo() throws android.os.RemoteException { return null; }
            public void openRanging(android.content.AttributionSource p0, android.uwb.SessionHandle p1, android.uwb.IUwbRangingCallbacks p2, android.os.PersistableBundle p3) throws android.os.RemoteException {}
            public void startRanging(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
            public void reconfigureRanging(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) throws android.os.RemoteException {}
            public void stopRanging(android.uwb.SessionHandle p0) throws android.os.RemoteException {}
            public void closeRanging(android.uwb.SessionHandle p0) throws android.os.RemoteException {}
            public void setEnabled(boolean p0) throws android.os.RemoteException {}
            public int getAdapterState() throws android.os.RemoteException { return 0; }
        }
    }
}
