package android.media;

public interface IRecordingConfigDispatcher extends android.os.IInterface {
    public void dispatchRecordingConfigChange(java.util.List<android.media.AudioRecordingConfiguration> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.media.IRecordingConfigDispatcher {
        private static final java.lang.String DESCRIPTOR = "android.media.IRecordingConfigDispatcher";
        static final int TRANSACTION_dispatchRecordingConfigChange = 1;
        public Stub() { super(); }
        public static android.media.IRecordingConfigDispatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IRecordingConfigDispatcher p0) { return false; }
        public static android.media.IRecordingConfigDispatcher getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IRecordingConfigDispatcher {
            private android.os.IBinder mRemote;
            public static android.media.IRecordingConfigDispatcher sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchRecordingConfigChange(java.util.List<android.media.AudioRecordingConfiguration> p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.media.IRecordingConfigDispatcher {
        public Default() {}
        public void dispatchRecordingConfigChange(java.util.List<android.media.AudioRecordingConfiguration> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
