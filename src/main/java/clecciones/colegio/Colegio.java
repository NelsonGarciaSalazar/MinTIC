package clecciones.colegio;

import lombok.Data;

import java.util.*;

@Data
public class Colegio {

    private LinkedList< String> listNationality = new LinkedList<>();

    public void addNationalityStudent(String nationality){

        listNationality.add(nationality.toUpperCase());
    }

    public void showAll(){
        Set<String> setNationalities = new TreeSet<>(listNationality);
        for (String nationality:setNationalities) {
            System.out.println(nationality + "->" +Collections.frequency(listNationality,nationality));
        }
    }

    public void showNationality(String nationality){
        System.out.println(nationality + "->" +Collections.frequency(listNationality,nationality.toUpperCase()));
    }

    public void several(){
        Set<Object> setNationalities = new TreeSet<>(listNationality);
        System.out.println("Diferentes Nacionalidades" + setNationalities.size());

        // This is same to up
        System.out.println("Diferentes Nacionalidades" + new TreeSet<>(listNationality).size());
    }

    public void delete(){
        listNationality.clear();
    }

}
