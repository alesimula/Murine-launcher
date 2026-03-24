package com.android.internal.textservice;

public interface ISpellCheckerService extends android.os.IInterface {
    public void getISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, int p3, com.android.internal.textservice.ISpellCheckerServiceCallback p4) throws android.os.RemoteException;

    public static class Default implements com.android.internal.textservice.ISpellCheckerService {
        public Default() {}
        public void getISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, int p3, com.android.internal.textservice.ISpellCheckerServiceCallback p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.textservice.ISpellCheckerService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.textservice.ISpellCheckerService";
        static final int TRANSACTION_getISpellCheckerSession = 1;
        public Stub() { super(); }
        public static com.android.internal.textservice.ISpellCheckerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.textservice.ISpellCheckerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getISpellCheckerSession(java.lang.String p0, com.android.internal.textservice.ISpellCheckerSessionListener p1, android.os.Bundle p2, int p3, com.android.internal.textservice.ISpellCheckerServiceCallback p4) throws android.os.RemoteException {}
        }
    }
}
