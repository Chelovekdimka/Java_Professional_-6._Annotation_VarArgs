//Створіть кілька класів, один клас успадковує інший і використовує інструкцію Inherited.
//        Крім цього, спробуйте ще в проекті використовувати 5 різних інструкцій.

package Ex_3;

@MyAnnotation(str = "Dog", val = 100)
class Animal {
    public String speak() {
        return "Animal speaks";
    }
}