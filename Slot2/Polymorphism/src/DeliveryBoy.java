import java.util.Random;
/**
 *
 * @author ADMIN
 */
class DeliveryBoy {

    public void deliver() {
        System.out.println("\nDelivering Item");
    }
    public static void main(String[] args) {
        DeliveryBoy deliveryBoy = getDeliveryBoy();
        deliveryBoy.deliver();
    }
    private static DeliveryBoy getDeliveryBoy(){
        Random random = new Random();
        int number = random.nextInt();
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }
}
