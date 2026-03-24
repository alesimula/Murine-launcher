package android.graphics;

public class PathDashPathEffect extends android.graphics.PathEffect {
    public PathDashPathEffect(android.graphics.Path p0, float p1, float p2, android.graphics.PathDashPathEffect.Style p3) { super(); }

    public static enum Style {
        TRANSLATE,
        ROTATE,
        MORPH;
        int native_style;
    }
}
