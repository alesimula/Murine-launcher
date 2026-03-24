package android.view;

public class EventLogTags {
    public static final int IMF_IME_ANIM_START = 32006;
    public static final int IMF_IME_ANIM_FINISH = 32007;
    public static final int IMF_IME_ANIM_CANCEL = 32008;
    public static final int IMF_IME_REMOTE_ANIM_START = 32009;
    public static final int IMF_IME_REMOTE_ANIM_END = 32010;
    public static final int IMF_IME_REMOTE_ANIM_CANCEL = 32011;
    public static final int VIEW_ENQUEUE_INPUT_EVENT = 62002;
    public static void writeImfImeAnimStart(java.lang.String p0, int p1, float p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) {}
    public static void writeImfImeAnimFinish(java.lang.String p0, int p1, float p2, int p3, java.lang.String p4) {}
    public static void writeImfImeAnimCancel(java.lang.String p0, int p1, java.lang.String p2) {}
    public static void writeImfImeRemoteAnimStart(java.lang.String p0, int p1, int p2, float p3, float p4, float p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9) {}
    public static void writeImfImeRemoteAnimEnd(java.lang.String p0, int p1, int p2, float p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7) {}
    public static void writeImfImeRemoteAnimCancel(java.lang.String p0, int p1, java.lang.String p2) {}
    public static void writeViewEnqueueInputEvent(java.lang.String p0, java.lang.String p1) {}
}
