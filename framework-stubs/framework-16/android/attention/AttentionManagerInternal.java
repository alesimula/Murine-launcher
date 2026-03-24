package android.attention;

public abstract class AttentionManagerInternal {
    public AttentionManagerInternal() {}
    public abstract boolean isAttentionServiceSupported();
    public abstract boolean isProximitySupported();
    public abstract boolean checkAttention(long p0, android.attention.AttentionManagerInternal.AttentionCallbackInternal p1);
    public abstract void cancelAttentionCheck(android.attention.AttentionManagerInternal.AttentionCallbackInternal p0);
    public abstract boolean onStartProximityUpdates(android.attention.AttentionManagerInternal.ProximityUpdateCallbackInternal p0);
    public abstract void onStopProximityUpdates(android.attention.AttentionManagerInternal.ProximityUpdateCallbackInternal p0);

    public static abstract class AttentionCallbackInternal {
        public AttentionCallbackInternal() {}
        public abstract void onSuccess(int p0, long p1);
        public abstract void onFailure(int p0);
    }

    public static interface ProximityUpdateCallbackInternal {
        public void onProximityUpdate(double p0);
    }
}
