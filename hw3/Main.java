package hw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
     public static void main(String[] args) {
        Student student01 = new Student("Абрамов", "Изя", "Рашидович", 1001);
        Student student02 = new Student("Шкуматов", "Лектор", "Фаридович", 1002);
        Student student03 = new Student("Безупречный", "Рафаил", "Агдамович", 1003);
        Student student04 = new Student("Шулеров", "Абдул", "Револьвер", 1004);
        Student student05 = new Student("Саидов", "Саид", "Саидович", 1005);
        Student student06 = new Student("Перепел", "Лука", "Ибрагимович", 1006);
        Student student07 = new Student("Ленин", "Владимир", "Ильич", 1007);
        Student student08 = new Student("Дзержинский", "Феликс", "Эдмундович", 1008);
        Student student09 = new Student("Сапляков", "Моряк", "Попаевич", 1009);
        Student student10 = new Student("Искариота", "Иуда", "Симонович", 1010);
        Student student11 = new Student("Рубашка", "Парень", "Иванович", 1011);
        Student student12 = new Student("Революция", "Аглая", "Фирсовна", 1012);
        Student student13 = new Student("Петров", "Иван", "Сидорович", 1013);
        Student student14 = new Student("Сидоров", "Кальвадос", "Перепоевич", 1014);
        Student student15 = new Student("Иванов", "Сидорчук", "Харитонович", 1015);

        Curator curator01 = new Curator("Грозный", "Альберт", "Эйнштейнович", 9001);
        Curator curator02 = new Curator("Чехов", "Антон", "Павлович", 9002);
        Curator curator03 = new Curator("Пушкин", "Александр", "Сергеевич", 9003);

    
        List<Student> group01 = new ArrayList<>();
        List<Student> group02 = new ArrayList<>();
        List<Student> group03 = new ArrayList<>();

        List<Curator> curatorList = new ArrayList<>();
        curatorList.add(curator01);
        curatorList.add(curator02);
        curatorList.add(curator03);

        group01.add(student01);
        group01.add(student04);
        group01.add(student07);
        group01.add(student10);
        group01.add(student13);
        group01.add(student15);
        StudentGroup studentGroup01 = new StudentGroup(group01, curatorList);

        group02.add(student02);
        group02.add(student05);
        group02.add(student08);
        group02.add(student11);
        StudentGroup studentGroup02 = new StudentGroup(group02, curatorList);

        group03.add(student03);
        group03.add(student06);
        group03.add(student09);
        group03.add(student12);
        group03.add(student14);
        StudentGroup studentGroup03 = new StudentGroup(group03, curatorList);

        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(studentGroup01); 
        studentGroups.add(studentGroup02); 
        studentGroups.add(studentGroup03);

        studentGroups.sort(new StreamComparator());

        Stream stream = new Stream(studentGroups);
        for (StudentGroup studentGroup : stream) {
            System.out.println(studentGroup);
        }
    }
    
}
