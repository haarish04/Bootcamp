abstract class PrepaidCard {
    private int cardNo;
    private double availableBalance;
    private double swipeLimit;

    PrepaidCard(int cardNo, double availableBalance, double swipeLimit){
        this.cardNo = cardNo;
        this.availableBalance= availableBalance;
        this.swipeLimit = swipeLimit;
    }

    abstract boolean swipeCard(int amount);

    @Override
    public String toString() {
        return "Card No: " + this.cardNo + ", Available Balance: " + this.availableBalance;
    }

    public void rechargeCard(int amount){
        this.availableBalance += amount;
    }
    public int getCardNo() {
        return cardNo;
    }
 
    public double getAvailableBalance() {
        return availableBalance;
    }
 
    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }
 
    public double getSwipeLimit() {
        return swipeLimit;
    }
    
}

class TravelCard extends PrepaidCard{

    public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
        super(cardNo, availableBalance, swipeLimit);
        this.rewardPoints = 0;
    }
    int rewardPoints;
    boolean swipeCard(int amount){
        int amountINR= amount * 60;
        if(amountINR >= getAvailableBalance() || amountINR >= getSwipeLimit())
            return false;
        setAvailableBalance(getAvailableBalance()-(amountINR + amountINR*0.05));
        this.rewardPoints = rewardPoints + amountINR/100 * 5;
        return true;
            
    }
    
}

public class TestCard{
    public static void main(String[] args) {
        PrepaidCard newCard = new TravelCard(1,10000.0,5000.0);

        System.out.println("Initial Card Details: " + newCard.toString());
 
    
        if (newCard.swipeCard(500)) {
            System.out.println("Swipe successfull!");
        } else {
            System.out.println("Swipe failed!");
        }
 
        System.out.println("Card Details after swipe: " + newCard);
 
  
        newCard.rechargeCard(2000);
        System.out.println("Card Details after recharge: " + newCard.toString());

    }
}
