package com.company.encapsulation.ex4;

public class Member {

    private int verificationEmailStatus;

    public int getVerificationEmailStatus() {
        return verificationEmailStatus;
    }

    public void setVerificationEmailStatus(int verificationEmailStatus) {
        this.verificationEmailStatus = verificationEmailStatus;
    }

    public void verifyEmail() {
        if (isEmailVerified()) {
            throw new AlreadyVerifiedException();
        } else {
            this.verificationEmailStatus = 2;
        }
    }

    public boolean isEmailVerified() {
        return verificationEmailStatus == 2;
    }
}
