package org.tyutyunik;

public class FacultyPuffenduy extends PersonInHogwarts {
    private int levelWorkLoving;
    private int levelLoyalty;
    private int levelHonesty;

    public FacultyPuffenduy(String name, int magicPower, int transDistance, int levelWorkLoving, int levelLoyalty, int levelHonesty) {
        super(name, magicPower, transDistance);
        this.levelWorkLoving = levelWorkLoving;
        this.levelLoyalty = levelLoyalty;
        this.levelHonesty = levelHonesty;
    }

    public int getLevelWorkLoving() {
        return levelWorkLoving;
    }

    public int getLevelLoyalty() {
        return levelLoyalty;
    }

    public int getLevelHonesty() {
        return levelHonesty;
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.printf("And individual characteristics: Work loving: %s point(s), Loyalty %s point(s), Honesty %s point(s)\n", levelWorkLoving, levelLoyalty, levelHonesty);
    }

    public static void comparePersons(FacultyPuffenduy student1, FacultyPuffenduy student2) {
        int student1Total = student1.getLevelWorkLoving() + student1.getLevelLoyalty() + student1.getLevelHonesty();
        int student2Total = student2.getLevelWorkLoving() + student2.getLevelLoyalty() + student2.getLevelHonesty();

        if (student1Total > student2Total) {
            System.out.printf("%s is a better Puffenduy's person than %s\n", student1.getName(), student2.getName());
        } else if (student1Total < student2Total) {
            System.out.printf("%s is a better Puffenduy's person than %s\n", student2.getName(), student1.getName());
        } else {
            System.out.printf("%s and %s are equally Puffenduy's person\n", student1.getName(), student2.getName());
        }
    }
}
