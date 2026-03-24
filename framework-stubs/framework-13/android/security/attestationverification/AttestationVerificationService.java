package android.security.attestationverification;

public abstract class AttestationVerificationService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.security.attestationverification.AttestationVerificationService";
    public AttestationVerificationService() { super(); }
    public abstract int onVerifyPeerDeviceAttestation(android.os.Bundle p0, byte[] p1);
}
