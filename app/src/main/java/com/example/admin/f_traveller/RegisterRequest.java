package com.example.admin.f_traveller;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 04/06/2017.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "https://insolvable-measurem.000webhostapp.com/traveller_register.php";
    private Map<String, String> params;

    public RegisterRequest(String firstname, String lastname, int idno, String email, String password, Response.Listener<String>listener){
        super(Method.POST,REGISTER_REQUEST_URL, listener,null);
        params = new HashMap<>();
        params.put("firstname",firstname);
        params.put("lastname",lastname);
        params.put("idno", idno + "");
        params.put("email",email);
        params.put("password",password);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
