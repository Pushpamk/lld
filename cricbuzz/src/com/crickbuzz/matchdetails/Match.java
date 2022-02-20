package com.crickbuzz.matchdetails;

import java.util.Date;

import com.crickbuzz.enums.MatchResult;

/**
* Represent a match in a tournament.
* A match can be only in single tournament.
*/

public class Match {
    private Date startDate;
    private MatchResult matchResult;

    /**
     * Assign this match to a stadium with the given stadium.
     * @param stadium   The stadium to be assigned.
     * 
     * @return Whether the assign stadium operation succeeded(True) or failed(False)
     */s
    public boolean assignStadium(Stadium stadium);
}