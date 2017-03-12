package com.agilie.dribbblesdk.sample.activity;

import com.agilie.dribbblesdk.service.auth.AuthCredentials;
import com.agilie.dribbblesdk.service.auth.DribbbleConstants;

import java.util.Arrays;

/**
 * Created by ttc on 2017/3/12.
 */

public class CredentialsBuilder {

    private static final String DRIBBBLE_CLIENT_ID = "3402370d3de009b84f8a4c6f77a36ea5a27dd3901b51394cbc402b33f9644bc1";
    private static final String DRIBBBLE_CLIENT_SECRET = "4b0b37aa4603fe0740ce2245c2dbf742fa0bb7b0868172349dfeb411d4bb7a62";
    private static final String DRIBBBLE_CLIENT_ACCESS_TOKEN = "0cc5e30b7a98c0d80073777c38a97d0c7db1b286185c0db80af81823b65e12aa";
    private static final String DRIBBBLE_CLIENT_REDIRECT_URL = "http://my.csdn.net/my/mycsdn";


    public String getDribbbleClientId(){
        return DRIBBBLE_CLIENT_ID;
    }

    public String getDribbbleClientSecret(){
        return DRIBBBLE_CLIENT_SECRET;
    }

    public String getDribbbleClientAccessToken(){
        return DRIBBBLE_CLIENT_ACCESS_TOKEN;
    }

    public String getDribbbleClientRedirectUrl(){
        return DRIBBBLE_CLIENT_REDIRECT_URL;
    }

    private  AuthCredentials credentials;
    public CredentialsBuilder(){
        credentials= AuthCredentials.newBuilder(
                DRIBBBLE_CLIENT_ID,
                DRIBBBLE_CLIENT_SECRET,
                DRIBBBLE_CLIENT_ACCESS_TOKEN,
                DRIBBBLE_CLIENT_REDIRECT_URL)
                .setScope(Arrays.asList(
                        DribbbleConstants.SCOPE_PUBLIC,
                        DribbbleConstants.SCOPE_WRITE,
                        DribbbleConstants.SCOPE_UPLOAD,
                        DribbbleConstants.SCOPE_COMMENT))
                .build();
    }

    public  AuthCredentials getCredential(){
        return credentials;
    }


}
