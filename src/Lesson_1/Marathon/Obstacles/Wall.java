package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Participants.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
