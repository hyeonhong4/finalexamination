import java.util.*;
public class Player{
  String name;
  int money;
  int zen;
  int end;
  int day;
  public Player(String name,int money, int zen,int day,int end){
    this.name = name;
    this.money=money;
    this.zen=zen;
    this.end=end;
    this.day=day;
    if(this.end==0){
      temple(this);}
    
  }



public void temple(Player x){
  while(x.day<=30){
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
    while(x.end==0){
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
          System.out.println("A small temple generates 3 zen each turn.");
          System.out.println("Do you want a small (-$30, press 1) temple? You not want small temple -> press 2.");
          while(true){
            Scanner temple = new Scanner(System.in);
            System.out.print("");
            int temple_choice = temple.nextInt();
            if(temple_choice==1){
              x.money=x.money-30;
              x.end=x.end+1;
              System.out.println("Collecting 3 Zen");
              if(x.end==1){
                Smalltemple p2 = new Smalltemple(x.name,x.money,x.zen,x.day,x.end);}
              break;
            }
            else if(temple_choice==2){
              break;}
          }
        }
        else{
          continue;}
      }
      System.out.println("Collecting from all temples...");
      System.out.println("Done collecting from temples...");       
      break;
    }x.day++;
  }
}
}