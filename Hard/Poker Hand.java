import java.util.Scanner;
import java.util.HashSet;

// Inefficient code
public class Program
{
    public static void main(
      String[] args) {
        Scanner sc
          = new Scanner(System.in);
        String hand = sc.nextLine();
        String[] cards
          = hand.split(" ");
        
        // Replace 10 by T
        for (int i = 0; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == '1') {
                cards[i] = "" + 'T'
                  + cards[i].charAt(2);
            }
        }
        
        String rank = "High Card";
        
        if (royalFlush(cards)) {
            rank = "Royal Flush";
        }
        else if (straightFlush(cards)) {
            rank = "Straight Flush";
        }
        else if (fourOfAKind(cards)) {
            rank = "Four of a Kind";
        }
        else if (fullHouse(cards)) {
            rank = "Full House";
        }
        else if (flush(cards)) {
            rank = "Flush";
        }
        else if (straight(cards)) {
            rank = "Straight";
        }
        else if (threeOfAKind(cards)) {
            rank = "Three of a Kind";
        }
        else if (twoPairs(cards)) {
            rank = "Two Pairs";
        }
        else if (onePair(cards)) {
            rank = "One Pair";
        }
        
        System.out.println(rank);
    }
    
    // private
    static boolean royalFlush(
      String[] cards) {
        boolean suit = true;
        for (int i = 1; i < 5; ++i) {
            suit = suit &&
              (cards[i].charAt(1)
                == cards[0].charAt(1));
        }
        
        HashSet<Character> values
          = new HashSet<Character>();
        for (int i = 0; i < 5; ++i) {
            values.add(
              cards[i].charAt(0));
        }
        
        HashSet<Character> TJQKA
          = new HashSet<Character>();
        TJQKA.add('T'); TJQKA.add('J');
        TJQKA.add('Q'); TJQKA.add('K');
        TJQKA.add('A');
        
        boolean royal
          = values.equals(TJQKA);
        
        return suit && royal;
    }
    
    // private
    static boolean straightFlush (
      String[] cards) {
        boolean suit = true;
        for (int i = 1; i < 5; ++i) {
            suit = suit &&
              (cards[i].charAt(1)
                == cards[0].charAt(1));
        }
        
        HashSet<Character> values
          = new HashSet<Character>();
        for (int i = 0; i < 5; ++i) {
            values.add(
              cards[i].charAt(0));
        }
        
        HashSet<Character> SSSSS
          = new HashSet<Character>();
        SSSSS.add('9'); SSSSS.add('T');
        SSSSS.add('J'); SSSSS.add('Q');
        SSSSS.add('K');
        
        boolean straight
          = values.equals(SSSSS);
        
        SSSSS.remove('K');
        SSSSS.add('8');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('Q');
        SSSSS.add('7');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('J');
        SSSSS.add('6');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('T');
        SSSSS.add('5');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('9');
        SSSSS.add('4');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('8');
        SSSSS.add('3');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('7');
        SSSSS.add('2');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('6');
        SSSSS.add('A');
        straight = straight
          || values.equals(SSSSS);
        
        return suit && straight;
    }
    
    // private
    static boolean fourOfAKind(
      String[] cards) {
        char test = cards[0].charAt(0);
        int f1 = 0;
        for (int i = 1; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == test) {
                ++f1;
            }
        }
        
        test = cards[4].charAt(0);
        int f2 = 0;
        for (int i = 3; i >= 0; --i) {
            if (cards[i].charAt(0)
                  == test) {
                ++f2;
            }
        }

        return (f1 == 3 || f2 == 3);
    }
    
    // private
    static boolean fullHouse(
      String[] cards) {
        char test1 = cards[0].charAt(0);
        char test2 = '0';
        
        int full1 = 0;
        for (int i = 1; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == test1) {
                ++full1;
            }
            else {
                test2
                  = cards[i].charAt(0);
            }
        }
        
        int full2 = -1;
        for (int i = 1; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == test2) {
                ++full2;
            }
        }
        
        return (full1 + full2 == 3
                  && full1 != 3
                    && full2 != 3);
    }
    
    // private
    static boolean flush(
      String[] cards) {
        boolean suit = true;
        for (int i = 1; i < 5; ++i) {
            suit = suit &&
              (cards[i].charAt(1)
                == cards[0].charAt(1));
        }
      
        return suit;
    }
    
    // private
    static boolean straight(
      String[] cards) {
        HashSet<Character> values
          = new HashSet<Character>();
        for (int i = 0; i < 5; ++i) {
            values.add(
              cards[i].charAt(0));
        }
        
        // not in straightFlush
        HashSet<Character> SSSSS
          = new HashSet<Character>();
        SSSSS.add('T'); SSSSS.add('J');
        SSSSS.add('Q'); SSSSS.add('K');
        SSSSS.add('A');
        
        boolean straight
          = values.equals(SSSSS);
          
        SSSSS.remove('A');
        SSSSS.add('9');
        straight = straight
          || values.equals(SSSSS);
        
        SSSSS.remove('K');
        SSSSS.add('8');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('Q');
        SSSSS.add('7');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('J');
        SSSSS.add('6');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('T');
        SSSSS.add('5');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('9');
        SSSSS.add('4');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('8');
        SSSSS.add('3');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('7');
        SSSSS.add('2');
        straight = straight
          || values.equals(SSSSS);
          
        SSSSS.remove('6');
        SSSSS.add('A');
        straight = straight
          || values.equals(SSSSS);
        
        return straight;
    }
    
    // private
    static boolean threeOfAKind(
      String[] cards) {
        char test1 = cards[0].charAt(0);
        char test2 = '0';
        
        HashSet<Integer> positions
          = new HashSet<Integer>();
        
        int t1 = 0;   // 0
        for (int i = 1; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == test1) {
                ++t1;
                positions.add(i);
            }
            else {
                test2
                  = cards[i].charAt(0);
            }
        }

	int t2 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test2) {
                ++t2;
                positions.add(i);
            }
            else {
                test1
                  = cards[i].charAt(0);
            }
        }
        
        int t3 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test1) {
                ++t3;
            }
        }
        
        return (t1 == 2 && t2 == 0
                  && t3 == 0)
            || (t1 == 0 && t2 == 2
                  && t3 == 0)
            || (t1 == 0 && t2 == 0
                  && t3 == 2);
    }
    
    // private
    static boolean twoPairs(
      String[] cards) {
        char test1 = cards[0].charAt(0);
        char test2 = '0';
        
        HashSet<Integer> positions
          = new HashSet<Integer>();
        
        int t1 = 0;   // 0
        for (int i = 1; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == test1) {
                ++t1;
                positions.add(i);
            }
            else {
                test2
                  = cards[i].charAt(0);
            }
        }
        
        int t2 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test2) {
                ++t2;
                positions.add(i);
            }
            else {
                test1
                  = cards[i].charAt(0);
            }
        }
        
        int t3 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test1) {
                ++t3;
            }
        }
        
        return (t1 == 1 && t2 == 1
                  && t3 == 0)
            || (t1 == 1 && t2 == 0
                  && t3 == 1)
            || (t1 == 0 && t2 == 1
                  && t3 == 1);
    }
    
    // private
    static boolean onePair(
      String[] cards) {
        char test1 = cards[0].charAt(0);
        char test2 = '0';
        
        HashSet<Integer> positions
          = new HashSet<Integer>();
        
        int t1 = 0;   // 0
        for (int i = 1; i < 5; ++i) {
            if (cards[i].charAt(0)
                  == test1) {
                ++t1;
                positions.add(i);
            }
            else {
                test2
                  = cards[i].charAt(0);
            }
        }
        
        int t2 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test2) {
                ++t2;
                positions.add(i);
            }
            else {
                test1
                  = cards[i].charAt(0);
            }
        }
        
        int t3 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test1) {
                ++t3;
                positions.add(i);
            }
            else {
                test2
                  = cards[i].charAt(0);
            }
        }
        
       	int t4 = -1;   // -1
        for (int i = 1; i < 5; ++i) {
            if (positions
                  .contains(i)) {
                continue;
            }
            else if (cards[i].charAt(0)
                       == test2) {
                ++t4;
            }
        }
        
        return (t1 == 1 && t2 == 0
                  && t3 == 0 && t4 == 0)
            || (t1 == 0 && t2 == 1
                  && t3 == 0 && t4 == 0)
            || (t1 == 0 && t2 == 0
                  && t3 == 1 && t4 == 0)
            || (t1 == 0 && t2 == 0
                  && t3 == 0
                    && t4 == 1);
    }
}