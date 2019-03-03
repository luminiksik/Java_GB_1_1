package Lesson_1.Marathon;

import Lesson_1.Marathon.Obstacles.Obstacle;
import Lesson_1.Marathon.Participants.Competitor;

public class Course {
    Obstacle[] course;

    public Course(Obstacle[] course) {
        this.course = course;
    }

    public void doIt(Team team) {
        for (Competitor c : team.team) {
            for (Obstacle o : course) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }

}
