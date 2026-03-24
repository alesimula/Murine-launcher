package android.net.wifi.hotspot2.omadm;

public final class PpsMoParser {
    private static final java.lang.String TAG = "PpsMoParser";
    private static final java.lang.String TAG_MANAGEMENT_TREE = "MgmtTree";
    private static final java.lang.String TAG_VER_DTD = "VerDTD";
    private static final java.lang.String TAG_NODE = "Node";
    private static final java.lang.String TAG_NODE_NAME = "NodeName";
    private static final java.lang.String TAG_RT_PROPERTIES = "RTProperties";
    private static final java.lang.String TAG_TYPE = "Type";
    private static final java.lang.String TAG_DDF_NAME = "DDFName";
    private static final java.lang.String TAG_VALUE = "Value";
    private static final java.lang.String NODE_PER_PROVIDER_SUBSCRIPTION = "PerProviderSubscription";
    private static final java.lang.String NODE_UPDATE_IDENTIFIER = "UpdateIdentifier";
    private static final java.lang.String NODE_AAA_SERVER_TRUST_ROOT = "AAAServerTrustRoot";
    private static final java.lang.String NODE_SUBSCRIPTION_UPDATE = "SubscriptionUpdate";
    private static final java.lang.String NODE_SUBSCRIPTION_PARAMETER = "SubscriptionParameters";
    private static final java.lang.String NODE_TYPE_OF_SUBSCRIPTION = "TypeOfSubscription";
    private static final java.lang.String NODE_USAGE_LIMITS = "UsageLimits";
    private static final java.lang.String NODE_DATA_LIMIT = "DataLimit";
    private static final java.lang.String NODE_START_DATE = "StartDate";
    private static final java.lang.String NODE_TIME_LIMIT = "TimeLimit";
    private static final java.lang.String NODE_USAGE_TIME_PERIOD = "UsageTimePeriod";
    private static final java.lang.String NODE_CREDENTIAL_PRIORITY = "CredentialPriority";
    private static final java.lang.String NODE_EXTENSION = "Extension";
    private static final java.lang.String NODE_HOMESP = "HomeSP";
    private static final java.lang.String NODE_FQDN = "FQDN";
    private static final java.lang.String NODE_FRIENDLY_NAME = "FriendlyName";
    private static final java.lang.String NODE_ROAMING_CONSORTIUM_OI = "RoamingConsortiumOI";
    private static final java.lang.String NODE_NETWORK_ID = "NetworkID";
    private static final java.lang.String NODE_SSID = "SSID";
    private static final java.lang.String NODE_HESSID = "HESSID";
    private static final java.lang.String NODE_ICON_URL = "IconURL";
    private static final java.lang.String NODE_HOME_OI_LIST = "HomeOIList";
    private static final java.lang.String NODE_HOME_OI = "HomeOI";
    private static final java.lang.String NODE_HOME_OI_REQUIRED = "HomeOIRequired";
    private static final java.lang.String NODE_OTHER_HOME_PARTNERS = "OtherHomePartners";
    private static final java.lang.String NODE_CREDENTIAL = "Credential";
    private static final java.lang.String NODE_CREATION_DATE = "CreationDate";
    private static final java.lang.String NODE_EXPIRATION_DATE = "ExpirationDate";
    private static final java.lang.String NODE_USERNAME_PASSWORD = "UsernamePassword";
    private static final java.lang.String NODE_USERNAME = "Username";
    private static final java.lang.String NODE_PASSWORD = "Password";
    private static final java.lang.String NODE_MACHINE_MANAGED = "MachineManaged";
    private static final java.lang.String NODE_SOFT_TOKEN_APP = "SoftTokenApp";
    private static final java.lang.String NODE_ABLE_TO_SHARE = "AbleToShare";
    private static final java.lang.String NODE_EAP_METHOD = "EAPMethod";
    private static final java.lang.String NODE_EAP_TYPE = "EAPType";
    private static final java.lang.String NODE_VENDOR_ID = "VendorId";
    private static final java.lang.String NODE_VENDOR_TYPE = "VendorType";
    private static final java.lang.String NODE_INNER_EAP_TYPE = "InnerEAPType";
    private static final java.lang.String NODE_INNER_VENDOR_ID = "InnerVendorID";
    private static final java.lang.String NODE_INNER_VENDOR_TYPE = "InnerVendorType";
    private static final java.lang.String NODE_INNER_METHOD = "InnerMethod";
    private static final java.lang.String NODE_DIGITAL_CERTIFICATE = "DigitalCertificate";
    private static final java.lang.String NODE_CERTIFICATE_TYPE = "CertificateType";
    private static final java.lang.String NODE_CERT_SHA256_FINGERPRINT = "CertSHA256Fingerprint";
    private static final java.lang.String NODE_REALM = "Realm";
    private static final java.lang.String NODE_SIM = "SIM";
    private static final java.lang.String NODE_SIM_IMSI = "IMSI";
    private static final java.lang.String NODE_CHECK_AAA_SERVER_CERT_STATUS = "CheckAAAServerCertStatus";
    private static final java.lang.String NODE_POLICY = "Policy";
    private static final java.lang.String NODE_PREFERRED_ROAMING_PARTNER_LIST = "PreferredRoamingPartnerList";
    private static final java.lang.String NODE_FQDN_MATCH = "FQDN_Match";
    private static final java.lang.String NODE_PRIORITY = "Priority";
    private static final java.lang.String NODE_COUNTRY = "Country";
    private static final java.lang.String NODE_MIN_BACKHAUL_THRESHOLD = "MinBackhaulThreshold";
    private static final java.lang.String NODE_NETWORK_TYPE = "NetworkType";
    private static final java.lang.String NODE_DOWNLINK_BANDWIDTH = "DLBandwidth";
    private static final java.lang.String NODE_UPLINK_BANDWIDTH = "ULBandwidth";
    private static final java.lang.String NODE_POLICY_UPDATE = "PolicyUpdate";
    private static final java.lang.String NODE_UPDATE_INTERVAL = "UpdateInterval";
    private static final java.lang.String NODE_UPDATE_METHOD = "UpdateMethod";
    private static final java.lang.String NODE_RESTRICTION = "Restriction";
    private static final java.lang.String NODE_URI = "URI";
    private static final java.lang.String NODE_TRUST_ROOT = "TrustRoot";
    private static final java.lang.String NODE_CERT_URL = "CertURL";
    private static final java.lang.String NODE_SP_EXCLUSION_LIST = "SPExclusionList";
    private static final java.lang.String NODE_REQUIRED_PROTO_PORT_TUPLE = "RequiredProtoPortTuple";
    private static final java.lang.String NODE_IP_PROTOCOL = "IPProtocol";
    private static final java.lang.String NODE_PORT_NUMBER = "PortNumber";
    private static final java.lang.String NODE_MAXIMUM_BSS_LOAD_VALUE = "MaximumBSSLoadValue";
    private static final java.lang.String NODE_OTHER = "Other";
    private static final java.lang.String PPS_MO_URN = "urn:wfa:mo:hotspot2dot0-perprovidersubscription:1.0";
    public PpsMoParser() {}
    public static android.net.wifi.hotspot2.PasspointConfiguration parseMoText(java.lang.String p0) { return null; }
    private static android.net.wifi.hotspot2.PasspointConfiguration parsePpsNode(android.net.wifi.hotspot2.omadm.XMLNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.lang.String parseUrn(android.net.wifi.hotspot2.omadm.XMLNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode buildPpsNode(android.net.wifi.hotspot2.omadm.XMLNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.lang.String getPpsNodeValue(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.PasspointConfiguration parsePpsInstance(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.pps.HomeSp parseHomeSP(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static long[] parseRoamingConsortiumOI(java.lang.String p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.util.Map<java.lang.String, java.lang.Long> parseNetworkIds(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.util.Pair<java.lang.String, java.lang.Long> parseNetworkIdInstance(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.util.Pair<java.util.List<java.lang.Long>, java.util.List<java.lang.Long>> parseHomeOIList(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.util.Pair<java.lang.Long, java.lang.Boolean> parseHomeOIInstance(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.lang.String[] parseOtherHomePartners(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.lang.String parseOtherHomePartnerInstance(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.pps.Credential parseCredential(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.pps.Credential.UserCredential parseUserCredential(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static void parseEAPMethod(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0, android.net.wifi.hotspot2.pps.Credential.UserCredential p1) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException {}
    private static android.net.wifi.hotspot2.pps.Credential.CertificateCredential parseCertificateCredential(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.pps.Credential.SimCredential parseSimCredential(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.pps.Policy parsePolicy(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.util.List<android.net.wifi.hotspot2.pps.Policy.RoamingPartner> parsePreferredRoamingPartnerList(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.net.wifi.hotspot2.pps.Policy.RoamingPartner parsePreferredRoamingPartner(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static void parseMinBackhaulThreshold(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0, android.net.wifi.hotspot2.pps.Policy p1) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException {}
    private static void parseMinBackhaulThresholdInstance(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0, android.net.wifi.hotspot2.pps.Policy p1) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException {}
    private static android.net.wifi.hotspot2.pps.UpdateParameter parseUpdateParameter(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.util.Pair<java.lang.String, java.lang.String> parseUpdateUserCredential(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.util.Pair<java.lang.String, byte[]> parseTrustRoot(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.lang.String[] parseSpExclusionList(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.lang.String parseSpExclusionInstance(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.util.Map<java.lang.Integer, java.lang.String> parseRequiredProtoPortTuple(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static android.util.Pair<java.lang.Integer, java.lang.String> parseProtoPortTuple(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static java.util.Map<java.lang.String, byte[]> parseAAAServerTrustRootList(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static void parseSubscriptionParameter(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0, android.net.wifi.hotspot2.PasspointConfiguration p1) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException {}
    private static void parseUsageLimits(android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode p0, android.net.wifi.hotspot2.PasspointConfiguration p1) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException {}
    private static byte[] parseHexString(java.lang.String p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return null; }
    private static long parseDate(java.lang.String p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return 0L; }
    private static int parseInteger(java.lang.String p0) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return 0; }
    private static long parseLong(java.lang.String p0, int p1) throws android.net.wifi.hotspot2.omadm.PpsMoParser.ParsingException { return 0L; }
    private static long[] convertFromLongList(java.util.List<java.lang.Long> p0) { return null; }

    private static class ParsingException extends java.lang.Exception {
        public ParsingException(java.lang.String p0) { super(); }
    }

    private static abstract class PPSNode {
        private final java.lang.String mName = null;
        public PPSNode(java.lang.String p0) {}
        public java.lang.String getName() { return null; }
        public abstract java.util.List<android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode> getChildren();
        public abstract java.lang.String getValue();
        public abstract boolean isLeaf();
    }

    private static class LeafNode extends android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode {
        private final java.lang.String mValue = null;
        public LeafNode(java.lang.String p0, java.lang.String p1) { super(null); }
        public java.lang.String getValue() { return null; }
        public java.util.List<android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode> getChildren() { return null; }
        public boolean isLeaf() { return false; }
    }

    private static class InternalNode extends android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode {
        private final java.util.List<android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode> mChildren = null;
        public InternalNode(java.lang.String p0, java.util.List<android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode> p1) { super(null); }
        public java.lang.String getValue() { return null; }
        public java.util.List<android.net.wifi.hotspot2.omadm.PpsMoParser.PPSNode> getChildren() { return null; }
        public boolean isLeaf() { return false; }
    }
}
