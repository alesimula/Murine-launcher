package android.widget;

final class SmartSelectSprite {
    static final java.util.Comparator<android.graphics.RectF> RECTANGLE_COMPARATOR = null;
    SmartSelectSprite(android.content.Context p0, int p1, java.lang.Runnable p2) {}
    public void startAnimation(android.graphics.PointF p0, java.util.List<android.widget.SmartSelectSprite.RectangleWithTextSelectionLayout> p1, java.lang.Runnable p2) {}
    public boolean isAnimationActive() { return false; }
    public void cancelAnimation() {}
    public void draw(android.graphics.Canvas p0) {}

    private static final class RectangleList extends android.graphics.drawable.shapes.Shape {
        void setDisplayType(int p0) {}
        public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface DisplayType {
            public static final int RECTANGLES = 0;
            public static final int POLYGON = 1;
        }
    }

    static final class RectangleWithTextSelectionLayout {
        RectangleWithTextSelectionLayout(android.graphics.RectF p0, int p1) {}
        public android.graphics.RectF getRectangle() { return null; }
        public int getTextSelectionLayout() { return 0; }
    }

    private static final class RoundedRectangleShape extends android.graphics.drawable.shapes.Shape {
        public void draw(android.graphics.Canvas p0, android.graphics.Paint p1) {}
        void setRoundRatio(float p0) {}
        float getRoundRatio() { return 0.0f; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface ExpansionDirection {
            public static final int LEFT = -1;
            public static final int CENTER = 0;
            public static final int RIGHT = 1;
        }
    }
}
