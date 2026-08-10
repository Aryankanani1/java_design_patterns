package design_pattern.creational_patterns.builder;

public class AccountInfo {
    private final String name;
    private final String  accountNo;
    private final String phoneNo;
    private final String birthDate;
    private final String SSN;
    private final String address;
    private final String gender;
    private final String accountType;
    private final double balance;

    public AccountInfo (Builder builder){
        this.name = builder.name;
        this.accountNo = builder.accountNo;
        this.phoneNo = builder.phoneNo;
        this.birthDate = builder.birthDate;
        this.SSN = builder.SSN;
        this.address = builder.address;
        this.gender = builder.gender;
        this.accountType = builder.accountType;
        this.balance = builder.balance;
    }

    public void print(){
        System.out.println(
                        "name:" + name +
                        " | "+"accountNo:" + accountNo +
                        " | "+"accountType:" + accountType +
                        " | "+"balance:" + balance
        );
    }

    static class Builder{
        private  String name = "Unknown";
        private final String accountNo;
        private  String phoneNo = "NOT-PROVIDED";
        private  String birthDate = "NOT-PROVIDED";
        private  String SSN = "NOT-PROVIDED";
        private  String address = "NOT-PROVIDED";
        private  String gender = "NOT-PROVIDED";
        private final String accountType;
        private double balance = 0.00;

        public Builder(String accountNo,String accountType){
            this.accountNo = accountNo;
            this.accountType = accountType;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder phoneNo(String phoneNo){
            this.phoneNo = phoneNo;
            return this;
        }
        public Builder birthDate(String birthDate){
            this.birthDate = birthDate;
            return this;
        }
        public Builder SSN(String SSN){
            this.SSN = SSN;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder balance(double balance){
            this.balance = balance;
            return this;
        }

public AccountInfo build(){
            if(accountNo == null || accountNo.isEmpty()){
                throw new IllegalArgumentException("Account number is required");
            }
            if(accountType == null || accountType.isEmpty()){
                throw new IllegalArgumentException("Account type is required");
            }
            if(balance < 0){
                throw new IllegalArgumentException("balance must be above 0");
            }
            return new AccountInfo(this);
}
    }

    public static void main(String[] args) {
        AccountInfo account1 = new AccountInfo.Builder("Ace-112233","saving")
                .address("xx-APT-federalHWY-orlando-Florida-33024")
                .gender("male")
                .name("Robert").build();

        account1.print();
    }
}
