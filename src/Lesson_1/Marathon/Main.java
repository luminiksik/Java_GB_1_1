package Lesson_1.Marathon;

import Lesson_1.Marathon.Obstacles.Cross;
import Lesson_1.Marathon.Obstacles.Obstacle;
import Lesson_1.Marathon.Obstacles.Wall;
import Lesson_1.Marathon.Participants.Cat;
import Lesson_1.Marathon.Participants.Competitor;
import Lesson_1.Marathon.Participants.Dog;
import Lesson_1.Marathon.Participants.Human;

public class Main {
    public static void main(String[] args) {
        Team team = new Team(new Competitor[]{new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Cat("Васька")});
        Course c = new Course(new Obstacle[]{new Cross(80), new Wall(2), new Wall(1), new Cross(120)});
        c.doIt(team);
        team.showResults();
    }
}