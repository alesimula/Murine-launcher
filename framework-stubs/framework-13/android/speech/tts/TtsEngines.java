package android.speech.tts;

public class TtsEngines {
    public TtsEngines(android.content.Context p0) {}
    public java.lang.String getDefaultEngine() { return null; }
    public java.lang.String getHighestRankedEngineName() { return null; }
    public android.speech.tts.TextToSpeech.EngineInfo getEngineInfo(java.lang.String p0) { return null; }
    public java.util.List<android.speech.tts.TextToSpeech.EngineInfo> getEngines() { return null; }
    public boolean isEngineInstalled(java.lang.String p0) { return false; }
    public android.content.Intent getSettingsIntent(java.lang.String p0) { return null; }
    public java.util.Locale getLocalePrefForEngine(java.lang.String p0) { return null; }
    public java.util.Locale getLocalePrefForEngine(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean isLocaleSetToDefaultForEngine(java.lang.String p0) { return false; }
    public java.util.Locale parseLocaleString(java.lang.String p0) { return null; }
    public static java.util.Locale normalizeTTSLocale(java.util.Locale p0) { return null; }
    public static java.lang.String[] toOldLocaleStringFormat(java.util.Locale p0) { return null; }
    public synchronized void updateLocalePrefForEngine(java.lang.String p0, java.util.Locale p1) {}

    private static abstract class EngineInfoComparator implements java.util.Comparator<android.speech.tts.TextToSpeech.EngineInfo> {
        static android.speech.tts.TtsEngines.EngineInfoComparator INSTANCE;
        public int compare(android.speech.tts.TextToSpeech.EngineInfo p0, android.speech.tts.TextToSpeech.EngineInfo p1) { return 0; }
    }
}
