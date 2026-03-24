package android.media;

public interface IVolumeController extends android.os.IInterface {
    public void displaySafeVolumeWarning(int p0) throws android.os.RemoteException;
    public void volumeChanged(int p0, int p1) throws android.os.RemoteException;
    public void masterMuteChanged(int p0) throws android.os.RemoteException;
    public void setLayoutDirection(int p0) throws android.os.RemoteException;
    public void dismiss() throws android.os.RemoteException;
    public void setA11yMode(int p0) throws android.os.RemoteException;

    public static class Default implements android.media.IVolumeController {
        public Default() {}
        public void displaySafeVolumeWarning(int p0) throws android.os.RemoteException {}
        public void volumeChanged(int p0, int p1) throws android.os.RemoteException {}
        public void masterMuteChanged(int p0) throws android.os.RemoteException {}
        public void setLayoutDirection(int p0) throws android.os.RemoteException {}
        public void dismiss() throws android.os.RemoteException {}
        public void setA11yMode(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IVolumeController {
        private static final java.lang.String DESCRIPTOR = "android.media.IVolumeController";
        static final int TRANSACTION_displaySafeVolumeWarning = 1;
        static final int TRANSACTION_volumeChanged = 2;
        static final int TRANSACTION_masterMuteChanged = 3;
        static final int TRANSACTION_setLayoutDirection = 4;
        static final int TRANSACTION_dismiss = 5;
        static final int TRANSACTION_setA11yMode = 6;
        public Stub() { super(); }
        public static android.media.IVolumeController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.IVolumeController p0) { return false; }
        public static android.media.IVolumeController getDefaultImpl() { return null; }

        private static class Proxy implements android.media.IVolumeController {
            private android.os.IBinder mRemote;
            public static android.media.IVolumeController sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void displaySafeVolumeWarning(int p0) throws android.os.RemoteException {}
            public void volumeChanged(int p0, int p1) throws android.os.RemoteException {}
            public void masterMuteChanged(int p0) throws android.os.RemoteException {}
            public void setLayoutDirection(int p0) throws android.os.RemoteException {}
            public void dismiss() throws android.os.RemoteException {}
            public void setA11yMode(int p0) throws android.os.RemoteException {}
        }
    }
}
