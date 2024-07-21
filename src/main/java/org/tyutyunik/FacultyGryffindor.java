package org.tyutyunik;

public class FacultyGryffindor extends PersonInHogwarts {
    private int levelNobility;
    private int levelHonor;
    private int levelBravery;

    public FacultyGryffindor(String name, int magicPower, int transDistance, int levelNobility, int levelHonor, int levelBravery) {
        super(name, magicPower, transDistance);
        this.levelNobility = levelNobility;
        this.levelHonor = levelHonor;
        this.levelBravery = levelBravery;
    }

    public int getLevelNobility() {
        return levelNobility;
    }

    public int getLevelHonor() {
        return levelHonor;
    }

    public int getLevelBravery() {
        return levelBravery;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.printf("And faculty characteristics: Nobility %s point(s), Honor %s point(s), Bravery %s point(s)\n", levelNobility, levelHonor, levelBravery);
    }

    public static void comparePersons(FacultyGryffindor student1, FacultyGryffindor student2) {
        int student1Total = student1.getLevelNobility() + student1.getLevelHonor() + student1.getLevelBravery();
        int student2Total = student2.getLevelNobility() + student2.getLevelHonor() + student2.getLevelBravery();

        if (student1Total > student2Total) {
            System.out.printf("%s is a better Gryffindor's person than %s\n", student1.getName(), student2.getName());
        } else if (student1Total < student2Total) {
            System.out.printf("%s is a better Gryffindor's person than %s\n", student2.getName(), student1.getName());
        } else {
            System.out.printf("%s and %s are equally Gryffindors's person\n", student1.getName(), student2.getName());
        }
    }
}
