package android.hardware.hdmi;

public interface IHdmiRecordListener extends android.os.IInterface {
    public byte[] getOneTouchRecordSource(int p0) throws android.os.RemoteException;
    public void onOneTouchRecordResult(int p0, int p1) throws android.os.RemoteException;
    public void onTimerRecordingResult(int p0, int p1) throws android.os.RemoteException;
    public void onClearTimerRecordingResult(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.hdmi.IHdmiRecordListener {
        public Default() {}
        public byte[] getOneTouchRecordSource(int p0) throws android.os.RemoteException { return null; }
        public void onOneTouchRecordResult(int p0, int p1) throws android.os.RemoteException {}
        public void onTimerRecordingResult(int p0, int p1) throws android.os.RemoteException {}
        public void onClearTimerRecordingResult(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.hdmi.IHdmiRecordListener {
        public static final java.lang.String DESCRIPTOR = "android.hardware.hdmi.IHdmiRecordListener";
        static final int TRANSACTION_getOneTouchRecordSource = 1;
        static final int TRANSACTION_onOneTouchRecordResult = 2;
        static final int TRANSACTION_onTimerRecordingResult = 3;
        static final int TRANSACTION_onClearTimerRecordingResult = 4;
        public Stub() { super(); }
        public static android.hardware.hdmi.IHdmiRecordListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.hdmi.IHdmiRecordListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public byte[] getOneTouchRecordSource(int p0) throws android.os.RemoteException { return null; }
            public void onOneTouchRecordResult(int p0, int p1) throws android.os.RemoteException {}
            public void onTimerRecordingResult(int p0, int p1) throws android.os.RemoteException {}
            public void onClearTimerRecordingResult(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
