package android.filterpacks.imageproc;

public class Invert extends android.filterpacks.imageproc.SimpleImageFilter {
    private static final java.lang.String mInvertShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  gl_FragColor.r = 1.0 - color.r;\n  gl_FragColor.g = 1.0 - color.g;\n  gl_FragColor.b = 1.0 - color.b;\n  gl_FragColor.a = color.a;\n}\n";
    public Invert(java.lang.String p0) { super(null, null); }
    protected android.filterfw.core.Program getNativeProgram(android.filterfw.core.FilterContext p0) { return null; }
    protected android.filterfw.core.Program getShaderProgram(android.filterfw.core.FilterContext p0) { return null; }
}
