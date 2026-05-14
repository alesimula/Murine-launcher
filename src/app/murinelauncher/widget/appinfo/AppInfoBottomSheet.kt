package app.murinelauncher.widget.appinfo

import android.content.ComponentName
import android.content.Context
import android.content.pm.LauncherApps
import android.os.UserHandle
import android.util.AttributeSet
import android.util.Pair
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.Interpolator
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.android.launcher3.BaseActivity
import com.android.launcher3.LauncherSettings
import com.android.launcher3.R
import com.android.launcher3.Utilities
import com.android.launcher3.anim.PendingAnimation
import com.android.launcher3.model.data.ItemInfo
import com.android.launcher3.model.data.WorkspaceItemInfo
import com.android.launcher3.util.PackageManagerHelper
import com.android.launcher3.views.AbstractSlideInView

/**
 * Bottom sheet showing app information: package, version, last update, source, and icon pack;
 * Entries are rendered by [AppInfoPreferenceFragment] via a standard preferences XML.
 */
class AppInfoBottomSheet @JvmOverloads constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int = 0) : AbstractSlideInView<BaseActivity?>(context, attrs, defStyleAttr) {

    private var mItemInfo: ItemInfo? = null

    init { setWillNotDraw(false) }

    override fun onFinishInflate() {
        super.onFinishInflate()
        mContent = findViewById<ViewGroup?>(R.id.app_info_bottom_sheet)
        setContentBackgroundWithParent(
            AppCompatResources.getDrawable(context,R.drawable.bg_rounded_corner_bottom_sheet)!!, mContent
        )
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val width = r - l
        val height = b - t
        val contentWidth = mContent.measuredWidth
        val contentLeft = (width - contentWidth) / 2
        mContent.layout(contentLeft, height - mContent.measuredHeight, contentLeft + contentWidth, height)
        setTranslationShift(mTranslationShift)
    }

    override fun getScrimColor(context: Context): Int = context.resources.getColor(R.color.widgets_picker_scrim)

    fun populateAndShow(itemInfo: ItemInfo) {
        mItemInfo = itemInfo
        val context = context
        val componentName = itemInfo.targetComponent

        val titleView = findViewById<View>(R.id.title) as TextView
        titleView.text = itemInfo.title ?: ""

        findViewById<ImageButton>(R.id.edit_label_button).setOnClickListener {
            val activity = BaseActivity.fromContext<BaseActivity>(context)
            val frag = activity.supportFragmentManager.findFragmentByTag(AppInfoPreferenceFragment.TAG) as? AppInfoPreferenceFragment
            frag?.showEditLabel()
        }
        findViewById<ImageButton>(R.id.settings_button).setOnClickListener { v ->
            PackageManagerHelper.startDetailsActivityForInfo(
                context, mItemInfo, Utilities.getViewBounds(v), null
            )
        }

        if (componentName != null) {
            val activity = BaseActivity.fromContext<BaseActivity>(context)
            val (labelKey, originalLabel, instanceId) = resolveLabelInfo(context, itemInfo, componentName)
            val fragment = AppInfoPreferenceFragment.newInstance(
                componentName.flattenToString(), componentName.packageName,
                labelKey, originalLabel, instanceId, itemInfo.user
            )
            fragment.onLabelEdited = { newLabel -> titleView.text = newLabel }
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.app_info_prefs, fragment, AppInfoPreferenceFragment.TAG)
                .commitAllowingStateLoss()
        }

        attachToContainer()
        mIsOpen = false
        animateOpen()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        val activity = BaseActivity.fromContext<BaseActivity>(context) ?: return
        val fm = activity.supportFragmentManager
        fm.findFragmentByTag(AppInfoPreferenceFragment.TAG)?.let {
            fm.beginTransaction().remove(it).commitAllowingStateLoss()
        }
    }

    private fun animateOpen() {
        if (mIsOpen || mOpenCloseAnimation.animationPlayer.isRunning) return
        mIsOpen = true
        setUpDefaultOpenAnimation().start()
    }

    override fun handleClose(animate: Boolean) {
        handleClose(animate, DEFAULT_CLOSE_DURATION.toLong())
    }

    override fun isOfType(@FloatingViewType type: Int): Boolean = (type and TYPE_WIDGETS_BOTTOM_SHEET) != 0

    override fun onControllerInterceptTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action == MotionEvent.ACTION_DOWN) {
            mNoIntercept = false
            val prefsContainer = findViewById<View>(R.id.app_info_prefs)
            if (getPopupContainer().isEventOverView(prefsContainer, ev)) {
                val rv = findRecyclerView(prefsContainer)
                if (rv != null && rv.computeVerticalScrollOffset() > 0) mNoIntercept = true
            }
        }
        return super.onControllerInterceptTouchEvent(ev)
    }

    private fun findRecyclerView(view: View): RecyclerView? {
        if (view is RecyclerView) return view
        if (view is ViewGroup) for (i in 0 until view.childCount) {
            findRecyclerView(view.getChildAt(i))?.let { return it }
        }
        return null
    }

    override fun getAccessibilityTarget(): Pair<View?, String?>? = Pair.create(
        findViewById(R.id.title), context.getString(R.string.app_info_drop_target_label)
    )

    override fun addHintCloseAnim(distanceToMove: Float, interpolator: Interpolator?, target: PendingAnimation) {
        target.addAnimatedFloat(mSwipeToDismissProgress, 0f, 1f, interpolator)
    }

    private fun resolveLabelInfo(context: Context, itemInfo: ItemInfo, componentName: ComponentName): Triple<String, String, Int> {
        val userHash = itemInfo.user.hashCode()
        val shortcutId = (itemInfo as? WorkspaceItemInfo)?.getDeepShortcutId()
        if (shortcutId != null) {
            // Deep shortcut: per-instance label via itemInfo.id; original from LauncherApps
            val key = ComponentName(componentName.packageName, shortcutId).flattenToString() + "#" + userHash
            val original = getOriginalShortcutLabel(context, componentName.packageName, shortcutId, itemInfo.user)
                ?: itemInfo.title?.toString() ?: shortcutId
            return Triple(key, original, itemInfo.id)
        }
        // Regular app: shared label via component key
        val key = componentName.flattenToString() + "#" + userHash
        val original = try {
            val pm = context.packageManager
            pm.getActivityInfo(componentName, 0).loadLabel(pm).toString()
        } catch (_: Exception) {
            itemInfo.title?.toString() ?: componentName.flattenToString()
        }
        return Triple(key, original, -1)
    }

    private fun getOriginalShortcutLabel(context: Context, packageName: String, shortcutId: String, user: UserHandle): String? {
        val launcherApps = context.getSystemService(Context.LAUNCHER_APPS_SERVICE) as? LauncherApps ?: return null
        val query = LauncherApps.ShortcutQuery()
        query.setQueryFlags(
            LauncherApps.ShortcutQuery.FLAG_MATCH_DYNAMIC or
            LauncherApps.ShortcutQuery.FLAG_MATCH_PINNED or
            LauncherApps.ShortcutQuery.FLAG_MATCH_MANIFEST
        )
        query.setPackage(packageName)
        query.setShortcutIds(listOf(shortcutId))
        return try {
            launcherApps.getShortcuts(query, user)?.firstOrNull()?.shortLabel?.toString()
        } catch (_: Exception) {
            null
        }
    }

    companion object {
        private const val DEFAULT_CLOSE_DURATION = 200

        @JvmStatic
        fun show(activity: BaseActivity, itemInfo: ItemInfo): AppInfoBottomSheet {
            val sheet = activity.layoutInflater.inflate(
                R.layout.app_info_bottom_sheet, activity.dragLayer, false
            ) as AppInfoBottomSheet
            sheet.populateAndShow(itemInfo)
            return sheet
        }
    }
}
