package demo;

import java.io.Serializable;

public class Student implements Serializable
{
    int id;
    String name;

    public Student()
    {
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
