package android.filterpacks.imageproc;

public class ContrastFilter extends android.filterpacks.imageproc.SimpleImageFilter {
    private static final java.lang.String mContrastShader = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float contrast;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color = texture2D(tex_sampler_0, v_texcoord);\n  color -= 0.5;\n  color *= contrast;\n  color += 0.5;\n  gl_FragColor = color;\n}\n";
    public ContrastFilter(java.lang.String p0) { super(null, null); }
    protected android.filterfw.core.Program getNativeProgram(android.filterfw.core.FilterContext p0) { return null; }
    protected android.filterfw.core.Program getShaderProgram(android.filterfw.core.FilterContext p0) { return null; }
}
