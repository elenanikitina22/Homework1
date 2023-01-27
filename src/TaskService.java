import MyException.TaskNotFoundException;
import Tasks.Task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskService {

    private Map<Integer, Task> taskMap = new HashMap<Integer, Task>();
    private List<Task> removedTasks = new ArrayList<Task>();

    public void addTask(Task task) throws TaskNotFoundException {
        if (task == null)
            throw new TaskNotFoundException("Ошибка при добавлении задачи. Некорректное значение!");

        taskMap.put(task.getId(), task);
    }

    public Task removeTask(int id) throws TaskNotFoundException
    {
        if (taskMap.containsKey(id))
        {
            var task = taskMap.get(id);

            taskMap.remove(id);
            removedTasks.add(task);
            return task;
        }
        else
        {
            throw new TaskNotFoundException("В ежедневнике нет задачи c id - " + id);
        }
    }

    public List<Task> getAllByDate(LocalDate date)
    {
        List<Task> taskForDay = new ArrayList<Task>();

        for (var item : taskMap.values()) {
            Task task = (Task)item;

            if (task.appearsIn(date))
                taskForDay.add(task);
        }

        return taskForDay;
    }
}