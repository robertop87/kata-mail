Actividad de Programación
Kata Mail


# Problema
Se desea construir un programa que permita el manejo de correos electrónicos. El programa se desarrollará en un par de iteraciones.
# Primera iteración

El programa debe constar de la funcionalidad de un Cliente y un Servidor de correos electrónicos.
** El Cliente debe ser capaz de conectarse a un servidor de correos y enviar un correo a un usuario que tenga cuenta en dicho servidor. En la primera versión el Cliente es simple. No necesita almacenar ni temporalmente ni localmente los mensajes del usuario conectado.

** El Servidor debe ser capaz de responder a pedidos de conexión por parte de clientes y de entrega de correos electrónicos. El Servidor también administra los correos de cada cliente.
Cliente y Servidor pueden funcionar independientemente.

Todo el sistema se debe ejecutar (tanto Servidor como Clientes) en el mismo proceso, por tanto, crear nuevos clientes es tan fácil como crear nuevas instancias de una clase MailClient (suponiendo esta implementara la funcionalidad del cliente).

Para el almacenamiento de los mensajes se puede usar una colección simple (una implementación de Listas es suficiente).

# Segunda iteración
Para la segunda iteración se requiere la adición de la siguiente funcionalidad:
* Registrar las cuentas de los usuarios que podrán usar el sistema de correos (enviar y recibir mensajes). Esto implica:

** Permitir enviar mensajes solo a usuarios registrados en el sistema.
** Crear instancias de MailClient solo con cuentas registradas en el sistema.

* Permitir mandar y recibir archivos adjuntos.
