package ua.ithillel.lessons.lesson3;

public class TaskOne {
    public static void main(String[] args) {
        String[] newText = {
                ",ежоБA,ябетAюрадогалБ",
                ",меьтяпсарAдерпAьсялоМ",
                ",яьнахыдAеьтсачсAаЗ",
                ",ирузалAьтселерпAаЗ",
                ",ежортсAенмAокAьдубAеН",
                ",мяьтарбAмиовсAкAяAмеЧ",
                ",яьнадартсAтоAьвабзИ",
                ",ерубAвAмечотевсAьдуБ",
                "абелхAогонщусаН",
                ",удубAенAадAнешиЛ",
                ",ыдобовсAагалбAиН",
                ";ецинметAвA,хазележAВ",
                "обенAенмAьтедивAйаД",
                "удучAумонсяAИ",
                "ыдорирпAйонтремссеБ",
                ".ясьтивидAонвендесВ",
                "еримAвA—AовтсежумAйаД",
                ",онсачесвAмылтевсAьтыБ",
                ",оледAеовсAьташревС",
                ",енмAигомопAьтепAИ",
                ",ерилAйоннемалпAаН",
                ",онсаркерпAотчA,есвA,есВ",
                ",олетAиAушудAИ",
                "!енмигAмоннеремзарAВ",
                "7191AьрбятнеСA.восюрБAйирелаВ"
        };
        String[] newTextAfterReplace = new String[newText.length];
        String[] newTextAfterRevers = new String[newText.length];
        String[][] newTextAfterSplit = new String[newText.length][];
        for (int i=0; i<newText.length; i++){
            newTextAfterReplace[i] = newText[i].replace('A', ' ');
            newTextAfterRevers[i] = new StringBuilder(newTextAfterReplace[i]).reverse().toString();
            newTextAfterSplit[i] = newTextAfterRevers[i].split(" ");
        }

        StringBuilder[] resultText = new StringBuilder[newTextAfterSplit.length];
        for (int i=0; i<resultText.length; i++){
            resultText[i] = new StringBuilder("");
        }
        for (int i=0; i<newTextAfterSplit.length; i++){
            for (int j=0; j<newTextAfterSplit[i].length; j++){
                resultText[i].append(newTextAfterSplit[i][j]).append(" ");
            }
        }
        for (StringBuilder str: resultText){
            System.out.println(str.toString());
        }
    }
}
