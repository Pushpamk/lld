package com.crickbuzz.matchdetails;

/**
 * A over represent the ith over of the inning.
 */
 public class Over {
     private int overNumber;
     
     /**
      * Add a ball to a over.
      * @param ball     The ball to be added.
      * 
      * @return Wheter the addBall operation succeeded(True) or failed(False)
      */
    public boolean addBall(Ball ball);
 }