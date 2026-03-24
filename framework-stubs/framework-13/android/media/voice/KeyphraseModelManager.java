package android.media.voice;

@android.annotation.SystemApi
public final class KeyphraseModelManager {
    public KeyphraseModelManager(com.android.internal.app.IVoiceInteractionManagerService p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_VOICE_KEYPHRASES")
    public android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel getKeyphraseSoundModel(int p0, java.util.Locale p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_VOICE_KEYPHRASES")
    public void updateKeyphraseSoundModel(android.hardware.soundtrigger.SoundTrigger.KeyphraseSoundModel p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_VOICE_KEYPHRASES")
    public void deleteKeyphraseSoundModel(int p0, java.util.Locale p1) {}
}
