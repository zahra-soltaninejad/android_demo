package com.login_signup_screendesign_demo.ws;

import com.login_signup_screendesign_demo.dto.PersonDTO;

/**
 * Created by m.pak on 8/19/2018.
 */

public class TemplateHolder {

    private PersonDTO personDTO;
    private static TemplateHolder instance = null;

    private TemplateHolder(){
    }

    public static TemplateHolder getInstance(){
        if (instance == null){
            return new TemplateHolder();
        }else {
            return instance;
        }
    }

    public PersonDTO getPersonDTO() {
        return personDTO;
    }

    public void setPersonDTO(PersonDTO personDTO) {
        this.personDTO = personDTO;
    }
}
