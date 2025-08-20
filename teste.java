package zoologico;

import java.util.*;

public class teste{
    public static void main(String[] args){
       Zelador ze = new Zelador();

       Alimentavel[] animais = new Alimentavel[10];
       
       Alimentavel gi = new Girafa();
       animais[1] = gi;
       Alimentavel le = new Leao();
       animais[2] = le;
       
       int x = 0;
       
       for (x = 0 ; x < 10; x = x + 1) {
        if (animais[x] == null){ 
        }
        else{
            ze.alimentar(animais[x]);
        }
    }
  }
}
