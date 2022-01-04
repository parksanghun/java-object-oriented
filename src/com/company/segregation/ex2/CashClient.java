package com.company.segregation.ex1;

public class CashClient {
    private Cryptor cryptor;

    private Res post(Req req) {
        String reqBody = toJson(req);

        String encReqBody = cryptor.encrypt(reqBody)

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(api, encReqBody, String.class);

        String encRespBody = responseEntity.getBody();

        String respBody = cryptor.decrypt(encRespBody);

        return jsonToObj(respBody);
    }
}
