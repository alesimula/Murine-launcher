package android.media.tv.extension.rating;

public interface IProgramRatingInfo extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.rating.IProgramRatingInfo";
    public void addProgramRatingInfoListener(java.lang.String p0, android.media.tv.extension.rating.IProgramRatingInfoListener p1) throws android.os.RemoteException;
    public void removeProgramRatingInfoListener(android.media.tv.extension.rating.IProgramRatingInfoListener p0) throws android.os.RemoteException;
    public android.os.Bundle getProgramRatingInfo(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.rating.IProgramRatingInfo {
        public Default() {}
        public void addProgramRatingInfoListener(java.lang.String p0, android.media.tv.extension.rating.IProgramRatingInfoListener p1) throws android.os.RemoteException {}
        public void removeProgramRatingInfoListener(android.media.tv.extension.rating.IProgramRatingInfoListener p0) throws android.os.RemoteException {}
        public android.os.Bundle getProgramRatingInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.rating.IProgramRatingInfo {
        static final int TRANSACTION_addProgramRatingInfoListener = 1;
        static final int TRANSACTION_removeProgramRatingInfoListener = 2;
        static final int TRANSACTION_getProgramRatingInfo = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.rating.IProgramRatingInfo asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.rating.IProgramRatingInfo {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addProgramRatingInfoListener(java.lang.String p0, android.media.tv.extension.rating.IProgramRatingInfoListener p1) throws android.os.RemoteException {}
            public void removeProgramRatingInfoListener(android.media.tv.extension.rating.IProgramRatingInfoListener p0) throws android.os.RemoteException {}
            public android.os.Bundle getProgramRatingInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        }
    }
}
