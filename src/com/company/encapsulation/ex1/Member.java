package com.company.encapsulation.ex1;

public class Member {

    private int emailStatus;
    private String password;
    private long id;

    public int getVerificationEmailStatus() {
        return emailStatus;
    }

    public String getPassword() {
        return password;
    }

    public long getId() {
        return id;
    }

    public boolean isEmailVerified(Member mem) {
        return mem.getVerificationEmailStatus() == 2;
    }

    public boolean isNotEmailVerified(Member mem) {
        return !isEmailVerified(mem);
    }
}
