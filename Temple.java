import java.util.*;
public class Temple{
  public static void main(String[] args){
    int day=0;
    Scanner player = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = player.nextLine();
    Player p1 = new Player(name);
    System.out.println("Boss: "+p1.name+" you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk.");
    System.out.println("Boss: "+p1.name+" you get 30day.");
    p1.money=100;
    p1.zen=0;
    p1.day=0;
    p1.end=0;
    while(p1.day<30){
      p1.day++;
      System.out.println(p1.day+" day");
      if(p1.end==0){
        temple(p1);}
      if(p1.end==1){
        small_temple(p1);}
      else if(p1.end==2){
        big_temple(p1);
        if(p1.zen>=100){
          System.out.println("Congrats, you became a master monk in "+p1.day+" turns.");
          break;
        }
      }
    }
    if(p1.day==5){
      System.out.println("You ran out of money before becoming a master in 30 turns.");
    }
  }
  
  public static void temple(Player x){
    System.out.println("You have $"+x.money+" and "+x.zen+" Zen points");
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
                System.out.println("Collecting 3 eZen");
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
    }
    
    
    
    
    
  }
  
  public static void small_temple(Player x){
    x.zen=x.zen+3;
    System.out.println("You have $"+x.money+" and "+x.zen+" Zen points");
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
              x.money=x.money-70;
              x.end=x.end+1;
              break;
            }
            else if(temple_choice==2){
              break;
            }           
      }
    }
    else{
      continue;}
    
    
  }
  
  
  System.out.println("Collecting from all temples...");
  System.out.println("Collecting 3 eZen");
  System.out.println("Done collecting from temples...");
  break;
  
}





}
   public static void big_temple(Player x){
     x.zen=x.zen+3;
     System.out.println("You have $"+x.money+" and "+x.zen+" Zen points");
     System.out.println("What would you like to do?");
     System.out.println("Meditate 0$ -> Press 1");
     System.out.println("Help Someone -10$ -> Press 2");
     System.out.println("Work at Company +$50, -30 Zen -> Press 3");
     while(x.end==2){
       Scanner player_number = new Scanner(System.in);
       System.out.print("");
       int player_choice = player_number.nextInt();
       if (player_choice<=3 && player_choice >0){
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
         
         else{
           continue;}
         
         
       }
       
       
       System.out.println("Collecting from all temples...");
       System.out.println("Collecting $15 and 5 Zen");
       System.out.println("Done collecting from temples...");
       break;
       
     }
     
     
     
     
     
   }
   
   
   }
