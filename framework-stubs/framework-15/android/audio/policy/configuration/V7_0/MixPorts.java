package android.audio.policy.configuration.V7_0;

public class MixPorts {
    public MixPorts() {}
    @android.annotation.Nullable
    public java.util.List<android.audio.policy.configuration.V7_0.MixPorts.MixPort> getMixPort() { return null; }
    @android.annotation.NonNull
    static android.audio.policy.configuration.V7_0.MixPorts read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }

    public static class MixPort {
        public MixPort() {}
        @android.annotation.Nullable
        public java.util.List<android.audio.policy.configuration.V7_0.Profile> getProfile() { return null; }
        @android.annotation.Nullable
        public android.audio.policy.configuration.V7_0.Gains getGains() { return null; }
        boolean hasGains() { return false; }
        public void setGains(android.audio.policy.configuration.V7_0.Gains p0) {}
        @android.annotation.Nullable
        public java.lang.String getName() { return null; }
        boolean hasName() { return false; }
        public void setName(java.lang.String p0) {}
        @android.annotation.Nullable
        public android.audio.policy.configuration.V7_0.Role getRole() { return null; }
        boolean hasRole() { return false; }
        public void setRole(android.audio.policy.configuration.V7_0.Role p0) {}
        @android.annotation.Nullable
        public java.util.List<android.audio.policy.configuration.V7_0.AudioInOutFlag> getFlags() { return null; }
        boolean hasFlags() { return false; }
        public void setFlags(java.util.List<android.audio.policy.configuration.V7_0.AudioInOutFlag> p0) {}
        @android.annotation.Nullable
        public long getMaxOpenCount() { return 0L; }
        boolean hasMaxOpenCount() { return false; }
        public void setMaxOpenCount(long p0) {}
        @android.annotation.Nullable
        public long getMaxActiveCount() { return 0L; }
        boolean hasMaxActiveCount() { return false; }
        public void setMaxActiveCount(long p0) {}
        @android.annotation.Nullable
        public java.util.List<android.audio.policy.configuration.V7_0.AudioUsage> getPreferredUsage() { return null; }
        boolean hasPreferredUsage() { return false; }
        public void setPreferredUsage(java.util.List<android.audio.policy.configuration.V7_0.AudioUsage> p0) {}
        @android.annotation.NonNull
        static android.audio.policy.configuration.V7_0.MixPorts.MixPort read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    }
}
