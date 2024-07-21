package org.tyutyunik;

public class Main {
    public static void main(String[] args) {
        FacultyGryffindor personHarryPotter = new FacultyGryffindor(
                "Harry Potter",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultyGryffindor personHermioneGranger = new FacultyGryffindor(
                "Hermione Granger",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultyGryffindor personRonWeasley = new FacultyGryffindor(
                "Ron Weasley",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );

        FacultySlytherin personDracoMalfoy = new FacultySlytherin(
                "Draco Malfoy",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultySlytherin personGrahamMontague = new FacultySlytherin(
                "Graham Montague",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultySlytherin personGregoryGoyle = new FacultySlytherin(
                "Gregory Goyle",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );

        FacultyPuffenduy personZachariahSmith = new FacultyPuffenduy(
                "Zachariah Smith",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultyPuffenduy personCedricDiggory = new FacultyPuffenduy(
                "Cedric Diggory",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultyPuffenduy personJustinFinchFletchley = new FacultyPuffenduy(
                "Justin Finch-Fletchley",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );

        FacultyKogtevran personZhouChang = new FacultyKogtevran(
                "Zhou Chang",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultyKogtevran personPadmaPatil = new FacultyKogtevran(
                "Padma Patil",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );
        FacultyKogtevran personMarcusBelby = new FacultyKogtevran(
                "Marcus Belby",
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100),
                (int) (Math.random() * 100)
        );

        System.out.println("Description of students:");
        personHarryPotter.printDescription();
        personHermioneGranger.printDescription();
        personRonWeasley.printDescription();

        personDracoMalfoy.printDescription();
        personGrahamMontague.printDescription();
        personGregoryGoyle.printDescription();

        personZachariahSmith.printDescription();
        personCedricDiggory.printDescription();
        personJustinFinchFletchley.printDescription();

        personZhouChang.printDescription();
        personPadmaPatil.printDescription();
        personMarcusBelby.printDescription();

        System.out.println("\nComparison of students by faculty characteristics:");
        FacultyGryffindor.comparePersons(personHarryPotter, personHermioneGranger);
        FacultyGryffindor.comparePersons(personHermioneGranger, personRonWeasley);
        FacultyGryffindor.comparePersons(personRonWeasley, personHarryPotter);

        FacultySlytherin.comparePersons(personDracoMalfoy, personGrahamMontague);
        FacultySlytherin.comparePersons(personGrahamMontague, personGregoryGoyle);
        FacultySlytherin.comparePersons(personGregoryGoyle, personDracoMalfoy);

        FacultyPuffenduy.comparePersons(personZachariahSmith, personCedricDiggory);
        FacultyPuffenduy.comparePersons(personCedricDiggory, personJustinFinchFletchley);
        FacultyPuffenduy.comparePersons(personJustinFinchFletchley, personZachariahSmith);

        FacultyKogtevran.comparePersons(personZhouChang, personPadmaPatil);
        FacultyKogtevran.comparePersons(personPadmaPatil, personMarcusBelby);
        FacultyKogtevran.comparePersons(personMarcusBelby, personZhouChang);

        System.out.println("\nComparison of students by personal characteristics:");
        PersonInHogwarts.comparePersons(personHarryPotter, personDracoMalfoy);
        PersonInHogwarts.comparePersons(personHermioneGranger, personGrahamMontague);
        PersonInHogwarts.comparePersons(personRonWeasley, personGregoryGoyle);

        PersonInHogwarts.comparePersons(personZachariahSmith, personZhouChang);
        PersonInHogwarts.comparePersons(personCedricDiggory, personPadmaPatil);
        PersonInHogwarts.comparePersons(personJustinFinchFletchley, personMarcusBelby);
    }
}