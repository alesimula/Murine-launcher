package android.hardware.face;

public class FaceCallback {
    FaceCallback(android.hardware.face.FaceManager.AuthenticationCallback p0, android.hardware.biometrics.CryptoObject p1) {}
    FaceCallback(android.hardware.face.FaceManager.FaceDetectionCallback p0) {}
    FaceCallback(android.hardware.face.FaceManager.EnrollmentCallback p0) {}
    FaceCallback(android.hardware.face.FaceManager.GenerateChallengeCallback p0) {}
    FaceCallback(android.hardware.face.FaceManager.SetFeatureCallback p0) {}
    FaceCallback(android.hardware.face.FaceManager.GetFeatureCallback p0) {}
    FaceCallback(android.hardware.face.FaceManager.RemovalCallback p0, android.hardware.face.Face p1) {}
    FaceCallback(android.hardware.face.FaceManager.RemovalCallback p0) {}
    public void sendSetFeatureCompleted(boolean p0, int p1) {}
    public void sendGetFeatureCompleted(boolean p0, int[] p1, boolean[] p2) {}
    public void sendChallengeGenerated(int p0, int p1, long p2) {}
    public void sendFaceDetected(int p0, int p1, boolean p2) {}
    public void sendRemovedResult(android.hardware.face.Face p0, int p1) {}
    public void sendErrorResult(android.content.Context p0, int p1, int p2) {}
    public void sendEnrollResult(int p0) {}
    public void sendAuthenticatedSucceeded(android.hardware.face.Face p0, int p1, boolean p2) {}
    public void sendAuthenticatedFailed() {}
    public void sendAcquiredResult(android.content.Context p0, int p1, int p2) {}
    public void sendAuthenticationFrame(android.content.Context p0, android.hardware.face.FaceAuthenticationFrame p1) {}
    public void sendEnrollmentFrame(android.content.Context p0, android.hardware.face.FaceEnrollFrame p1) {}
}
