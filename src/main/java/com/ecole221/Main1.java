package com.ecole221;

import com.ecole221.service.DBHelper;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisir le libelle de la filiére");
            String libelle = sc.nextLine();
            FiliereService filiereService = new FiliereService();
            if (filiereService.findFiliereByLibelle(libelle)) {
                filiereService.addFiliere(libelle);
            }
            else {
                System.out.println("Cette filiere existe dejà");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("webooksssssssssssssssss");
        }
    }
}
