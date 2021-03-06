# FRGroupe1git

## Présentation

Projet fil rouge pour la réalisation d'un portail web de catalogue de formations.

Le site web permet à l'utilisateur de consulter le catalogue de formation, d'obtenir des informations sur une formation particulière, et de s'y inscrire. Il peut consulter de plus, à l'aide d'un tableau de bord, ses informations personnelles et la formation en cours qu'il est entrain d'assister.

Le site web donne aussi la possibilité à l'admin d'ajouter des formations à partir du navigateur.

Finalement, une side bar est présente à gauche pour permettre à l'utilisateur un accès plus rapide aux différentes formations que présente le portail web.

<p align="center">
<img src="https://media.giphy.com/media/o409lcPopm6cY4ykGC/giphy.gif" title="Projet fil rouge" alt="Projet Fil Rouge">
 </p>

## Prérequis

- [bibliothèques JDK version 11.0.9](https://www.oracle.com/fr/java/technologies/javase/jdk11-archive-downloads.html)

- [NodeJs 16.15.1](https://nodejs.org/en/download/)

- [MySQL version 8.0.29](https://dev.mysql.com/downloads/installer/)

## Technologies utilisées

- [Angular 14.0.2](https://angular.io/guide/setup-local)

- [Spring Boot 2.7.1](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.installing)

- [MySQL version 8.0.29](https://dev.mysql.com/downloads/installer/)

- [Visual Studio Code](https://code.visualstudio.com/) 

- [IntelliJ IDEA](https://www.jetbrains.com/fr-fr/idea/download/#section=windows)

## Installation

1. Dans le dossier `bdd` , ouvrir le script `FilRouge.sql` avec MySQL et l'exécuter.

2. Ouvrir le dossier `back` avec IntelliJ en utilisant `Maven` (open project from existing sources).

3. Dans `back > src > main > resources`, ouvrir le fichier `application.properties`  et configurer le fichier selon les instructions suivantes : 
   
   - À la ligne : `spring.datasource.url=jdbc:mysql://localhost:3306/`, ajouter le nom de la base de donnée (le nom du schéma dans MySQL)
   
   - À la ligne : `spring.datasource.username=`, ajouter le nom de l'utilisateur figurant dans le serveur MySQL où se trouve le schéma de la base de données.
   
   - Puis dans la ligne : `spring.datasource.password=`, préciser le mot de passe associé à cet utilisateur.

4. Dans `back > src > main > java > Fr.groupe1.ITTraining`, ouvrir le fichier `itTrainingApplication` et l'exécuter.

5. Ouvrir le dossier `front` avec Visual Studio Code.

6. Dans le terminal associé à l'IDE, lancer la commande `npm install` pour installer et mettre à jour les modules manquants.

7. Une fois les modules installés, lancer dans le terminal la commande `ng serve -o`.

## Utilisation

(à venir)

## Membres de l'équipe de développement

> - Amine Laaroussi 
> 
> - Marie Defretin 
> 
> - Thomas Barré 
