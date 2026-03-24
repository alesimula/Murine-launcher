package android.security.attestationverification;

public interface IAttestationVerificationService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.attestationverification.IAttestationVerificationService";
    public void onVerifyAttestation(android.os.Bundle p0, byte[] p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException;

    public static class Default implements android.security.attestationverification.IAttestationVerificationService {
        public Default() {}
        public void onVerifyAttestation(android.os.Bundle p0, byte[] p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.attestationverification.IAttestationVerificationService {
        static final int TRANSACTION_onVerifyAttestation = 1;
        public Stub() { super(); }
        public static android.security.attestationverification.IAttestationVerificationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.attestationverification.IAttestationVerificationService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onVerifyAttestation(android.os.Bundle p0, byte[] p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        }
    }
}
