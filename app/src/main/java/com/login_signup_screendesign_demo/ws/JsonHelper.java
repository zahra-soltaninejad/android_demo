package com.login_signup_screendesign_demo.ws;

import com.google.gson.Gson;
import com.login_signup_screendesign_demo.dto.CheckBookDTO;
import com.login_signup_screendesign_demo.dto.CheckDTO;
import com.login_signup_screendesign_demo.dto.PersonDTO;
import com.login_signup_screendesign_demo.dto.ReceiverAccountDTO;
import com.login_signup_screendesign_demo.dto.ReceiverDTO;
import com.login_signup_screendesign_demo.dto.ResponseDTO;
import com.login_signup_screendesign_demo.dto.SenderDTO;
import com.login_signup_screendesign_demo.dto.UserDTO;

/**
 * Created by Mobina on 8/15/2018.
 */

public class JsonHelper {

    //person--------------------------------------------------------
    public String generateRequest(PersonDTO personDTO){

        Gson gson = new Gson();
        return gson.toJson(personDTO , PersonDTO.class);
    }

    public ResponseDTO<PersonDTO> getPersonResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
    //receiver-------------------------------------------------------
    public String generateRequest(CheckDTO checkDTO){

        Gson gson = new Gson();
        return gson.toJson(checkDTO , CheckDTO.class);
    }

    public ResponseDTO<ReceiverDTO> getReceiverResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
    //receiver account-------------------------------------------------------
    public String generateRequest(ReceiverDTO receiverDTO){

        Gson gson = new Gson();
        return gson.toJson(receiverDTO , ReceiverDTO.class);
    }

    public ResponseDTO<ResponseDTO<ReceiverAccountDTO>> getReceiverAccountResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
    //sender checks---------------------------------------------------------
    public String generateRequest(SenderDTO senderDTO){

        Gson gson = new Gson();
        return gson.toJson(senderDTO , SenderDTO.class);
    }

    public ResponseDTO<ResponseDTO<CheckBookDTO>> getSenderCheckResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
    //response dto in general------------------------------------------------
    public ResponseDTO<ResponseDTO> getResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
    //user-------------------------------------------------------------------
    public String generateRequest(UserDTO userDTO){

        Gson gson = new Gson();
        return gson.toJson(userDTO , UserDTO.class);
    }

    public ResponseDTO<ResponseDTO<PersonDTO>> getLoginResponse(String json){

        Gson gson = new Gson();
        return gson.fromJson(json , ResponseDTO.class);
    }
}
