package ControlDeVersiones;

public class Apuntes_pagina_interactiva {

	/*	CONCEPTOS:
	 
	    - git clone: hace una copia en mi repositorio local del estado del repositorio en un punto concreto del tiempo
	 
		- commit: se denomina commit a cada uno de los puntos de guardado a los que puedo acceder (las bolitas de la rama).
				  una vez realizados los cambios, guardarlos en mi repositorio local tambien es hacer un commit
		
		- branch: significa rama, puede ser una rama creada o la Main branch (rama principal)
		
		- checkout: seleccion de un commit para seguir trabajando sobre el
		
		- cherry-pick: copiar una serie de commits sobre tu ubicacion actual (HEAD)
		
		- reset: deshace los cambios moviendo la referencia de una rama hacia atrás en el tiempo a un commit anterior(rama local)
				
		- revert: Se usa Para revertir cambios y compartir esa revertida con otros (rama remota)
		
		- rebase: es un modo de combinar el trabajo de distintas ramas, selecciona un conjunto de commits, los "copia", y 
		los aplica en algún otro lado
		
		- merge: combinar dos ramas, incluir todo el trabajo de estos dos padres, y del conjunto de todos sus ancestros
		
		- HEAD: es el nombre simbólico del commit sobre el que hemos hecho checkout. Es, básicamente, el commit sobre el que estás
		trabajando.
		
		- Detachear: (des-adjuntar) HEAD simplemente significa adjuntarla a un commit en lugar de a un branch
		
		- hash: el hash de los commit es el nombre (lo que hay dentro del circulo)
		
		- remote: es una rama remota (usa revert para rectificar)
		
		- local: es una rama local (usa reset para rectificar)
	
		- tags: son puntos inamovibles en la historia del proyecto, para cosas como releases mayores o grandes merges
		
		- fetch: traer datos de un repositorio remoto
		
-------------------------------------------------------------------------------------------------------------------------------		
		
		COMANDOS:
		
		1)	CREAR UN COMMIT:
		
		- git commit: comando que crea un commit debajo del seleccionado
		
		2)	CREAR UNA BRANCH:
		
		- git branch NombreRama: crea una nueva rama con ese nombre
			
			ejemplo: git branch foo (crea la rama de nombre foo donde este el HEAD)
			ejemplo2: git checkout -b side o/main (crea la rama de nombre side en el o/main y lo selecciona)
			
		3)	SELECCIONAR UNA BRANCH:
		
		- git checkout NombreRama: nos situa en esa rama para poder trabajar desde esa posicion
		
		4)	UNIR LA BRANCH CON EL MAIN:
		
		- git merge NombreRama: une la rama que nombras con la main branch en un nuevo commit
		
		5)	HACER UNA COPIA DE LO QUE TENGO SELECCIONADO Y PONERLO EN OTRO LUGAR:
		
		- git rebase NombreRama: haz una copia de lo que tengo seleccionado y situalo en NombreRama
	
		6)	COMO MOVERSE HACIA ATRAS ENTRE COMMITS:	
				
		- ^: moverse un commit para atras, decir main^ es equivalente a "el primer padre de main".
		main^^ es el abuelo (segunda generación de ancestros) de main
		
			ejemplo: git checkout main^	vuelve al anterior main
			ejemplo2: git checkout HEAD^ vuelve a la anterior seleccion
		
		- ~<num>: Moverse una cantidad de commits hacia atrás
		
		ejemplo: git checkout HEAD~4
		
		- en el caso de que el commit venga de un merge,
		
			git checkout HEAD^ subira por la parte directamente superior de la rama
			git checkout HEAD^2 subira por la otra branch(rama)
			git checkout HEAD~^2~2 sube 2 por la rama no directa y luego sube 2 por la directa
		
		7)	COMO MOVER BRANCH HACIA ATRAS:
		
		- -f: es para mover las ramas, Puedes reasignar directamente una rama a un commit usando la opción -f
		
			ejemplo: git branch -f main HEAD~3	Mueve (forzadamente) la rama main tres padres por detrás de HEAD	
					main	->	la rama que desplazo
					HEAD	->	desde donde la desplazo (que punto de referencia o posicion cojo)
					~3		-> 	cuanto la desplazo respecto de este punto de referencia o posicion
					
		8)	COMO DESHACER CAMBIOS MOVIENDO LA REFERENCIA DE UNA RAMA HACIA ATRAS:		
		
		- git reset: deshace los cambios moviendo la referencia de una rama hacia atrás en el tiempo a un commit anterior
		
			ejemplo: git reset HEAD~1 (rama local)
		
		- git revert: Mientras que resetear los cambios funciona estupendamente para ramas locales en tu máquina, su método de
		"reescribir la historia" no funciona para ramas remotas que otros están usando
		Se usa Para revertir cambios y compartir esa revertida con otros
		
			ejemplo: git revert HEAD (rama remota)
			
		9)	COPIAR EN EL HEAD LOS COMMIT QUE LE INDIQUEMOS:
			
		- git cherry-pick: sirve para copiar en el HEAD los commit que le indiquemos.
			
			ejemplo: git cherry-pick C2 C4
	
		10)	COPIAR UNA RAMA DANDO TU QUIERAS:
		
		- rebase interactivo:
		
			ejemplo: git rebase -i HEAD~4 (seleccionas que commits de la rama quieres copiar y se los lleva a HEAD~4)
			ejemplo2: git rebase -i main (seleccionas que commits de la rama quieres copiar y se los lleva a main)	
			ejemplo3: git rebase -i main HEAD(copia los commit de la rama HEAD que le indiques y los pone en main)
			ejemplo4: git rebase main HEAD(copia todos los commit de la rama HEAD y los pone en main)
		
		11)	--amend PARA MODIFICAR:
		
			--amend
			
		12)	COMO HACER UN TAG EN UN COMMIT:
		
		- git tag: volver un commit un tag (punto inamovible)
		
			ejemplo: git tag V1 C1 (V1 es el nombre del Tag y C1 el nombre del commit)
			ejemplo2: git tag V1 (V1 es el nombre del Tag y lo va a crear en el HEAD)
		
		13) LOCALIZAR DONDE ESTA EL TAG MAS CERCANO:
		
		- git describe: dice donde estas relativo al "hito" más cercano (tag)
		
			git describe <ref> (ref es cualquier cosa que git puede resolver a un commit)
			
				ejemplo: git describe main (el nombre de la rama es main)
				ejemplo2: git describe side (el nombre de la rama es side)
				ejemplo3: git describe (lo hace sobre el HEAD en el que estas)
				ejemplo4: git describe C2 (lo hace sobre el commit C2)
			
		la salida de este comando se ve asi:	
		
			<tag>_<numCommits>_g<hash> (el tag mas cercano, a cuantos commits se encuentra, el nombre del commit que estas describiendo)
			
			ejemplo: V1_4_gC1
			
----------------------------------------------------------------------------------------------------------------------------------			
			
		REMOTO:		
			
		1) COMO CREAR UNA COPIA LOCAL DEL REPOSITORIO:
		
		- git clone: con este comando copiamos el repositorio externo en nuestro ordenador
			
		2) 	o/ ES UN COMANDO PARA DEFINIR DONDE ESTAMOS EN EL REMOTO:
		
		- o/:  si observas una rama llamada o/main, el nombre de la rama es main, y el nombre del remoto es o
		github crea tu remoto llamándolo origin cuando haces git clone de un repositorio en lugar de o
		
			ejemplo: git checkout o/main

		3) COMO TRAER DATOS DE UN REPOSITORIO REMOTO A MI REPOSITORIO LOCAL:
		
		git fetch: trae datos desde un repositorio remoto en dos pasos:
			- baja los commits que el remoto tiene pero no están en nuestro repositorio local
			- actualiza a dónde apuntan nuestras ramas remotas (por ejemplo, o/main)
		git fetch no modifica en absoluto tu estado local. No va a actualizar tu rama main ni va a cambiar nada sobre cómo se ve 
		tu sistema de archivos en este momento
		
		git fetch origin foo: Git va a ir a la rama foo en el remoto, va a traer todos los commits que no estén presentes localmente, 
		y luego los aplicará sobre la rama o/foo localmente
		
		git fetch origin foo:bar: git fetch origin(desde donde)(lugar donde lo copia), lo coge de foo y lo copia en bar 
		si la branch de nombre bar no existiera lo crearia donde tengamos seleccionado.
			
		git fetch origin :bar, crea una nueva rama llamada bar	
			
		4) COMO ACTUALIZAR NUESTRO TRABAJO LOCAL CON LOS CAMBIOS QUE HAN EFECTUADO LOS DEMAS:
					
		git pull: fetchear cambios remotos y después mergearlos, en un solo comando
		
		git pull --rebase: realiza el pull y hace el rebase (copia) al final del mismo (lo que copia es donde estamos checkout)
		
		git pull origin foo: hace un pull de todos los commits cogiendo de destino la branch foo
		
		git pull origin main:foo, hace un pull de todos los commits cogiendo de destino la branch main y ademas crea la branch foo
		
		5) SIMULAR EL TRABAJO DE OTROS EN LA PAGINA DE PRACTICAS:
		
		- git fakeTeamwork:simula trabajo de nuestros colegas
		El comportamiento por default de fakeTeamwork es simplemente crear un commit en main
		
		ejemplo: git fakeTeamwork foo 3 (foo es el nombre de la branch) agrega 3 commit. 	
		ejemplo2: git faketeamwork 2 (empieza en el HEAD) 	
		 	
		6) COMO COMPARTIR MIS CAMBIOS REALIZADOS EN LOCAL CON EL REPOSITORIO REMOTO:
		
		- git push: sirve para subir tus cambios realizados en local a un remoto y actualizar dicho remoto con tus nuevos commits
		se podria decir que sirve para "publicar" tu trabajo.
		
		- git push origin main: git push(donde los copio)(de que lugar) significa coge todos los commits de mi rama main del repositorio 
		local y copialos en el main del remoto llamado origin
			origin significa (a tu main)
			main significa (desde mi main)
			
		- git push origin <origen>:<destino>, especificas tanto el origen como el destino	
		- git push origin main:newBranch, como no le especificas el nombre del destino, crea una rama nueva llamada newBranch
		- git push origin :foo, como el origen esta vacio, elimina la rama foo del remoto, le envia la nada y la convierte en ella
		
		7) PORQUE NO PODEMOS HACER UN PUSH DE UN PULL REQUEST:
		
		normalmente la rama remota main esta bloqueada, por lo que necesita un pull request para mergear los cambios
		Si haces commit directamente a main e intentas realizar push te saldra un mensaje como que no se te permite
		
		SOLUCION:
		
		Crea otra rama llamada feature en el remoto y haz push en ella
		También restablece su rama main nuevamente para que esté sincronizado con el repositorio remoto


	*/	
}
