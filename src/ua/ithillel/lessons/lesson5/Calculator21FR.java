package ua.ithillel.lessons.lesson5;

public class Calculator21FR extends Calculator21{

    public final String THIS_LANGUAGE = LANGUAGE_FR;

    public String getTHIS_LANGUAGE(){
        return THIS_LANGUAGE;
    }

    public void toConsole(){
        String[] homeMessage = new String[]{
                "| Opérations disponibles: + - * /",
                "| Commandes\t| La description",
                "| help\t\t| Appeler à l'aide",
                "| exit\t\t| Sortir du programme",
                "| m\t\t\t| Enregistrer le résultat en mémoire",
                "| m+\t\t| Ajouter le résultat à la mémoire",
                "| m-\t\t| Soustraire le résultat de la mémoire",
                "| mc\t\t| Mémoire claire",
                "| Saisir les données du formulaire:\topérande1 opérateur opérande2",
                "| \t\t\t\t\t\t\t\t\t\"memory\" opérateur opérande2",
                "| \t\t\t\t\t\t\t\t\topérande1 opérateur \"memory\"",
                "| Par exemple: memory+658.7",
                "| Ou entrez l'une des commandes",
                "| Par exemple: m+",
                "| Minerai entrer la langue de l'interface (en, de, fr, ita)"
        };
        for (String line: homeMessage){
            System.out.println(line);
        }
    }

    public void toConsole (double result){
        System.out.println("Résultat: " + result);
    }

    public void toConsole (double memory, double result){
        System.out.println("Mémoire: " + memory);
        System.out.println("Résultat: " + result);
    }

    public void toConsoleDataInput (){
        System.out.print("> Entrez vos données: ");
    }
}
