package android.app;

public abstract class AppOpsManagerInternal {
    public AppOpsManagerInternal() {}
    public abstract void setDeviceAndProfileOwners(android.util.SparseIntArray p0);
    public abstract void updateAppWidgetVisibility(android.util.SparseArray<java.lang.String> p0, boolean p1);
    public abstract void setUidModeFromPermissionPolicy(int p0, int p1, int p2, com.android.internal.app.IAppOpsCallback p3);
    public abstract void setModeFromPermissionPolicy(int p0, int p1, java.lang.String p2, int p3, com.android.internal.app.IAppOpsCallback p4);
    public abstract void setGlobalRestriction(int p0, boolean p1, android.os.IBinder p2);
    public abstract int getOpRestrictionCount(int p0, android.os.UserHandle p1, java.lang.String p2, java.lang.String p3);
    public abstract void onPackageAdded(java.lang.String p0, int p1);

    public static interface CheckOpsDelegate {
        public int checkOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, com.android.internal.util.function.HexFunction<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Integer> p6);
        public int checkAudioOperation(int p0, int p1, int p2, java.lang.String p3, com.android.internal.util.function.QuadFunction<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> p4);
        public android.app.SyncNotedAppOp noteOperation(int p0, int p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, boolean p7, int p8, com.android.internal.util.function.NonaFunction<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer, android.app.SyncNotedAppOp> p9);
        public android.app.SyncNotedAppOp noteProxyOperation(int p0, android.content.AttributionSource p1, boolean p2, java.lang.String p3, boolean p4, boolean p5, com.android.internal.util.function.HexFunction<java.lang.Integer, android.content.AttributionSource, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, android.app.SyncNotedAppOp> p6);
        public android.app.SyncNotedAppOp startOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, boolean p6, boolean p7, java.lang.String p8, boolean p9, int p10, int p11, com.android.internal.util.function.DodecFunction<android.os.IBinder, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.Integer, android.app.SyncNotedAppOp> p12);
        public android.app.SyncNotedAppOp startProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, boolean p7, int p8, int p9, int p10, com.android.internal.util.function.UndecFunction<android.os.IBinder, java.lang.Integer, android.content.AttributionSource, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.Integer, android.app.SyncNotedAppOp> p11);
        public void finishOperation(android.os.IBinder p0, int p1, int p2, java.lang.String p3, java.lang.String p4, int p5, com.android.internal.util.function.HexConsumer<android.os.IBinder, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer> p6);
        public void finishProxyOperation(android.os.IBinder p0, int p1, android.content.AttributionSource p2, boolean p3, com.android.internal.util.function.QuadFunction<android.os.IBinder, java.lang.Integer, android.content.AttributionSource, java.lang.Boolean, java.lang.Void> p4);
    }
}
