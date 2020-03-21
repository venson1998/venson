package com.song.building.venson.provider;

import com.alibaba.fastjson.JSON;
import com.song.building.venson.dto.AccessTokenDTO;
import com.song.building.venson.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

<<<<<<< HEAD
//github授权支持
=======

>>>>>>> c630a74aeafe8bb84c50af6ca65c50b3ec1bb0b7
@Component
public class GithubProvider {

    public String getAccessToken(AccessTokenDTO accessTokenDTO){
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
<<<<<<< HEAD

        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String string = response.body().string();
            String[] split = string.split("&");
            String tokenstr = split[0];
            String token = tokenstr.split("=")[1];
            return token;
        } catch (IOException e) {
        }
        return null;
=======
        OkHttpClient client = new OkHttpClient();


            RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
            Request request = new Request.Builder()
                    .url("https://github.com/login/oauth/access_token")
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                String string = response.body().string();
                String token = string.split("&")[0].split("=")[1];
                return token;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
>>>>>>> c630a74aeafe8bb84c50af6ca65c50b3ec1bb0b7
    }

    public GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" + accessToken)
                .build();
<<<<<<< HEAD
        try {
=======
        try  {
>>>>>>> c630a74aeafe8bb84c50af6ca65c50b3ec1bb0b7
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string,GithubUser.class);
            return githubUser;
        } catch (IOException e) {
<<<<<<< HEAD
            e.printStackTrace();
        }
        return null;
=======
        }
        return null;

>>>>>>> c630a74aeafe8bb84c50af6ca65c50b3ec1bb0b7
    }

}
