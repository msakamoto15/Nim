public class NimGame//NimGame class 
{
  
  public NimGame()
  {
  }
  public int play(int pieces)
  {
    
     //if (total = 11 || 8 || 5 || 2) //numbers for when computer takes 1
  //{
    //comptake = 1;
    //total -= comptake;
  //}
  
  //if (total = 12 || 9 || 6 || 3) //numbers for when computer takes 2
  //{
    //comptake = 2;
    //total -= comptake;

    int set = (pieces % 3);//devides number of pieces left by 3 to find the remainder
    int take = 0;
    if(set == 0){//determines how many piece the computer will take based on the remainder 
      take  = 2;}
    if(set == 1){//determines how many piece the computer will take based on the remainder
      take = (int)(Math.random()*2)+1;}
    if(set == 2){//determines how many piece the computer will take based on the remainder
      take = 1;}
    
    return take;//tells how much you took
  }
}




    
  