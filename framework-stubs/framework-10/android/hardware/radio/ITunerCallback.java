package android.hardware.radio;

public interface ITunerCallback extends android.os.IInterface {
    public void onError(int p0) throws android.os.RemoteException;
    public void onTuneFailed(int p0, android.hardware.radio.ProgramSelector p1) throws android.os.RemoteException;
    public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig p0) throws android.os.RemoteException;
    public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo p0) throws android.os.RemoteException;
    public void onTrafficAnnouncement(boolean p0) throws android.os.RemoteException;
    public void onEmergencyAnnouncement(boolean p0) throws android.os.RemoteException;
    public void onAntennaState(boolean p0) throws android.os.RemoteException;
    public void onBackgroundScanAvailabilityChange(boolean p0) throws android.os.RemoteException;
    public void onBackgroundScanComplete() throws android.os.RemoteException;
    public void onProgramListChanged() throws android.os.RemoteException;
    public void onProgramListUpdated(android.hardware.radio.ProgramList.Chunk p0) throws android.os.RemoteException;
    public void onParametersUpdated(java.util.Map p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ITunerCallback {
        private static final java.lang.String DESCRIPTOR = "android.hardware.radio.ITunerCallback";
        static final int TRANSACTION_onError = 1;
        static final int TRANSACTION_onTuneFailed = 2;
        static final int TRANSACTION_onConfigurationChanged = 3;
        static final int TRANSACTION_onCurrentProgramInfoChanged = 4;
        static final int TRANSACTION_onTrafficAnnouncement = 5;
        static final int TRANSACTION_onEmergencyAnnouncement = 6;
        static final int TRANSACTION_onAntennaState = 7;
        static final int TRANSACTION_onBackgroundScanAvailabilityChange = 8;
        static final int TRANSACTION_onBackgroundScanComplete = 9;
        static final int TRANSACTION_onProgramListChanged = 10;
        static final int TRANSACTION_onProgramListUpdated = 11;
        static final int TRANSACTION_onParametersUpdated = 12;
        public Stub() { super(); }
        public static android.hardware.radio.ITunerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.radio.ITunerCallback p0) { return false; }
        public static android.hardware.radio.ITunerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.radio.ITunerCallback {
            private android.os.IBinder mRemote;
            public static android.hardware.radio.ITunerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0) throws android.os.RemoteException {}
            public void onTuneFailed(int p0, android.hardware.radio.ProgramSelector p1) throws android.os.RemoteException {}
            public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig p0) throws android.os.RemoteException {}
            public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo p0) throws android.os.RemoteException {}
            public void onTrafficAnnouncement(boolean p0) throws android.os.RemoteException {}
            public void onEmergencyAnnouncement(boolean p0) throws android.os.RemoteException {}
            public void onAntennaState(boolean p0) throws android.os.RemoteException {}
            public void onBackgroundScanAvailabilityChange(boolean p0) throws android.os.RemoteException {}
            public void onBackgroundScanComplete() throws android.os.RemoteException {}
            public void onProgramListChanged() throws android.os.RemoteException {}
            public void onProgramListUpdated(android.hardware.radio.ProgramList.Chunk p0) throws android.os.RemoteException {}
            public void onParametersUpdated(java.util.Map p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.radio.ITunerCallback {
        public Default() {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onTuneFailed(int p0, android.hardware.radio.ProgramSelector p1) throws android.os.RemoteException {}
        public void onConfigurationChanged(android.hardware.radio.RadioManager.BandConfig p0) throws android.os.RemoteException {}
        public void onCurrentProgramInfoChanged(android.hardware.radio.RadioManager.ProgramInfo p0) throws android.os.RemoteException {}
        public void onTrafficAnnouncement(boolean p0) throws android.os.RemoteException {}
        public void onEmergencyAnnouncement(boolean p0) throws android.os.RemoteException {}
        public void onAntennaState(boolean p0) throws android.os.RemoteException {}
        public void onBackgroundScanAvailabilityChange(boolean p0) throws android.os.RemoteException {}
        public void onBackgroundScanComplete() throws android.os.RemoteException {}
        public void onProgramListChanged() throws android.os.RemoteException {}
        public void onProgramListUpdated(android.hardware.radio.ProgramList.Chunk p0) throws android.os.RemoteException {}
        public void onParametersUpdated(java.util.Map p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
