import processing.core.PApplet;

public class Avoider {
    private int x;
    private int y;
    private int size;
    private PApplet canvas;
    private int speed;
    private int health;
    private int color;
    

    public Avoider(int xPos, int yPos, PApplet c) {
        x = 50;
        y = 300;
        size = 50;
        canvas = c;
        color =  canvas.color(0,255,0);
        health = 3;
    
    }


    public void display() {
       canvas.fill(255);
       canvas.rect(x,y,size,size);
       if (health == 2) {
        color = canvas.color(255,255,0);
       } else if(health ==1) {
        color = canvas.color(255,0,0);
       }
       
    }
    // chat for moveUp, moveDown, and stop
    public void moveUp() {
        speed = -50;
    }
    public void moveDown() {
        speed = 50;
    }
    public void stop() {
        speed = 0;
    }
    public void update() {
        y += speed;
       color = randomcolor();
        health --;
 
    }

    public int randomcolor() {
      return canvas.color(canvas.random(255),canvas.random(255),canvas.random(255));
    }

}
