package android.se.omapi;

public interface ISecureElementListener extends android.os.IInterface {

    public static abstract class Stub extends android.os.Binder implements android.se.omapi.ISecureElementListener {
        private static final java.lang.String DESCRIPTOR = "android.se.omapi.ISecureElementListener";
        public Stub() { super(); }
        public static android.se.omapi.ISecureElementListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.se.omapi.ISecureElementListener p0) { return false; }
        public static android.se.omapi.ISecureElementListener getDefaultImpl() { return null; }

        private static class Proxy implements android.se.omapi.ISecureElementListener {
            private android.os.IBinder mRemote;
            public static android.se.omapi.ISecureElementListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }

    public static class Default implements android.se.omapi.ISecureElementListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }
}
