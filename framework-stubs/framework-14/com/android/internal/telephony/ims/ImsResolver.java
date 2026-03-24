package com.android.internal.telephony.ims;

public class ImsResolver implements com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks {
    public static final java.lang.String METADATA_EMERGENCY_MMTEL_FEATURE = "android.telephony.ims.EMERGENCY_MMTEL_FEATURE";
    public static final java.lang.String METADATA_MMTEL_FEATURE = "android.telephony.ims.MMTEL_FEATURE";
    public static final java.lang.String METADATA_RCS_FEATURE = "android.telephony.ims.RCS_FEATURE";
    public static void make(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3, com.android.ims.ImsFeatureBinderRepository p4) {}
    public static com.android.internal.telephony.ims.ImsResolver getInstance() { return null; }
    public ImsResolver(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3, com.android.ims.ImsFeatureBinderRepository p4, android.os.Looper p5) {}
    public void setTelephonyManagerProxy(com.android.internal.telephony.ims.ImsResolver.TelephonyManagerProxy p0) {}
    public void setSubscriptionManagerProxy(com.android.internal.telephony.ims.ImsResolver.SubscriptionManagerProxy p0) {}
    public void setImsServiceControllerFactory(com.android.internal.telephony.ims.ImsResolver.ImsServiceControllerFactory p0) {}
    public android.os.Handler getHandler() { return null; }
    public void setImsDynamicQueryManagerFactory(com.android.internal.telephony.ims.ImsResolver.ImsDynamicQueryManagerFactory p0) {}
    public void initialize() {}
    public void destroy() {}
    public void enableIms(int p0) {}
    public void disableIms(int p0) {}
    public void resetIms(int p0) {}
    public android.telephony.ims.aidl.IImsRegistration getImsRegistration(int p0, int p1) { return null; }
    public android.telephony.ims.aidl.IImsConfig getImsConfig(int p0, int p1) { return null; }
    public void listenForFeature(int p0, int p1, com.android.ims.internal.IImsServiceFeatureCallback p2) {}
    public void unregisterImsFeatureCallback(com.android.ims.internal.IImsServiceFeatureCallback p0) {}
    public boolean clearCarrierImsServiceConfiguration(int p0) { return false; }
    public boolean overrideImsServiceConfiguration(int p0, boolean p1, java.util.Map<java.lang.Integer, java.lang.String> p2) { return false; }
    public java.lang.String getImsServiceConfiguration(int p0, boolean p1, int p2) { return null; }
    public boolean isImsServiceConfiguredForFeature(int p0, int p1) { return false; }
    public java.lang.String getConfiguredImsServicePackageName(int p0, int p1) { return null; }
    public void imsServiceFeatureCreated(int p0, int p1, com.android.internal.telephony.ims.ImsServiceController p2) {}
    public void imsServiceFeatureRemoved(int p0, int p1, com.android.internal.telephony.ims.ImsServiceController p2) {}
    public void imsServiceFeaturesChanged(android.telephony.ims.stub.ImsFeatureConfiguration p0, com.android.internal.telephony.ims.ImsServiceController p1) {}
    public void imsServiceBindPermanentError(android.content.ComponentName p0) {}
    public com.android.internal.telephony.ims.ImsResolver.ImsServiceInfo getImsServiceInfoFromCache(java.lang.String p0) { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static interface ImsDynamicQueryManagerFactory {
        public com.android.internal.telephony.ims.ImsServiceFeatureQueryManager create(android.content.Context p0, com.android.internal.telephony.ims.ImsServiceFeatureQueryManager.Listener p1);
    }

    public static interface ImsServiceControllerFactory {
        public java.lang.String getServiceInterface();
        public com.android.internal.telephony.ims.ImsServiceController create(android.content.Context p0, android.content.ComponentName p1, com.android.internal.telephony.ims.ImsServiceController.ImsServiceControllerCallbacks p2, com.android.ims.ImsFeatureBinderRepository p3);
    }

    public static class ImsServiceInfo {
        public android.content.ComponentName name;
        public boolean featureFromMetadata;
        public com.android.internal.telephony.ims.ImsResolver.ImsServiceControllerFactory controllerFactory;
        public ImsServiceInfo() {}
        void addFeatureForAllSlots(int p0, int p1) {}
        void replaceFeatures(java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> p0) {}
        public java.util.Set<android.telephony.ims.stub.ImsFeatureConfiguration.FeatureSlotPair> getSupportedFeatures() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class OverrideConfig {
        public final int slotId = 0;
        public final boolean isCarrierService = false;
        public final java.util.Map<java.lang.Integer, java.lang.String> featureTypeToPackageMap = null;
        OverrideConfig(int p0, boolean p1, java.util.Map<java.lang.Integer, java.lang.String> p2) {}
    }

    private class ResolverHandler extends android.os.Handler {
        ResolverHandler(com.android.internal.telephony.ims.ImsResolver p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface SubscriptionManagerProxy {
        public int getSubId(int p0);
        public int getSlotIndex(int p0);
    }

    public static interface TelephonyManagerProxy {
        public int getSimState(android.content.Context p0, int p1);
    }
}
