package com.example.admin.f_traveller;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 04/06/2017.
 */

public class SignupRequest  extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://insolvable-measurem.000webhostapp.com/phone_number.php";
    private Map<String, String> params;

    public SignupRequest(int phone_number, Response.Listener<String>listener){
        super(Method.POST,REGISTER_REQUEST_URL, listener,null);
        params = new HashMap<>();
        params.put("phone_number",phone_number + "");


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
