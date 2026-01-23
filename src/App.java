import java.util.ArrayList;
import processing.core.*;

public class App extends PApplet {
Bubble first;
Avoider player;
ArrayList<Bubble> bubbles;
ArrayList<Avoider> avoiders;


    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(1400, 900);
    }

    public void setup() {
      first = new Bubble(150, 200, this);
      bubbles = new ArrayList<>();

      avoiders = new ArrayList<>();
    //   chat
      avoiders.add(new Avoider(20,500,this)); 
        

    }

    public void draw() {
        background(0);
        
        first.display();
        first.update();
        
        for (Bubble b : bubbles) {
            b.display();
            b.update();
            
        }
          

          for (Avoider a : avoiders) {
            a.display();
            a.update();
            a.moveDown();
            a.moveUp();
            a.stop();

          }

          

          
            
          
    }
        
         

         
    

public void keyPressed() {
    // chat just on "Avoider player..."
    Avoider player = avoiders.get(0);
    if (key == ' ') {
        int x = (int) random(1000);
        int y = (int) random(800);

        Bubble bubble = new Bubble(x, y, this);
        bubbles.add(bubble);
    }
    if (key == 'w') {
    player.moveUp(); 
    // chat for moveup/moveDown

}

if (key == 's') {
    player.moveDown();
}
}


}
