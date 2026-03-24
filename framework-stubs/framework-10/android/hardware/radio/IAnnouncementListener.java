package android.hardware.radio;

public interface IAnnouncementListener extends android.os.IInterface {
    public void onListUpdated(java.util.List<android.hardware.radio.Announcement> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.radio.IAnnouncementListener {
        private static final java.lang.String DESCRIPTOR = "android.hardware.radio.IAnnouncementListener";
        static final int TRANSACTION_onListUpdated = 1;
        public Stub() { super(); }
        public static android.hardware.radio.IAnnouncementListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.radio.IAnnouncementListener p0) { return false; }
        public static android.hardware.radio.IAnnouncementListener getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.radio.IAnnouncementListener {
            private android.os.IBinder mRemote;
            public static android.hardware.radio.IAnnouncementListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onListUpdated(java.util.List<android.hardware.radio.Announcement> p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.hardware.radio.IAnnouncementListener {
        public Default() {}
        public void onListUpdated(java.util.List<android.hardware.radio.Announcement> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
