
void setup() {
     ellipseMode(CENTER);
     size(500, 500);
     background(160, 160, 160);
     drawFlower(350, 100);
}

void draw() {
  
// First run the program and you should see a flower.  
  
  
/* Then, use a loop to make a body for the Bee! 
(see the image on the recipe, it's a diagonal line of circles)
Use remainder to make the colors alternate between yellow and black
*/
 fill(#000000);
  ellipse(400, 400, 50, 50);
  //Use an if statement and remainder to alternate the color of your rings.
  int number = 385;
  for (int i=500; i>=0; i-=5){
    if (i % 2 == 0) {    
      fill(#FFF300);
    } 
    else {
      System.out.println("number is odd");
        fill(#000000); 
  }
   ellipse(number, number, 50, 50);
   if (i % 20 == 0) {
     System.out.println("20 more repeats completed");
      number -= 15;
    }
  }

/*
Now put his head on using drawBeeFace(x,y)
*/
 drawBeeFace(415,415);
}

/**************   Use these methods but  DON'T CHANGE THE CODE BELOW  **************/

void drawFlower(int x, int y) {
     noStroke();
     translate(x, y);
     // draw 5 petals, rotating after each one
     fill(#c6ff89);      // green
      for (int i = 0; i < 5; i++) {
           ellipse(0, -40, 50, 50);
          rotate(radians(72));
     }
     fill(#fff9bb); // light yellow
    ellipse(0, 0, 50, 50);
} 


void drawBeeFace(int BeeFaceX, int BeeFaceY) {
     noStroke();
     fill(0, 0, 0);
     stroke(1);
     strokeWeight(5);
     line(BeeFaceX-10, BeeFaceY-27, BeeFaceX-17, BeeFaceY-50);
     line(BeeFaceX+10, BeeFaceY-27, BeeFaceX+17, BeeFaceY-50);
     ellipse(BeeFaceX-17, BeeFaceY-50, 10, 10);
     ellipse(BeeFaceX+17, BeeFaceY-50, 10, 10);
     noStroke();
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY, 60, 60); // face
     fill(255, 237, 209);
     fill(0,0,0);
      ellipse(BeeFaceX-10, BeeFaceY-15, 10, 10); // eyes
     ellipse(BeeFaceX+10, BeeFaceY-15, 10, 10);
      ellipse(BeeFaceX, BeeFaceY-5, 10, 10); // nose
      ellipse(BeeFaceX, BeeFaceY+10, 20, 10);// mouth
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY+5, 20, 6);
}
