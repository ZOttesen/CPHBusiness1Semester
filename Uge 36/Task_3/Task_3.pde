int red = #FF1212;
int yellow = #FFF700;
int green = #07E31E;
int black = 0;

boolean R = false;
boolean Y = false;
boolean G = false;


void setup(){
  size(200,200);                    //Size of the window.
  background(255);                  //Background colour (White)
  fill(150);                        //Cone colour (Gray)
  rectMode(CENTER);                 
  rect(100,100,50,150);
}


void draw()
{ 
  if (R==true) fill(red);
  else fill(black);
  ellipseMode(CENTER);              
  ellipse(100,50,40,40);  
  
  if (Y==true) fill(yellow);
  else fill(black);
  ellipseMode(CENTER);             
  ellipse(100,100,40,40);      
  
  if (G==true) fill(green);
  else fill(black);
  ellipseMode(CENTER);              
  ellipse(100,150,40,40);  
  changeColour();
}

void changeColour()
{
  if(R==false && Y==false && G==false) R=!R;
  else if (R==true && Y==false && G==false){
    Y=true;
    delay(1500);
  }
  else if(R==true && Y==true && G==false){
    R=false;
    Y=false;
    G=true;
    delay(5000);
  }
  else if (R==false && Y==false && G==true){
    Y=true;
    G=false;
    delay(1500);
  }
  else if (R==false && Y==true && G==false){
    Y=false;
    R=true;
    delay(5000);
  }
}
