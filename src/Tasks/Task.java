package Tasks;
import MyException.IncorrectArgumentException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Task {

    // Переменные
    private int id;
    private String title;
    private String description;
    private Type type;
    private LocalDateTime dateTime;

    public Task(String title, String description, Type type) throws IncorrectArgumentException {
        this.title = title;
        this.description = description;
        this.type = type;

        if (this.type == null)
            throw new IncorrectArgumentException("Некорректное значение типа задачи.");

        id = idGenerator();
        dateTime = LocalDateTime.now();
    }

    // Геттеры
    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public Type getType() { return type; }

    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    // Сеттеры
    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    // Генератор id
    private int idGenerator()
    {
        return hashCode() / 1000;
    }

    // Сравнение дат
    public abstract Boolean appearsIn(LocalDate date);

    // Переопределение методов
    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        Task task = (Task)obj;
        if (getTitle().equals(task.getTitle()) && getType().equals(task.getType()))
            return true;

        return false;
    }

    @Override
    public int hashCode()
    {
        return getTitle().hashCode() + super.hashCode();
    }

    public String toString()
    {
        return "Id задачи: " + getId() + "\n" +
                "Название задачи: " + getTitle() + ", описание: " + getDescription() + ", тип: " + getType().getTypeEnum() + "\n" +
                "Дата добавления: " + getDateTime().toLocalDate() + "\n";
    }
}