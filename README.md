1. Creamos una carpeta de trabajo con:

    Dos carpetas (Ordenador1 y Ordenador2), que simularán dos equipos remotos.
    Este README.md para ir editándolo y creando el registro de trabajo con capturas.
    Una carpeta "img" para las imágenes que serán referenciadas desde el README
	
	![1creamos carpeta de trabajo](https://user-images.githubusercontent.com/114091264/205150099-257cd4ab-59b4-433a-8626-506ccf518be1.png)

	
2. Creamos un repositorio vacío (sin README ni gitignore) en GitHub.
![2nuevo repositorio](https://user-images.githubusercontent.com/114091264/205150121-6de7a058-0401-41e8-90a0-621ef1de918c.png)

	
3. Creamos un proyecto de IntelliJ en Ordenador1 con repositorio de Git y código de ejemplo. 

	![3nuevoproyecto](https://user-images.githubusercontent.com/114091264/205150138-4291cdea-db16-4f5f-baf7-84a72941f47a.png)


4. Creamos un nuevo README.md localmente (no el presente con el registro de trabajo, que se añadirá al final sustituyendo a ese.)

	![4creacion readme desde intellij](https://user-images.githubusercontent.com/114091264/205150172-e3e90ef5-e720-4d82-a80a-07cd8f0d7e5d.png)


5. Realizamos un primer commit y push de la base del proyecto.

![5primer commit](https://user-images.githubusercontent.com/114091264/205150204-3b8dee29-e74a-4ba0-8d87-b46bae5b8675.png)

	![6git push](https://user-images.githubusercontent.com/114091264/205150215-1ddbfcb5-15b0-4e9d-b828-a4233c6b5a65.png)

	
6. Clonamos el proyecto dentro de Ordenador2 y lo abrimos.

	![7git clone en ordenador2](https://user-images.githubusercontent.com/114091264/205150238-888f5f9e-d3a4-4f0e-ad2e-c54653404df1.png)

	
7. Creamos una nueva funcionalidad, para lo cual creamos una rama "feat_persona" y la desarrollamos. 

	![8codigo creacion persona](https://user-images.githubusercontent.com/114091264/205150273-46a75b6a-39a4-43f7-b7fe-a794e506dbf8.png)

	![9creacion rama feat_persona](https://user-images.githubusercontent.com/114091264/205150288-6c0701f7-4ab2-4347-bb29-eaa877bd105a.png)


Una vez lista subimos la rama (``` git push feat_persona ```). Después, nos movemos a master para hacer un merge de "feat_persona" localmente.
Al no haber nuevos commits en master, el merge debería ser automático y sin conflictos

![10push feat_persona y merge](https://user-images.githubusercontent.com/114091264/205150309-dfb6cfef-f6d9-4fdd-b006-46295c53f5bd.png)


8. Volvemos a Ordenador1. Recordamos el estado de nuestro proyecto en este ordenador haciendo un ``` git status ``` y un ``` git log ```.
Si no nos indica que el master local está por detrás del remoto (origin/master), será necesario hacer un ```git fetch```.

![11git status git log en ordenador1](https://user-images.githubusercontent.com/114091264/205150414-38a1aee2-5614-4fd1-b589-39e0aade83fe.png)


9. Para poder seguir trabajando desde Ordenador1, deberíamos hacer antes de nada un pull para traernos el nuevo commit que tiene master en remoto. 
Sin embargo, vamos a probar qué sucedería si nos olvidamos de ello.

<!-- ☠☠☠☠ -->

10. Desarrollamos una nueva funcionalidad "feat_empleado" en su correspondiente rama.

	[12creacion rama feat_empleado](https://user-images.githubusercontent.com/114091264/205150438-e8abd435-555c-44f2-a6c0-c0a36fa8e199.png)


	i.Durante el desarrollo, antes de hacer el primer commit en feat_empleado, detectamos que el fichero .idea/workspace.xml cambia automáticamente
	a menudo al abrir el proyecto en IntelliJ (es un archivo de metadatos de proyecto de IntelliJ).
	
	ii. Hacemos un primer commit para añadir .idea/workspace.xml al .gitignore.
		Además, como los ficheros de ese directorio ya se han añadido previamente al repositorio, tendremos que eliminarlos de él haciendo:
		``` git rm --cached .idea/workspace.xml ```
		
	![13 gitignore  ideaworkspace xml](https://user-images.githubusercontent.com/114091264/205150490-e7a6c9f6-1cf2-4ae1-8297-6954f68e2c52.png)

	![14deleted  ideaworkspace xml](https://user-images.githubusercontent.com/114091264/205150496-2f636b2e-0beb-4099-ba94-424eb186e6d0.png)

		
	iii. Hacemos los otros 2 commits y pusheamos.
	
	![15probando objeto empleado](https://user-images.githubusercontent.com/114091264/205150539-0d56f31c-abec-4d6b-860e-3e3a4c35369f.png)
	![16commit probando objeto empleado](https://user-images.githubusercontent.com/114091264/205150542-3a107283-b585-4fc2-a939-5b8e7ce0a22f.png)
![17encapsulando toString de Empleado](https://user-images.githubusercontent.com/114091264/205150544-62e13996-2bdf-4381-83ba-a57af8798bd9.png)
	![18commit encapsulando toString en Empleado](https://user-images.githubusercontent.com/114091264/205150535-957e55ee-9c07-474f-a36d-12f270649256.png)


	iv. Vemos todas las ramas que tenemos.
	
	``` Git branch -a ```
	
![19vemos q ramas tenemos git branch -a](https://user-images.githubusercontent.com/114091264/205150699-7f39ea0c-6c16-423c-b039-a9d8d3f614ba.png)

	
	vi. Podríamos hacer un pull, que implicaría un merge de la rama remota a la rama local, como ya hemos visto, pero para hacerlo bien, vamos a eliminar los nuevos commits de master (siguen en feat_empleado, así que no se pierden).
	Para ello, usamos un git reset --hard desde master, volviendo al último commit común al master remoto.
	
![20cambiamos a master y volvemos a commit comun para pull](https://user-images.githubusercontent.com/114091264/205150726-746c9e54-200e-4059-99d6-7837a9ad6d0c.png)

	
	vii. Ahora sí podemos hacer un pull de master sin conflicto
	
		![21 pull sin conflicto](https://user-images.githubusercontent.com/114091264/205150752-8a36fcd3-f9fa-4647-8ef6-f42d9407dcda.png)

		
	viii. Hacemos merge de la nueva rama local feat_empleado. Ahora sí tendremos conflicto.
		
![22git merge](https://user-images.githubusercontent.com/114091264/205150766-8293e195-da4a-4d7c-9f63-50326bd80e58.png)

	
	Solventamos los conflictos (en Main.java) y como realmente se está abordando la misma
	funcionalidad, lo llevamos más allá y dejamos una versión funcional con lo que queremos
	quedarnos de cada rama (ver en mi log)
	
![23resolvemos](https://user-images.githubusercontent.com/114091264/205150795-3e8b3ce6-7ea3-41e1-bd01-767b84e36c6a.png)

	
	ix. Terminamos el merge con add y commit, y hacemos un push.
	
	![24 git add git commit pa terminar de merge](https://user-images.githubusercontent.com/114091264/205150816-8a1a53a5-f798-4045-a31b-6f8d360fd86d.png)
![25git push](https://user-images.githubusercontent.com/114091264/205150819-fa26d435-b6c6-40b5-ad3b-fecbda498720.png)

	
11. Volvemos a Ordenador2 y comprobamos si tenemos todo al día con git status y git log.
Si no nos indica que el master local está por detrás del remoto, será necesario hacer un git fetch, que ahora nos indicará que debemos hacer un pull.

	![26 git status git log ordenador2](https://user-images.githubusercontent.com/114091264/205150843-920a313e-98fc-4b42-a2ce-e7f1a8cad6ea.png)

	
	No sé muy bien que hice pero creo que puse todo al día:
	
![27noseqhice1](https://user-images.githubusercontent.com/114091264/205150935-688a350a-ba66-4680-996b-7419531de217.png)
![28noseqhice2](https://user-images.githubusercontent.com/114091264/205150884-7fd39cb8-0a69-4526-a8ef-f463eab3cd14.png)
![29noseqhiceperotodoOK](https://user-images.githubusercontent.com/114091264/205150881-edf2e6f1-10ad-49b3-9017-fae0c4462cb9.png)
	
12. Ahora vamos a simular cómo se desarrollaría en paralelo en varias ramas (distintas personas).
No crearemos carpetas que simulen ordenadores pero cada rama representará el trabajo independiente de cada componente del equipo de trabajo.

	i. Creamos dos ramas desde master, que desarrollaremos sin hacer merge a master (simulando otro desarrollador trabajando en paralelo):
	
		a. "feat_inmutable_fields" para evitar que se pueda cambiar el nombre y la fecha de contratación
		   de un empleado (asumimos que las especificaciones del proyecto lo impiden, sea o no razonable)
		   
	
![30 creacion nuevas ramas](https://user-images.githubusercontent.com/114091264/205151211-29884bd3-6019-43bf-a88d-f702b2ccc743.png)
![32inmutable_fields1](https://user-images.githubusercontent.com/114091264/205151175-f5e90c61-3903-4504-bb3c-c5394161def8.png)
![33inmutable_fields2](https://user-images.githubusercontent.com/114091264/205151146-6b643553-efd7-4858-a1f6-8e531af49e55.png)


		b. "bug_edad_negativa", para garantizar que la edad de un empleado no pueda ser negativa.
		
![31merge dos nuevas ramas a master](https://user-images.githubusercontent.com/114091264/205151262-caa564eb-c462-42ed-afe9-533332fa6f1e.png)

![34bug_edad_log](https://user-images.githubusercontent.com/114091264/205151291-97386c05-d032-4c0d-8736-9bb54ac731e9.png)

			
		
	ii. Una vez desarrolladas, hacemos el merge de ambas ramas a master solventando conflictos.
	
![36merge y cosas raras](https://user-images.githubusercontent.com/114091264/205151395-2e48734b-1b4e-47a7-926f-cc7b5ea6c6ca.png)

![37mergeinmutable fields](https://user-images.githubusercontent.com/114091264/205151421-00f09dc8-6ce7-4c40-b2a5-89266131ab36.png)

		

13. Realizamos otras mejoras en la rama feat_deprecated_data_type para solucionar los problemas de la librería obsoleta java.util.Date, y los mergeamos.
		
![42](https://user-images.githubusercontent.com/114091264/205151473-825fabb2-5885-4731-b27d-1856c1ca4d54.png)

![41](https://user-images.githubusercontent.com/114091264/205151481-60c6a69a-551c-41c3-adfb-64d89a1fd753.png)

![35log de las ultimas 2 ramas](https://user-images.githubusercontent.com/114091264/205151499-aa95686b-ec1d-493b-8336-3281dad35df6.png)

![38 merge y mas liada](https://user-images.githubusercontent.com/114091264/205151535-ab418193-e5cc-4124-895a-166bcd1e14f0.png)

![39 merge y push encima le puse mal el nombre y me lie muchiximo](https://user-images.githubusercontent.com/114091264/205151551-51927aec-7888-456b-8b2d-63c5dd0cedf2.png)

![40 le puse el nombre bien y tal](https://user-images.githubusercontent.com/114091264/205151571-52bf9b19-5505-4fdf-b73d-5bf72a2540ac.png)


<!-- se ha intentado ☻ -->
