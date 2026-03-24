package android.app;

public abstract class AppOpsManagerInternal {
    public AppOpsManagerInternal() {}
    public abstract void setDeviceAndProfileOwners(android.util.SparseIntArray p0);
    public abstract void updateAppWidgetVisibility(android.util.SparseArray<java.lang.String> p0, boolean p1);
    public abstract void setUidModeFromPermissionPolicy(int p0, int p1, int p2, com.android.internal.app.IAppOpsCallback p3);
    public abstract void setModeFromPermissionPolicy(int p0, int p1, java.lang.String p2, int p3, com.android.internal.app.IAppOpsCallback p4);

    public static interface CheckOpsDelegate {
        public int checkOperation(int p0, int p1, java.lang.String p2, boolean p3, com.android.internal.util.function.QuadFunction<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Integer> p4);
        public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3, com.android.internal.util.function.QuadFunction<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> p4);
        public int noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, boolean p4, java.lang.String p5, boolean p6, com.android.internal.util.function.HeptFunction<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer> p7);
    }
}
