package cn.xiaoniangao.ximagemedia;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

import cn.xiaoniangao.ximagemedia.entity.Media;
import cn.xiaoniangao.ximagemedia.entity.ResultModel;
import cn.xiaoniangao.ximagemedia.utils.UriUtils;

public class MainActivity extends AppCompatActivity {
    private Button    btn_select;
    private ImageView image;
    private VideoView videoview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_select = findViewById(R.id.btn_select);
        image = findViewById(R.id.image);
        videoview = findViewById(R.id.videoview);
        btn_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhone();
            }
        });
    }

    private void selectPhone() {
        Intent intent = new Intent(MainActivity.this, PickerActivity.class);
        intent.putExtra(PickerConfig.SELECT_MODE, PickerConfig.PICKER_IMAGE);//default image and video (Optional)
        long maxSize = 188743680L;//long long long long类型
        intent.putExtra(PickerConfig.MAX_SELECT_SIZE, maxSize); //default 180MB (Optional)
        intent.putExtra(PickerConfig.MAX_SELECT_COUNT, 1);  //default 40 (Optional)
        intent.putExtra(PickerConfig.DEFAULT_SELECTED_LIST, ""); //(Optional)默认选中的照片
        //intent.putExtra(PickerConfig.CHOOSE_FULL_TOAST,"对不起，已经达到选择的上线");
        //intent.putExtra(PickerConfig.URI_TYPE,PickerConfig.CONTENT_TYPE);
        startActivityForResult(intent, 200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == PickerConfig.RESULT_CODE) {
            ArrayList select = data.getParcelableArrayListExtra(PickerConfig.EXTRA_RESULT);
            if (select != null) {
                for (int i = 0; i < select.size(); i++) {
                    ResultModel resultModel = (ResultModel) select.get(i);
                    if (resultModel.mediaType == 1) {
                        image.setImageURI(Uri.parse(resultModel.uriPath));
                    } else {
                        image.setImageURI(Uri.parse(resultModel.thumPath));
                        videoview.setVideoURI(Uri.parse(resultModel.uriPath));
                        videoview.start();
                    }
                }
            }
        }
    }
}
