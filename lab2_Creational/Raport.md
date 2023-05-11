# Lucrarea de laborator nr.2
# *Tema: Creational Design Patterns.*

### Elaborat de: Sclearenco Irina, TI-204.

## Obiective:

1. Studiați și înțelegeți modelele de design creațional.
2. Alegeți un domeniu, definiți-i principalele clase/modele/entități și alegeți mecanismele de instanțiere adecvate.
3. Utilizați câteva modele de design creațional pentru instanțierea obiectelor într-un proiect.



## Design Patterns utilizate:

- Singleton este un design pattern care permite crearea unei singure instanțe a unei clase într-un program. Acesta asigură că o clasă are o singură instanță și oferă un punct global de acces la această instanță.
Principalele caracteristici ale design pattern-ului Singleton sunt:
     1. Constructor privat: Clasa Singleton are un constructor privat pentru a preveni crearea de instanțe noi prin intermediul operatorului "new".
     2. Variabilă statică: Clasa Singleton conține o variabilă statică care reține singura instanță creată.
     3. Metodă statică de acces: Clasa Singleton furnizează o metodă statică prin care alte clase pot accesa instanța unică.
     4. Instanțierea leneșă: Instanta Singleton este creată numai atunci când este necesară, în momentul primei apelări a metodei de acces.
     5. Asigurarea unicității: Singleton-ul asigură că există o singură instanță prin intermediul constructorului privat și a variabilei statice.

- Builder Pattern este un design pattern utilizat pentru a crea și inițializa obiecte complexe pas cu pas. Acesta permite construirea unui obiect compus din mai multe părți, oferind o abordare mai flexibilă și ușor de utilizata decât un constructor cu multi parametri sau metode de setare.

- Factory Pattern este un design pattern utilizat pentru a crea obiecte fără a specifica clasa concretă a obiectului care trebuie creat. În schimb, se utilizează o interfață sau o clasă abstractă pentru a defini o metodă de fabricare care va fi implementată de clasele derivate. Această metodă de fabricare este apoi utilizată pentru a crea obiecte în funcție de contextul sau necesitățile programului.




## Implementarea
În Singleton Pattern am definit o clasă care are o singură instanță și oferă un punct global de acces la ea. Cu alte cuvinte, o clasă trebuie să se asigure că trebuie creată o singură instanță și că un singur obiect poate fi folosit de toate celelalte clase. Acest model implică o singură clasă care este responsabilă să creeze un obiect, asigurându-se în același timp că este creat doar un singur obiect. Această clasă oferă o modalitate de a accesa singurul său obiect care poate fi accesat direct, fără a fi nevoie de instanțierea obiectului clasei.
```java
public class Main {
    public static void main(String[] args) {    

        Singleton object = Singleton.getInstance();

        object.showMessage();
    }
}
```
Builder pattern construiește un obiect complex folosind obiecte simple și folosind o abordare pas cu pas. O clasă Builder construiește obiectul final pas cu pas. Acest constructor este independent de alte obiecte. Este folosit mai ales atunci când obiectul nu poate fi creat într-un singur pas, cum ar fi deserializarea unui obiect complex.
```java
public class Main {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
```

În Factory Pattern am definit o interfață sau o clasă abstractă pentru crearea unui obiect, dar lăsăm subclasele să decidă ce clasă să instanțieze. Cu alte cuvinte, subclasele sunt responsabile pentru a crea instanța clasei. Creăm obiect fără a expune clientului logica de creare și ne referim la obiectul nou creat folosind o interfață comună.
```java
public class Main {
    public static void main(String[] args) {

        String bankType1 = "Savings";
        String bankType2 = "Cheque";
        String bankType3 = "Credit";
        
        BankAccount bankAccount = BankAccountFactory.getInstance(bankType1);
        BankAccount bankAccount1 = BankAccountFactory.getInstance(bankType2);
        BankAccount bankAccount2 = BankAccountFactory.getInstance(bankType3);

        System.out.println("----Savings----");
        System.out.println(bankAccount.balance());
        System.out.println("----Cheque----");
        System.out.println(bankAccount1.balance());
        System.out.println("----Credit----");
        System.out.println(bankAccount2.balance());
    }
}
```


## Concluzie

În timp ce lucram la acest laborator, m-am familiarizat cu design patterns creaționale și cum sunt ele implementate și utilizate. D Design patterns creaționale oferă diverse mecanisme de creare a obiectelor, care maresc flexibilitatea și reutilizarea codului existent. Aceste modele de proiectare sunt utilizate atunci când o decizie trebuie luată în momentul instanțierii unei clase (adică crearea unui obiect al unei clase).