
# Encapsulamiento en Java con la Clase `Persona`

## Descripción

El encapsulamiento es uno de los principios fundamentales de la programación orientada a objetos. Consiste en ocultar los detalles internos de un objeto y exponer solo los aspectos necesarios a través de métodos públicos. Este principio permite proteger los datos y garantiza que estos solo puedan ser modificados de manera controlada.

En este ejemplo, se utiliza la clase `Persona` para demostrar el encapsulamiento en Java. La clase `Persona` tiene dos atributos privados (`nombre` y `edad`) y utiliza métodos públicos para acceder y modificar esos atributos de forma controlada.

## Estructura de la Clase `Persona`

```java
public class Persona {
    private String nombre;  // Atributo privado
    private int edad;       // Atributo privado

    // Método getter para obtener el valor de nombre
    public String getNombre() {
        return nombre;
    }

    // Método setter para modificar el valor de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener el valor de edad
    public int getEdad() {
        return edad;
    }

    // Método setter para modificar el valor de edad
    public void setEdad(int edad) {
        if (edad > 0) {  // Validación simple
            this.edad = edad;
        }
    }
}
```

## Explicación del Encapsulamiento

### 1. **Atributos Privados**
   - `private String nombre;`
   - `private int edad;`

   Los atributos `nombre` y `edad` están declarados como `private`. Esto significa que no pueden ser accedidos directamente desde fuera de la clase `Persona`. Al hacer que estos atributos sean privados, se protege el estado interno del objeto `Persona`, evitando que otros objetos o clases modifiquen directamente sus valores de manera inadecuada.

### 2. **Métodos Getter**
   - `public String getNombre() { return nombre; }`
   - `public int getEdad() { return edad; }`

   Los métodos `getNombre` y `getEdad` son métodos públicos que permiten acceder a los valores de los atributos `nombre` y `edad`, respectivamente. Estos métodos proporcionan una forma controlada de leer el valor de los atributos privados.

### 3. **Métodos Setter**
   - `public void setNombre(String nombre) { this.nombre = nombre; }`
   - `public void setEdad(int edad) { if (edad > 0) { this.edad = edad; } }`

   Los métodos `setNombre` y `setEdad` son métodos públicos que permiten modificar los valores de los atributos privados. En particular, el método `setEdad` incluye una validación simple para asegurarse de que el valor de `edad` sea positivo antes de asignarlo. Esto garantiza que el atributo `edad` solo contenga valores válidos.

### 4. **Beneficios del Encapsulamiento**
   - **Protección de datos:** Evita que los atributos sean accedidos o modificados directamente desde fuera de la clase, lo que protege el estado del objeto.
   - **Control de acceso:** Permite que los atributos sean modificados solo a través de métodos específicos, lo que facilita la validación y el control sobre los cambios.
   - **Mantenibilidad:** Facilita la modificación del código interno de la clase sin afectar a otras partes del programa que dependen de ella.

## Uso de la Clase `Persona`

Para utilizar la clase `Persona`, se crearían instancias de la misma y se interactuaría con los atributos `nombre` y `edad` utilizando los métodos getter y setter. Por ejemplo:

```java
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        // Establecer valores usando setters
        persona.setNombre("Juan");
        persona.setEdad(25);
        
        // Obtener valores usando getters
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
```

Este ejemplo muestra cómo los métodos getter y setter permiten interactuar con los atributos privados de manera controlada y segura.
