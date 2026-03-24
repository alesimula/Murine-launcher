package android.media;

class WebVttParser {
    WebVttParser(android.media.WebVttCueListener p0) {}
    public static float parseFloatPercentage(java.lang.String p0) throws java.lang.NumberFormatException { return 0.0f; }
    public static int parseIntPercentage(java.lang.String p0) throws java.lang.NumberFormatException { return 0; }
    public static long parseTimestampMs(java.lang.String p0) throws java.lang.NumberFormatException { return 0L; }
    public static java.lang.String timeToString(long p0) { return null; }
    public void parse(java.lang.String p0) {}
    public void eos() {}
    public void yieldCue() {}

    static interface Phase {
        public void parse(java.lang.String p0);
    }
}
