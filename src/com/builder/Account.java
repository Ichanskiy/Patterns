package com.builder;

public class Account {

    private Integer id;
    private String token;

    private Account() {
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public static Builder builder() {
        return new Account().new Builder();
    }

    public class Builder {

        private Builder() {

        }

        public Builder setId(Integer id) {
            Account.this.id = id;
            return this;
        }

        public Builder setToken(String token) {
            Account.this.token = token;
            return this;
        }

        public Account build() {
            return Account.this;
        }

    }

}
