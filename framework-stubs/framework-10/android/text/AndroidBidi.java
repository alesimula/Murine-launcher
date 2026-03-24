package android.text;

public class AndroidBidi {
    private static final android.text.AndroidBidi.EmojiBidiOverride sEmojiBidiOverride = null;
    public AndroidBidi() {}
    @android.annotation.UnsupportedAppUsage
    public static int bidi(int p0, char[] p1, byte[] p2) { return 0; }
    public static android.text.Layout.Directions directions(int p0, byte[] p1, int p2, char[] p3, int p4, int p5) { return null; }

    public static class EmojiBidiOverride {
        private static final int NO_OVERRIDE = Integer.valueOf(0);
        public EmojiBidiOverride() {}
        public int classify(int p0) { return 0; }
    }
}
