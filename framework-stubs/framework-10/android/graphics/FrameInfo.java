package android.graphics;

public final class FrameInfo {
    public long[] frameInfo;
    private static final int FLAGS = 0;
    public static final long FLAG_WINDOW_LAYOUT_CHANGED = 1L;
    public static final long FLAG_SURFACE_CANVAS = 4L;
    private static final int INTENDED_VSYNC = 1;
    private static final int VSYNC = 2;
    private static final int OLDEST_INPUT_EVENT = 3;
    private static final int NEWEST_INPUT_EVENT = 4;
    private static final int HANDLE_INPUT_START = 5;
    private static final int ANIMATION_START = 6;
    private static final int PERFORM_TRAVERSALS_START = 7;
    private static final int DRAW_START = 8;
    public FrameInfo() {}
    public void setVsync(long p0, long p1) {}
    public void updateInputEventTime(long p0, long p1) {}
    public void markInputHandlingStart() {}
    public void markAnimationsStart() {}
    public void markPerformTraversalsStart() {}
    public void markDrawStart() {}
    public void addFlags(long p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameInfoFlags {
    }
}
