package com.company.segregation.ex1;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Cryptor {
    private SecretKeySpec keySpec;
    private IvParameterSpec ivSpec;

    public String encrypt(String plain) {
        Cipher cipher = Cipher.getInstance(DEFAULT_TRANSFORM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        return new String(Base64.getEncoder().encode(cipher.doFinal(reqBody)));
    }

    public String decrypt(String encrypted) {
        Cipher cipher2 = Cipher.getInstance(DEFAULT_TRANSFORM);
        cipher2.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        return new String(cipher.doFinal(Base64.getDecoder().decode(encRespBody)));
    }
}
