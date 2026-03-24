package android.icu.text;

public class DateIntervalInfo implements java.lang.Cloneable, android.icu.util.Freezable<android.icu.text.DateIntervalInfo>, java.io.Serializable {
    public DateIntervalInfo(android.icu.util.ULocale p0) {}
    public DateIntervalInfo(java.util.Locale p0) {}
    public void setIntervalPattern(java.lang.String p0, int p1, java.lang.String p2) {}
    public android.icu.text.DateIntervalInfo.PatternInfo getIntervalPattern(java.lang.String p0, int p1) { return null; }
    public java.lang.String getFallbackIntervalPattern() { return null; }
    public void setFallbackIntervalPattern(java.lang.String p0) {}
    public boolean getDefaultOrder() { return false; }
    public java.lang.Object clone() { return null; }
    public boolean isFrozen() { return false; }
    public android.icu.text.DateIntervalInfo freeze() { return null; }
    public android.icu.text.DateIntervalInfo cloneAsThawed() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class PatternInfo implements java.lang.Cloneable, java.io.Serializable {
        public PatternInfo(java.lang.String p0, java.lang.String p1, boolean p2) {}
        public java.lang.String getFirstPart() { return null; }
        public java.lang.String getSecondPart() { return null; }
        public boolean firstDateInPtnIsLaterDate() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
