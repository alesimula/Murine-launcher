package android.hardware.radio;

public interface ITuner extends android.os.IInterface {
    public void close() throws android.os.RemoteException;
    public boolean isClosed() throws android.os.RemoteException;
    public void setConfiguration(android.hardware.radio.RadioManager.BandConfig p0) throws android.os.RemoteException;
    public android.hardware.radio.RadioManager.BandConfig getConfiguration() throws android.os.RemoteException;
    public void setMuted(boolean p0) throws android.os.RemoteException;
    public boolean isMuted() throws android.os.RemoteException;
    public void step(boolean p0, boolean p1) throws android.os.RemoteException;
    public void scan(boolean p0, boolean p1) throws android.os.RemoteException;
    public void tune(android.hardware.radio.ProgramSelector p0) throws android.os.RemoteException;
    public void cancel() throws android.os.RemoteException;
    public void cancelAnnouncement() throws android.os.RemoteException;
    public android.graphics.Bitmap getImage(int p0) throws android.os.RemoteException;
    public boolean startBackgroundScan() throws android.os.RemoteException;
    public void startProgramListUpdates(android.hardware.radio.ProgramList.Filter p0) throws android.os.RemoteException;
    public void stopProgramListUpdates() throws android.os.RemoteException;
    public boolean isConfigFlagSupported(int p0) throws android.os.RemoteException;
    public boolean isConfigFlagSet(int p0) throws android.os.RemoteException;
    public void setConfigFlag(int p0, boolean p1) throws android.os.RemoteException;
    public java.util.Map setParameters(java.util.Map p0) throws android.os.RemoteException;
    public java.util.Map getParameters(java.util.List<java.lang.String> p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.radio.ITuner {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public boolean isClosed() throws android.os.RemoteException { return false; }
        public void setConfiguration(android.hardware.radio.RadioManager.BandConfig p0) throws android.os.RemoteException {}
        public android.hardware.radio.RadioManager.BandConfig getConfiguration() throws android.os.RemoteException { return null; }
        public void setMuted(boolean p0) throws android.os.RemoteException {}
        public boolean isMuted() throws android.os.RemoteException { return false; }
        public void step(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void scan(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void tune(android.hardware.radio.ProgramSelector p0) throws android.os.RemoteException {}
        public void cancel() throws android.os.RemoteException {}
        public void cancelAnnouncement() throws android.os.RemoteException {}
        public android.graphics.Bitmap getImage(int p0) throws android.os.RemoteException { return null; }
        public boolean startBackgroundScan() throws android.os.RemoteException { return false; }
        public void startProgramListUpdates(android.hardware.radio.ProgramList.Filter p0) throws android.os.RemoteException {}
        public void stopProgramListUpdates() throws android.os.RemoteException {}
        public boolean isConfigFlagSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isConfigFlagSet(int p0) throws android.os.RemoteException { return false; }
        public void setConfigFlag(int p0, boolean p1) throws android.os.RemoteException {}
        public java.util.Map setParameters(java.util.Map p0) throws android.os.RemoteException { return null; }
        public java.util.Map getParameters(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ITuner {
        public static final java.lang.String DESCRIPTOR = "android.hardware.radio.ITuner";
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_isClosed = 2;
        static final int TRANSACTION_setConfiguration = 3;
        static final int TRANSACTION_getConfiguration = 4;
        static final int TRANSACTION_setMuted = 5;
        static final int TRANSACTION_isMuted = 6;
        static final int TRANSACTION_step = 7;
        static final int TRANSACTION_scan = 8;
        static final int TRANSACTION_tune = 9;
        static final int TRANSACTION_cancel = 10;
        static final int TRANSACTION_cancelAnnouncement = 11;
        static final int TRANSACTION_getImage = 12;
        static final int TRANSACTION_startBackgroundScan = 13;
        static final int TRANSACTION_startProgramListUpdates = 14;
        static final int TRANSACTION_stopProgramListUpdates = 15;
        static final int TRANSACTION_isConfigFlagSupported = 16;
        static final int TRANSACTION_isConfigFlagSet = 17;
        static final int TRANSACTION_setConfigFlag = 18;
        static final int TRANSACTION_setParameters = 19;
        static final int TRANSACTION_getParameters = 20;
        public Stub() { super(); }
        public static android.hardware.radio.ITuner asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.radio.ITuner p0) { return false; }
        public static android.hardware.radio.ITuner getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.radio.ITuner {
            private android.os.IBinder mRemote;
            public static android.hardware.radio.ITuner sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
            public boolean isClosed() throws android.os.RemoteException { return false; }
            public void setConfiguration(android.hardware.radio.RadioManager.BandConfig p0) throws android.os.RemoteException {}
            public android.hardware.radio.RadioManager.BandConfig getConfiguration() throws android.os.RemoteException { return null; }
            public void setMuted(boolean p0) throws android.os.RemoteException {}
            public boolean isMuted() throws android.os.RemoteException { return false; }
            public void step(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void scan(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void tune(android.hardware.radio.ProgramSelector p0) throws android.os.RemoteException {}
            public void cancel() throws android.os.RemoteException {}
            public void cancelAnnouncement() throws android.os.RemoteException {}
            public android.graphics.Bitmap getImage(int p0) throws android.os.RemoteException { return null; }
            public boolean startBackgroundScan() throws android.os.RemoteException { return false; }
            public void startProgramListUpdates(android.hardware.radio.ProgramList.Filter p0) throws android.os.RemoteException {}
            public void stopProgramListUpdates() throws android.os.RemoteException {}
            public boolean isConfigFlagSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isConfigFlagSet(int p0) throws android.os.RemoteException { return false; }
            public void setConfigFlag(int p0, boolean p1) throws android.os.RemoteException {}
            public java.util.Map setParameters(java.util.Map p0) throws android.os.RemoteException { return null; }
            public java.util.Map getParameters(java.util.List<java.lang.String> p0) throws android.os.RemoteException { return null; }
        }
    }
}
