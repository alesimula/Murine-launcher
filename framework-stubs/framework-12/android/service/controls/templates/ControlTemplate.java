package android.service.controls.templates;

public abstract class ControlTemplate {
    private static final java.lang.String TAG = "ControlTemplate";
    private static final java.lang.String KEY_TEMPLATE_ID = "key_template_id";
    private static final java.lang.String KEY_TEMPLATE_TYPE = "key_template_type";
    public static final android.service.controls.templates.ControlTemplate NO_TEMPLATE = null;
    private static final android.service.controls.templates.ControlTemplate ERROR_TEMPLATE = null;
    public static final int TYPE_ERROR = -1;
    public static final int TYPE_NO_TEMPLATE = 0;
    public static final int TYPE_TOGGLE = 1;
    public static final int TYPE_RANGE = 2;
    public static final int TYPE_THUMBNAIL = 3;
    public static final int TYPE_TOGGLE_RANGE = 6;
    public static final int TYPE_TEMPERATURE = 7;
    public static final int TYPE_STATELESS = 8;
    private final java.lang.String mTemplateId = null;
    public java.lang.String getTemplateId() { return null; }
    public abstract int getTemplateType();
    android.os.Bundle getDataBundle() { return null; }
    private ControlTemplate() {}
    ControlTemplate(android.os.Bundle p0) {}
    ControlTemplate(java.lang.String p0) {}
    public void prepareTemplateForBinder(android.content.Context p0) {}
    static android.service.controls.templates.ControlTemplate createTemplateFromBundle(android.os.Bundle p0) { return null; }
    public static android.service.controls.templates.ControlTemplate getErrorTemplate() { return null; }
    public static android.service.controls.templates.ControlTemplate getNoTemplateObject() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TemplateType {
    }
}
