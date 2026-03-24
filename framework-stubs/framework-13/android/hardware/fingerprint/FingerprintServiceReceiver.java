package android.hardware.fingerprint;

public class FingerprintServiceReceiver extends android.hardware.fingerprint.IFingerprintServiceReceiver.Stub {
    public FingerprintServiceReceiver() { super(); }
    public void onEnrollResult(android.hardware.fingerprint.Fingerprint p0, int p1) throws android.os.RemoteException {}
    public void onAcquired(int p0, int p1) throws android.os.RemoteException {}
    public void onAuthenticationSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1, boolean p2) throws android.os.RemoteException {}
    public void onFingerprintDetected(int p0, int p1, boolean p2) throws android.os.RemoteException {}
    public void onAuthenticationFailed() throws android.os.RemoteException {}
    public void onError(int p0, int p1) throws android.os.RemoteException {}
    public void onRemoved(android.hardware.fingerprint.Fingerprint p0, int p1) throws android.os.RemoteException {}
    public void onChallengeGenerated(int p0, int p1, long p2) throws android.os.RemoteException {}
    public void onUdfpsPointerDown(int p0) throws android.os.RemoteException {}
    public void onUdfpsPointerUp(int p0) throws android.os.RemoteException {}
}
