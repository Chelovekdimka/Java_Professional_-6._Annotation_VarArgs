//Створити свою інструкцію, яка міститиме параметри для методу, виконати додавання 2-х чисел.
//
//@Math(num1 = 100, num2 = 200)
//
//public void mathSum(int num1, int num2)

package Ex_4;
public class Sum {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        s1.mathSum(50,50);
    }
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
