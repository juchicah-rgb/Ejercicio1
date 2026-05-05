import java.util.Scanner;

class Juan {
    int edad;

    Juan(int edad) {
        this.edad = edad;
    }

    int Alberto()
        return this.edad * 2 / 3;
    }

    int Ana() {
        return this.edad * 4 / 3;
    }

    int Mama() {
        return this.Ana() + this.Alberto() + this.edad;
    }

    void resultado() {
        int Juan = this.edad;
        int Alberto = this.Alberto();
        int Ana = this.Ana();
        int Mama = this.Mama();

        System.out.println("Juan: " + Juan);
        System.out.println("Alberto: " + Alberto);
        System.out.println("Ana: " + Ana);
        System.out.println("Mama: " + Mama);
    }
}

public class MyClass {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese edad de Juan: ");
        int edad = sc.nextInt();

        Juan e1 = new Juan(edad);
        e1.resultado();

        sc.close();
    }
}