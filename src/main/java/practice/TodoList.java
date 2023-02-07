package practice;

import java.util.ArrayList;
import java.util.Stack;

public class TodoList {

 private  ArrayList<String> todoList = new ArrayList<>();


    public void add( String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
    }

    public void add(int index, String todo) {

        if (  todoList.size()  > index - 1 ) {

            todoList.add(index,todo);
        }

        else {
            todoList.add(todo);
        }

        // TODO: добавьте дело на указаный индекс,


        // TODO: проверьте возможность добавления
    }

    public void edit( int index, String todo) {

        if ( todoList.size()  > index - 1 ) {

            todoList.set(index,todo);
        }

        else {
            System.out.println("количество индексов = " + todoList.size() + " изменить данный элемент не возможно");
        }
        // TODO: заменить дело на index переданным todo индекс,


        //  TODO: проверьте возможность изменения
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,

        if (  todoList.size()  > index + 1 ){
            todoList.remove(index);
        }
        else
            System.out.println("Данного индекса нет в списке");

        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        /*ArrayList <String> list = new ArrayList<>();

        for (String item : todoList)
            list.add(todoList.indexOf(item) + " - "+item);*/

        return  todoList;
    }

}