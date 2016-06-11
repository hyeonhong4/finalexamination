import java.util.*;
public class BigTemple extends Smalltemple{
  public BigTemple(String name,int money, int zen,int day,int end){
    super(name,money,zen,day,end);
    System.out.println("congret!big!");
    if(this.end==2){
    bigtemple(this);
    }}
    
  

  public void bigtemple(Player x){
  while(x.day<=30){
    if(x.zen>=100){
    System.out.println("Congrats, you became a master monk in "+x.day+" turns.");
      break;}
    if(x.day==30){
      System.out.println("You ran out of money before becoming a master in 30 turns.");
      break;}
    System.out.println(x.day+"Days");
    System.out.println("You have $"+this.money+" and "+this.zen+" Zen points");
    System.out.println("What would you like to do?");
    System.out.println("Meditate 0$ -> Press 1");
    System.out.println("Help Someone -10$ -> Press 2");
    System.out.println("Work at Company +$50, -30 Zen -> Press 3");
    System.out.println("Purchase Temple -> Press 4");
    while(x.end==2){
      Scanner player_number = new Scanner(System.in);
      System.out.print("");
      int player_choice = player_number.nextInt();
      if (player_choice<=4 && player_choice >0){
        if (player_choice==1){
          x.zen=x.zen+1;
        }
        else if (player_choice==2){
          x.money=x.money-10;
          x.zen=x.zen+5;
        }
        else if (player_choice==3){
          x.money=x.money+50;
          x.zen=x.zen-30;
        }
        else if (player_choice==4){
          System.out.println("You not buy new Temple");
        }
        else{
          continue;}
      }
      System.out.println("Collecting from all temples...");
      System.out.println("Collecting $15 and 5 Zen");
      System.out.println("Done collecting from temples...");       
      break;
    }
  x.day++;
  x.money=x.money+15;
  x.zen=x.zen+5;
  }
}
}