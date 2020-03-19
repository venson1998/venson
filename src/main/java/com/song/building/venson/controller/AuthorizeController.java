package com.song.building.venson.controller;

import com.song.building.venson.dto.AccessTokenDTO;
import com.song.building.venson.dto.GithubUser;
import com.song.building.venson.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.krb5.internal.AuthorizationDataEntry;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String calback(@RequestParam(name = "code") String code,
                          @RequestParam(name = "state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("58ef52c645f98463fa0c");
        accessTokenDTO.setClient_secret("08449f9ce8dab20d0fb7c24d6a4945422e54d389");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_url("http://localhost:8080/callback");
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());



        return "index";
    }

}
