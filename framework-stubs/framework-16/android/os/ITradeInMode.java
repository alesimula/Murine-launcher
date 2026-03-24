package android.os;

public interface ITradeInMode extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.ITradeInMode";
    public boolean start() throws android.os.RemoteException;
    public boolean isEvaluationModeAllowed() throws android.os.RemoteException;
    public boolean enterEvaluationMode() throws android.os.RemoteException;
    public void scheduleWipeForTesting() throws android.os.RemoteException;
    public void startTesting() throws android.os.RemoteException;
    public void stopTesting() throws android.os.RemoteException;
    public boolean isTesting() throws android.os.RemoteException;
    public int getHingeCount() throws android.os.RemoteException;
    public int getFoldCount(int p0) throws android.os.RemoteException;
    public int getHingeLifeSpan(int p0) throws android.os.RemoteException;
    public int[] getScreenPartStatus() throws android.os.RemoteException;
    public int getMoistureIntrusionDetected(long p0) throws android.os.RemoteException;

    public static class Default implements android.os.ITradeInMode {
        public Default() {}
        public boolean start() throws android.os.RemoteException { return false; }
        public boolean isEvaluationModeAllowed() throws android.os.RemoteException { return false; }
        public boolean enterEvaluationMode() throws android.os.RemoteException { return false; }
        public void scheduleWipeForTesting() throws android.os.RemoteException {}
        public void startTesting() throws android.os.RemoteException {}
        public void stopTesting() throws android.os.RemoteException {}
        public boolean isTesting() throws android.os.RemoteException { return false; }
        public int getHingeCount() throws android.os.RemoteException { return 0; }
        public int getFoldCount(int p0) throws android.os.RemoteException { return 0; }
        public int getHingeLifeSpan(int p0) throws android.os.RemoteException { return 0; }
        public int[] getScreenPartStatus() throws android.os.RemoteException { return null; }
        public int getMoistureIntrusionDetected(long p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface MoistureIntrusionStatus {
        public static final int UNSUPPORTED = -1;
        public static final int UNDETECTED = 0;
        public static final int DETECTED = 1;
    }

    public static @interface ScreenPartStatus {
        public static final int UNSUPPORTED = 0;
        public static final int ORIGINAL = 1;
        public static final int REPLACED = 2;
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ITradeInMode {
        static final int TRANSACTION_start = 1;
        static final int TRANSACTION_isEvaluationModeAllowed = 2;
        static final int TRANSACTION_enterEvaluationMode = 3;
        static final int TRANSACTION_scheduleWipeForTesting = 4;
        static final int TRANSACTION_startTesting = 5;
        static final int TRANSACTION_stopTesting = 6;
        static final int TRANSACTION_isTesting = 7;
        static final int TRANSACTION_getHingeCount = 8;
        static final int TRANSACTION_getFoldCount = 9;
        static final int TRANSACTION_getHingeLifeSpan = 10;
        static final int TRANSACTION_getScreenPartStatus = 11;
        static final int TRANSACTION_getMoistureIntrusionDetected = 12;
        public Stub() { super(); }
        public static android.os.ITradeInMode asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.ITradeInMode {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean start() throws android.os.RemoteException { return false; }
            public boolean isEvaluationModeAllowed() throws android.os.RemoteException { return false; }
            public boolean enterEvaluationMode() throws android.os.RemoteException { return false; }
            public void scheduleWipeForTesting() throws android.os.RemoteException {}
            public void startTesting() throws android.os.RemoteException {}
            public void stopTesting() throws android.os.RemoteException {}
            public boolean isTesting() throws android.os.RemoteException { return false; }
            public int getHingeCount() throws android.os.RemoteException { return 0; }
            public int getFoldCount(int p0) throws android.os.RemoteException { return 0; }
            public int getHingeLifeSpan(int p0) throws android.os.RemoteException { return 0; }
            public int[] getScreenPartStatus() throws android.os.RemoteException { return null; }
            public int getMoistureIntrusionDetected(long p0) throws android.os.RemoteException { return 0; }
        }
    }
}
