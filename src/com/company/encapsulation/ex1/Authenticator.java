package com.company.encapsulation.ex1;


public class Authenticator {

    private PasswordEncoder passwordEncoder;

    public AuthResult authenticate(String id, String pw) {
        Member mem = findOne(id);
        if (mem == null) return AuthResult.NO_MATCH;

        // Tell Don't ask
//        if (mem.getVerificationEmailStatus() != 2) {
        if (mem.isNotEmailVerified(mem)) {
            return AuthResult.NO_EMAIL_VERIFIED;
        }
        if (passwordEncoder.isPasswordValid(mem.getPassword(), pw, mem.getId())) {
            return AuthResult.SUCCESS;
        }
        return AuthResult.NO_MATCH;
    }

    private Member findOne(String id) {
        return null;
    }
}
