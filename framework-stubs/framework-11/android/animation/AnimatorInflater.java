package android.animation;

public class AnimatorInflater {
    private static final java.lang.String TAG = "AnimatorInflater";
    private static final int TOGETHER = 0;
    private static final int SEQUENTIALLY = 1;
    private static final int VALUE_TYPE_FLOAT = 0;
    private static final int VALUE_TYPE_INT = 1;
    private static final int VALUE_TYPE_PATH = 2;
    private static final int VALUE_TYPE_COLOR = 3;
    private static final int VALUE_TYPE_UNDEFINED = 4;
    private static final boolean DBG_ANIMATOR_INFLATER = false;
    private static final android.util.TypedValue sTmpTypedValue = null;
    public AnimatorInflater() {}
    public static android.animation.Animator loadAnimator(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.animation.Animator loadAnimator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, int p2) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.animation.Animator loadAnimator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, int p2, float p3) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.animation.StateListAnimator loadStateListAnimator(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    private static android.animation.StateListAnimator createStateListAnimatorFromXml(android.content.Context p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.animation.PropertyValuesHolder getPVH(android.content.res.TypedArray p0, int p1, int p2, int p3, java.lang.String p4) { return null; }
    private static void parseAnimatorFromTypeArray(android.animation.ValueAnimator p0, android.content.res.TypedArray p1, android.content.res.TypedArray p2, float p3) {}
    private static android.animation.TypeEvaluator setupAnimatorForPath(android.animation.ValueAnimator p0, android.content.res.TypedArray p1) { return null; }
    private static void setupObjectAnimator(android.animation.ValueAnimator p0, android.content.res.TypedArray p1, int p2, float p3) {}
    private static void setupValues(android.animation.ValueAnimator p0, android.content.res.TypedArray p1, boolean p2, boolean p3, int p4, boolean p5, int p6) {}
    private static android.animation.Animator createAnimatorFromXml(android.content.res.Resources p0, android.content.res.Resources.Theme p1, org.xmlpull.v1.XmlPullParser p2, float p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.animation.Animator createAnimatorFromXml(android.content.res.Resources p0, android.content.res.Resources.Theme p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3, android.animation.AnimatorSet p4, int p5, float p6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.animation.PropertyValuesHolder[] loadValues(android.content.res.Resources p0, android.content.res.Resources.Theme p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static int inferValueTypeOfKeyframe(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2) { return 0; }
    private static int inferValueTypeFromValues(android.content.res.TypedArray p0, int p1, int p2) { return 0; }
    private static void dumpKeyframes(java.lang.Object[] p0, java.lang.String p1) {}
    private static android.animation.PropertyValuesHolder loadPvh(android.content.res.Resources p0, android.content.res.Resources.Theme p1, org.xmlpull.v1.XmlPullParser p2, java.lang.String p3, int p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.animation.Keyframe createNewKeyframe(android.animation.Keyframe p0, float p1) { return null; }
    private static void distributeKeyframes(android.animation.Keyframe[] p0, float p1, int p2, int p3) {}
    private static android.animation.Keyframe loadKeyframe(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2, int p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.animation.ObjectAnimator loadObjectAnimator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2, float p3) throws android.content.res.Resources.NotFoundException { return null; }
    private static android.animation.ValueAnimator loadAnimator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, android.util.AttributeSet p2, android.animation.ValueAnimator p3, float p4) throws android.content.res.Resources.NotFoundException { return null; }
    private static int getChangingConfigs(android.content.res.Resources p0, int p1) { return 0; }
    private static boolean isColorType(int p0) { return false; }

    private static class PathDataEvaluator implements android.animation.TypeEvaluator<android.util.PathParser.PathData> {
        private final android.util.PathParser.PathData mPathData = null;
        private PathDataEvaluator() {}
        public android.util.PathParser.PathData evaluate(float p0, android.util.PathParser.PathData p1, android.util.PathParser.PathData p2) { return null; }
    }
}
