package android.media.effect;

public class EffectFactory {
    private android.media.effect.EffectContext mEffectContext;
    private static final java.lang.String[] EFFECT_PACKAGES = null;
    public static final java.lang.String EFFECT_IDENTITY = "IdentityEffect";
    public static final java.lang.String EFFECT_BRIGHTNESS = "android.media.effect.effects.BrightnessEffect";
    public static final java.lang.String EFFECT_CONTRAST = "android.media.effect.effects.ContrastEffect";
    public static final java.lang.String EFFECT_FISHEYE = "android.media.effect.effects.FisheyeEffect";
    public static final java.lang.String EFFECT_BACKDROPPER = "android.media.effect.effects.BackDropperEffect";
    public static final java.lang.String EFFECT_AUTOFIX = "android.media.effect.effects.AutoFixEffect";
    public static final java.lang.String EFFECT_BLACKWHITE = "android.media.effect.effects.BlackWhiteEffect";
    public static final java.lang.String EFFECT_CROP = "android.media.effect.effects.CropEffect";
    public static final java.lang.String EFFECT_CROSSPROCESS = "android.media.effect.effects.CrossProcessEffect";
    public static final java.lang.String EFFECT_DOCUMENTARY = "android.media.effect.effects.DocumentaryEffect";
    public static final java.lang.String EFFECT_BITMAPOVERLAY = "android.media.effect.effects.BitmapOverlayEffect";
    public static final java.lang.String EFFECT_DUOTONE = "android.media.effect.effects.DuotoneEffect";
    public static final java.lang.String EFFECT_FILLLIGHT = "android.media.effect.effects.FillLightEffect";
    public static final java.lang.String EFFECT_FLIP = "android.media.effect.effects.FlipEffect";
    public static final java.lang.String EFFECT_GRAIN = "android.media.effect.effects.GrainEffect";
    public static final java.lang.String EFFECT_GRAYSCALE = "android.media.effect.effects.GrayscaleEffect";
    public static final java.lang.String EFFECT_LOMOISH = "android.media.effect.effects.LomoishEffect";
    public static final java.lang.String EFFECT_NEGATIVE = "android.media.effect.effects.NegativeEffect";
    public static final java.lang.String EFFECT_POSTERIZE = "android.media.effect.effects.PosterizeEffect";
    public static final java.lang.String EFFECT_REDEYE = "android.media.effect.effects.RedEyeEffect";
    public static final java.lang.String EFFECT_ROTATE = "android.media.effect.effects.RotateEffect";
    public static final java.lang.String EFFECT_SATURATE = "android.media.effect.effects.SaturateEffect";
    public static final java.lang.String EFFECT_SEPIA = "android.media.effect.effects.SepiaEffect";
    public static final java.lang.String EFFECT_SHARPEN = "android.media.effect.effects.SharpenEffect";
    public static final java.lang.String EFFECT_STRAIGHTEN = "android.media.effect.effects.StraightenEffect";
    public static final java.lang.String EFFECT_TEMPERATURE = "android.media.effect.effects.ColorTemperatureEffect";
    public static final java.lang.String EFFECT_TINT = "android.media.effect.effects.TintEffect";
    public static final java.lang.String EFFECT_VIGNETTE = "android.media.effect.effects.VignetteEffect";
    EffectFactory(android.media.effect.EffectContext p0) {}
    public android.media.effect.Effect createEffect(java.lang.String p0) { return null; }
    public static boolean isEffectSupported(java.lang.String p0) { return false; }
    private static java.lang.Class getEffectClassByName(java.lang.String p0) { return null; }
    private android.media.effect.Effect instantiateEffect(java.lang.Class p0, java.lang.String p1) { return null; }
}
