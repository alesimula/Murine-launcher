package android.app;

public final class PendingIntent implements android.os.Parcelable {
    private final android.content.IIntentSender mTarget = null;
    private com.android.internal.os.IResultReceiver mCancelReceiver;
    private android.os.IBinder mWhitelistToken;
    private android.util.ArraySet<android.app.PendingIntent.CancelListener> mCancelListeners;
    public static final int FLAG_ONE_SHOT = 1073741824;
    public static final int FLAG_NO_CREATE = 536870912;
    public static final int FLAG_CANCEL_CURRENT = 268435456;
    public static final int FLAG_UPDATE_CURRENT = 134217728;
    public static final int FLAG_IMMUTABLE = 67108864;
    private static final java.lang.ThreadLocal<android.app.PendingIntent.OnMarshaledListener> sOnMarshaledListener = null;
    public static final android.os.Parcelable.Creator<android.app.PendingIntent> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public static void setOnMarshaledListener(android.app.PendingIntent.OnMarshaledListener p0) {}
    public static android.app.PendingIntent getActivity(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    public static android.app.PendingIntent getActivity(android.content.Context p0, int p1, android.content.Intent p2, int p3, android.os.Bundle p4) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.app.PendingIntent getActivityAsUser(android.content.Context p0, int p1, android.content.Intent p2, int p3, android.os.Bundle p4, android.os.UserHandle p5) { return null; }
    public static android.app.PendingIntent getActivities(android.content.Context p0, int p1, android.content.Intent[] p2, int p3) { return null; }
    public static android.app.PendingIntent getActivities(android.content.Context p0, int p1, android.content.Intent[] p2, int p3, android.os.Bundle p4) { return null; }
    public static android.app.PendingIntent getActivitiesAsUser(android.content.Context p0, int p1, android.content.Intent[] p2, int p3, android.os.Bundle p4, android.os.UserHandle p5) { return null; }
    public static android.app.PendingIntent getBroadcast(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.app.PendingIntent getBroadcastAsUser(android.content.Context p0, int p1, android.content.Intent p2, int p3, android.os.UserHandle p4) { return null; }
    public static android.app.PendingIntent getService(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    public static android.app.PendingIntent getForegroundService(android.content.Context p0, int p1, android.content.Intent p2, int p3) { return null; }
    private static android.app.PendingIntent buildServicePendingIntent(android.content.Context p0, int p1, android.content.Intent p2, int p3, int p4) { return null; }
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
    public void registerCancelListener(android.app.PendingIntent.CancelListener p0) {}
    private void notifyCancelListeners() {}
    public void unregisterCancelListener(android.app.PendingIntent.CancelListener p0) {}
    public android.os.UserHandle getCreatorUserHandle() { return null; }
    public boolean isTargetedToPackage() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isActivity() { return false; }
    public boolean isForegroundService() { return false; }
    public boolean isBroadcast() { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.content.Intent getIntent() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getTag(java.lang.String p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static void writePendingIntentOrNullToParcel(android.app.PendingIntent p0, android.os.Parcel p1) {}
    public static android.app.PendingIntent readPendingIntentOrNullFromParcel(android.os.Parcel p0) { return null; }
    PendingIntent(android.content.IIntentSender p0) {}
    PendingIntent(android.os.IBinder p0, java.lang.Object p1) {}
    public android.content.IIntentSender getTarget() { return null; }
    public android.os.IBinder getWhitelistToken() { return null; }

    public static interface OnMarshaledListener {
        public void onMarshaled(android.app.PendingIntent p0, android.os.Parcel p1, int p2);
    }

    public static interface OnFinished {
        public void onSendFinished(android.app.PendingIntent p0, android.content.Intent p1, int p2, java.lang.String p3, android.os.Bundle p4);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    private static class FinishedDispatcher extends android.content.IIntentReceiver.Stub implements java.lang.Runnable {
        private final android.app.PendingIntent mPendingIntent = null;
        private final android.app.PendingIntent.OnFinished mWho = null;
        private final android.os.Handler mHandler = null;
        private android.content.Intent mIntent;
        private int mResultCode;
        private java.lang.String mResultData;
        private android.os.Bundle mResultExtras;
        private static android.os.Handler sDefaultSystemHandler;
        FinishedDispatcher(android.app.PendingIntent p0, android.app.PendingIntent.OnFinished p1, android.os.Handler p2) { super(); }
        public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) {}
        public void run() {}
    }

    public static class CanceledException extends android.util.AndroidException {
        public CanceledException() { super(); }
        public CanceledException(java.lang.String p0) { super(); }
        public CanceledException(java.lang.Exception p0) { super(); }
    }

    public static interface CancelListener {
        public void onCancelled(android.app.PendingIntent p0);
    }
}
