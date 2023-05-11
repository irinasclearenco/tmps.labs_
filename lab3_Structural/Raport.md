# Laborator nr.3
# *Tema: Structural Design Patterns.*

### Elaborat de: st. gr. TI-204, Sclearenco Irina

## Obiective:
1. Studiați și înțelegeți modelele de proiectare structurală.
2. Ca o continuare a lucrărilor anterioare de laborator, gândiți-vă la funcționalitățile pe care sistemul dumneavoastră va trebui să le ofere utilizatorului.
3. Implementați unele funcționalități suplimentare sau creați un nou proiect folosind modele de proiectare structurală.

## Design Patterns utilizate:

- Adapter Pattern
Adapter Pattern funcționează ca o punte între două interfețe incompatibile. Acest tip de model de design se încadrează în model structural, deoarece acest model combină capacitatea a două interfețe independente.
Acest model implică o singură clasă care este responsabilă să unească funcționalitățile interfețelor independente sau incompatibile. Un exemplu din viața reală ar putea fi un caz de cititor de carduri care acționează ca un adaptor între cardul de memorie și un laptop. Conectăm cardul de memorie în cititorul de carduri și cititorul de carduri în laptop, astfel încât cardul de memorie să poată fi citit prin laptop.

- Bridge Pattern 
Bridge pattern este folosit atunci când trebuie să decuplăm o abstracție de implementarea ei, astfel încât cele două să poată varia independent. Acest tip de design pattern face parte din model structural, deoarece acest model decuplă clasa de implementare și clasa abstractă, oferind o structură de punte între ele.
Acest model implică o interfață care acționează ca o punte care face ca funcționalitatea claselor concrete să fie independentă de clasele de implementare a interfeței. Ambele tipuri de clase pot fi modificate structural fără a se afecta reciproc.

- Decorator Pattern
Decorator Pattern permite unui utilizator să adauge o nouă funcționalitate unui obiect existent fără a-i modifica structura. Acest tip de design pattern face parte din modelul structural, deoarece acest model acționează ca un înveliș pentru clasa existentă.
Acest design pattern creează o clasă de decorator care înglobează clasa originală și oferă funcționalitate suplimentară, păstrând semnătura metodelor de clasă intactă.

- Facade Pattern
Facade pattern ascunde complexitățile sistemului și oferă clientului o interfață prin care clientul poate accesa sistemul. Acest tip de design pattern face parte din model structural, deoarece acest model adaugă o interfață sistemului existent pentru a ascunde complexitățile acestuia.
Facade pattern implică o singură clasă care oferă metode simplificate cerute de client și delegă apeluri la metodele claselor existente de sistem.




## Implementare
În Adapter Pattern, implementarea folosește principiul compoziției obiectului: adaptorul implementează interfața unui obiect și înfășoară pe celălalt.
```java
public class Main {
    public static void main(String[] args) {
	Adapter adapter = new Adapter();
    adapter.Send("Hello");
    }
}
```
În Bridge Pattern, obiectul de abstractizare controlează aspectul aplicației, delegând munca efectivă obiectului de implementare legat.
```java
public class ProgramCreator {
    public static void main(String[] args){
        Program program1 = new BankSystem(new JavaDeveloper());
        Program program2 = new StockExchange(new ScalaDeveloper());

        program1.developProgram();
        program2.developProgram();
    }
}
```
În Decorator Pattern vom crea o interfață ```Developer``` și clase concrete care implementează interfața ```Developer```.
```java
public interface Developer {
    public String makeJob();
}
```
Vom crea apoi o clasă de decorator abstract ```DeveloperDecorator``` care implementează interfața ```Developer``` și având obiectul ```Developer``` ca variabilă de instanță.
```java
public class DeveloperDecorator implements Developer{
    Developer developer;

    public DeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
```

Facade este o clasă care oferă o interfață simplă unui subsistem complex care conține o mulțime de părți mobile. O fațadă poate oferi o funcționalitate limitată în comparație cu lucrul direct cu subsistemul. Avem o clasă ```SprintRunner```, care este foarte simplă.
```java
public class SprintRunner {
    public static void main(String[] args){
        WorkFlow workFlow = new WorkFlow();

        workFlow.solveProblems();
    }
}
```
Clasa ```WorkFlow``` folosește clasele concrete pentru a delega apelurile utilizatorilor acestor clase.
```java
public class WorkFlow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDEadLine(bugTracker);
    }

}
```

## Concluzia

În timp ce lucram la acest laborator, m-am familiarizat cu design patterns structurale și cum sunt implementate și utilizate. Modelele de proiectare structurală explică modul de asamblare a obiectelor și claselor în structuri mai mari, păstrând în același timp aceste structuri flexibile și eficiente. Modelele din proiectele structurale arată modul în care piesele unice ale unui sistem pot fi combinate într-un mod extensibil și flexibil. Deci, cu ajutorul esign pattern structural, putem viza și modifica anumite părți ale structurii fără a schimba întreaga structură.