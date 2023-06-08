package ControlDeVersiones;

public class GitGithub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			APLICACION GIT:
			
			COMANDOS DE CONSOLA:

			- git init: se ejecuta una vez, al comenzar nuestro proyecto o cuando queremos que git comience un seguimiento del mismo

			git crea dos areas:
				1) Area de ensayo: aqui se almacenan los archivos de forma temporal
				2) Repositorio local: aqui es donde se almacenan esas instantaneas de los archivos

			- git add: con este commando le decimos a git que archivos queremos que les haga seguimiento

				git add nombreArchivo: incluye en el area de ensayo un archivo que se llame como le decimos
				git add . agregamos a todos los archivos que tenemos al area de ensayo

			- git commit: traslada el archivo o archivos que tenemos en el area de ensayo a nuestro repositorio local	
					
			- git commit -m "comienzo del proyecto": para añadir una descripcion cuando realizamos el commit

			- git status -s: nos da un listado con todos los archivos o carpetas que tenemos en seguimiento
				si salen listados con dos interrogantes delante, significa que no puede crear copias de los archivos o directorios
				si sale delante del nombre una A, es que efectuvamente lo ha enviado al area de ensayo
				si sale una M, es que en el archivo al que le hemos hecho un commit, han habido modificaciones, si la M esta en rojo es que
				aun no la hemos añadido a la zona de ensayo con un add, si sale en verde es que si.
					para poder hacer un nuevo commit de ese archivo modificado, primero volvemos a hacer git add de el, y luego el commit.

			- git log --oneline: nos saca un listado de los commit que hemos hecho

			- git commit -am: realiza el add y el commit a la vez en un solo comando
				ejemplo: git commit -am "segundo commit"
				
			PARA MODIFICAR EL NOMBRE DE UN COMMIT:	
				
			- git commit --amend: con esto abres el editor VIM 
				dentro del editor ponemos :i para entrar el modo edicion
				despues vamos dandole a la tecla suprimir para borrarlo
				luego le damos a la tecla escape para salir del modo edicion
				
				ahora nuevamente :i para comenzar de nuevo a editar
				ahora escribimos el nombre correcto y pulsamos enter
				
				usamos el commando :wq para salir del editor
				
			PARA CREAR UN NUEVO REPOSITORIO EN GITHUB:
			
			le damos al boton "new", ponemos el nombre, una descripcion, si es publico o privado y le damos a "create repository"
			
			nos salen 3 opciones, por el momento elegiremos a "…or push an existing repository from the command line"
			por lo que copiaremos la primera frase y la pegaremos en la consola, algo asi:
			git remote add origin https://github.com/lokdarin/Prueba2.git
			ahora refrescamos la pagina, y ya tenemos ahi todo el contenido.	
			
			SE PUEDE MODIFICAR ARCHIVOS SUBIDOS A GITHUB DIRECTAMENTE DESDE ALLI:
			
			seleccionamos el commit que nos interesa, despues el archivo a modificar, le damos al boton con forma de lapiz y programamos.
			
			COMO DESCARGAR DEL REPOSITORIO A LOCAL
			
			git pull: ha actualizado directamente mi repositorio local con la modificaciones que hay en el remoto
			
			COMO CREAR UN TAG:
			
			introducir por consola:
			git tag nombreEtiqueta "descripcion"
			Ejemplo:
			git tag 15-09-20v1 -m "Version 1 del proyecto"
			
			de esta forma tenemos la tag creada en nuestro repositorio local
			
			- git push --tags: es para subir a github los tags que tenemos en local
			
			desde github en code -> tags, accedemos a nuestras tags y desde ahi podemos descargarlo comprimido
				
			PARA CLONAR EL REPOSITORIO REMOTO EN LOCAL
			
			en github le damos al boton code y copiamos la URL del proyecto
			despues vamos a la carpeta donde queremos clonarlo, desde alli abrimos consola e introducimos:
			git clone URLcopiada
			
			PARA CREAR UNA NUEVA RAMA		

			git branch nombreRama: crea una nueva rama con el nombre de nombreRama
			
			PARA VER LAS RAMAS DEL PROYECTO Y EN QUE RAMA ME ENCUENTRO
			
			git branch
			
			PARA MOVERME A UNA RAMA EN CONCRETO
			
			git checkout nombreRama: el HEAD se mueve a la rama con el nombre de nombreRama
			cuando nos movemos a una rama, automaticamente los archivos vuelven al estado en el que se encontraban en esa rama

			PARA UNIR LAS RAMAS
			
			me situo primer en la rama "main" o "master", luego introduzco:
			
			- git merge nombreRama: une la rama main con la rama nombreRama

			PARA SUBIR A GITHUB NUESTROS CAMBIOS
			
			git push -u origin main: git push -u (donde los copio)(de que lugar) significa coge todos los commits de mi rama main del repositorio 
			local y copialos en el main del remoto llamado origin
			origin significa (a tu main)
			main significa (desde mi main)
			
			PARA BAJAR UN REPOSITORIO A UNA CARPETA VACIA

			dentro de esa carpeta abrimos el git bash e introducimos git clone
			
			PARA BORRAR UN COMMIT DE MI REPOSITORIO LOCAL (GIT RESET)
						
			- git reset --soft HEAD^: retrocede un commit en el tiempo desde mi HEAD
			- git reset --soft HEAD^^: retrocede 2 commit en el tiempo respecto a mi HEAD
			- git reset --soft HEAD~3: retrocede 3 commit en el tiempo respecto a mi HEAD
			
			- git reset --hard codigoInstantanea: le decimos que el archivo vuelva a como estaba cuando hicimos ese commit
			el codigoInstantanea lo pone cuando haces el git log --oneline a la izquierda del nombre que le hemos dado
				ejemplo de git log --oneline: 64a0169 nombreCommit
				
			al hacer esto, si ahora hacemos un git log --oneline para ver el listado, veremos que todos los commit posteriores al
			que hemos vuelto ya no estan alli
			

		*/	
		
	}

}
