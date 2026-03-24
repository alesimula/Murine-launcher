package android.telephony.ims;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class SipDelegateImsConfiguration implements android.os.Parcelable {
    public static final java.lang.String IPTYPE_IPV4 = "IPV4";
    public static final java.lang.String IPTYPE_IPV6 = "IPV6";
    public static final java.lang.String SIP_TRANSPORT_UDP = "UDP";
    public static final java.lang.String SIP_TRANSPORT_TCP = "TCP";
    public static final java.lang.String KEY_SIP_CONFIG_IS_COMPACT_FORM_ENABLED_BOOL = "sip_config_is_compact_form_enabled_bool";
    public static final java.lang.String KEY_SIP_CONFIG_IS_KEEPALIVE_ENABLED_BOOL = "sip_config_is_keepalive_enabled_bool";
    public static final java.lang.String KEY_SIP_CONFIG_MAX_PAYLOAD_SIZE_ON_UDP_INT = "sip_config_udp_max_payload_size_int";
    public static final java.lang.String KEY_SIP_CONFIG_TRANSPORT_TYPE_STRING = "sip_config_protocol_type_string";
    public static final java.lang.String KEY_SIP_CONFIG_UE_PUBLIC_USER_ID_STRING = "sip_config_ue_public_user_id_string";
    public static final java.lang.String KEY_SIP_CONFIG_UE_PRIVATE_USER_ID_STRING = "sip_config_ue_private_user_id_string";
    public static final java.lang.String KEY_SIP_CONFIG_HOME_DOMAIN_STRING = "sip_config_home_domain_string";
    public static final java.lang.String KEY_SIP_CONFIG_IMEI_STRING = "sip_config_imei_string";
    public static final java.lang.String KEY_SIP_CONFIG_IPTYPE_STRING = "sip_config_iptype_string";
    public static final java.lang.String KEY_SIP_CONFIG_UE_DEFAULT_IPADDRESS_STRING = "sip_config_ue_default_ipaddress_string";
    public static final java.lang.String KEY_SIP_CONFIG_UE_DEFAULT_PORT_INT = "sip_config_ue_default_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_SERVER_DEFAULT_IPADDRESS_STRING = "sip_config_server_default_ipaddress_string";
    public static final java.lang.String KEY_SIP_CONFIG_SERVER_DEFAULT_PORT_INT = "sip_config_server_default_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_IS_NAT_ENABLED_BOOL = "sip_config_is_nat_enabled_bool";
    public static final java.lang.String KEY_SIP_CONFIG_UE_PUBLIC_IPADDRESS_WITH_NAT_STRING = "sip_config_ue_public_ipaddress_with_nat_string";
    public static final java.lang.String KEY_SIP_CONFIG_UE_PUBLIC_PORT_WITH_NAT_INT = "sip_config_ue_public_port_with_nat_int";
    public static final java.lang.String KEY_SIP_CONFIG_IS_GRUU_ENABLED_BOOL = "sip_config_is_gruu_enabled_bool";
    public static final java.lang.String KEY_SIP_CONFIG_UE_PUBLIC_GRUU_STRING = "sip_config_ue_public_gruu_string";
    public static final java.lang.String KEY_SIP_CONFIG_IS_IPSEC_ENABLED_BOOL = "sip_config_is_ipsec_enabled_bool";
    public static final java.lang.String KEY_SIP_CONFIG_UE_IPSEC_CLIENT_PORT_INT = "sip_config_ue_ipsec_client_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_UE_IPSEC_SERVER_PORT_INT = "sip_config_ue_ipsec_server_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_UE_IPSEC_OLD_CLIENT_PORT_INT = "sip_config_ue_ipsec_old_client_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_SERVER_IPSEC_CLIENT_PORT_INT = "sip_config_server_ipsec_client_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_SERVER_IPSEC_SERVER_PORT_INT = "sip_config_server_ipsec_server_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_SERVER_IPSEC_OLD_CLIENT_PORT_INT = "sip_config_server_ipsec_old_client_port_int";
    public static final java.lang.String KEY_SIP_CONFIG_AUTHENTICATION_HEADER_STRING = "sip_config_auhentication_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_AUTHENTICATION_NONCE_STRING = "sip_config_authentication_nonce_string";
    public static final java.lang.String KEY_SIP_CONFIG_SERVICE_ROUTE_HEADER_STRING = "sip_config_service_route_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_SECURITY_VERIFY_HEADER_STRING = "sip_config_security_verify_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_PATH_HEADER_STRING = "sip_config_path_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_USER_AGENT_HEADER_STRING = "sip_config_sip_user_agent_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_URI_USER_PART_STRING = "sip_config_uri_user_part_string";
    public static final java.lang.String KEY_SIP_CONFIG_P_ACCESS_NETWORK_INFO_HEADER_STRING = "sip_config_p_access_network_info_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_P_LAST_ACCESS_NETWORK_INFO_HEADER_STRING = "sip_config_p_last_access_network_info_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_CELLULAR_NETWORK_INFO_HEADER_STRING = "sip_config_cellular_network_info_header_string";
    public static final java.lang.String KEY_SIP_CONFIG_P_ASSOCIATED_URI_HEADER_STRING = "sip_config_p_associated_uri_header_string";
    public static final android.os.Parcelable.Creator<android.telephony.ims.SipDelegateImsConfiguration> CREATOR = null;
    public boolean containsKey(java.lang.String p0) { return false; }
    public java.lang.String getString(java.lang.String p0) { return null; }
    public int getInt(java.lang.String p0, int p1) { return 0; }
    public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
    public android.os.PersistableBundle copyBundle() { return null; }
    public long getVersion() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.telephony.ims.SipDelegateConfiguration toNewConfig() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BooleanConfigKey {
    }

    public static final class Builder {
        public Builder(int p0) {}
        public Builder(android.telephony.ims.SipDelegateImsConfiguration p0) {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.telephony.ims.SipDelegateImsConfiguration.Builder addString(java.lang.String p0, java.lang.String p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.telephony.ims.SipDelegateImsConfiguration.Builder addInt(java.lang.String p0, int p1) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.telephony.ims.SipDelegateImsConfiguration.Builder addBoolean(java.lang.String p0, boolean p1) { return null; }
        public android.telephony.ims.SipDelegateImsConfiguration build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntConfigKey {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringConfigKey {
    }
}
