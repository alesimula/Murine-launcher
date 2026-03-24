package android.graphics.pdf;

@android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_pdf_viewer")
public final class RenderParams {
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_text_annotations")
    public static final int FLAG_RENDER_FREETEXT_ANNOTATIONS = 16;
    public static final int FLAG_RENDER_HIGHLIGHT_ANNOTATIONS = 4;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_edit_pdf_stamp_annotations")
    public static final int FLAG_RENDER_STAMP_ANNOTATIONS = 8;
    public static final int FLAG_RENDER_TEXT_ANNOTATIONS = 2;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_render_params_form_options")
    public static final int RENDER_FORM_CONTENT_DEFAULT = 3;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_render_params_form_options")
    public static final int RENDER_FORM_CONTENT_DISABLED = 2;
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_render_params_form_options")
    public static final int RENDER_FORM_CONTENT_ENABLED = 1;
    public static final int RENDER_MODE_FOR_DISPLAY = 1;
    public static final int RENDER_MODE_FOR_PRINT = 2;
    RenderParams() {}
    public int getRenderFlags() { return 0; }
    @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_render_params_form_options")
    public int getRenderFormContentMode() { return 0; }
    public int getRenderMode() { return 0; }

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams build() { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams.Builder setRenderFlags(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams.Builder setRenderFlags(int p0, int p1) { return null; }
        @android.annotation.FlaggedApi("android.graphics.pdf.flags.enable_render_params_form_options")
        @android.annotation.NonNull
        public android.graphics.pdf.RenderParams.Builder setRenderFormContentMode(int p0) { return null; }
    }
}
