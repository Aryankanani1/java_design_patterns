package design_pattern.creational_patterns.builder.mini_project;

public class FoodOrder {

        private final String mainItem;
        private final String deliverAddress;
        private final String drink;
        private final String sides;
        private final boolean fries;
        private final String dessert;
        private final String giftMessage;

        public FoodOrder(Builder builder){
        this.mainItem = builder.mainItem;
        this.deliverAddress= builder.deliverAddress;
        this.drink = builder.drink;
        this.sides = builder.sides;
        this.fries = builder.fries;
        this.dessert = builder.dessert;
        this.giftMessage = builder.giftMessage;
        }

        public void print(){
            System.out.println("mainItem:" + mainItem +
                    " | "+ "deliveryAddress:" + deliverAddress +
                    " | "+ "drink:" + drink +
                    " | "+ "sides:" + sides +
                    " | "+ "fries:" + fries +
                    " | "+ "dessert:" + dessert +
                    " | "+ "giftMessage:" + giftMessage);
        }

    static class Builder{
        private final String mainItem;
        private final String deliverAddress;
        private  String drink = "None";
        private  String sides = "None";
        private  boolean fries = false;
        private  String dessert = "None";
        private String giftMessage = "No gift message";

        public Builder(String mainItem, String deliverAddress){
            this.mainItem = mainItem;
            this.deliverAddress = deliverAddress;
        }

        public Builder drink(String drink){
            this.drink = drink;
            return this;
        }
        public Builder sides(String sides){
            this.sides = sides;
            return this;
        }
        public Builder fries(boolean fries){
            this.fries = fries;
            return this;
        }
        private Builder dessert(String dessert){
            this.dessert = dessert;
            return this;
        }

        private Builder giftMessage(String giftMessage){
            this.giftMessage = giftMessage;
            return this;
        }

        public FoodOrder build(){
            if( deliverAddress == null || deliverAddress.isEmpty() ){
                throw new IllegalArgumentException("you have to provide the delivery address");
            } else if (mainItem == null || mainItem.isEmpty()) {
                throw new IllegalArgumentException("you have to select main item");

            }
            return new FoodOrder(this);
        }
    }

    public static void main(String[] args) {

            FoodOrder order1 = new Builder("Burger","florida")
                    .dessert("cake")
                    .fries(true)
                    .build();

            FoodOrder order2 = new FoodOrder.Builder("burrito","California")
                    .build();

            order1.print();
            order2.print();
    }

}
