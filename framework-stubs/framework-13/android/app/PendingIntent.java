package android.app;

public final class PendingIntent implements android.os.Parcelable {
    static final long PENDING_INTENT_EXPLICIT_MUTABILITY_REQUIRED = 160794467L;
    public static final int FLAG_ONE_SHOT = 1073741824;
    public static final int FLAG_NO_CREATE = 536870912;
    public static final int FLAG_CANCEL_CURRENT = 268435456;
    public static final int FLAG_UPDATE_CURRENT = 134217728;
    public static final int FLAG_IMMUTABLE = 67108864;
    public static final int FLAG_MUTABLE = 33554432;
    @java.lang.Deprecated
    public static final int FLAG_MUTABLE_UNAUDITED = 33554432;
    public static final android.os.Parcelable.Creator<android.app.PendingIntent> CREATOR = null;
    public static void setOnMarshaledListener(android.app.PendingIntent.OnMarshaledListener p0) {}
    public static android.app.PendingIntent getActivity(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    public static android.app.PendingIntent getActivity(android.content.Context p0, int p1, android.content.Intent p2, int p3, android.os.Bundle p4) { return null; }
    public static android.app.PendingIntent getActivityAsUser(android.content.Context p0, int p1, android.content.Intent p2, int p3, android.os.Bundle p4, android.os.UserHandle p5) { return null; }
    public static android.app.PendingIntent getActivities(android.content.Context p0, int p1, android.content.Intent[] p2, int p3) { return null; }
    public static android.app.PendingIntent getActivities(android.content.Context p0, int p1, android.content.Intent[] p2, int p3, android.os.Bundle p4) { return null; }
    public static android.app.PendingIntent getActivitiesAsUser(android.content.Context p0, int p1, android.content.Intent[] p2, int p3, android.os.Bundle p4, android.os.UserHandle p5) { return null; }
    public static android.app.PendingIntent getBroadcast(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    public static android.app.PendingIntent getBroadcastAsUser(android.content.Context p0, int p1, android.content.Intent p2, int p3, android.os.UserHandle p4) { return null; }
    public static android.app.PendingIntent getService(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    public static android.app.PendingIntent getForegroundService(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    public android.content.IntentSender getIntentSender() { return null; }
    public void cancel() {}
    public void send() throws android.app.PendingIntent.CanceledException {}
    public void send(int p0) throws android.app.PendingIntent.CanceledException {}
    public void send(android.content.Context p0, int p1, android.content.Intent p2) throws android.app.PendingIntent.CanceledException {}
    public void send(int p0, android.app.PendingIntent.OnFinished p1, android.os.Handler p2) throws android.app.PendingIntent.CanceledException {}
    public void send(android.content.Context p0, int p1, android.content.Intent p2, android.app.PendingIntent.OnFinished p3, android.os.Handler p4) throws android.app.PendingIntent.CanceledException {}
    public void send(android.content.Context p0, int p1, android.content.Intent p2, android.app.PendingIntent.OnFinished p3, android.os.Handler p4, java.lang.String p5) throws android.app.PendingIntent.CanceledException {}
    public void send(android.content.Context p0, int p1, android.content.Intent p2, android.app.PendingIntent.OnFinished p3, android.os.Handler p4, java.lang.String p5, android.os.Bundle p6) throws android.app.PendingIntent.CanceledException {}
    public int sendAndReturnResult(android.content.Context p0, int p1, android.content.Intent p2, android.app.PendingIntent.OnFinished p3, android.os.Handler p4, java.lang.String p5, android.os.Bundle p6) throws android.app.PendingIntent.CanceledException { return 0; }
    @java.lang.Deprecated
    public java.lang.String getTargetPackage() { return null; }
    public java.lang.String getCreatorPackage() { return null; }
    public int getCreatorUid() { return 0; }
    @java.lang.Deprecated
    public void registerCancelListener(android.app.PendingIntent.CancelListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public boolean addCancelListener(java.util.concurrent.Executor p0, android.app.PendingIntent.CancelListener p1) { return false; }
    @java.lang.Deprecated
    public void unregisterCancelListener(android.app.PendingIntent.CancelListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void removeCancelListener(android.app.PendingIntent.CancelListener p0) {}
    public android.os.UserHandle getCreatorUserHandle() { return null; }
    public boolean isTargetedToPackage() { return false; }
    public boolean isImmutable() { return false; }
    public boolean isActivity() { return false; }
    public boolean isForegroundService() { return false; }
    public boolean isService() { return false; }
    public boolean isBroadcast() { return false; }
    public android.content.Intent getIntent() { return null; }
    public java.lang.String getTag(java.lang.String p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.GET_INTENT_SENDER_INTENT")
    public java.util.List<android.content.pm.ResolveInfo> queryIntentComponents(int p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @android.annotation.RequiresPermission("android.permission.GET_INTENT_SENDER_INTENT")
    public boolean intentFilterEquals(android.app.PendingIntent p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static void writePendingIntentOrNullToParcel(android.app.PendingIntent p0, android.os.Parcel p1) {}
    public static android.app.PendingIntent readPendingIntentOrNullFromParcel(android.os.Parcel p0) { return null; }
    public PendingIntent(android.content.IIntentSender p0) {}
    PendingIntent(android.os.IBinder p0, java.lang.Object p1) {}
    public android.content.IIntentSender getTarget() { return null; }
    public android.os.IBinder getWhitelistToken() { return null; }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static interface CancelListener {
        public void onCanceled(android.app.PendingIntent p0);
    }

    private final class CancelListerInfo extends com.android.internal.os.IResultReceiver.Stub {
        public void send(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
    }

    public static class CanceledException extends android.util.AndroidException {
        public CanceledException() { super(); }
        public CanceledException(java.lang.String p0) { super(); }
        public CanceledException(java.lang.Exception p0) { super(); }
    }

    private static class FinishedDispatcher extends android.content.IIntentReceiver.Stub implements java.lang.Runnable {
        FinishedDispatcher(android.app.PendingIntent p0, android.app.PendingIntent.OnFinished p1, android.os.Handler p2) { super(); }
        public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    public static interface OnFinished {
        public void onSendFinished(android.app.PendingIntent p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4);
    }

    public static interface OnMarshaledListener {
        public void onMarshaled(android.app.PendingIntent p0, android.os.Parcel p1, int p2);
    }
}
