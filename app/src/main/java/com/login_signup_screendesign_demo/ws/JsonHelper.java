package com.login_signup_screendesign_demo.ws;

import com.google.gson.Gson;
import com.login_signup_screendesign_demo.dto.PersonDTO;
import com.login_signup_screendesign_demo.dto.ResponseDTO;

/**
 * Created by Mobina on 8/15/2018.
 */

public class JsonHelper {

    public String createPersonJson(PersonDTO personDTO){

        Gson gson = new Gson();
        return gson.toJson(personDTO , PersonDTO.class);
    }

    public ResponseDTO getResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
}
