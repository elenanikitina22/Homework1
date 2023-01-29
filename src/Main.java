import MyException.IncorrectArgumentException;
import MyException.TaskNotFoundException;
import Tasks.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String dateFormat = "dd-MM-yyyy";
        final String dateTimeFormat = "dd-MM-yyyy HH-mm";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        Scanner scanner = new Scanner(System.in);

        TaskService taskService = new TaskService();

        while (true) {
            System.out.println("1) Для добавления задачи введите Add");
            System.out.println("2) Для получения задачи на указанный день, введите Show");
            System.out.println("3) Для удаления задачи введите Del");

            String text = scanner.nextLine();

            if (text.toUpperCase().equals("ADD")) {
                System.out.println("Введите название задачи");
                String title = scanner.nextLine();

                System.out.println("Введите описание задачи");
                String description = scanner.nextLine();

                System.out.println("Укажите тип задачи: P - личная, W - рабочая");
                String type = scanner.nextLine();

                Type typeTask;

                switch (type.toUpperCase()) {
                    case "P":
                        typeTask = Type.PERSONAL;
                        break;
                    case "W":
                        typeTask = Type.WORK;
                        break;
                    default:
                        typeTask = null;
                        break;
                }

                System.out.println("Укажите дату и время выполнения задачи (в формате " + dateTimeFormat + "):");
                String dateText = scanner.nextLine();
                DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern(dateTimeFormat);
                LocalDateTime date;

                try
                {
                    date = LocalDateTime.parse(dateText, formatterDateTime);
                }
                catch (Exception ex)
                {
                    System.out.println("Дата указана неверно!");
                    continue;
                }

                System.out.println("Укажите повторяемость задачи: " +
                        "S - однократная, D - ежедневная, W - еженедельная, M - ежемесячная, Y - ежегодная");
                String repeatability = scanner.nextLine();

                Task task;

                try
                {
                    switch (repeatability.toUpperCase())
                    {
                        case "S":
                            task = new OneTimeTask(title, description, typeTask, date);
                            break;
                        case "D":
                            task = new DailyTask(title, description, typeTask, date);
                            break;
                        case "W":
                            task = new WeeklyTask(title, description, typeTask, date);
                            break;
                        case "M":
                            task = new MonthlyTask(title, description, typeTask, date);
                            break;
                        case "Y":
                            task = new YearlyTask(title, description, typeTask, date);
                            break;
                        default:
                            task = null;
                            break;
                    }

                    taskService.addTask(task);
                    System.out.println("Задача добавлена в ежедневник. \n");
                }
                catch (TaskNotFoundException exTask)
                {
                    System.out.println(exTask.getMessage());
                }
                catch (IncorrectArgumentException exArg)
                {
                    System.out.println(exArg.getArgument());
                }
            }
            else if (text.toUpperCase().equals("SHOW"))
            {
                System.out.println("Введите дату в формате число-месяц-год");
                text = scanner.nextLine();

                LocalDate date = null;

                try
                {
                    date = LocalDate.parse(text, formatter);
                }
                catch (Exception ex)
                {
                    System.out.println("Неправильный формат даты. \n");
                    continue;
                }

                var list = taskService.getAllByDate(date);
                System.out.println("Список задач на " + date + ":");

                if (list.size() > 0)
                {
                    for (var item : list)
                        System.out.println(item.toString());
                }
                else
                {
                    System.out.println("Задачи не найдены. \n");
                }
            }
            else if (text.toUpperCase().equals("DEL"))
            {
                System.out.println("Введите id задачи.");
                text = scanner.nextLine();
                int id;

                try
                {
                    id = Integer.parseInt(text);

                    Task task =  taskService.removeTask(id);
                    System.out.println("Задача " + task.getTitle() + " удалена.");
                }
                catch (TaskNotFoundException exTask)
                {
                    System.out.println(exTask.getMessage() + "\n");
                }
                catch (Exception ex)
                {
                    System.out.println("Некорректный формат id \n");
                }
            }
        }
    }
}