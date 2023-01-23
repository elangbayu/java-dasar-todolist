package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Elang Bayu Segara");
        todoListRepository.data[1] = new TodoList("Wiwit Widowati");
        todoListRepository.data[2] = new TodoList("Widji Sriwahjuni");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Elang Bayu Segara");
        todoListService.addTodoList("Wiwit Widowati");
        todoListService.addTodoList("Widji Sriwahjuni");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Elang Bayu Segara");
        todoListService.addTodoList("Wiwit Widowati");
        todoListService.addTodoList("Widji Sriwahjuni");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(2);
        todoListService.showTodoList();
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }
}
