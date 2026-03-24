package android.hardware.vibrator;

public interface IVibrator extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "ea8742d6993e1a82917da38b9938e537aa7fcb54";
    public static final java.lang.String DESCRIPTOR = null;
    public static final int CAP_ON_CALLBACK = 1;
    public static final int CAP_PERFORM_CALLBACK = 2;
    public static final int CAP_AMPLITUDE_CONTROL = 4;
    public static final int CAP_EXTERNAL_CONTROL = 8;
    public static final int CAP_EXTERNAL_AMPLITUDE_CONTROL = 16;
    public static final int CAP_COMPOSE_EFFECTS = 32;
    public static final int CAP_ALWAYS_ON_CONTROL = 64;
    public static final int CAP_GET_RESONANT_FREQUENCY = 128;
    public static final int CAP_GET_Q_FACTOR = 256;
    public static final int CAP_FREQUENCY_CONTROL = 512;
    public static final int CAP_COMPOSE_PWLE_EFFECTS = 1024;
    public int getCapabilities() throws android.os.RemoteException;
    public void off() throws android.os.RemoteException;
    public void on(int p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException;
    public int perform(int p0, byte p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException;
    public int[] getSupportedEffects() throws android.os.RemoteException;
    public void setAmplitude(float p0) throws android.os.RemoteException;
    public void setExternalControl(boolean p0) throws android.os.RemoteException;
    public int getCompositionDelayMax() throws android.os.RemoteException;
    public int getCompositionSizeMax() throws android.os.RemoteException;
    public int[] getSupportedPrimitives() throws android.os.RemoteException;
    public int getPrimitiveDuration(int p0) throws android.os.RemoteException;
    public void compose(android.hardware.vibrator.CompositeEffect[] p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException;
    public int[] getSupportedAlwaysOnEffects() throws android.os.RemoteException;
    public void alwaysOnEnable(int p0, int p1, byte p2) throws android.os.RemoteException;
    public void alwaysOnDisable(int p0) throws android.os.RemoteException;
    public float getResonantFrequency() throws android.os.RemoteException;
    public float getQFactor() throws android.os.RemoteException;
    public float getFrequencyResolution() throws android.os.RemoteException;
    public float getFrequencyMinimum() throws android.os.RemoteException;
    public float[] getBandwidthAmplitudeMap() throws android.os.RemoteException;
    public int getPwlePrimitiveDurationMax() throws android.os.RemoteException;
    public int getPwleCompositionSizeMax() throws android.os.RemoteException;
    public int[] getSupportedBraking() throws android.os.RemoteException;
    public void composePwle(android.hardware.vibrator.PrimitivePwle[] p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.vibrator.IVibrator {
        public Default() {}
        public int getCapabilities() throws android.os.RemoteException { return 0; }
        public void off() throws android.os.RemoteException {}
        public void on(int p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException {}
        public int perform(int p0, byte p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException { return 0; }
        public int[] getSupportedEffects() throws android.os.RemoteException { return null; }
        public void setAmplitude(float p0) throws android.os.RemoteException {}
        public void setExternalControl(boolean p0) throws android.os.RemoteException {}
        public int getCompositionDelayMax() throws android.os.RemoteException { return 0; }
        public int getCompositionSizeMax() throws android.os.RemoteException { return 0; }
        public int[] getSupportedPrimitives() throws android.os.RemoteException { return null; }
        public int getPrimitiveDuration(int p0) throws android.os.RemoteException { return 0; }
        public void compose(android.hardware.vibrator.CompositeEffect[] p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException {}
        public int[] getSupportedAlwaysOnEffects() throws android.os.RemoteException { return null; }
        public void alwaysOnEnable(int p0, int p1, byte p2) throws android.os.RemoteException {}
        public void alwaysOnDisable(int p0) throws android.os.RemoteException {}
        public float getResonantFrequency() throws android.os.RemoteException { return 0.0f; }
        public float getQFactor() throws android.os.RemoteException { return 0.0f; }
        public float getFrequencyResolution() throws android.os.RemoteException { return 0.0f; }
        public float getFrequencyMinimum() throws android.os.RemoteException { return 0.0f; }
        public float[] getBandwidthAmplitudeMap() throws android.os.RemoteException { return null; }
        public int getPwlePrimitiveDurationMax() throws android.os.RemoteException { return 0; }
        public int getPwleCompositionSizeMax() throws android.os.RemoteException { return 0; }
        public int[] getSupportedBraking() throws android.os.RemoteException { return null; }
        public void composePwle(android.hardware.vibrator.PrimitivePwle[] p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.vibrator.IVibrator {
        static final int TRANSACTION_getCapabilities = 1;
        static final int TRANSACTION_off = 2;
        static final int TRANSACTION_on = 3;
        static final int TRANSACTION_perform = 4;
        static final int TRANSACTION_getSupportedEffects = 5;
        static final int TRANSACTION_setAmplitude = 6;
        static final int TRANSACTION_setExternalControl = 7;
        static final int TRANSACTION_getCompositionDelayMax = 8;
        static final int TRANSACTION_getCompositionSizeMax = 9;
        static final int TRANSACTION_getSupportedPrimitives = 10;
        static final int TRANSACTION_getPrimitiveDuration = 11;
        static final int TRANSACTION_compose = 12;
        static final int TRANSACTION_getSupportedAlwaysOnEffects = 13;
        static final int TRANSACTION_alwaysOnEnable = 14;
        static final int TRANSACTION_alwaysOnDisable = 15;
        static final int TRANSACTION_getResonantFrequency = 16;
        static final int TRANSACTION_getQFactor = 17;
        static final int TRANSACTION_getFrequencyResolution = 18;
        static final int TRANSACTION_getFrequencyMinimum = 19;
        static final int TRANSACTION_getBandwidthAmplitudeMap = 20;
        static final int TRANSACTION_getPwlePrimitiveDurationMax = 21;
        static final int TRANSACTION_getPwleCompositionSizeMax = 22;
        static final int TRANSACTION_getSupportedBraking = 23;
        static final int TRANSACTION_composePwle = 24;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.vibrator.IVibrator asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.vibrator.IVibrator p0) { return false; }
        public static android.hardware.vibrator.IVibrator getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.vibrator.IVibrator {
            private android.os.IBinder mRemote;
            private int mCachedVersion;
            private java.lang.String mCachedHash;
            public static android.hardware.vibrator.IVibrator sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getCapabilities() throws android.os.RemoteException { return 0; }
            public void off() throws android.os.RemoteException {}
            public void on(int p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException {}
            public int perform(int p0, byte p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException { return 0; }
            public int[] getSupportedEffects() throws android.os.RemoteException { return null; }
            public void setAmplitude(float p0) throws android.os.RemoteException {}
            public void setExternalControl(boolean p0) throws android.os.RemoteException {}
            public int getCompositionDelayMax() throws android.os.RemoteException { return 0; }
            public int getCompositionSizeMax() throws android.os.RemoteException { return 0; }
            public int[] getSupportedPrimitives() throws android.os.RemoteException { return null; }
            public int getPrimitiveDuration(int p0) throws android.os.RemoteException { return 0; }
            public void compose(android.hardware.vibrator.CompositeEffect[] p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException {}
            public int[] getSupportedAlwaysOnEffects() throws android.os.RemoteException { return null; }
            public void alwaysOnEnable(int p0, int p1, byte p2) throws android.os.RemoteException {}
            public void alwaysOnDisable(int p0) throws android.os.RemoteException {}
            public float getResonantFrequency() throws android.os.RemoteException { return 0.0f; }
            public float getQFactor() throws android.os.RemoteException { return 0.0f; }
            public float getFrequencyResolution() throws android.os.RemoteException { return 0.0f; }
            public float getFrequencyMinimum() throws android.os.RemoteException { return 0.0f; }
            public float[] getBandwidthAmplitudeMap() throws android.os.RemoteException { return null; }
            public int getPwlePrimitiveDurationMax() throws android.os.RemoteException { return 0; }
            public int getPwleCompositionSizeMax() throws android.os.RemoteException { return 0; }
            public int[] getSupportedBraking() throws android.os.RemoteException { return null; }
            public void composePwle(android.hardware.vibrator.PrimitivePwle[] p0, android.hardware.vibrator.IVibratorCallback p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}
