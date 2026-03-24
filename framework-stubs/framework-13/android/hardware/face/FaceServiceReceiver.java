package android.hardware.face;

public class FaceServiceReceiver extends android.hardware.face.IFaceServiceReceiver.Stub {
    public FaceServiceReceiver() { super(); }
    public void onEnrollResult(android.hardware.face.Face p0, int p1) throws android.os.RemoteException {}
    public void onAcquired(int p0, int p1) throws android.os.RemoteException {}
    public void onAuthenticationSucceeded(android.hardware.face.Face p0, int p1, boolean p2) throws android.os.RemoteException {}
    public void onFaceDetected(int p0, int p1, boolean p2) throws android.os.RemoteException {}
    public void onAuthenticationFailed() throws android.os.RemoteException {}
    public void onError(int p0, int p1) throws android.os.RemoteException {}
    public void onRemoved(android.hardware.face.Face p0, int p1) throws android.os.RemoteException {}
    public void onFeatureSet(boolean p0, int p1) throws android.os.RemoteException {}
    public void onFeatureGet(boolean p0, int[] p1, boolean[] p2) throws android.os.RemoteException {}
    public void onChallengeGenerated(int p0, int p1, long p2) throws android.os.RemoteException {}
    public void onAuthenticationFrame(android.hardware.face.FaceAuthenticationFrame p0) throws android.os.RemoteException {}
    public void onEnrollmentFrame(android.hardware.face.FaceEnrollFrame p0) throws android.os.RemoteException {}
}
