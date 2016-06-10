import java.util.*;
public class Temple{
  public static void main(String[] args){
    int zen=0;
    int money=100;
    int day=0;
    Scanner player = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = player.nextLine();
    System.out.println("Boss: "+name+" you were a good worker, I am sad you are leaving the company. Good luck on becoming a monk.");
    System.out.println("Boss: "+name+" you get 30day.");
    Player p1 = new Player(name,money,zen,day);

  }}
