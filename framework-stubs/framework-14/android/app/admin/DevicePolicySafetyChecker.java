package android.app.admin;

public interface DevicePolicySafetyChecker {
    public int getUnsafeOperationReason(int p0);
    public boolean isSafeOperation(int p0);
    default public android.app.admin.UnsafeStateException newUnsafeStateException(int p0, int p1) { return null; }
    public void onFactoryReset(com.android.internal.os.IResultReceiver p0);
}
