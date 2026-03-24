package android.content.res;

@android.annotation.FlaggedApi("android.content.res.font_scale_converter_public")
public interface FontScaleConverter {
    public float convertSpToDp(float p0);
    public float convertDpToSp(float p0);
    public static boolean isNonLinearFontScalingActive(float p0) { return false; }
    @android.annotation.Nullable
    public static android.content.res.FontScaleConverter forScale(float p0) { return null; }
}
