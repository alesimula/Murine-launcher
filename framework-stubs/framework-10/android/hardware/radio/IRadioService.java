package android.hardware.radio;

public interface IRadioService extends android.os.IInterface {
    public java.util.List<android.hardware.radio.RadioManager.ModuleProperties> listModules() throws android.os.RemoteException;
    public android.hardware.radio.ITuner openTuner(int p0, android.hardware.radio.RadioManager.BandConfig p1, boolean p2, android.hardware.radio.ITunerCallback p3) throws android.os.RemoteException;
    public android.hardware.radio.ICloseHandle addAnnouncementListener(int[] p0, android.hardware.radio.IAnnouncementListener p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.IRadioService {
        private static final java.lang.String DESCRIPTOR = "android.hardware.radio.IRadioService";
        static final int TRANSACTION_listModules = 1;
        static final int TRANSACTION_openTuner = 2;
        static final int TRANSACTION_addAnnouncementListener = 3;
        public Stub() { super(); }
        public static android.hardware.radio.IRadioService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.radio.IRadioService p0) { return false; }
        public static android.hardware.radio.IRadioService getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.radio.IRadioService {
            private android.os.IBinder mRemote;
            public static android.hardware.radio.IRadioService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.hardware.radio.RadioManager.ModuleProperties> listModules() throws android.os.RemoteException { return null; }
            public android.hardware.radio.ITuner openTuner(int p0, android.hardware.radio.RadioManager.BandConfig p1, boolean p2, android.hardware.radio.ITunerCallback p3) throws android.os.RemoteException { return null; }
            public android.hardware.radio.ICloseHandle addAnnouncementListener(int[] p0, android.hardware.radio.IAnnouncementListener p1) throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.hardware.radio.IRadioService {
        public Default() {}
        public java.util.List<android.hardware.radio.RadioManager.ModuleProperties> listModules() throws android.os.RemoteException { return null; }
        public android.hardware.radio.ITuner openTuner(int p0, android.hardware.radio.RadioManager.BandConfig p1, boolean p2, android.hardware.radio.ITunerCallback p3) throws android.os.RemoteException { return null; }
        public android.hardware.radio.ICloseHandle addAnnouncementListener(int[] p0, android.hardware.radio.IAnnouncementListener p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}
