//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    //Task1

    /*    List<Integer> list=List.of(1,2,3,4,5,6,7,8);
    List<Integer> list1=list.stream()
            .filter(element->element%2==0)
            .map(x->x*x)
            .toList();
    System.out.println(list1);
 */

    //Task2

    /* List<String> list=List.of("Ali","Vali","Sevinc","Fa","Vali","Fatima","Muhammad");

   List<String> list1=list.stream()
           .filter(element->element.length()>3)
           .distinct()
           .sorted(Comparator.comparingInt(String::length).reversed())
           .limit(3)
           .toList();
    System.out.println(list1);*/

    //Task3

    /*List<Employee> employees=List.of(
            new Employee("Xeyyam","IT",2400,24),
            new Employee("Elvin","IT",2000,27),
            new Employee("Samir","Manegment",2200,32)
    );
    Optional<Employee> maxSalary=employees.stream()
            .max(Comparator.comparingInt(Employee::getSalary));

            maxSalary.ifPresent(e-> System.out.println(e.getName()+" "+e.getSalary()));

    double averageSalary=employees.stream()
            .mapToInt(Employee::getSalary)
            .average()
                    .orElse(0);
    System.out.println("Average salary: " + averageSalary);

    int sum = employees.stream()
            .filter(e -> e.getAge() > 30)
            .mapToInt(Employee::getSalary)
            .sum();

    System.out.println("Total Salary: " + sum);


    Map<String, Long> count = employees.stream()
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.counting()));


    Map<String, Double> averageSalaryy = employees.stream()
            .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                    Collectors.averagingInt(Employee::getSalary)));

    System.out.println(count);
    System.out.println(averageSalaryy);*/

    //Task 4 and Task 5

    /*  List<String> emails = List.of("Ali@Gmail.com", "vali@yahoo.com", "ali@gmail.com", "Aysel@gmail.com", "NIGAR@GMAIL.COM", "aysel@gmail.com", "elvin@mail.ru"
    );

    long  count1=emails.stream()
            .map(String::toLowerCase)
            .filter(e->e.endsWith("@gmail.com"))
            .distinct()
            .count();

    System.out.println("Number of unique Gmail addresses: "+count1);*/

    //Task 6

    /*  List <String> name=List.of("Jack","Nickol","Pasinyan");

    name.stream()
            .map(n->"Students: "+n)
            .forEach(System.out::println);
*/

    //Task 7

    /*  List<Integer> numbers=List.of(1,2,3,12,13,14);
            numbers.stream()
            .filter(e->e>10)
            .map(n->"Number: "+n)
            .forEach(System.out::println);*/

    //Task 8

    /* Map<String, Integer> price=new HashMap<>();
    price.put("Mathematics", 90);
    price.put("Physics", 84);
    price.put("Chemistry", 91);

    price.forEach((key, value)-> System.out.println(key+" "+value));*/


}

