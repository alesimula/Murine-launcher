package android.provider;

public class SettingsValidators {
    public static final android.provider.SettingsValidators.Validator BOOLEAN_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator ANY_STRING_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator NON_NEGATIVE_INTEGER_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator ANY_INTEGER_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator URI_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator COMPONENT_NAME_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator NULLABLE_COMPONENT_NAME_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator PACKAGE_NAME_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator LENIENT_IP_ADDRESS_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator LOCALE_VALIDATOR = null;
    public static final android.provider.SettingsValidators.Validator JSON_OBJECT_VALIDATOR = null;
    public SettingsValidators() {}

    public static interface Validator {
        public boolean validate(java.lang.String p0);
    }

    public static final class PackageNameListValidator implements android.provider.SettingsValidators.Validator {
        private final java.lang.String mSeparator = null;
        public PackageNameListValidator(java.lang.String p0) {}
        public boolean validate(java.lang.String p0) { return false; }
    }

    public static final class InclusiveIntegerRangeValidator implements android.provider.SettingsValidators.Validator {
        private final int mMin = 0;
        private final int mMax = 0;
        public InclusiveIntegerRangeValidator(int p0, int p1) {}
        public boolean validate(java.lang.String p0) { return false; }
    }

    public static final class InclusiveFloatRangeValidator implements android.provider.SettingsValidators.Validator {
        private final float mMin = 0.0f;
        private final float mMax = 0.0f;
        public InclusiveFloatRangeValidator(float p0, float p1) {}
        public boolean validate(java.lang.String p0) { return false; }
    }

    public static final class DiscreteValueValidator implements android.provider.SettingsValidators.Validator {
        private final java.lang.String[] mValues = null;
        public DiscreteValueValidator(java.lang.String[] p0) {}
        public boolean validate(java.lang.String p0) { return false; }
    }

    public static final class ComponentNameListValidator implements android.provider.SettingsValidators.Validator {
        private final java.lang.String mSeparator = null;
        public ComponentNameListValidator(java.lang.String p0) {}
        public boolean validate(java.lang.String p0) { return false; }
    }
}
