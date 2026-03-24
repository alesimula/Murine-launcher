package android.media.tv.extension.teletext;

public interface IDataServiceSignalInfo extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.teletext.IDataServiceSignalInfo";
    public android.os.Bundle getDataServiceSignalInfo(java.lang.String p0) throws android.os.RemoteException;
    public void addDataServiceSignalInfoListener(java.lang.String p0, android.media.tv.extension.teletext.IDataServiceSignalInfoListener p1) throws android.os.RemoteException;
    public void removeDataServiceSignalInfoListener(java.lang.String p0, android.media.tv.extension.teletext.IDataServiceSignalInfoListener p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.teletext.IDataServiceSignalInfo {
        public Default() {}
        public android.os.Bundle getDataServiceSignalInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addDataServiceSignalInfoListener(java.lang.String p0, android.media.tv.extension.teletext.IDataServiceSignalInfoListener p1) throws android.os.RemoteException {}
        public void removeDataServiceSignalInfoListener(java.lang.String p0, android.media.tv.extension.teletext.IDataServiceSignalInfoListener p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.teletext.IDataServiceSignalInfo {
        static final int TRANSACTION_getDataServiceSignalInfo = 1;
        static final int TRANSACTION_addDataServiceSignalInfoListener = 2;
        static final int TRANSACTION_removeDataServiceSignalInfoListener = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.teletext.IDataServiceSignalInfo asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.teletext.IDataServiceSignalInfo {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.Bundle getDataServiceSignalInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addDataServiceSignalInfoListener(java.lang.String p0, android.media.tv.extension.teletext.IDataServiceSignalInfoListener p1) throws android.os.RemoteException {}
            public void removeDataServiceSignalInfoListener(java.lang.String p0, android.media.tv.extension.teletext.IDataServiceSignalInfoListener p1) throws android.os.RemoteException {}
        }
    }
}
