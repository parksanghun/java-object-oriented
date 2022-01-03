package com.company.encapsulation.ex4;

public class EmailService {

    @Deprecated
    public void verifyEmailOld(String token) {
        Member mem = findByToken(token);
        if (mem == null) throw new BadTokenException();

        if (mem.getVerificationEmailStatus() == 2) {
            throw new AlreadyVerifiedException();
        } else {
            mem.setVerificationEmailStatus(2);
        }
        // 수정사항 DB 반영
    }

    public void verifyEmail(String token) {
        Member mem = findByToken(token);
        if (mem == null) throw new BadTokenException();

        mem.verifyEmail();
        // 수정사항 DB 반영
    }


    private Member findByToken(String token) {
        return null;
    }
}
