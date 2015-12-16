package cardquiz;

/**
 *
 * @author 18mossj
 */
public class Cardquiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Card a = new Card("diamonds", "7");
      Card b = new Card("spades", "5");
      
      int a_value = Integer.parseInt(a.getValue());
      int b_value = Integer.parseInt(b.getValue());
      
      if (a_value > b_value) {
        System.out.println("Card A has a greater value than Card B.");
      } else {
        System.out.println("Card B has a greater value than Card A.");
      }
      
      System.out.println("Card A has a value of " + a.getValue());
      System.out.println("Card A has a suit of " + a.getSuit());
      
      System.out.println("Card B has a value of " + b.getValue());
      System.out.println("Card B has a suit of " + b.getSuit());
    }
}

public class Card {
  private String suit;
  private String value;
  
  public Card() {
    suit = "NO SUIT";
    value = "JOKER";
  }
  
  public Card(String suit, String value) {
    suit = suit;
    value = value;
  }
  
  public String getSuit() {
    return suit;
  }
  
  public String getValue() {
    return value;
  }
}
