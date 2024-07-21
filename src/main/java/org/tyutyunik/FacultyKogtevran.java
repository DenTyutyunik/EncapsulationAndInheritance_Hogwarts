package org.tyutyunik;

public class FacultyKogtevran extends PersonInHogwarts {
    private int levelMind;
    private int levelWisdom;
    private int levelMindOnTheEdge;
    private int levelCreativity;

    public FacultyKogtevran(String name, int magicPower, int transDistance, int levelMind, int levelWisdom, int levelMindOnTheEdge, int levelCreativity) {
        super(name, magicPower, transDistance);
        this.levelMind = levelMind;
        this.levelWisdom = levelWisdom;
        this.levelMindOnTheEdge = levelMindOnTheEdge;
        this.levelCreativity = levelCreativity;
    }

    public int getLevelMind() {
        return levelMind;
    }

    public int getLevelWisdom() {
        return levelWisdom;
    }

    public int getLevelMindOnTheEdge() {
        return levelMindOnTheEdge;
    }

    public int getLevelCreativity() {
        return levelCreativity;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.printf("And individual characteristics: Mind: %s point(s), Wisdom %s point(s), Mind on the edge %s point(s), Creativity %s point(s)\n", levelMind, levelWisdom, levelMindOnTheEdge, levelCreativity);
    }

    public static void comparePersons(FacultyKogtevran student1, FacultyKogtevran student2) {
        int student1Total = student1.getLevelMind() + student1.getLevelWisdom() + student1.getLevelMindOnTheEdge() + student1.getLevelCreativity();
        int student2Total = student2.getLevelMind() + student2.getLevelWisdom() + student2.getLevelMindOnTheEdge() + student2.getLevelCreativity();

        if (student1Total > student2Total) {
            System.out.printf("%s is a better Kogtevran's person than %s\n", student1.getName(), student2.getName());
        } else if (student1Total < student2Total) {
            System.out.printf("%s is a better Kogtevran's person than %s\n", student2.getName(), student1.getName());
        } else {
            System.out.printf("%s and %s are equally Kogtevran's person\n", student1.getName(), student2.getName());
        }
    }
}
