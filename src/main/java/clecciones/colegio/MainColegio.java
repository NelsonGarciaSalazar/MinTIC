package clecciones.colegio;

public class MainColegio {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();

        colegio.addNationalityStudent("Colombia");
        colegio.addNationalityStudent("Colombia");
        colegio.addNationalityStudent("Colombia");
        colegio.addNationalityStudent("Brasil");
        colegio.addNationalityStudent("Brasil");
        colegio.addNationalityStudent("Brasil");
        colegio.addNationalityStudent("España");

        colegio.showAll();
        colegio.several();
        colegio.showNationality("Brasil");
        colegio.delete();
        colegio.showAll();
    }
}
