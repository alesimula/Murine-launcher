package android.view;

public class SoundEffectConstants {
    private static final java.util.Random NAVIGATION_REPEAT_RANDOMIZER = null;
    private static int sLastNavigationRepeatSoundEffectId;
    public static final int CLICK = 0;
    public static final int NAVIGATION_LEFT = 1;
    public static final int NAVIGATION_UP = 2;
    public static final int NAVIGATION_RIGHT = 3;
    public static final int NAVIGATION_DOWN = 4;
    public static final int NAVIGATION_REPEAT_LEFT = 5;
    public static final int NAVIGATION_REPEAT_UP = 6;
    public static final int NAVIGATION_REPEAT_RIGHT = 7;
    public static final int NAVIGATION_REPEAT_DOWN = 8;
    private SoundEffectConstants() {}
    public static int getContantForFocusDirection(int p0) { return 0; }
    public static int getConstantForFocusDirection(int p0, boolean p1) { return 0; }
    public static boolean isNavigationRepeat(int p0) { return false; }
    public static int nextNavigationRepeatSoundEffectId() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NavigationSoundEffect {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoundEffect {
    }
}
