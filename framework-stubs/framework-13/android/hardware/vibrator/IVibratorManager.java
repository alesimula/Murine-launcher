package android.hardware.vibrator;

public interface IVibratorManager extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "ea8742d6993e1a82917da38b9938e537aa7fcb54";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int CAP_SYNC = 1;
    public static final int CAP_PREPARE_ON = 2;
    public static final int CAP_PREPARE_PERFORM = 4;
    public static final int CAP_PREPARE_COMPOSE = 8;
    public static final int CAP_MIXED_TRIGGER_ON = 16;
    public static final int CAP_MIXED_TRIGGER_PERFORM = 32;
    public static final int CAP_MIXED_TRIGGER_COMPOSE = 64;
    public static final int CAP_TRIGGER_CALLBACK = 128;
    public int getCapabilities() throws android.os.RemoteException;
    public int[] getVibratorIds() throws android.os.RemoteException;
    public android.hardware.vibrator.IVibrator getVibrator(int p0) throws android.os.RemoteException;
    public void prepareSynced(int[] p0) throws android.os.RemoteException;
    public void triggerSynced(android.hardware.vibrator.IVibratorCallback p0) throws android.os.RemoteException;
    public void cancelSynced() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.vibrator.IVibratorManager {
        public Default() {}
        public int getCapabilities() throws android.os.RemoteException { return 0; }
        public int[] getVibratorIds() throws android.os.RemoteException { return null; }
        public android.hardware.vibrator.IVibrator getVibrator(int p0) throws android.os.RemoteException { return null; }
        public void prepareSynced(int[] p0) throws android.os.RemoteException {}
        public void triggerSynced(android.hardware.vibrator.IVibratorCallback p0) throws android.os.RemoteException {}
        public void cancelSynced() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.vibrator.IVibratorManager {
        static final int TRANSACTION_getCapabilities = 1;
        static final int TRANSACTION_getVibratorIds = 2;
        static final int TRANSACTION_getVibrator = 3;
        static final int TRANSACTION_prepareSynced = 4;
        static final int TRANSACTION_triggerSynced = 5;
        static final int TRANSACTION_cancelSynced = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.vibrator.IVibratorManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.vibrator.IVibratorManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getCapabilities() throws android.os.RemoteException { return 0; }
            public int[] getVibratorIds() throws android.os.RemoteException { return null; }
            public android.hardware.vibrator.IVibrator getVibrator(int p0) throws android.os.RemoteException { return null; }
            public void prepareSynced(int[] p0) throws android.os.RemoteException {}
            public void triggerSynced(android.hardware.vibrator.IVibratorCallback p0) throws android.os.RemoteException {}
            public void cancelSynced() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
