package practice;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoList = new ArrayList<>();


    public void add(String todo) {

        todoList.add(todo);
    }

    public void add(int index, String todo) {

        if (todoList.size() > index - 1) {

            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }


    }

    public void edit(int index, String todo) {

        if (todoList.size() > index - 1) {

            todoList.set(index, todo);
        } else {
            System.out.println("количество индексов = " + todoList.size() + " изменить данный элемент не возможно");
        }


    }

    public void delete(int index) {

        if (todoList.size() > index + 1) {
            todoList.remove(index);
        } else
        {
            System.out.println("Данного индекса нет в списке");
        }

    }

    public ArrayList<String> getTodos() {

        return todoList;
    }

}