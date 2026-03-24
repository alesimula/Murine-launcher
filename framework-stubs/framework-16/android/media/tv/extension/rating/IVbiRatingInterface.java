package android.media.tv.extension.rating;

public interface IVbiRatingInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.rating.IVbiRatingInterface";
    public java.lang.String getVbiRating(java.lang.String p0) throws android.os.RemoteException;
    public void addVbiRatingListener(java.lang.String p0, android.media.tv.extension.rating.IVbiRatingListener p1) throws android.os.RemoteException;
    public void removeVbiRatingListener(android.media.tv.extension.rating.IVbiRatingListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.rating.IVbiRatingInterface {
        public Default() {}
        public java.lang.String getVbiRating(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void addVbiRatingListener(java.lang.String p0, android.media.tv.extension.rating.IVbiRatingListener p1) throws android.os.RemoteException {}
        public void removeVbiRatingListener(android.media.tv.extension.rating.IVbiRatingListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.rating.IVbiRatingInterface {
        static final int TRANSACTION_getVbiRating = 1;
        static final int TRANSACTION_addVbiRatingListener = 2;
        static final int TRANSACTION_removeVbiRatingListener = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.rating.IVbiRatingInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.rating.IVbiRatingInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getVbiRating(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void addVbiRatingListener(java.lang.String p0, android.media.tv.extension.rating.IVbiRatingListener p1) throws android.os.RemoteException {}
            public void removeVbiRatingListener(android.media.tv.extension.rating.IVbiRatingListener p0) throws android.os.RemoteException {}
        }
    }
}
