package vn.hoangphan.facerecognition.net;

import retrofit.Callback;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.Part;
import retrofit.mime.TypedByteArray;
import vn.hoangphan.facerecognition.models.SuccessResponse;

/**
 * Created by Hoang Phan on 1/4/2016.
 */
public interface FaceRecAPI {
    @Multipart
    @POST("/images")
    void createImage(@Part("image[binary_data]") TypedByteArray data, Callback<SuccessResponse> callback);
}
