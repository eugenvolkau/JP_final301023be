package com.telrun.org.customdatabase.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.beans.ConstructorProperties;

@Getter
@Setter
@NoArgsConstructor
public class Custom {

    private String id;
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNum;

    public Custom(String id, String phoneNum, String eMail, String lastName, String firstName) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.eMail = eMail;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Custom(String firstName, String lastName, String eMail, String phoneNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
    }
}
