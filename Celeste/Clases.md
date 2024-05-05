# **Apuntes Semana 1**

## **Clase 1**

*Presentancion de la materia Programación II.* :)

* Presentación del profesor.

* Presentación de los estudiantes.

* Información de varios recurso que se necesitaran para los talleres.

* El primer taller en grupo se trataba de armar una torre lo mas alta y con la menor cantidad de material posible (spoiler: no salio muy bien que se diga :p).

* Explicación de como iban a ser la evalucación.

* Las pruebas y la duración de las mismas, las pruebas serian de dos horas, en cambio los examenes de ocho horas.

* El proyecto, se deberia de entregar la primera parte en el primer bimestre y la finalizacion del mismo en el segundo bimestre.

* Cuadro de evaluaciones y sus porcentajes:

|  Evaluación |   Puntaje |          |   |  Bonos Extras |  Puntaje    |
|-------------|-----------|----------|---|---------------|-------------|
| -Prueba     |   25%     |          |   |-Actuación     |  +0.1 punto |
| -Examen     |   25%     |          |   |-Retos         |  +1.0 punto |
| -Workshop   |   10%     |          |   |               |             |
| -Homework   |   10%     |          |   |               |             |
| -Proyecto   |   30%     |          |   |               |             |

* Explicación de como se iba a llevar el curso, las aplicaciones que se deberan de instalar y como conseguir una buena optimización, ademas de la personalizacion de las mismas, haciendo que sean mas comodas para sacarles el maximo provecho al momento de trabajar y tener buenos resultados.

* Presentar los apuntes de markdonw al final de cada bimestre.

* Talleres en grupo.

* Proyecto en grupo, el proyecto debe tener un aparato externo.

* Presentanción de la normativa.

* Personalizacion de las aplicaciones de trabajo.

* Aprender los comandos.

## **Clase 2**

*Personalización* *del* *Visual* *Code* *y* *de* *Git* *bash*

* Para la personalización del Git Bash y del visual code, se puede personalizar su terminal para que esta sea la determinada en Visual Code y salga por defecto automaticamente, cada vez que se le llame con el comando CTRL + Ñ o manualmente.

![Captura de la terminal](<Imagen de WhatsApp 2024-05-04 a las 22.24.19_3b2c7ac5.jpg>)

Ademas se puede personalizar el git bash en si con la ayuda de otras aplicaciones externas, como por ejemplo: *Oh my posh* que es una de varias que pueden ayudar a darle un toque mas personal a la terminal y la consola de Git bash, con varios diseños y fuentes de se pueden instalar facilmente.

![Captura de los diseños](<Imagen de WhatsApp 2024-05-04 a las 16.13.59_3c1bb01b.jpg>)

Esos son algunos de los diseños que se pueden conseguir en Oh my posh, de la misma forma la aplicacion permite crear un diseño nuevo, al final de la personalizacion se puede obtener un resultado asi en la terminal.

![Captura de la terminal terminada](<Imagen de WhatsApp 2024-05-04 a las 22.23.51_73342430.jpg>)

* De la misma forma se puede personalizar, el color de visual estudio con ayuda de los temas que vienen en la aplicación, pero tambien se pueden instalar otros, así mismo con los iconos de las aplicaciones o archivos que se abran dentro del visual.

* Tambien es recomendable cambiar la letra del visual code y de git bash para que sea mas comoda al momento de trabajar, pero eligiendo una que sea entendible y que facilite el trabajo.

Con todo eso listo, se puede tener una buena herramienta, que sea comoda y al gusto del usuario para trabajar adecuadamente.

*Comandos* :)

* **Windows**
    * CTRL + SHIFT + P: para abrir la barra de comandos donde estan las aplicaciones y funciones.
    * CTRL + P: para ver los documentos que se han abierto recientemente o buscar algun archivo para abrirlo.
    * CTRL + B: para aparecer y desaparecer la barra donde se observan las carpetas y documentos que estabn abiertos o almacenados.
    * CTRL + D: para selecionar varias lineas.
    * CTRL + S: para guardar.
    * CTRL + Ñ: para aparecer y desaparecer la terminal.
    * SHIFT + ALT + UP/DOWN: para copiar y pegar una linea del codigo.
    * ALT + ->: Para moverse entre los archivos que se encuentran abiertos en la barra de arriba.
    * ALT + ->(arriba): Para mover una linea del codigo ya sea arriba o abajo.
    * SHIFT + ALT + A: para poner una linea de comentario.
    * SHIFT + ALT: para selencionar la linea o palabra.

* **Linux**
    * pwd: para sar en que carpeta actual te encuentras.
    * touch: para crear un nuevo archivo de cualquier tipo.
    * code: para abrir el documento creado.
    * ls: lista de archivos en el directorio.

## **Clase 3**

*Uso* *del *Markdonw*

Markdown es una herramienta para tomar apuntes sin necesidad de una herramienta fuera del area de trabajo, visula code, este se puede descargar como un archivo en formato PDF para compartir.
Para eso se necesitan algunas extensiones.

* Titulo: #Titulo.

    Mientras mas # tenga se ira diviendo en titulos y subtitulo.

* Cursiva: * *Cursiva* *

    Con solo un * a cada lado de la palabra u oración.

* Negrillas: ** **Negrillas** **

    Con dos ** a cada lado de la palabra u oración.

* Negrilla y Cursiva: *** ***Negrilla y Cursiva*** ***

    Con tres *** a cada lado de la palabra u oración.

* Link de pagina o sitio web: [Nombre del link](Enlace del link)

    [Youtube](https://www.youtube.com/)

* Imagen: ![Nombre de la imagen](Direccion o link de la imagen)

![alt text](<Imagen de WhatsApp 2024-05-04 a las 22.23.51_a78d8a4d.jpg>)

* Codigo: ``` Nombre del lenguaje de programacion

    (y cierra en una siguente linea) ```

    Tres ` para formar el cuadro y el nombre del lenguaja para que asi se resalte el codigo de acorde al mismo.

```c++
#include <iostream>
#include <cstdlib>
using namespace std;
struct nodo{
    int nro;
    struct nodo *izq, *der;
};
```

* Cuadros: se puede formar cuadros dividiendo las columnas con | y la primera fila (titulos del cuadro) con ---

|  titulo 1   | titulo 2   |
|-------------|------------|
| ejemplo 1   | ejemplo 2  |
| ejemplo 1   | ejemplo 2  |

* Comando:
    * CTRL + SHIFT + V: para ver la vista previa de markdown.

*Manejo* *de git/github*

* **GIT**
    * git init: crear un nuevo repositorio.
    * git status: ver como se encuentran los archivos creados, si estan dentro de git o no.
    * git add . : añadir todos los archivos de la lista que se presente tras el *git status*.
    * git push: para subir a la nube.
    * git pull: para bajar de la nube los cambios efectuados.

* subir los archivos a la nube. 
