package android.audio.policy.configuration.V7_0;

public class DevicePorts {
    private java.util.List<android.audio.policy.configuration.V7_0.DevicePorts.DevicePort> devicePort;
    public DevicePorts() {}
    public java.util.List<android.audio.policy.configuration.V7_0.DevicePorts.DevicePort> getDevicePort() { return null; }
    static android.audio.policy.configuration.V7_0.DevicePorts read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }

    public static class DevicePort {
        private java.util.List<android.audio.policy.configuration.V7_0.Profile> profile;
        private android.audio.policy.configuration.V7_0.Gains gains;
        private java.lang.String tagName;
        private java.lang.String type;
        private android.audio.policy.configuration.V7_0.Role role;
        private java.lang.String address;
        private java.lang.Boolean _default;
        private java.util.List<java.lang.String> encodedFormats;
        public DevicePort() {}
        public java.util.List<android.audio.policy.configuration.V7_0.Profile> getProfile() { return null; }
        public android.audio.policy.configuration.V7_0.Gains getGains() { return null; }
        boolean hasGains() { return false; }
        public void setGains(android.audio.policy.configuration.V7_0.Gains p0) {}
        public java.lang.String getTagName() { return null; }
        boolean hasTagName() { return false; }
        public void setTagName(java.lang.String p0) {}
        public java.lang.String getType() { return null; }
        boolean hasType() { return false; }
        public void setType(java.lang.String p0) {}
        public android.audio.policy.configuration.V7_0.Role getRole() { return null; }
        boolean hasRole() { return false; }
        public void setRole(android.audio.policy.configuration.V7_0.Role p0) {}
        public java.lang.String getAddress() { return null; }
        boolean hasAddress() { return false; }
        public void setAddress(java.lang.String p0) {}
        public boolean get_default() { return false; }
        boolean has_default() { return false; }
        public void set_default(boolean p0) {}
        public java.util.List<java.lang.String> getEncodedFormats() { return null; }
        boolean hasEncodedFormats() { return false; }
        public void setEncodedFormats(java.util.List<java.lang.String> p0) {}
        static android.audio.policy.configuration.V7_0.DevicePorts.DevicePort read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    }
}
