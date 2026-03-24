package android.os;

public interface IVibratorService extends android.os.IInterface {
    public boolean hasVibrator() throws android.os.RemoteException;
    public boolean hasAmplitudeControl() throws android.os.RemoteException;
    public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, android.media.AudioAttributes p3, java.lang.String p4, android.os.IBinder p5) throws android.os.RemoteException;
    public void cancelVibrate(android.os.IBinder p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.os.IVibratorService {
        private static final java.lang.String DESCRIPTOR = "android.os.IVibratorService";
        static final int TRANSACTION_hasVibrator = 1;
        static final int TRANSACTION_hasAmplitudeControl = 2;
        static final int TRANSACTION_vibrate = 3;
        static final int TRANSACTION_cancelVibrate = 4;
        public Stub() { super(); }
        public static android.os.IVibratorService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVibratorService p0) { return false; }
        public static android.os.IVibratorService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVibratorService {
            private android.os.IBinder mRemote;
            public static android.os.IVibratorService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean hasVibrator() throws android.os.RemoteException { return false; }
            public boolean hasAmplitudeControl() throws android.os.RemoteException { return false; }
            public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, android.media.AudioAttributes p3, java.lang.String p4, android.os.IBinder p5) throws android.os.RemoteException {}
            public void cancelVibrate(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.os.IVibratorService {
        public Default() {}
        public boolean hasVibrator() throws android.os.RemoteException { return false; }
        public boolean hasAmplitudeControl() throws android.os.RemoteException { return false; }
        public void vibrate(int p0, java.lang.String p1, android.os.VibrationEffect p2, android.media.AudioAttributes p3, java.lang.String p4, android.os.IBinder p5) throws android.os.RemoteException {}
        public void cancelVibrate(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
