package vn.hoangphan.facerecognition.net;

import retrofit.RestAdapter;
import vn.hoangphan.facerecognition.constants.Constants;

/**
 * Created by Hoang Phan on 1/4/2016.
 */
public class APIService {
    private static FaceRecAPI instance;

    public static FaceRecAPI getInstance() {
        if (instance == null) {
            RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(Constants.API_ENDPOINT).setConverter(new JSONConverter()).build();
            instance = restAdapter.create(FaceRecAPI.class);
        }
        return instance;
    }
}
