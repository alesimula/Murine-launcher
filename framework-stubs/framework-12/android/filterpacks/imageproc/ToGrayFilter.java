package android.filterpacks.imageproc;

public class ToGrayFilter extends android.filterpacks.imageproc.SimpleImageFilter {
    @android.filterfw.core.GenerateFieldPort(name="invertSource", hasDefault=true)
    private boolean mInvertSource;
    @android.filterfw.core.GenerateFieldPort(name="tile_size", hasDefault=true)
    private int mTileSize;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private static final java.lang.String mColorToGray4Shader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  float y = dot(color, vec4(0.299, 0.587, 0.114, 0));\n  gl_FragColor = vec4(y, y, y, color.a);\n}\n";
    public ToGrayFilter(java.lang.String p0) { super(null, null); }
    public void setupPorts() {}
    protected android.filterfw.core.Program getNativeProgram(android.filterfw.core.FilterContext p0) { return null; }
    protected android.filterfw.core.Program getShaderProgram(android.filterfw.core.FilterContext p0) { return null; }
}
