package cn.xiaoniangao.ximagemedia.entity;

import android.os.Parcel;
import android.os.Parcelable;

/**
 *
 * Created by liujiao on 18-8-7
 */
public class ResultModel implements Parcelable {
    public int    mediaType;//媒体类型 1：图片   3：视频
    public String uriPath;//视频或者图片的地址
    public String thumPath;//只有视频才有的缩略图地址

    public ResultModel() {

    }

    protected ResultModel(Parcel in) {
        mediaType = in.readInt();
        uriPath = in.readString();
        thumPath = in.readString();
    }

    public ResultModel(int mediaType, String uriPath, String thumPath) {
        this.mediaType = mediaType;
        this.uriPath = uriPath;
        this.thumPath = thumPath;
    }

    public static final Creator<ResultModel> CREATOR = new Creator<ResultModel>() {
        @Override
        public ResultModel createFromParcel(Parcel in) {
            return new ResultModel(in);
        }

        @Override
        public ResultModel[] newArray(int size) {
            return new ResultModel[size];
        }
    };


    public void setMediaType(int mediaType) {
        this.mediaType = mediaType;
    }

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    public void setThumPath(String thumPath) {
        this.thumPath = thumPath;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mediaType);
        parcel.writeString(uriPath);
        parcel.writeString(thumPath);
    }
}
