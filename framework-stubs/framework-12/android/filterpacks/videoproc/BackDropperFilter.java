package android.filterpacks.videoproc;

public class BackDropperFilter extends android.filterfw.core.Filter {
    private final int BACKGROUND_STRETCH = 0;
    private final int BACKGROUND_FIT = 0;
    private final int BACKGROUND_FILL_CROP = 0;
    @android.filterfw.core.GenerateFieldPort(name="backgroundFitMode", hasDefault=true)
    private int mBackgroundFitMode;
    @android.filterfw.core.GenerateFieldPort(name="learningDuration", hasDefault=true)
    private int mLearningDuration;
    @android.filterfw.core.GenerateFieldPort(name="learningVerifyDuration", hasDefault=true)
    private int mLearningVerifyDuration;
    @android.filterfw.core.GenerateFieldPort(name="acceptStddev", hasDefault=true)
    private float mAcceptStddev;
    @android.filterfw.core.GenerateFieldPort(name="hierLrgScale", hasDefault=true)
    private float mHierarchyLrgScale;
    @android.filterfw.core.GenerateFieldPort(name="hierMidScale", hasDefault=true)
    private float mHierarchyMidScale;
    @android.filterfw.core.GenerateFieldPort(name="hierSmlScale", hasDefault=true)
    private float mHierarchySmlScale;
    @android.filterfw.core.GenerateFieldPort(name="maskWidthExp", hasDefault=true)
    private int mMaskWidthExp;
    @android.filterfw.core.GenerateFieldPort(name="maskHeightExp", hasDefault=true)
    private int mMaskHeightExp;
    @android.filterfw.core.GenerateFieldPort(name="hierLrgExp", hasDefault=true)
    private int mHierarchyLrgExp;
    @android.filterfw.core.GenerateFieldPort(name="hierMidExp", hasDefault=true)
    private int mHierarchyMidExp;
    @android.filterfw.core.GenerateFieldPort(name="hierSmlExp", hasDefault=true)
    private int mHierarchySmlExp;
    @android.filterfw.core.GenerateFieldPort(name="lumScale", hasDefault=true)
    private float mLumScale;
    @android.filterfw.core.GenerateFieldPort(name="chromaScale", hasDefault=true)
    private float mChromaScale;
    @android.filterfw.core.GenerateFieldPort(name="maskBg", hasDefault=true)
    private float mMaskBg;
    @android.filterfw.core.GenerateFieldPort(name="maskFg", hasDefault=true)
    private float mMaskFg;
    @android.filterfw.core.GenerateFieldPort(name="exposureChange", hasDefault=true)
    private float mExposureChange;
    @android.filterfw.core.GenerateFieldPort(name="whitebalanceredChange", hasDefault=true)
    private float mWhiteBalanceRedChange;
    @android.filterfw.core.GenerateFieldPort(name="whitebalanceblueChange", hasDefault=true)
    private float mWhiteBalanceBlueChange;
    @android.filterfw.core.GenerateFieldPort(name="autowbToggle", hasDefault=true)
    private int mAutoWBToggle;
    @android.filterfw.core.GenerateFieldPort(name="learningAdaptRate", hasDefault=true)
    private float mAdaptRateLearning;
    @android.filterfw.core.GenerateFieldPort(name="adaptRateBg", hasDefault=true)
    private float mAdaptRateBg;
    @android.filterfw.core.GenerateFieldPort(name="adaptRateFg", hasDefault=true)
    private float mAdaptRateFg;
    @android.filterfw.core.GenerateFieldPort(name="maskVerifyRate", hasDefault=true)
    private float mVerifyRate;
    @android.filterfw.core.GenerateFieldPort(name="learningDoneListener", hasDefault=true)
    private android.filterpacks.videoproc.BackDropperFilter.LearningDoneListener mLearningDoneListener;
    @android.filterfw.core.GenerateFieldPort(name="useTheForce", hasDefault=true)
    private boolean mUseTheForce;
    @android.filterfw.core.GenerateFinalPort(name="provideDebugOutputs", hasDefault=true)
    private boolean mProvideDebugOutputs;
    @android.filterfw.core.GenerateFieldPort(name="mirrorBg", hasDefault=true)
    private boolean mMirrorBg;
    @android.filterfw.core.GenerateFieldPort(name="orientation", hasDefault=true)
    private int mOrientation;
    private static final int DEFAULT_LEARNING_DURATION = 40;
    private static final int DEFAULT_LEARNING_VERIFY_DURATION = 10;
    private static final float DEFAULT_ACCEPT_STDDEV = 0.8500000238418579f;
    private static final float DEFAULT_HIER_LRG_SCALE = 0.699999988079071f;
    private static final float DEFAULT_HIER_MID_SCALE = 0.6000000238418579f;
    private static final float DEFAULT_HIER_SML_SCALE = 0.5f;
    private static final int DEFAULT_MASK_WIDTH_EXPONENT = 8;
    private static final int DEFAULT_MASK_HEIGHT_EXPONENT = 8;
    private static final int DEFAULT_HIER_LRG_EXPONENT = 3;
    private static final int DEFAULT_HIER_MID_EXPONENT = 2;
    private static final int DEFAULT_HIER_SML_EXPONENT = 0;
    private static final float DEFAULT_Y_SCALE_FACTOR = 0.4000000059604645f;
    private static final float DEFAULT_UV_SCALE_FACTOR = 1.350000023841858f;
    private static final float DEFAULT_MASK_BLEND_BG = 0.6499999761581421f;
    private static final float DEFAULT_MASK_BLEND_FG = 0.949999988079071f;
    private static final float DEFAULT_EXPOSURE_CHANGE = 1.0f;
    private static final float DEFAULT_WHITE_BALANCE_RED_CHANGE = 0.0f;
    private static final float DEFAULT_WHITE_BALANCE_BLUE_CHANGE = 0.0f;
    private static final int DEFAULT_WHITE_BALANCE_TOGGLE = 0;
    private static final float DEFAULT_LEARNING_ADAPT_RATE = 0.20000000298023224f;
    private static final float DEFAULT_ADAPT_RATE_BG = 0.0f;
    private static final float DEFAULT_ADAPT_RATE_FG = 0.0f;
    private static final float DEFAULT_MASK_VERIFY_RATE = 0.25f;
    private static final int DEFAULT_LEARNING_DONE_THRESHOLD = 20;
    private static final float[] DEFAULT_BG_FIT_TRANSFORM = null;
    private static final java.lang.String MASK_SMOOTH_EXPONENT = "2.0";
    private static final java.lang.String DISTANCE_STORAGE_SCALE = "0.6";
    private static final java.lang.String VARIANCE_STORAGE_SCALE = "5.0";
    private static final java.lang.String DEFAULT_AUTO_WB_SCALE = "0.25";
    private static final java.lang.String MIN_VARIANCE = "3.0";
    private static final java.lang.String RGB_TO_YUV_MATRIX = "0.299, -0.168736,  0.5,      0.000, 0.587, -0.331264, -0.418688, 0.000, 0.114,  0.5,      -0.081312, 0.000, 0.000,  0.5,       0.5,      1.000 ";
    private static final java.lang.String[] mInputNames = null;
    private static final java.lang.String[] mOutputNames = null;
    private static final java.lang.String[] mDebugOutputNames = null;
    private android.filterfw.core.FrameFormat mOutputFormat;
    private android.filterfw.core.MutableFrameFormat mMemoryFormat;
    private android.filterfw.core.MutableFrameFormat mMaskFormat;
    private android.filterfw.core.MutableFrameFormat mAverageFormat;
    private final boolean mLogVerbose = false;
    private static final java.lang.String TAG = "BackDropperFilter";
    private static java.lang.String mSharedUtilShader;
    private static final java.lang.String mBgDistanceShader = "uniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform sampler2D tex_sampler_2;\nuniform float subsample_level;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 fg_rgb = texture2D(tex_sampler_0, v_texcoord, subsample_level);\n  vec4 fg = coeff_yuv * vec4(fg_rgb.rgb, 1.);\n  vec4 mean = texture2D(tex_sampler_1, v_texcoord);\n  vec4 variance = inv_var_scale * texture2D(tex_sampler_2, v_texcoord);\n\n  float dist_y = gauss_dist_y(fg.r, mean.r, variance.r);\n  float dist_uv = gauss_dist_uv(fg.gb, mean.gb, variance.gb);\n  gl_FragColor = vec4(0.5*fg.rg, dist_scale*dist_y, dist_scale*dist_uv);\n}\n";
    private static final java.lang.String mBgMaskShader = "uniform sampler2D tex_sampler_0;\nuniform float accept_variance;\nuniform vec2 yuv_weights;\nuniform float scale_lrg;\nuniform float scale_mid;\nuniform float scale_sml;\nuniform float exp_lrg;\nuniform float exp_mid;\nuniform float exp_sml;\nvarying vec2 v_texcoord;\nbool is_fg(vec2 dist_yc, float accept_variance) {\n  return ( dot(yuv_weights, dist_yc) >= accept_variance );\n}\nvoid main() {\n  vec4 dist_lrg_sc = texture2D(tex_sampler_0, v_texcoord, exp_lrg);\n  vec4 dist_mid_sc = texture2D(tex_sampler_0, v_texcoord, exp_mid);\n  vec4 dist_sml_sc = texture2D(tex_sampler_0, v_texcoord, exp_sml);\n  vec2 dist_lrg = inv_dist_scale * dist_lrg_sc.ba;\n  vec2 dist_mid = inv_dist_scale * dist_mid_sc.ba;\n  vec2 dist_sml = inv_dist_scale * dist_sml_sc.ba;\n  vec2 norm_dist = 0.75 * dist_sml / accept_variance;\n  bool is_fg_lrg = is_fg(dist_lrg, accept_variance * scale_lrg);\n  bool is_fg_mid = is_fg_lrg || is_fg(dist_mid, accept_variance * scale_mid);\n  float is_fg_sml =\n      float(is_fg_mid || is_fg(dist_sml, accept_variance * scale_sml));\n  float alpha = 0.5 * is_fg_sml + 0.3 * float(is_fg_mid) + 0.2 * float(is_fg_lrg);\n  gl_FragColor = vec4(alpha, norm_dist, is_fg_sml);\n}\n";
    private static final java.lang.String mAutomaticWhiteBalance = "uniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform float pyramid_depth;\nuniform bool autowb_toggle;\nvarying vec2 v_texcoord;\nvoid main() {\n   vec4 mean_video = texture2D(tex_sampler_0, v_texcoord, pyramid_depth);\n   vec4 mean_bg = texture2D(tex_sampler_1, v_texcoord, pyramid_depth);\n   float green_normalizer = mean_video.g / mean_bg.g;\n   vec4 adjusted_value = vec4(mean_bg.r / mean_video.r * green_normalizer, 1., \n                         mean_bg.b / mean_video.b * green_normalizer, 1.) * auto_wb_scale; \n   gl_FragColor = autowb_toggle ? adjusted_value : vec4(auto_wb_scale);\n}\n";
    private static final java.lang.String mBgSubtractShader = "uniform mat3 bg_fit_transform;\nuniform float mask_blend_bg;\nuniform float mask_blend_fg;\nuniform float exposure_change;\nuniform float whitebalancered_change;\nuniform float whitebalanceblue_change;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform sampler2D tex_sampler_2;\nuniform sampler2D tex_sampler_3;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec2 bg_texcoord = (bg_fit_transform * vec3(v_texcoord, 1.)).xy;\n  vec4 bg_rgb = texture2D(tex_sampler_1, bg_texcoord);\n  vec4 wb_auto_scale = texture2D(tex_sampler_3, v_texcoord) * exposure_change / auto_wb_scale;\n  vec4 wb_manual_scale = vec4(1. + whitebalancered_change, 1., 1. + whitebalanceblue_change, 1.);\n  vec4 fg_rgb = texture2D(tex_sampler_0, v_texcoord);\n  vec4 fg_adjusted = fg_rgb * wb_manual_scale * wb_auto_scale;\n  vec4 mask = texture2D(tex_sampler_2, v_texcoord, \n                      2.0);\n  float alpha = smoothstep(mask_blend_bg, mask_blend_fg, mask.a);\n  gl_FragColor = mix(bg_rgb, fg_adjusted, alpha);\n";
    private static final java.lang.String mBgSubtractForceShader = "  vec4 ghost_rgb = (fg_adjusted * 0.7 + vec4(0.3,0.3,0.4,0.))*0.65 + \n                   0.35*bg_rgb;\n  float glow_start = 0.75 * mask_blend_bg; \n  float glow_max   = mask_blend_bg; \n  gl_FragColor = mask.a < glow_start ? bg_rgb : \n                 mask.a < glow_max ? mix(bg_rgb, vec4(0.9,0.9,1.0,1.0), \n                                     (mask.a - glow_start) / (glow_max - glow_start) ) : \n                 mask.a < mask_blend_fg ? mix(vec4(0.9,0.9,1.0,1.0), ghost_rgb, \n                                    (mask.a - glow_max) / (mask_blend_fg - glow_max) ) : \n                 ghost_rgb;\n}\n";
    private static final java.lang.String mUpdateBgModelMeanShader = "uniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform sampler2D tex_sampler_2;\nuniform float subsample_level;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 fg_rgb = texture2D(tex_sampler_0, v_texcoord, subsample_level);\n  vec4 fg = coeff_yuv * vec4(fg_rgb.rgb, 1.);\n  vec4 mean = texture2D(tex_sampler_1, v_texcoord);\n  vec4 mask = texture2D(tex_sampler_2, v_texcoord, \n                      2.0);\n\n  float alpha = local_adapt_rate(mask.a);\n  vec4 new_mean = mix(mean, fg, alpha);\n  gl_FragColor = new_mean;\n}\n";
    private static final java.lang.String mUpdateBgModelVarianceShader = "uniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform sampler2D tex_sampler_2;\nuniform sampler2D tex_sampler_3;\nuniform float subsample_level;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 fg_rgb = texture2D(tex_sampler_0, v_texcoord, subsample_level);\n  vec4 fg = coeff_yuv * vec4(fg_rgb.rgb, 1.);\n  vec4 mean = texture2D(tex_sampler_1, v_texcoord);\n  vec4 variance = inv_var_scale * texture2D(tex_sampler_2, v_texcoord);\n  vec4 mask = texture2D(tex_sampler_3, v_texcoord, \n                      2.0);\n\n  float alpha = local_adapt_rate(mask.a);\n  vec4 cur_variance = (fg-mean)*(fg-mean);\n  vec4 new_variance = mix(variance, cur_variance, alpha);\n  new_variance = max(new_variance, vec4(min_variance));\n  gl_FragColor = var_scale * new_variance;\n}\n";
    private static final java.lang.String mMaskVerifyShader = "uniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform float verify_rate;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 lastmask = texture2D(tex_sampler_0, v_texcoord);\n  vec4 mask = texture2D(tex_sampler_1, v_texcoord);\n  float newmask = mix(lastmask.a, mask.a, verify_rate);\n  gl_FragColor = vec4(0., 0., 0., newmask);\n}\n";
    private android.filterfw.core.ShaderProgram mBgDistProgram;
    private android.filterfw.core.ShaderProgram mBgMaskProgram;
    private android.filterfw.core.ShaderProgram mBgSubtractProgram;
    private android.filterfw.core.ShaderProgram mBgUpdateMeanProgram;
    private android.filterfw.core.ShaderProgram mBgUpdateVarianceProgram;
    private android.filterfw.core.ShaderProgram mCopyOutProgram;
    private android.filterfw.core.ShaderProgram mAutomaticWhiteBalanceProgram;
    private android.filterfw.core.ShaderProgram mMaskVerifyProgram;
    private android.filterfw.core.ShaderProgram copyShaderProgram;
    private boolean mPingPong;
    private android.filterfw.core.GLFrame[] mBgMean;
    private android.filterfw.core.GLFrame[] mBgVariance;
    private android.filterfw.core.GLFrame[] mMaskVerify;
    private android.filterfw.core.GLFrame mDistance;
    private android.filterfw.core.GLFrame mAutoWB;
    private android.filterfw.core.GLFrame mMask;
    private android.filterfw.core.GLFrame mVideoInput;
    private android.filterfw.core.GLFrame mBgInput;
    private android.filterfw.core.GLFrame mMaskAverage;
    private boolean isOpen;
    private int mFrameCount;
    private boolean mStartLearning;
    private boolean mBackgroundFitModeChanged;
    private float mRelativeAspect;
    private int mPyramidDepth;
    private int mSubsampleLevel;
    private long startTime;
    public BackDropperFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    private boolean createMemoryFormat(android.filterfw.core.FrameFormat p0) { return false; }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    private void allocateFrames(android.filterfw.core.FrameFormat p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public synchronized void relearn() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    private void updateBgScaling(android.filterfw.core.Frame p0, android.filterfw.core.Frame p1, boolean p2) {}
    private int pyramidLevel(int p0) { return 0; }

    public static interface LearningDoneListener {
        public void onLearningDone(android.filterpacks.videoproc.BackDropperFilter p0);
    }
}
