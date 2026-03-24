package android.content.integrity;

@android.annotation.SystemApi
public class RuleSet {
    private final java.lang.String mVersion = null;
    private final java.util.List<android.content.integrity.Rule> mRules = null;
    private RuleSet(java.lang.String p0, java.util.List<android.content.integrity.Rule> p1) {}
    public java.lang.String getVersion() { return null; }
    public java.util.List<android.content.integrity.Rule> getRules() { return null; }

    public static class Builder {
        private java.lang.String mVersion;
        private java.util.List<android.content.integrity.Rule> mRules;
        public Builder() {}
        public android.content.integrity.RuleSet.Builder setVersion(java.lang.String p0) { return null; }
        public android.content.integrity.RuleSet.Builder addRules(java.util.List<android.content.integrity.Rule> p0) { return null; }
        public android.content.integrity.RuleSet build() { return null; }
    }
}
