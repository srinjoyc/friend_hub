package cpen391.friendhub;

import cpen391.friendhub.models.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Srinjoy on 3/11/2017.
 */

public interface ServerCallable {

    //This method is used for "POST"
    @GET("/users/{id}")
    Call<User> showUser(@Path("id") String id);

    //This method is used for "GET"
    @GET("/api.php")
    Call<User> get(
            @Query("method") String method,
            @Query("username") String username,
            @Query("password") String password
    );

}
