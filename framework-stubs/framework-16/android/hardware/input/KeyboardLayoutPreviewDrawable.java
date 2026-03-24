package android.hardware.input;

final class KeyboardLayoutPreviewDrawable extends android.graphics.drawable.Drawable {
    public KeyboardLayoutPreviewDrawable(android.content.Context p0, android.hardware.input.PhysicalKeyLayout p1, int p2, int p3) { super(); }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getOpacity() { return 0; }

    private static final record GlyphDrawable(java.lang.String text, android.graphics.RectF rect, int gravity, android.graphics.Paint paint) {
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String text() { return null; }
        public android.graphics.RectF rect() { return null; }
        public int gravity() { return 0; }
        public android.graphics.Paint paint() { return null; }
    }

    private static class IsoEnterKey implements android.hardware.input.KeyboardLayoutPreviewDrawable.KeyDrawable {
        public void draw(android.graphics.Canvas p0) {}

        private static class Builder {
        }
    }

    private static interface KeyDrawable {
        public void draw(android.graphics.Canvas p0);
    }

    private static class ResourceProvider {
    }

    private static class TypingKey implements android.hardware.input.KeyboardLayoutPreviewDrawable.KeyDrawable {
        public void draw(android.graphics.Canvas p0) {}
    }

    private static class UnsureTypingKey extends android.hardware.input.KeyboardLayoutPreviewDrawable.TypingKey {
    }
}
