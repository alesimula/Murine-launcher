package android.audio.policy.configuration.V7_0;

public class Routes {
    private java.util.List<android.audio.policy.configuration.V7_0.Routes.Route> route;
    public Routes() {}
    public java.util.List<android.audio.policy.configuration.V7_0.Routes.Route> getRoute() { return null; }
    static android.audio.policy.configuration.V7_0.Routes read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }

    public static class Route {
        private android.audio.policy.configuration.V7_0.MixType type;
        private java.lang.String sink;
        private java.lang.String sources;
        public Route() {}
        public android.audio.policy.configuration.V7_0.MixType getType() { return null; }
        boolean hasType() { return false; }
        public void setType(android.audio.policy.configuration.V7_0.MixType p0) {}
        public java.lang.String getSink() { return null; }
        boolean hasSink() { return false; }
        public void setSink(java.lang.String p0) {}
        public java.lang.String getSources() { return null; }
        boolean hasSources() { return false; }
        public void setSources(java.lang.String p0) {}
        static android.audio.policy.configuration.V7_0.Routes.Route read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, javax.xml.datatype.DatatypeConfigurationException { return null; }
    }
}
