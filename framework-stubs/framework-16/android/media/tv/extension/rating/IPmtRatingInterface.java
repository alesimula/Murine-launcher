package android.media.tv.extension.rating;

public interface IPmtRatingInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.rating.IPmtRatingInterface";
    public java.lang.String getPmtRating(java.lang.String p0) throws android.os.RemoteException;
    public void addPmtRatingListener(java.lang.String p0, android.media.tv.extension.rating.IPmtRatingListener p1) throws android.os.RemoteException;
    public void removePmtRatingListener(android.media.tv.extension.rating.IPmtRatingListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.rating.IPmtRatingInterface {
        public Default() {}
        public java.lang.String getPmtRating(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addPmtRatingListener(java.lang.String p0, android.media.tv.extension.rating.IPmtRatingListener p1) throws android.os.RemoteException {}
        public void removePmtRatingListener(android.media.tv.extension.rating.IPmtRatingListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.rating.IPmtRatingInterface {
        static final int TRANSACTION_getPmtRating = 1;
        static final int TRANSACTION_addPmtRatingListener = 2;
        static final int TRANSACTION_removePmtRatingListener = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.rating.IPmtRatingInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.rating.IPmtRatingInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getPmtRating(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addPmtRatingListener(java.lang.String p0, android.media.tv.extension.rating.IPmtRatingListener p1) throws android.os.RemoteException {}
            public void removePmtRatingListener(android.media.tv.extension.rating.IPmtRatingListener p0) throws android.os.RemoteException {}
        }
    }
}
