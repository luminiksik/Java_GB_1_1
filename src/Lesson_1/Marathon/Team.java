package Lesson_1.Marathon;

import Lesson_1.Marathon.Participants.Competitor;

public class Team {
    Competitor[] team;

    public Team(Competitor[] team) {
        this.team = team;
    }

    // информация о всей команде
    public void info(){
        for (Competitor c : team){
            c.info();
        }
    }

    // информация о членах комнеды, которые прошли дистанцию
    public void showResults(){
        for (Competitor c : team){
            if (c.isOnDistance()) {
                c.info();
            }
        }
    }
}
