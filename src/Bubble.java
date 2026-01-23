import processing.core.PApplet;

public class Bubble {
   private int x;
   private int y;
   private int size;
   private PApplet canvas;
   private int speed;
  
  
    

    public Bubble(int xPos, int yPos, PApplet c) {
      x = xPos;
      y = yPos;
      size = 60;
      canvas = c;
      speed = 8;
      
    }

  public void display() {
        canvas.fill(255,0,0);
        canvas.circle(x,y,size);

    }

    public void update() {
      x += speed;
      if (x > canvas.width) {
         speed = -speed;
      
      }
      if (x < 0) {
         x = canvas.width;
      }
    }
    

    


}