package android.view.animation;

public class AnimationUtils {
    public AnimationUtils() {}
    @android.annotation.FlaggedApi("android.view.flags.expected_presentation_time_read_only")
    public static void lockAnimationClock(long p0, long p1) {}
    public static void lockAnimationClock(long p0) {}
    public static void unlockAnimationClock() {}
    public static long currentAnimationTimeMillis() { return 0L; }
    @android.annotation.FlaggedApi("android.view.flags.expected_presentation_time_read_only")
    public static long getExpectedPresentationTimeNanos() { return 0L; }
    @android.annotation.FlaggedApi("android.view.flags.expected_presentation_time_read_only")
    public static long getExpectedPresentationTimeMillis() { return 0L; }
    public static android.view.animation.Animation loadAnimation(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.view.animation.LayoutAnimationController loadLayoutAnimation(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.view.animation.Animation makeInAnimation(android.content.Context p0, boolean p1) { return null; }
    public static android.view.animation.Animation makeOutAnimation(android.content.Context p0, boolean p1) { return null; }
    public static android.view.animation.Animation makeInChildBottomAnimation(android.content.Context p0) { return null; }
    public static android.view.animation.Interpolator loadInterpolator(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.view.animation.Interpolator loadInterpolator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, int p2) throws android.content.res.Resources.NotFoundException { return null; }

    private static class AnimationState {
        boolean animationClockLocked;
        long currentVsyncTimeMillis;
        long lastReportedTimeMillis;
        long mExpectedPresentationTimeNanos;
    }
}
