package com.crickbuzz.matchdetails;

import com.crickbuzz.users.Player;

/** 
 * Represent a ball in an over.
 */
public class Ball {
    private Person balledBy;
    private Person playedBy;
    private BallType ballType;

    /**
     * Add commentry to this ball.
     * @param commentry     Commentry that we want to add to this ball.
     * 
     * @return Whether the addCommentry operation succeeded or failed.
     */
    public boolean addCommentry(Commentry commentry);
}