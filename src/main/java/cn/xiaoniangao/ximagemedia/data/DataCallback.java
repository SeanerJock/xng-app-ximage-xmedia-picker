package cn.xiaoniangao.ximagemedia.data;


import java.util.ArrayList;

import cn.xiaoniangao.ximagemedia.entity.Folder;


/**
 * Created by dmcBig on 2017/7/3.
 */

public interface DataCallback {


    void onData(ArrayList<Folder> list);

}
