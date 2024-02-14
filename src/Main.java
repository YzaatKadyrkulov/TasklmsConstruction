import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 12.02.2024year
        /**
         * Task of teacher
         * Deadline : 14.02.2024 / 17:00
         * MyClass деген класс тузунуз
         *
         * Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
         *
         * Параметри эки башка болгон эки конструктор тузунуз
         *
         * MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
         *
         * Эки объектке эки башка конструктор иштесин.
         *
         * Объекттердин маанилерин консольго чыгарыныз.
         */
        MyClass myClass1 = new MyClass();
        myClass1.name = "Eldos";
        myClass1.surName = "Abasbekov";
        myClass1.age = 18;
        myClass1.lessons = new String[]{"German","Math"};
        myClass1.favoriteMeal = "Samsy";

        MyClass myClass2 = new MyClass("Yzaat", "Kadyrkulov", 18, new String[]{"English, Math,Computer since,"}, "Praying Mantis");



        System.out.println("Name1:"+ myClass1.name);
        System.out.println("SurName1:"+ myClass1.surName);
        System.out.println("Age1:"+ myClass1.age);
        System.out.println("Favorite lessons1:"+Arrays.toString(myClass1.lessons));
        System.out.println("Favorite meal1:"+ myClass1.favoriteMeal);
        System.out.println();

        System.out.println("Name2:"+ myClass2.name + "\n"+ "Surname2:"+myClass2.surName + "\n"+ "Age2:" + myClass2.age + "\n" + " Favorite lessons2:"+ Arrays.toString(myClass2.lessons) + "\n"+"FavoriteMeal2:"+myClass2.favoriteMeal  );

        }

    }
