package android.hardware.camera2.extension;

public interface ISessionProcessorImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.ISessionProcessorImpl";
    public android.hardware.camera2.extension.CameraSessionConfig initSession(java.lang.String p0, android.hardware.camera2.extension.OutputSurface p1, android.hardware.camera2.extension.OutputSurface p2) throws android.os.RemoteException;
    public void deInitSession() throws android.os.RemoteException;
    public void onCaptureSessionStart(android.hardware.camera2.extension.IRequestProcessorImpl p0) throws android.os.RemoteException;
    public void onCaptureSessionEnd() throws android.os.RemoteException;
    public int startRepeating(android.hardware.camera2.extension.ICaptureCallback p0) throws android.os.RemoteException;
    public void stopRepeating() throws android.os.RemoteException;
    public int startCapture(android.hardware.camera2.extension.ICaptureCallback p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.ISessionProcessorImpl {
        public Default() {}
        public android.hardware.camera2.extension.CameraSessionConfig initSession(java.lang.String p0, android.hardware.camera2.extension.OutputSurface p1, android.hardware.camera2.extension.OutputSurface p2) throws android.os.RemoteException { return null; }
        public void deInitSession() throws android.os.RemoteException {}
        public void onCaptureSessionStart(android.hardware.camera2.extension.IRequestProcessorImpl p0) throws android.os.RemoteException {}
        public void onCaptureSessionEnd() throws android.os.RemoteException {}
        public int startRepeating(android.hardware.camera2.extension.ICaptureCallback p0) throws android.os.RemoteException { return 0; }
        public void stopRepeating() throws android.os.RemoteException {}
        public int startCapture(android.hardware.camera2.extension.ICaptureCallback p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.ISessionProcessorImpl {
        static final int TRANSACTION_initSession = 1;
        static final int TRANSACTION_deInitSession = 2;
        static final int TRANSACTION_onCaptureSessionStart = 3;
        static final int TRANSACTION_onCaptureSessionEnd = 4;
        static final int TRANSACTION_startRepeating = 5;
        static final int TRANSACTION_stopRepeating = 6;
        static final int TRANSACTION_startCapture = 7;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.ISessionProcessorImpl asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.camera2.extension.ISessionProcessorImpl p0) { return false; }
        public static android.hardware.camera2.extension.ISessionProcessorImpl getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.camera2.extension.ISessionProcessorImpl {
            private android.os.IBinder mRemote;
            public static android.hardware.camera2.extension.ISessionProcessorImpl sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.camera2.extension.CameraSessionConfig initSession(java.lang.String p0, android.hardware.camera2.extension.OutputSurface p1, android.hardware.camera2.extension.OutputSurface p2) throws android.os.RemoteException { return null; }
            public void deInitSession() throws android.os.RemoteException {}
            public void onCaptureSessionStart(android.hardware.camera2.extension.IRequestProcessorImpl p0) throws android.os.RemoteException {}
            public void onCaptureSessionEnd() throws android.os.RemoteException {}
            public int startRepeating(android.hardware.camera2.extension.ICaptureCallback p0) throws android.os.RemoteException { return 0; }
            public void stopRepeating() throws android.os.RemoteException {}
            public int startCapture(android.hardware.camera2.extension.ICaptureCallback p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        }
    }
}
