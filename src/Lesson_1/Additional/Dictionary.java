package Lesson_1.Additional;

import java.util.ArrayList;

public class Dictionary {

    ArrayList<Character> dictionary = new ArrayList<>();

    public Dictionary(){
        //Латиница
        dictionary.add('a');
        dictionary.add('A');
        dictionary.add('e');
        dictionary.add('E');
        dictionary.add('i');
        dictionary.add('I');
        dictionary.add('o');
        dictionary.add('O');
        dictionary.add('u');
        dictionary.add('U');
        dictionary.add('y');
        dictionary.add('Y');


        //Кирилица
        dictionary.add('у');
        dictionary.add('У');
        dictionary.add('е');
        dictionary.add('Е');
        dictionary.add('ы');
        dictionary.add('Ы');
        dictionary.add('а');
        dictionary.add('А');
        dictionary.add('о');
        dictionary.add('О');
        dictionary.add('я');
        dictionary.add('Я');
        dictionary.add('и');
        dictionary.add('И');
        dictionary.add('ю');
        dictionary.add('Ю');
    }
}
