package practice;

import java.util.Scanner;


public class Main {

    private static TodoList function = new TodoList();

    public static void main(String[] args) {

        while (true) {


            System.out.println("Введите команду");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();
            String[] words = command.split("\\s");


            if (words[0].equals("ADD")) {
                String regex = "[0-9]+";
                String text = "";
                if (words[1].matches(regex)) {
                    for (int i = 2; i != words.length; i++) {

                        text += words[i] + " ";

                    }
                    function.add(Integer.parseInt(words[1]), text);


                } else {
                    for (int i = 1; i != words.length; i++) {
                        text += words[i] + " ";
                    }
                    function.add(text);
                }


            } else if (words[0].equals("LIST")) {


                for (String intem : function.getTodos()){
                    System.out.println(intem);
                }


            } else if (words[0].equals("EDIT")) {

                String text = "";
                for (int i = 2; i != words.length; i++) {
                    text += words[i] + " ";
                }
                function.edit(Integer.parseInt(words[1]), text);


            } else if (words[0].equals("DELETE")) {

                function.delete(Integer.parseInt(words[1]));

            } else {
                System.out.println("Данной команды не существует");
            }


        }

    }
}
