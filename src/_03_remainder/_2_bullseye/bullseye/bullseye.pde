
void setup() {
  size(500, 500);
  // set the size of your sketch
}

void draw() {


  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  fill(#000000);
  ellipse(250, 250, 500, 500);
  //Use an if statement and remainder to alternate the color of your rings.
  int number =499;
  for (int i=500; i>=0; i-=5) {

    if (i % 2 == 0) {    
      fill(#000000);
    } 
    else {
      System.out.println("number is odd");
        fill(#FF0000); 
  }
    ellipse(250, 250, i, i);
   if (i % 20 == 0) {
      System.out.println("20 more repeats completed");
      number -= 10;
    }
  }
}
