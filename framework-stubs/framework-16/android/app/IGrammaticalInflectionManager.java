package android.app;

public interface IGrammaticalInflectionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IGrammaticalInflectionManager";
    public void setRequestedApplicationGrammaticalGender(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setSystemWideGrammaticalGender(int p0, int p1) throws android.os.RemoteException;
    public int getSystemGrammaticalGender(android.content.AttributionSource p0, int p1) throws android.os.RemoteException;
    public int peekSystemGrammaticalGenderByUserId(android.content.AttributionSource p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.app.IGrammaticalInflectionManager {
        public Default() {}
        public void setRequestedApplicationGrammaticalGender(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void setSystemWideGrammaticalGender(int p0, int p1) throws android.os.RemoteException {}
        public int getSystemGrammaticalGender(android.content.AttributionSource p0, int p1) throws android.os.RemoteException { return 0; }
        public int peekSystemGrammaticalGenderByUserId(android.content.AttributionSource p0, int p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IGrammaticalInflectionManager {
        static final int TRANSACTION_setRequestedApplicationGrammaticalGender = 1;
        static final int TRANSACTION_setSystemWideGrammaticalGender = 2;
        static final int TRANSACTION_getSystemGrammaticalGender = 3;
        static final int TRANSACTION_peekSystemGrammaticalGenderByUserId = 4;
        public Stub() { super(); }
        public static android.app.IGrammaticalInflectionManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IGrammaticalInflectionManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setRequestedApplicationGrammaticalGender(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void setSystemWideGrammaticalGender(int p0, int p1) throws android.os.RemoteException {}
            public int getSystemGrammaticalGender(android.content.AttributionSource p0, int p1) throws android.os.RemoteException { return 0; }
            public int peekSystemGrammaticalGenderByUserId(android.content.AttributionSource p0, int p1) throws android.os.RemoteException { return 0; }
        }
    }
}
