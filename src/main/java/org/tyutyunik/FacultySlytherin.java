package org.tyutyunik;

public class FacultySlytherin extends PersonInHogwarts {
    private int levelCunning;
    private int levelDetermination;
    private int levelAmbition;
    private int levelResourcefulness;
    private int levelLustOfPower;

    public FacultySlytherin(String name, int magicPower, int transDistance, int levelCunning, int levelDetermination, int levelAmbition, int levelResourcefulness, int levelLustOfPower) {
        super(name, magicPower, transDistance);
        this.levelCunning = levelCunning;
        this.levelDetermination = levelDetermination;
        this.levelAmbition = levelAmbition;
        this.levelResourcefulness = levelResourcefulness;
        this.levelLustOfPower = levelLustOfPower;
    }

    public int getLevelCunning() {
        return levelCunning;
    }

    public int getLevelDetermination() {
        return levelDetermination;
    }

    public int getLevelAmbition() {
        return levelAmbition;
    }

    public int getLevelResourcefulness() {
        return levelResourcefulness;
    }

    public int getLevelLustOfPower() {
        return levelLustOfPower;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.printf("And individual characteristics: Cunning %s point(s), Determination %s point(s), Ambition %s point(s), Resourcefulness %s point(s), Lust of Power %s point(s)\n", levelCunning, levelDetermination, levelAmbition, levelResourcefulness, levelLustOfPower);
    }

    public static void comparePersons(FacultySlytherin student1, FacultySlytherin student2) {
        int student1Total = student1.getLevelCunning() + student1.getLevelDetermination() + student1.getLevelAmbition() + student1.getLevelResourcefulness() + student1.getLevelLustOfPower();
        int student2Total = student2.getLevelCunning() + student2.getLevelDetermination() + student2.getLevelAmbition() + student2.getLevelResourcefulness() + student2.getLevelLustOfPower();

        if (student1Total > student2Total) {
            System.out.printf("%s is a better Slytherin's person than %s\n", student1.getName(), student2.getName());
        } else if (student1Total < student2Total) {
            System.out.printf("%s is a better Slytherin's person than %s\n", student2.getName(), student1.getName());
        } else {
            System.out.printf("%s and %s are equally good Slytherin's person\n", student1.getName(), student2.getName());
        }
    }
}
