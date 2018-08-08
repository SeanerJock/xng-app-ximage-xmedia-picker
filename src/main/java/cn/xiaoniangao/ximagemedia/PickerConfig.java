package cn.xiaoniangao.ximagemedia;

/**
 * Created by dmcBig on 2017/6/9.
 */

public class PickerConfig {
    public static final String LOG_TAG = "MediaPicker";

    /**
     * 最大图片选择次数，int类型，默认40
     */
    public static final String MAX_SELECT_COUNT = "max_select_count";

    public static final int DEFAULT_SELECTED_MAX_COUNT = 40;

    /**
     * 最大文件大小，int类型，默认180m
     */
    public static final String MAX_SELECT_SIZE = "max_select_size";

    public static final long DEFAULT_SELECTED_MAX_SIZE = 188743680;

    /**
     * 图片选择模式，默认选视频和图片
     */
    public static final String SELECT_MODE = "select_mode";

    /**
     * 选择结果，返回为 ArrayList&lt;String&gt; 图片路径集合
     */
    public static final String EXTRA_RESULT          = "select_result";
    /**
     * 默认选择集
     */
    public static final String DEFAULT_SELECTED_LIST = "default_list";
    /**
     * 预览集
     */
    public static final String PRE_RAW_LIST          = "pre_raw_List";
    /**
     * 预览选中集
     */
    public static final String PRE_SELECT_LIST       = "pre_select_List";
    /**
     * 首次预览的项
     */
    public static final String FIRST_PRE_ITEM        = "first_pre_item";
    /**
     * 选择满了的提示
     */
    public static final String CHOOSE_FULL_TOAST     = "choose_full_toast";

    /**
     * uri类型
     */
    public static final String URI_TYPE     = "uri_type";
    public static  String FILE_TYPE    = "file_type";
    public static final String CONTENT_TYPE = "content_type";

    public static final int RESULT_CODE        = 19901026;
    public static final int RESULT_UPDATE_CODE = 1990;
    public static final int PICKER_IMAGE       = 100;
    public static final int PICKER_VIDEO       = 102;
    public static final int PICKER_IMAGE_VIDEO = 101;
    public static       int GridSpanCount      = 3;
    public static       int GridSpace          = 4;

}
