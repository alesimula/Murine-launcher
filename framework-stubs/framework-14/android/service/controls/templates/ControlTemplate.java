package android.service.controls.templates;

public abstract class ControlTemplate {
    public static final android.service.controls.templates.ControlTemplate NO_TEMPLATE = null;
    public static final int TYPE_ERROR = -1;
    public static final int TYPE_NO_TEMPLATE = 0;
    public static final int TYPE_TOGGLE = 1;
    public static final int TYPE_RANGE = 2;
    public static final int TYPE_THUMBNAIL = 3;
    public static final int TYPE_TOGGLE_RANGE = 6;
    public static final int TYPE_TEMPERATURE = 7;
    public static final int TYPE_STATELESS = 8;
    public java.lang.String getTemplateId() { return null; }
    public abstract int getTemplateType();
    android.os.Bundle getDataBundle() { return null; }
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
