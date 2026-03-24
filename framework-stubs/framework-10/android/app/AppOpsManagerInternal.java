package android.app;

public abstract class AppOpsManagerInternal {
    public AppOpsManagerInternal() {}
    public abstract void setDeviceAndProfileOwners(android.util.SparseIntArray p0);
    public abstract void setUidMode(int p0, int p1, int p2);
    public abstract void setAllPkgModesToDefault(int p0, int p1);
    public abstract int checkOperationUnchecked(int p0, int p1, java.lang.String p2);

    public static interface CheckOpsDelegate {
        public int checkOperation(int p0, int p1, java.lang.String p2, boolean p3, com.android.internal.util.function.QuadFunction<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Integer> p4);
        public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3, com.android.internal.util.function.QuadFunction<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> p4);
        public int noteOperation(int p0, int p1, java.lang.String p2, com.android.internal.util.function.TriFunction<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> p3);
    }
}
