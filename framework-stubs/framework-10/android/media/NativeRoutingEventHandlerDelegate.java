package android.media;

class NativeRoutingEventHandlerDelegate {
    private android.media.AudioRouting mAudioRouting;
    private android.media.AudioRouting.OnRoutingChangedListener mOnRoutingChangedListener;
    private android.os.Handler mHandler;
    NativeRoutingEventHandlerDelegate(android.media.AudioRouting p0, android.media.AudioRouting.OnRoutingChangedListener p1, android.os.Handler p2) {}
    void notifyClient() {}
}
