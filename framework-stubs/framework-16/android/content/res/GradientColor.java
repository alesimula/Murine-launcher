package android.content.res;

public class GradientColor extends android.content.res.ComplexColor {
    public android.graphics.Shader getShader() { return null; }
    public static android.content.res.GradientColor createFromXml(android.content.res.Resources p0, android.content.res.XmlResourceParser p1, android.content.res.Resources.Theme p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    @android.annotation.NonNull
    static android.content.res.GradientColor createFromXmlInner(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public int getDefaultColor() { return 0; }
    public android.content.res.ConstantState<android.content.res.ComplexColor> getConstantState() { return null; }
    public android.content.res.GradientColor obtainForTheme(android.content.res.Resources.Theme p0) { return null; }
    public int getChangingConfigurations() { return 0; }
    public boolean canApplyTheme() { return false; }

    private static class GradientColorFactory extends android.content.res.ConstantState<android.content.res.ComplexColor> {
        public GradientColorFactory(android.content.res.GradientColor p0) { super(); }
        public int getChangingConfigurations() { return 0; }
        public android.content.res.GradientColor newInstance() { return null; }
        public android.content.res.GradientColor newInstance(android.content.res.Resources p0, android.content.res.Resources.Theme p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface GradientTileMode {
    }
}
