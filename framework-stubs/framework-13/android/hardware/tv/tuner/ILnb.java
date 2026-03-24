package android.hardware.tv.tuner;

public interface ILnb extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "d42f1677ada3f62036894111686245c3c8310fe4";
    public static final java.lang.String DESCRIPTOR = null;
    public void setCallback(android.hardware.tv.tuner.ILnbCallback p0) throws android.os.RemoteException;
    public void setVoltage(int p0) throws android.os.RemoteException;
    public void setTone(int p0) throws android.os.RemoteException;
    public void setSatellitePosition(int p0) throws android.os.RemoteException;
    public void sendDiseqcMessage(byte[] p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.tv.tuner.ILnb {
        public Default() {}
        public void setCallback(android.hardware.tv.tuner.ILnbCallback p0) throws android.os.RemoteException {}
        public void setVoltage(int p0) throws android.os.RemoteException {}
        public void setTone(int p0) throws android.os.RemoteException {}
        public void setSatellitePosition(int p0) throws android.os.RemoteException {}
        public void sendDiseqcMessage(byte[] p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.tv.tuner.ILnb {
        static final int TRANSACTION_setCallback = 1;
        static final int TRANSACTION_setVoltage = 2;
        static final int TRANSACTION_setTone = 3;
        static final int TRANSACTION_setSatellitePosition = 4;
        static final int TRANSACTION_sendDiseqcMessage = 5;
        static final int TRANSACTION_close = 6;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.tv.tuner.ILnb asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.tv.tuner.ILnb {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setCallback(android.hardware.tv.tuner.ILnbCallback p0) throws android.os.RemoteException {}
            public void setVoltage(int p0) throws android.os.RemoteException {}
            public void setTone(int p0) throws android.os.RemoteException {}
            public void setSatellitePosition(int p0) throws android.os.RemoteException {}
            public void sendDiseqcMessage(byte[] p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
