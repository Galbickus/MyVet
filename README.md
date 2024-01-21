
PROYECTO:
<h1 align="center"> App para una veterinaria </h1> 

![Gold Black   White Playful Pet Treats Food Logo ](https://github.com/Galbickus/MyVet/assets/135274833/c05e3e4e-2ac5-476d-9bfc-f7843e05bb64)

<p align="left">   
   </p>  <img src="https://img.shields.io/badge/JAVA-red">
   </p> 
   <p align="left">
   <img src="https://img.shields.io/badge/Xampp-%20orange">
   </p> 
   <p align="left">
   <img src="https://img.shields.io/badge/Graficos-Java%20Swing-blue">
   </p>
   <img src="https://img.shields.io/badge/IDE-Apache%20Netbeans%208.2%20-green">
   </p>
   <img src="https://img.shields.io/badge/MySQL%20-skyblue">
   </p>

Consigna: 
[3- CLÍNICA VETERINARIA.pdf](https://github.com/Galbickus/MyVet/files/13621645/3-.CLINICA.VETERINARIA.pdf)

https://github.com/Galbickus/MyVet/assets/135274833/c04b1557-026a-4915-aeea-5da11a22660b




Vista de diseñador de la Base de Datos

![image](https://github.com/Galbickus/MyVet/assets/135274833/d000e8b3-b6a4-48e9-bde2-48e1eb261773)

Consigna: 

INSTRUCTIVO: El proyecto será una aplicación en Java / MySQL. Se debe crear las tablas de la base de datos, y las correspondientes clases. Utilice una clase para la conexión y confeccione la interfaz gráfica (GUI). El grupo deberá presentar el proyecto en 3 etapas.
1-	Armado de la base de datos completa, relaciones. Proyecto en Netbeans, y clase de conexión. ABM de la clase Cliente (ClienteData), pruebas desde el main. 
2-	Desarrollo de todas las clases principales del dominio (ABM), consultas SQL embebidas. Interfaces gráficas completas. 
3-	Implementación de los todos los métodos necesarios, listados, ABM de clases relacionadas y aplicación terminada.

Se deben presentar las clases con atributos y métodos necesarios(abstracción). Setters y Getters (encapsulamiento). Constructor.
Se evaluará el aporte de todos los miembros al proyecto, en la construcción de las clases. Se subirán los commit al repositorio (Git). 
1.	CLÍNICA VETERINARIA

RELACIONES

⮚	Las personas tienen sus encariñadas mascotas a las que cuidan como un miembro más de la familia. Cada vez que deban ser atendidas se las lleva a la veterinaria de donde son clientes. 

⮚	Cada cliente registra su documento, apellido y nombre del cabeza de familia, una dirección y teléfono y nombre de otra persona alternativa. Se podrá gestionar el ABM y consulta de clientes.

⮚	Cada mascota registra visitas de atención a la veterinaria muchas veces, y cada visita corresponde a una mascota singular. Se podrá gestionar el ABM y consulta de mascotas.

⮚	Se debe asociar que los clientes pueden tener varias mascotas (de tipo perros, gatos, loros, o hámster), cada mascota tiene un código, un alias, sexo, una especie, una raza, color de pelo, fecha de nacimiento aproximada, peso medio del animal en las últimas 10 visitas y el peso actual del animal.

⮚	Se necesita, por tanto, un método que promedie el peso de las mascotas en cada visita y lo guarde en peso promedio de los datos de la mascota. 

⮚	En cada visita se hace uno de los diferentes tratamientos, pudiendo ser de tipo: vacunación, enfermedad, curaciones, baño y corte de pelo, castración, etc. Los tratamientos se registran con un código de tratamiento o servicio, tipo, una descripción, el importe del mismo y si está activo (1) o no.
Se podrá gestionar el ABM y consulta de tratamientos. Cambiar un tratamiento a inactivo (0).

⮚	Un tratamiento se aplica en una visita de atención es especifica de la mascota, la visita se cobra en el acto dependiendo del precio de ese tratamiento.

Visita de Atención

⮚	Cada vez que la mascota (y su dueño) acude a la veterinaria se produce y registran los detalles de la visita que vincula una mascota y un tratamiento. 1- Se debe verificar  que el cliente existe (en caso de no encontrarse, se agregara como cliente nuevo). 2- Acto sucesivo, se buscarán los datos de las mascotas de ese cliente y se elige una para saber detalles al revisarla. 3- Se busca los datos del tratamiento que esté activo (1), y cuánto cuesta. 4- Se guarda una nueva visita asociando mascota con tratamiento en la fecha, el peso promedio y detalles.

⮚	El cliente abonará cualquier servicio al momento de su realización, admitiendo contado como de preferencia en la forma de pago. 

⮚	De las visitas se asienta la fecha de la visita el tratamiento que se efectuó, un detalle si había síntomas o afección. En cada visita se pesa y guarda el peso actual de la mascota. 

⮚	Debe haber un método que pueda listar todas las visitas de una mascota en especial (históricamente) 
Ya que es deseable dar seguimiento de las visitas de tipo “enfermedad” que las mascotas puedan tener, de forma que se puedan diagnosticar y tratar. 

⮚	También listar visitas de mascotas que hacen un mismo tratamiento. Ejemplo todas las visitas que consistan en un tratamiento de tipo “castración” o “vacunación”.

⮚	Un método debe permitir agregar una nueva mascota a las que tiene un dueño que se nos indique. Ejemplo: tenía un perro de alias “Capitan”, y se le agrega un gato de alias “Kitty”.

⮚	Un método entrega una lista de las mascotas de un dueño que ya es existente en el sistema.

⮚	Un método entrega una lista de las visitas de una mascota que se indique y busque en el sistema.

⮚	Listar todos los tratamientos que se encuentren en estado activo (1).

![image](https://github.com/Galbickus/MyVet/assets/135274833/d28f4eb8-afcf-44d9-90df-4a4cfd2dc8b9)

