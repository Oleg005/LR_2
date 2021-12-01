package com.laba.task4;



import java.util.*;



public class Task4 {


    private  static List<Student> students = new ArrayList<>();
    private static String[] subArr = {"Фізика","Математика","Англійська мова"};
    private static Object[][] objects = new Object[][]{
            {1, "Іванчук" },{2,"Сідоренко"},{3,"Федоренко"},{4,"Петренко"},{5,"Коваленко"}  };

    public static void main(String[] args) {
        System.out.println("Створимо студентів..");
        createStudents();
        print();
        Student maxAvg = findStudentByMaxAvg();
        System.out.println("Студент з вищим середнім балом ");
        System.out.println(maxAvg);
        String newSubject = "Хімія";
        System.out.println("Додамо новий предмет: "+newSubject);
        addNewSubject(newSubject);
        System.out.println("Список студентів");
        print();
        String subject = "фізика";
        System.out.println("Виведемо карту оцінок для предмету \""+subject+"\"");
        Map<Integer, Rate> map = getMap("фізика");
        System.out.println(map);
    }
    private static void createStudents(){
        for(Object[] obj:objects){
           students.add(createStudent((int) obj[0],(String) obj[1]));

        }
    }
    private static Student createStudent(int id,String name){
        Random random = new Random();
        Student student = new Student(id,name);
        for(String sub:subArr){
            student.addSubject(sub);
            int rate = random.nextInt(6);
            student.setRate(sub,rate);
        }
        return  student;

    }

    public static void  addNewSubject(String name){
       students.forEach(s->s.addSubject(name));
    }
    public static void  print(){
        students.forEach(System.out::println);
    }

    public static Student findStudentByMaxAvg(){
        Student student = null;
        double minAvg = 0;
        for(Student s:students){
           double avg=s.getSubjects().stream().mapToInt(p->p.getRate().getRate()).average().orElse(0);
           if (avg>0 && avg>minAvg){
                   student=s;
                   minAvg = avg;
            }
        }
        return  student;
    }
    public static Map<Integer,Rate> getMap(String subject){
        Map<Integer,Rate> map = new HashMap<>();

        for(Student student:students){
            Optional<Subject> sub = student.getSubjects().stream().filter(s -> s.getName().equalsIgnoreCase(subject)).findFirst();
            if (sub.isPresent()){
                map.put(student.getId(),sub.get().getRate());
            }

        }
        return  map;
    }
}
