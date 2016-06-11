import java.util.*;
public class Smalltemple extends Player{
  public Smalltemple(String name,int money, int zen,int day,int end){
    super(name,money,zen,day,end);
    if(this.end==1){
    System.out.println("congret!");
    smalltemple(this);
    }}
    
  

  public void smalltemple(Player x){
  while(x.day<=30 ){
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
    while(x.end==1){
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
          System.out.println("A big temple generates $15 and 5 zen each turn.");
          System.out.println("Do you want a big (-$70, press 1) temple? You not want big temple -> press 2.");
          while(true){
            Scanner temple = new Scanner(System.in);
            System.out.print("");
            int temple_choice = temple.nextInt();
            if(temple_choice==1){
              x.money=x.money-30;
              x.end=x.end+1;
              System.out.println("Collecting $15 and 5 Zen");
              if(x.end==2){
                BigTemple p2 = new BigTemple(x.name,x.money,x.zen,x.day,x.end);}
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
      System.out.println("Collecting 3 Zen");
      System.out.println("Done collecting from temples...");       
      break;
    }
  x.day++;
  x.zen=x.zen+3;
  }
}
}