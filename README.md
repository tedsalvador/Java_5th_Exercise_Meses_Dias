# Java 5th Exercise: Meses y Días

Este proyecto es un ejercicio de Java que, dado el número de un mes (1, 2, 3, ..., 12), presenta el nombre del mes y determina la cantidad de días que tiene.

# Estructura del Proyecto
Java_5th_Exercise_Meses_Dias/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── meses/
│   │   │               ├── Mein.java
│   │   │               ├── Mes.java
│   │   │               └── MesService.java
│   ├── test/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── meses/
│   │   │               ├── MainTest.java
│   │   │               └── MesServiceTest.java
├── .gitignore
├── pom.xml
└── README.md


Entregable:
- Repositorio de git
- Obligatorio realizar los pruebas unitarias

# Diagrama de Clases

+------------------+          +----------------+
|     Mes          |          |  MesService    |
+------------------+          +----------------+
| - int numero     |1      *  | + getMesInfo() |
| - String nombre  | <--------| + getNombre()  |
| - int dias       |          | + getDias()    |
+------------------+          +----------------+
| + Mes()          |
| + getNombre()    |
| + getDias()      |
+------------------+
