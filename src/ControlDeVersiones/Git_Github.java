package ControlDeVersiones;

public class Git_Github {

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
				
	CREAR REPOSITORIO GITHUB:			
				
			PARA CREAR UN NUEVO REPOSITORIO EN GITHUB:
			
			le damos al boton "new", ponemos el nombre, una descripcion, si es publico o privado y le damos a "create repository"
			
			nos salen 3 opciones, por el momento elegiremos a "…or push an existing repository from the command line"
			por lo que copiaremos la primera frase y la pegaremos en la consola, algo asi:
			git remote add origin https://github.com/lokdarin/Prueba2.git
			ahora refrescamos la pagina, y ya tenemos ahi todo el contenido.	
			
			SE PUEDE MODIFICAR ARCHIVOS SUBIDOS A GITHUB DIRECTAMENTE DESDE ALLI:
			
			seleccionamos el commit que nos interesa, despues el archivo a modificar, le damos al boton con forma de lapiz y programamos.
			
	GIT PULL, DE REMOTO A LOCAL:		
			
			COMO DESCARGAR DEL REPOSITORIO A LOCAL
			
			git pull: ha actualizado directamente mi repositorio local con la modificaciones que hay en el remoto
			
			COMO HACER UN PULL A UNA RAMA EN CONCRETO DE MI LOCAL:
			
			git pull origin NOMBRE_DE_LA_RAMA
				origin: es mi repositorio remoto(github)
				NOMBRE_DE_LA_RAMA: es la rama donde quiero que me lo descargue
			
	TAGS:		
			
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
			
	RAMAS:	
			
			PARA CREAR UNA NUEVA RAMA		

			git branch nombreRama: crea una nueva rama con el nombre de nombreRama
			git checkout -b nombreRama: crea una nueva rama con el nombre de nombreRama y se situa en ella
			
			PARA CREAR UNA NUEVA RAMA DESDE UN COMMIT EN CONCRETO
			
			primero hago git checkout nombreRama para situarme en la rama donde esta ese commit
			luego hago un git log --oneline para ver el ID del commit que me interesa
			por ultimo introduzco: git branch nombreRama ID.
				ejemplo: git branch RamaNueva 7127c60
				
			PARA CREAR UNA RAMA EN OTRA RAMA
			
			primero hago git checkout nombreRama para situarme en la rama donde quiero hacerlo, y en su ultimo commit
			git branch nombreDeLaNuevaRama nombreDeLaRamaDondeEstoy	
				ejemplo: git branch RamaMejoraDemo RamaDemo
			
			PARA VER LAS RAMAS DEL PROYECTO Y EN QUE RAMA ME ENCUENTRO
			
			git branch
			
			PARA MOVERME A UNA RAMA EN CONCRETO
			
			git checkout nombreRama: el HEAD se mueve a la rama con el nombre de nombreRama
			cuando nos movemos a una rama, automaticamente los archivos vuelven al estado en el que se encontraban en esa rama

			PARA UNIR LAS RAMAS
			
			me situo primer en la rama "main" o "master", luego introduzco:
			
			- git merge nombreRama: une la rama main con la rama nombreRama
			
	PUSH A GITHUB:		

			PARA SUBIR A GITHUB NUESTROS CAMBIOS
			
			git push -u origin main: git push -u (donde los copio)(de que lugar) significa coge todos los commits de mi rama main del repositorio 
			local y copialos en el main del remoto llamado origin
			origin significa en mi remoto (github)
			main significa (desde mi main)
			
	CLONAR UN REPOSITORIO REMOTO A LOCAL:		
			
			PARA BAJAR UN REPOSITORIO A UNA CARPETA VACIA

			dentro de esa carpeta abrimos el git bash e introducimos git clone
			
	BORRAR COMMITS EN LOCAL:		
			
			PARA BORRAR UN COMMIT DE MI REPOSITORIO LOCAL (GIT RESET)
						
			- git reset --soft HEAD^: retrocede un commit en el tiempo desde mi HEAD
			- git reset --soft HEAD^^: retrocede 2 commit en el tiempo respecto a mi HEAD
			- git reset --soft HEAD~3: retrocede 3 commit en el tiempo respecto a mi HEAD
			
			- git reset --hard codigoInstantanea: le decimos que el archivo vuelva a como estaba cuando hicimos ese commit
			el codigoInstantanea lo pone cuando haces el git log --oneline a la izquierda del nombre que le hemos dado
				ejemplo de git log --oneline: 64a0169 nombreCommit
				
			al hacer esto, si ahora hacemos un git log --oneline para ver el listado, veremos que todos los commit posteriores al
			que hemos vuelto ya no estan alli
			
	MERGE (unir dos ramas en un commit):
	
			se utiliza cuando trabajamos con un repositorio remoto donde trabajan mas personas
			
			- git merge nombreRamaFusionar: situados en la rama principal, le indicamos que rama queremos mergear con ella
				ejemplo: git merge ramaNueva1
			
	REBASE (copiar el ultimo commit de una rama en el ultimo de otra):
	
			se utiliza cuando trabajamos con repositorio local
			
			la diferencia con el merge es que no genera un commit nuevo, solo pega y une los commit implicados en el rebase

			- git rebase nombreRamaFusionar: situados en la rama principal, le indicamos que rama queremos rebasear con ella
				ejemplo: git rebase ramaNueva1

	GIT STASH (aparcar trabajo):
	
			se utiliza cuando trabajamos con repositorio local

			- git stash: aquellos cambios que hemos realizado en los ficheros en los que estamos trabajando y que con un git status -s
			nos salen en rojo, en lugar de hacer add . y luego comitearlos, podemos dejarlo guardados en esa zona intermedia con git stash
			
			esto sucede cuando estamos trabajando con unos ficheros y nos piden algo urgente en otra parte, de esta forma lo tenemos guardado
			y no lo perdemos.
			
			- git stash apply: con esto volvemos al punto en el que estabamos antes de hacer el git stash
			
	CHERRY-PICKING (copiar commits concretos en otros commits):
	
			- git cherry-pick: sirve para copiar un commit concreto a continuacion de otro commit que queramos.
				
			PROCESO:
				
			1) primero nos situamos en la rama donde tenemos el commit que queremos copiar con git checkout nombreRama
			2) ahora hacemos un git log --line y vemos el ID de nuestro commit, lo copiamos
			3) ahora nos vamos a la rama donde lo queremos copiar con un git checkout nombreRama
			4) a continuacion usamos git cherry-pick ID
		
				ejemplo: git cherry-pick 482a5c
				
			si queremos hacerlo de varios commit a la vez tambien podemos, es el mismo proceso de antes y al final, poner las ID seguidas:
			
				ejemplo: git cherry-pick 482a5c 89g52e 3f518a
			
			
			

		*/	
		
	}

}
