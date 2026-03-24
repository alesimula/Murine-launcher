package android.media.tv;

public interface ITvInputHardware extends android.os.IInterface {
    public boolean setSurface(android.view.Surface p0, android.media.tv.TvStreamConfig p1) throws android.os.RemoteException;
    public void setStreamVolume(float p0) throws android.os.RemoteException;
    public void overrideAudioSink(int p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException;

    public static class Default implements android.media.tv.ITvInputHardware {
        public Default() {}
        public boolean setSurface(android.view.Surface p0, android.media.tv.TvStreamConfig p1) throws android.os.RemoteException { return false; }
        public void setStreamVolume(float p0) throws android.os.RemoteException {}
        public void overrideAudioSink(int p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.ITvInputHardware {
        public static final java.lang.String DESCRIPTOR = "android.media.tv.ITvInputHardware";
        static final int TRANSACTION_setSurface = 1;
        static final int TRANSACTION_setStreamVolume = 2;
        static final int TRANSACTION_overrideAudioSink = 3;
        public Stub() { super(); }
        public static android.media.tv.ITvInputHardware asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.tv.ITvInputHardware p0) { return false; }
        public static android.media.tv.ITvInputHardware getDefaultImpl() { return null; }

        private static class Proxy implements android.media.tv.ITvInputHardware {
            private android.os.IBinder mRemote;
            public static android.media.tv.ITvInputHardware sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean setSurface(android.view.Surface p0, android.media.tv.TvStreamConfig p1) throws android.os.RemoteException { return false; }
            public void setStreamVolume(float p0) throws android.os.RemoteException {}
            public void overrideAudioSink(int p0, java.lang.String p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        }
    }
}
