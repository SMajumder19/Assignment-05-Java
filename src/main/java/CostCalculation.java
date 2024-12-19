//Task: 12

public class CostCalculation {
    public static void main(String[] args) {
        String message = "A core i 7 laptop price is 85000 tk and a gaming mouse price " +
                "is 2500 tk. If I buy the laptop and 1 piece mouse, " +
                "what will be my total cost after giving 15% discount?";
        double total = calculatePrice(message);
        System.out.println("Total Price: " + total);
    }

    public static double calculatePrice(String message){
        message = message.replaceAll("[^\\d]", " ");
        //System.out.println(message);
        message = message.trim();
        //System.out.println(message);
        message = message.replaceAll(" +", " ");
        //System.out.println(message);
        String[] array = message.split(" ");
        //System.out.println(Arrays.toString(array));

        double laptop = Double.parseDouble(array[1]);
        double mouse = Double.parseDouble(array[2]);
        double mouseQuantity = Double.parseDouble(array[3]);
        double discount = Double.parseDouble(array[4]);

        double totalPrice = laptop + (mouseQuantity * mouse);
        totalPrice = totalPrice - ((totalPrice * discount) / 100);

        return totalPrice;
    }

}
