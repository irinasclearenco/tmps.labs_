# Laborator nr.4
# *Tema: Behavioral Design Patterns.*

### Elaborat de: st. gr. TI-204, Sclearenco Irina

## Obiective:
1. Studiați și înțelegeți modelele de design comportamental.
2. Ca o continuare a lucrărilor anterioare de laborator, gândiți-vă la ce comunicare între entitățile software ar putea fi implicată în sistemul dumneavoastră.
3. Creați un proiect nou sau adăugați câteva funcționalități suplimentare folosind modele de design comportamental.


### 1. Mișcare sporadică a salariilor implementată cu design pattern „Strategy”
Mișcarea sporadică a salariilor se bazează pe nivelul de muncă al unui angajat
- incepator: 20% din salariul efectiv
- intermediar: 40% din salariul efectiv
- avansat: 80% din salariul efectiv

``Strategy`` este un design pattern behavioral care vă permite să definiți o familie de algoritmi, să puneți fiecare dintre ei într-o clasă separată și să faceți obiectele lor interschimbabile. În strategy pattern, comportamentul unei clase sau algoritmul acesteia poate fi modificat în timpul rulării. În strategy pattern, creăm obiecte care reprezintă diverse strategii și un obiect context al cărui comportament variază în funcție de obiectul său de strategie. Obiectul strategie modifică algoritmul de execuție al obiectului context.

Am definit o clasă ``SporadicSalaryMovementCalculator``, care calculează salariul angajatului ținând cont de nivelul postului (începător [x0,2], intermediar [x0,4] sau avansat [x0,8]).
```java
public class SporadicSalaryMovementCalculator {

    public static BigDecimal calculate(BigDecimal salary, JobLevel jobLevel){
        return jobLevel.calculateSalaryMovement(salary);
    }
}
```
Iată un exemplu despre cum se calculează salariul pentru nivelul Intermediar (în același mod în care am calculat pentru Nivelul Începător și Avansat): 
```java
public class Intermediary implements JobLevel {
    @Override
    public BigDecimal calculateSalaryMovement(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.4"));
    }
}
```

### 2. Mișcarea salarială anuală implementată cu ``Chain of Responsability`` și ``Template Method`` patterns
Există câteva criterii pentru definirea mișcărilor salariale anuale. Acest criteriu are o regulă de prioritate între ele.
Mișcarea salarială anuală trebuie să se bazeze, în primul rând, pe valoarea salariului

> Dacă angajatul primește 20.000 sau mai mult pe lună, mișcarea lui anuală trebuie să fie de 60%

În al doilea rând, după nivel

> Dacă angajatul are un nivel avansat sau intermediar, trebuie să primească cu 40% mai mult pe an

În al treilea rând, după momentul contribuției

> Dacă angajatul are mai mult de un an de cotizare, acesta trebuie să primească cu 20% mai mult

Al patrulea

> Dacă angajatul nu îndeplinește niciunul dintre aceste criterii, nu primește mișcare anuală

Un angajat nu poate beneficia de mai mult de un criteriu

``Chain of Responsability`` este folosit pentru a realiza o cuplare slabă în proiectarea software-ului, în care o solicitare din partea clientului este transmisă unui lanț de obiecte pentru a le procesa. Ulterior, obiectul din lanț va decide singur cine va procesa cererea și dacă cererea trebuie trimisă la următorul obiect din lanț sau nu.

``Template Method`` este de a defini un algoritm ca un schelet de operații și de a lăsa detaliile să fie implementate de clasele copil. Structura generală și secvența algoritmului sunt păstrate de clasa părinte.

De exemplu, am declarat clasa ``AnnualSalaryMovement`` care calculează salariul. În dependență dacă există o condiție de a face mișcare, calculează salariul și îl înmulțește cu procentul aplicat mișcării. Dacă nu există o astfel de condiție, se calculează doar mișcarea salariului pentru angajat.
```java
public abstract class AnnualSalaryMovement {
    protected AnnualSalaryMovement next;

    public AnnualSalaryMovement(AnnualSalaryMovement next) {
        this.next = next;
    }

    public abstract boolean conditionToMakeMovement(Employee employee);

    public abstract BigDecimal obtainPercentageAppliedToMovement();

    public BigDecimal calculateSalaryMovementFor(Employee employee){
        if(conditionToMakeMovement(employee)){
            return employee.getSalary().multiply(obtainPercentageAppliedToMovement());
        }
        return next.calculateSalaryMovementFor(employee);
    }
}
```

### 3. Specificarea nivelului locului de muncă (implementată cu ``State patern``)
Fiecare nivel de job are o specificație: bronz, argint sau aur
Aceste specificații fac parte dintr-o divizie de subnivel și se pot modifica prin promovare.
De la bronz la argint:

> Angajatul primește o mișcare a salariului de 20%

Argint la Aur:

> Angajatul primește o mișcare a salariului de 40%

Aur pentru orice:

> Nu se poate întâmpla

În ``State pattern`` comportamentul unei clase se schimbă în funcție de starea sa. Acest design pattern se încadrează în modelul de comportament. În modelul de stare, creăm obiecte care reprezintă diferite stări și un obiect context al cărui comportament variază pe măsură ce obiectul său de stare se schimbă.

Pentru aceasta am creat o clasă ``JobLevelSpecification`` care poate actualiza nivelul angajatului. Avem 3 clase de copii (Bronz, Silver și Gold)
```java
public abstract class JobLevelSpecification {

    public void updateToNextJobLevelSpecification(Employee employee) throws Exception {
        throw new Exception("Can't update to the next level");
    }
}
```



## Concluzie

Design patterns behavioral se concentrează pe modul în care obiectele și clasele comunică și colaborează între ele pentru a realiza comportamente și funcționalități specifice într-un sistem software. Aceste pattern-uri se axează pe organizarea și gestionarea comportamentului și interacțiunilor dintre obiecte într-un mod flexibil și reutilizabil.