package android.companion.virtual.audio;

final class UserRestrictionsDetector extends android.content.BroadcastReceiver {
    UserRestrictionsDetector(android.content.Context p0) { super(); }
    boolean isUnmuteMicrophoneDisallowed() { return false; }
    void register(android.companion.virtual.audio.UserRestrictionsDetector.UserRestrictionsCallback p0) {}
    void unregister() {}
    public void onReceive(android.content.Context p0, android.content.Intent p1) {}

    static interface UserRestrictionsCallback {
        public void onMicrophoneRestrictionChanged(boolean p0);
    }
}
