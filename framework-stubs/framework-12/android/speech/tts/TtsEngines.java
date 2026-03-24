package android.speech.tts;

public class TtsEngines {
    private static final java.lang.String TAG = "TtsEngines";
    private static final boolean DBG = false;
    private static final java.lang.String LOCALE_DELIMITER_OLD = "-";
    private static final java.lang.String LOCALE_DELIMITER_NEW = "_";
    private final android.content.Context mContext = null;
    private static final java.util.Map<java.lang.String, java.lang.String> sNormalizeLanguage = null;
    private static final java.util.Map<java.lang.String, java.lang.String> sNormalizeCountry = null;
    private static final java.lang.String XML_TAG_NAME = "tts-engine";
    public TtsEngines(android.content.Context p0) {}
    public java.lang.String getDefaultEngine() { return null; }
    public java.lang.String getHighestRankedEngineName() { return null; }
    public android.speech.tts.TextToSpeech.EngineInfo getEngineInfo(java.lang.String p0) { return null; }
    public java.util.List<android.speech.tts.TextToSpeech.EngineInfo> getEngines() { return null; }
    private boolean isSystemEngine(android.content.pm.ServiceInfo p0) { return false; }
    public boolean isEngineInstalled(java.lang.String p0) { return false; }
    public android.content.Intent getSettingsIntent(java.lang.String p0) { return null; }
    private java.lang.String settingsActivityFromServiceInfo(android.content.pm.ServiceInfo p0, android.content.pm.PackageManager p1) { return null; }
    private android.speech.tts.TextToSpeech.EngineInfo getEngineInfo(android.content.pm.ResolveInfo p0, android.content.pm.PackageManager p1) { return null; }
    public java.util.Locale getLocalePrefForEngine(java.lang.String p0) { return null; }
    public java.util.Locale getLocalePrefForEngine(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean isLocaleSetToDefaultForEngine(java.lang.String p0) { return false; }
    public java.util.Locale parseLocaleString(java.lang.String p0) { return null; }
    public static java.util.Locale normalizeTTSLocale(java.util.Locale p0) { return null; }
    public static java.lang.String[] toOldLocaleStringFormat(java.util.Locale p0) { return null; }
    private static java.lang.String parseEnginePrefFromList(java.lang.String p0, java.lang.String p1) { return null; }
    public synchronized void updateLocalePrefForEngine(java.lang.String p0, java.util.Locale p1) {}
    private java.lang.String updateValueInCommaSeparatedList(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }

    private static class EngineInfoComparator implements java.util.Comparator<android.speech.tts.TextToSpeech.EngineInfo> {
        static android.speech.tts.TtsEngines.EngineInfoComparator INSTANCE;
        private EngineInfoComparator() {}
        public int compare(android.speech.tts.TextToSpeech.EngineInfo p0, android.speech.tts.TextToSpeech.EngineInfo p1) { return 0; }
    }
}
