package com.crickscore.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "crick_matches")
public class Match
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;

    private String teamHeading;
    private String matchNumberVenue;

    private String battingTeam;

    private String battingTeamScore;

    private String bowlTeam;
    private String bowlTeamScore;

    private String liveText;

    private String matchLink;

    private String textComplete;

    @Enumerated
    private MatchStatus status;


    private Date date=new Date();



    public void setMatchStatus() {
        if (this.textComplete.trim().isBlank()) {
            this.status = MatchStatus.LIVE;
        } else {
            this.status = MatchStatus.COMPLETED;
        }
    }


    public void setTeamHeading(String teamsHeading) {
        this.teamHeading=teamsHeading;
    }

    public void setMatchNumberVenue(String matchNumberVenue) {
        this.matchNumberVenue=matchNumberVenue;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam=battingTeam;
    }

    public void setBattingTeamScore(String score) {
        this.battingTeamScore=score;
    }

    public void setBowlTeam(String bowlTeam) {
        this.bowlTeam=bowlTeam;
    }

    public void setBowlTeamScore(String bowlTeamScore) {
        this.bowlTeamScore=bowlTeamScore;
    }

    public void setLiveText(String textLive) {
        this.liveText=textLive;
    }

    public void setMatchLink(String matchLink) {
        this.matchLink=matchLink;
    }

    public void setTextComplete(String textComplete) {
        this.textComplete=textComplete;
    }

    public String getTeamHeading() {
        return teamHeading;
    }

    public Object getMatchId() {
        return matchId;
    }

    public void setMatchId(Object matchId) {
        this.matchId= (int) matchId;
    }
}
