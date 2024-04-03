package demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentElement implements Serializable
{
   public static List<String > student = new ArrayList<>();
   int id;
   String name;
}
