package android.hardware.security.secureclock;

public interface ISecureClock extends android.os.IInterface {
    public static final int VERSION = 1;
    public static final java.lang.String HASH = "cd55ca9963c6a57fa5f2f120a45c6e0c4fafb423";
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String TIME_STAMP_MAC_LABEL = "Auth Verification";
    public android.hardware.security.secureclock.TimeStampToken generateTimeStamp(long p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.security.secureclock.ISecureClock {
        public Default() {}
        public android.hardware.security.secureclock.TimeStampToken generateTimeStamp(long p0) throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.security.secureclock.ISecureClock {
        static final int TRANSACTION_generateTimeStamp = 1;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.security.secureclock.ISecureClock asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.security.secureclock.ISecureClock {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.security.secureclock.TimeStampToken generateTimeStamp(long p0) throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
