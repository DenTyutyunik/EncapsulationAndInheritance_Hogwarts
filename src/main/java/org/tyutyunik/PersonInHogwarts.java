package org.tyutyunik;

public class PersonInHogwarts {
    private String name;
    private int magicPower;
    private int transDistance;

    public PersonInHogwarts(String name, int magicPower, int transDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransDistance() {
        return transDistance;
    }

    public void printDescription() {
        System.out.printf("Student %s has following characteristics: Magic Power %s point(s), Trans Distance %s point(s)\n", name, magicPower, transDistance);
    }

    public static void comparePersons(PersonInHogwarts student1, PersonInHogwarts student2) {
        int student1Total = student1.getMagicPower() + student1.getTransDistance();
        int student2Total = student2.getMagicPower() + student2.getTransDistance();

        if (student1Total > student2Total) {
            System.out.printf("%s is a better magic person than %s\n", student1.getName(), student2.getName());
        } else if (student1Total < student2Total) {
            System.out.printf("%s is a better magic person than %s\n", student2.getName(), student1.getName());
        } else {
            System.out.printf("%s and %s are equally magic person\n", student1.getName(), student2.getName());
        }
    }
}
