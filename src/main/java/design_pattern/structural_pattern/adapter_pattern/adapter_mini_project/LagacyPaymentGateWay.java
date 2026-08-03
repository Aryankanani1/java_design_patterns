package design_pattern.structural_pattern.adapter_pattern.adapter_mini_project;

public class LagacyPaymentGateWay {
    public void sendMoney(String referenceNumber, String amountText){
        System.out.println("your order reference number:" +referenceNumber);
        System.out.println("your total amount:" + amountText);
    }

}
