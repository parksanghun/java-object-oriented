package com.company.segregation.ex1.old;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class CashClient {
    private SecretKeySpec keySpec;
    private IvParameterSpec ivSpec;

    private Res post(Req req) {
        String reqBody = toJson(req);

        Cipher cipher = Cipher.getInstance(DEFAULT_TRANSFORM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        String encReqBody = new String(Base64.getEncoder().encode(cipher.doFinal(reqBody)));

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(api, encReqBody, String.class);

        String encRespBody = responseEntity.getBody();

        Cipher cipher2 = Cipher.getInstance(DEFAULT_TRANSFORM);
        cipher2.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        String respBody = new String(cipher.doFinal(Base64.getDecoder().decode(encRespBody)));

        return jsonToObj(respBody);
    }
}
