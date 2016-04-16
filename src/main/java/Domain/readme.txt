

Więcej przykładów konstrukcji zapytań JPA:
http://docs.spring.io/spring-data/jpa/docs/current/reference/html/



Do sprawdzenia:
- dodać telefon do osoby
- data zamówienia (timestamp)
- data zrealizowania
@Temporal(TemporalType.TIMESTAMP)
Date momentDopuszczenia;    //można

- custom query:
@Query("select o from Obrona o where o.student.studentid=?1")
List<Obrona> findByStudentid(Integer studentid);

- pola transient
@Transient
List<Double> allowedFinalNote;

- join query:
@Query("select o, s, p, w, t from Ocena o, Student s, Przedmiot p, Wykladowca w, OcenaTyp t where " +
            "o.studentid = s.studentid and " +
            "o.wykladowcaid = w.wykladowcaid and " +
            "o.przedmiotid = p.przedmiotid and " +
            "o.ocenatypid = t.ocenatypid and " +
            "s.studentid=?1")
    List<Object[]> findFullById(Integer studentid);

- pełne rozwinięcie (@ManyToOne (np. dla zamówienia->Osoba))
@ManyToOne
@JoinColumn(name = "studentid")
Student student;



- zachowanie kaskadowe przy delete


- dalej: logika transakcyjna
