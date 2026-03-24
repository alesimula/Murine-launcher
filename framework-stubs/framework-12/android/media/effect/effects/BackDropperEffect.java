package android.media.effect.effects;

public class BackDropperEffect extends android.media.effect.FilterGraphEffect {
    private static final java.lang.String mGraphDefinition = "@import android.filterpacks.base;\n@import android.filterpacks.videoproc;\n@import android.filterpacks.videosrc;\n\n@filter GLTextureSource foreground {\n  texId = 0;\n  width = 0;\n  height = 0;\n  repeatFrame = true;\n}\n\n@filter MediaSource background {\n  sourceUrl = \"no_file_specified\";\n  waitForNewFrame = false;\n  sourceIsUrl = true;\n}\n\n@filter BackDropperFilter replacer {\n  autowbToggle = 1;\n}\n\n@filter GLTextureTarget output {\n  texId = 0;\n}\n\n@connect foreground[frame]  => replacer[video];\n@connect background[video]  => replacer[background];\n@connect replacer[video]    => output[frame];\n";
    private android.media.effect.EffectUpdateListener mEffectListener;
    private android.filterpacks.videoproc.BackDropperFilter.LearningDoneListener mLearningListener;
    public BackDropperEffect(android.media.effect.EffectContext p0, java.lang.String p1) { super(null, null, null, null, null, null); }
    public void setParameter(java.lang.String p0, java.lang.Object p1) {}
    public void setUpdateListener(android.media.effect.EffectUpdateListener p0) {}
}
