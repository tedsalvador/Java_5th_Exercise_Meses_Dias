# Java 5th Exercise: Meses y Días

Este proyecto es un ejercicio de Java que, dado el número de un mes (1, 2, 3, ..., 12), presenta el nombre del mes y determina la cantidad de días que tiene.

# Estructura del Proyecto
Java_5th_Exercise_Meses_Dias/<br>
├── src/<br>
│   ├── main/<br>
│   │   ├── java/<br>
│   │   │   └── com/<br>
│   │   │       └── example/<br>
│   │   │           └── meses/<br>
│   │   │               ├── Mein.java<br>
│   │   │               ├── Mes.java<br>
│   │   │               └── MesService.java<br>
│   ├── test/<br>
│   │   ├── java/<br>
│   │   │   └── com/<br>
│   │   │       └── example/<br>
│   │   │           └── meses/<br>
│   │   │               ├── MainTest.java<br>
│   │   │               └── MesServiceTest.java<br>
├── .gitignore<br>
├── pom.xml<br>
└── README.md<br>


Entregable:
- Repositorio de git
- Obligatorio realizar los pruebas unitarias

# Diagrama de Clases

+------------------+          +----------------+<br>
|     Mes          |          |  MesService    |<br>
+------------------+          +----------------+<br>
| - int numero     |1      *  | + getMesInfo() |<br>
| - String nombre  | <--------| + getNombre()  |<br>
| - int dias       |          | + getDias()    |<br>
+------------------+          +----------------+<br>
| + Mes()          |<br>
| + getNombre()    |<br>
| + getDias()      |<br>
+------------------+<br>
