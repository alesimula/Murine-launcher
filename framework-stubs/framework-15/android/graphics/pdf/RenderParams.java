package android.graphics.pdf;

public final class RenderParams {
    public static final int FLAG_RENDER_HIGHLIGHT_ANNOTATIONS = 4;
    public static final int FLAG_RENDER_TEXT_ANNOTATIONS = 2;
    public static final int RENDER_MODE_FOR_DISPLAY = 1;
    public static final int RENDER_MODE_FOR_PRINT = 2;
    RenderParams() {}
    public int getRenderFlags() { return 0; }
    public int getRenderMode() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams build() { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams.Builder setRenderFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams.Builder setRenderFlags(int p0, int p1) { return null; }
    }
}
