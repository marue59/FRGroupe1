-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: it_training
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `domaine`
--

DROP TABLE IF EXISTS `domaine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `domaine` (
  `id` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `domaine`
--

LOCK TABLES `domaine` WRITE;
/*!40000 ALTER TABLE `domaine` DISABLE KEYS */;
INSERT INTO `domaine` VALUES (1,'informatique');
/*!40000 ALTER TABLE `domaine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entreprise`
--

DROP TABLE IF EXISTS `entreprise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entreprise` (
  `id` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `adresse` longtext,
  `code_postal` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `ville` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entreprise`
--

LOCK TABLES `entreprise` WRITE;
/*!40000 ALTER TABLE `entreprise` DISABLE KEYS */;
INSERT INTO `entreprise` VALUES (1,'Groupe Lexom','39 Rue de Wattignies','75012','09 71 09 05 50','Paris','contact@lexom.fr'),(2,'Dawan','46 Rue des Canonniers','59800','09 72 37 73 73','Lille','contact@dawan,fr'),(3,'Capital Formations','Rue du Helder','75009','01 53 34 00 13','Paris','contact@capital-formations.fr');
/*!40000 ALTER TABLE `entreprise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evaluation` (
  `id` int NOT NULL,
  `qualite_accueil` int DEFAULT NULL,
  `qualite_environnement` int DEFAULT NULL,
  `qualite_stage` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `pedagogie_formateur` int DEFAULT NULL,
  `maitrise_formateur` int DEFAULT NULL,
  `disponibilite_formateur` int DEFAULT NULL,
  `reponse_formateur` int DEFAULT NULL,
  `animation_formateur` int DEFAULT NULL,
  `satisfaction_utilisateur` int DEFAULT NULL,
  `autre_projet` longtext,
  `moyenne_note` double DEFAULT NULL,
  `sav_id` int NOT NULL,
  PRIMARY KEY (`id`,`sav_id`),
  KEY `fk_evaluation_sav1_idx` (`sav_id`),
  CONSTRAINT `fk_evaluation_sav1` FOREIGN KEY (`sav_id`) REFERENCES `sav` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluation`
--

LOCK TABLES `evaluation` WRITE;
/*!40000 ALTER TABLE `evaluation` DISABLE KEYS */;
INSERT INTO `evaluation` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1);
/*!40000 ALTER TABLE `evaluation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formation`
--

DROP TABLE IF EXISTS `formation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `formation` (
  `id` int NOT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `description` longtext,
  `objectifs` longtext,
  `programme` longtext,
  `prix` int DEFAULT NULL,
  `heures` int DEFAULT NULL,
  `jours` int DEFAULT NULL,
  `is_personnalisee` tinyint DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formation`
--

LOCK TABLES `formation` WRITE;
/*!40000 ALTER TABLE `formation` DISABLE KEYS */;
INSERT INTO `formation` VALUES (1,'Unix, Maitriser Unix','Cette formation vous prépare au passage de la certification \"AVIT by ENI - Administration d’un système Linux','Permettre aux participants d\'accéder à une réelle maîtrise du système Unix grâce à une progression pédagogique rigoureuse et à de nombreux exercices pratiques sous les principales versions d\'Unix ( AIX, HP/UX, Solaris et Linux). // Fournir une synthèse des informations nécessaires à l\'utilisation quotidienne et à la compréhension du fonctionnement d\'un système Unix. // Détailler une sélection d\'exemples variés et représentatifs des possibilités du système. // Présenter les différences fondamentales entre les principales versions du système Unix.','Notions et fonctions de base // L\'exécution des commandes // Les outils et la programmation du shell // Les mécanismes internes et la communication // Exploitation du système',2260,28,4,0,'Unix'),(2,'Unix Perfectionnement','Orienté vers l\'utilisation performante et sécurisée du système Unix, ce cours vous permettra d\'approfondir les fonctionnalités conduisant à une meilleure productivité. Il vous apprendra à mettre en œuvre les principales techniques d\'exécution en environnement réseau. Enfin, il vous montrera comment analyser à l\'aide des tableaux de bord les situations rencontrées dans son exploitation opérationnelle.','Passer l\'étape importante de la maîtrise de l\'éditeur \"vi\",2 8,\". // Approfondir les fonctionnalités d\'Unix. //  Mettre en œuvre différents shells. // Construire des outils à l\'aide des shells. // Comprendre et sécuriser l\'environnement. // Optimiser l\'exploitation d\'Unix.','Introduction // Mise en oeuvre des différents shells // Construction d\'outils à l\'aide des shells // Paramétrage et configuration de l\'environnement // Gestion de la sécurité pour l\'utilisateur // Utilisation des commandes // Exploration et recherche de fichiers // Edition automatique de fichiers avec awk // Sauvegardes et archivages // Gestion de l\'environnement d\'exécution // Analyse et optimisation des performances TCP/IP sous Unix // Système graphique et fenêtré',1690,21,3,0,'Unix'),(3,'Linux pour débutants','Linux est souvent considéré comme un système complexe et très technique, il est vrai que les premières distributions étaient effectivement destinées à des utilisateurs avertis. Depuis quelques années maintenant on peut aborder Linux avec la même facilité que les systèmes Mac ou Windows. // Cette formation est destinée prioritairement aux non-informaticiens ou aux débutants sur Linux. Il s\'agit de vous donner une réelle autonomie sur ce système pour une utilisation fluide au quotidien. // L\'ensemble des sujets fondamentaux est abordé de façon simple et concrète. Vous serez en mesure également de comprendre et débattre avec des spécialistes Linux en utilisant le vocabulaire adéquat et sachant différentier les tâches simples de celles plus complexes.','Comprendre le fonctionnement d\'un système Linux. // Comprendre le déroulement d\'une session. // Savoir utiliser son poste de travail sous Linux. // Gérer les fichiers et les applications associées. // Configurer et installer Linux en réseau local.','A quoi sert un système Linux, comment ça marche? // Une session type // Compléments sur les fichiers // Le poste de travail // La gestion des applications Linux en réseau local // Installer Linux',1650,21,3,0,'Linux'),(4,'Maîtriser les outils Linux','Savoir être performant en choisissant le bon outil pour le bon traitement dans le vaste atelier offert par l\'Open Source. Maîtriser l\'exploitation de fichiers aux formats divers (texte brut, texte formaté, image, binaire, ...) notamment avec grep, sed, et awk.','Revoir le Shell Bash. //  Automatiser les traitements avec des shellscripts. // S\'adapter aux expressions régulières, au Grep, ed et sed. // Introduire et comprendre le langage awk. // Gérer la publication des données. // Utiliser les outils et commandes sur les fichiers.','Rappels sur le shell bash // Automatiser les traitements avec des shellscripts // Grep, ed, sed et les expressions régulières // Le langage awk // Publication des données // Outils et commandes sur les fichiers',2090,28,4,0,'Linux'),(5,'Excel – Initiation','Sorti fin 2015, Excel 2016 est le tout récent successeur d\'Excel 2013. La majorité des fonctionnalités n\'a pas évolué, mais Microsoft a tout de même apporté quelques nouveautés tant dans l\'interface utilisateur que dans les fonctionnalités mêmes d\'Excel. // Cette formation Excel 2016 Initiation est un bon début pour connaître les fonctions de base du logiciel.','Être à l’aise avec l’environnement de travail. // Savoir construire des tableaux en soignant rapidement leur mise en forme. // Comprendre comment réaliser des calculs de base. // Être en mesure de créer, modifier, sauvegarder et imprimer ses documents. // Préparer les bases de l\'examen TOSA.','Environnement et méthodes dans Excel 2016 // Calculs (formules, fonctions) avec Excel 2016 // Mise en forme sous Excel 2016 // Mise en page et paramétrage de l’impression // Travail en multi-feuilles sur Excel 2016 // Initiation à la représentation et à la gestion des données',650,14,2,0,'excel'),(6,'Excel – Perfectionnement','Cette formation Excel 2016 Perfectionnement destinée à toute personne souhaitant maîtriser de manière approfondie les bases d’Excel, couvre les besoins essentiels du logiciel. Elle constitue en outre une excellente introduction pour ceux qui souhaiteraient poursuivre leur montée en compétences sur les fonctions plus avancées d’Excel 2016.','Gérer des listes de données. // Maîtriser les représentations graphiques. // Savoir créer des liaisons entre calcul. // Atteindre le niveau Opérationnel de la certification TOSA.','Consolidation de tableaux Excel 2016 // Perfectionnement sur les Calculs avec Excel 2016 // Gestion des grands tableaux de type liste de données avec Excel 2016 // Création de tableaux et graphiques croisés dynamiques avec Excel 2016',650,14,2,0,'excel'),(7,'PowerPoint – Initiation','Avec l\'arrivée de la version 2016, PowerPoint propose une interface simplifiée et maintenant adaptée au tactile. Le logiciel incontournable de la présentation intègre de nouveaux outils de conception tels que les repères d\'alignement ou de trajectoire d\'objets. // Les participants à cette formation PowerPoint 2016 Initiation découvriront les différentes étapes de la création d\'une présentation et disposeront des compétences nécessaires à l\'élaboration de leurs premiers \"PowerPoint\".','Construire avec méthode et rapidité, une présentation intégrant du texte et des illustrations. // Utiliser les masques de diapositives pour accélérer la conception. // Mettre au point le diaporama pour la projection et l’impression. // Atteindre le niveau Opérationnel de la certification TOSA.','Présenter l’interface // Mieux présenter son texte dans une diapositive // Utiliser des dispositions de diapositives pour optimiser leurs contenus // Utiliser des Thèmes et modèles pour faciliter et accélérer la conception de diapositives // Illustrer ses diapositives avec des organigrammes, des SmartArt, des tableaux ou des graphiques // Diffuser son diaporama // Optimiser la mise en page',650,14,2,0,'PowerPoint'),(8,'PowerPoint – Perfectionnement','Il est plus facile de retenir l’attention d’un auditoire ou de faire passer ses idées en s’appuyant sur des supports visuels de qualité. PowerPoint permet précisément la création de présentations \"attractives\". // Cette formation PowerPoint 2016 Perfectionnement vise à fournir aux participants les compétences nécessaires à la conception de présentations percutantes avec PowerPoint 2016. Ils apprendront notamment à valoriser leurs créations en y intégrant différents types d’objets (graphiques, tableaux, dessins, vidéos...), des effets d’animations, etc.','Paramétrer et personnaliser un diaporama. // Dynamiser sa présentation avec des transitions et des animations élaborées. // Perfectionner vos textes en créant un sommaire, des liens hypertextes, des boutons d’action. // Savoir utiliser l’écran de contrôle (mode présentateur) pour optimiser votre projection. // Atteindre le niveau Expert de la certification TOSA.','Optimiser son environnement et l’exploitation de son diaporama // Devenir expert dans le paramétrage de son diaporama // Perfectionner la gestion de vos textes // Maitriser la création et modification des objets de la présentation // Dynamiser son animation // Optimiser et approfondir l’utilisation des masques, thèmes et modèles',350,7,1,0,'PowerPoint'),(9,'Le langage C#','Le langage C# est le langage objet phare de Microsoft. Il permet de développer tout type d\'application (client lourd, web, web service, ...). Le langage C# est très lié à la plateforme .Net à laquelle il \"emprunte\" ses objets pour développer des applications fenêtrées (Windows Forms ou WPF), des sites WEB (ASP.net Web Forms et MVC), ou encore se connecter aux bases de données (ADO.net, LINQ et Entity Framework). L\'environnement de développement intégré incontournable pour le C# est Visual Studio. // Cette formation C# vous permettra de maîtriser les fondamentaux du langage C# et l\'environnement de programmation Visual Studio. Au-delà du langage C#, qui reste l’objectif de base de la formation, la plateforme .NET vous sera également présentée afin de bien comprendre l\'environnement global sur lequel peut s’appuyer  le langage C#.','Comprendre les principes du développement objet (classe, méthode, héritage, etc.). // Comprendre le rôle du framework .NET et savoir utiliser ses classes. // Configurer et utiliser Visual Studio. // Maîtriser la syntaxe et les concepts du langage C#. // Utiliser ADO.NET et LINQ pour accéder aux données d\'une base quelque soit leur provenance et les manipuler. // Savoir appliquer les grands principes de C# à la réalisation d\'applications riches (Windows Forms ou WPF). // Utiliser des services Web XML dans une application C#. // Tester des fonctionnalités avancées de C#. // Créer une première application Web en ASP.NET.','Introduction à .Net // La conception Objet // Les bases de C# // La programmation en C# // La programmation avancée en C# // Les classes incontournables du framework // Introduction à l’accès aux données en .NET // Introduction à WPF et aux Windows Forms // ASP.Net/ C# et Webform',2695,35,5,0,'C_Sharp'),(10,'C# perfectionnement','Cette formation « Langage C# avancé » vous permettra de maîtriser tous les concepts fondamentaux liés au développement des applications .NET (WPF, LINQ, Service Windows, Multithread) et à la communication (Socket, WCF, WebServices REST et SOAP). // Après une synthèse technique sur les possibilités et les performances des différentes technologies .NET, vous apprendrez à gérer de façon efficace vos applications sous forme de services (WebServices, WCF). // Ensuite vous prendrez la mesure des possibilités de LINQ et de sa philosophie originale pour gérer les données ainsi que celle du remplaçant des Windows Forms : WPF (effets graphiques, liens avec XAML, databinding, etc.). // Vous apprendrez aussi à développer vos propres services systèmes et à utiliser la technologie des sockets ainsi que les multithread. Pour finir, vous aborderez le développement et le déploiement de services Windows.','Créer et déployer un service Windows. // Optimiser le code de vos applications. // Programmer en des application multithreads. // Implémenter des WebServices SOAP et REST. // Utiliser les sockets pour  la programmation réseau. // Utiliser WPF. // Utiliser LINQ dans un programme C#.','Rappels et compléments sur le Framework .Net // Performances et mémoire (code non managé) - Optimisation C# // Créer et déployer un service Windows // Multithreading sous .NET // Introduction à la communication sous .NET // Services Web ASP.NET (SOAP et REST) // Programmation réseau avec les sockets // WCF // WPF (Windows Presentation Foundation) // Créer ses propres contrôles utilisateurs (User Controls) // LINQ (Language Integrated Query)',2290,28,4,0,'C_Sharp'),(11,'WPF : Développement d\'applications graphiques','Initialement proposé avec le framework .NET 3.0, Windows Présentation Foundation, plus couramment nommé WPF est un sous-système graphique pour le rendu des interfaces utilisateur dans les applications Windows. // Basé sur DirectX, il supporte ainsi l\'accélération matérielle et des fonctionnalités d\'interface modernes comme la transparence et les dégradés, devenu standards avec l\'arrivée de Windows 7. // Outre les aspects graphiques, WPF offre également un nouveau langage basé sur XML, le XAML (eXtensible Application Markup Langage) qui permet de séparer clairement l\'interface utilisateur et la logique métier, partageant de ce fait le travail du designer et du codeur.','Apprendre à utiliser le nouveau langage déclaratif XAML, utilisé pour le développement d\'interfaces Windows. // Être en mesure de développer des applications conviviales et graphiquement riches. // Être en mesure de configurer et déployer des applications WPF.','Concevoir une application Windows Client // Introduction à Visual Studio 2017 et WPF // Concevoir et développer une interface utilisateur // Contrôler une interface utilisateur // Liaison de Données simple et validation // Liaison de Données vers les collections // Architecture MVVM // Graphiques WPF 2D, multimédia et impressions // Personnalisation des contrôles // Propriétés attachées et comportements avec WPF // Animations dans WPF // États, paramètres et cycle de vie des applications // Configurer et déployer des applications Windows Client // WPF avec .NET Core',2695,35,5,0,'WPF'),(12,'WCF et ASP.NET Core','Cette formation WCF s\'adresse aux développeurs .NET expérimentés. // Pour suivre ce cours, vous devez connaitre la programmation C#. Il est également nécessaire d\'avoir une expérience significative dans le développement d\'applications .NET.','Créer un service WCF. // Déployer un service WCF. // Configurer et sécuriser des services WCF. // Mettre en oeuvre un service WCF transactionnel.','Architecture Orientée Service (SOA) // Débuter avec le développement WCF // Héberger les services WCF // Définition et implémentation de contrats WCF // Points de terminaison et Comportements // Tester et résoudre les problèmes des services WCF // Sécurité // Fonctionnalités avancées // La nouvelle approche avec ASP.NET Core // Création d’un service REST avec ASP.NET Core // gRPC // Déploiement',2290,28,4,0,'ASP_NET'),(13,'Java, les fondamentaux','Le langage Java est au cœur des applications d’entreprise et a réussi à s’imposer comme l’un des langages orienté-objet les plus utilisé dans le monde. Cette formation a pour objectif d’acquérir de solides bases sur le langage Java et de permettre une initiation progressive aux différentes APIs coeurs. Les entrées-sorties, l’accès aux bases données, les dernières nouveautés de Java seront présentées ainsi qu’une introduction technique complète à un environnement de développement standard pour Java (Eclipse, Maven, etc.)','Maîtriser son environnement de développement (IDE Java). // Maîtriser la syntaxe Java. // Savoir appliquer les concepts de la programmation orientée objet au langage Java (classes, méthodes, encapsulation, héritage, constructeur, polymorphisme, classe abstraite, interfaces, relations entre classes, etc.). // Mettre en œuvre les principales fonctions des API standards (Collections, I/O, JDBC, Streams, …). // Connaître les spécificités des différentes versions de Java.','Présentation de Java // Outils de développement // Java, fondamentaux // Classes, objets, relations entre objets // Les exceptions // Déploiement d’applications // Les collections et la généricité // Les flux d\'entrées-sorties // L\'accès aux bases de données avec l’API JDBC // Expressions Lambda, références de méthodes // Introduction à l’API Stream pour la manipulation de flux de données //',2490,35,5,0,'Java'),(14,'Java Avancé, perfectionnement','Cette formation Java avancé permet aux personnes ayant suivi une première initiation à Java, d’approfondir leurs connaissances du langage afin d’intégrer directement une équipe projet. // La formation commence par détailler le fonctionnement interne de la JVM (Java Virtual Machine) afin que le développeur puisse diagnostiquer des problèmes de performances liés à la conception de son programme et à l\'utilisation des objets Java. // Vous apprendrez à concevoir une application multi-threadée, et à synchroniser ses threads, tout en évitant la corruption de données. // Vous apprendrez ensuite à utiliser le langage Java dans le contexte des bases de données relationnelles (JDBC, JPA/Hibernate), ce qui apporte une dimension de projet professionnel à la formation. // La manipulation avancée de fichiers/répertoires est également visitée avec les API Nio.2.','Avoir compris le fonctionnement de la JVM. // Programmer en Java dans le contexte des bases de données relationnelles. // Développer une application Java multitâches en utilisant les threads. // Utiliser les expressions lambdas. // Mettre en œuvre l’API Stream. // Mettre en œuvre les modules de Java 9.','Fonctionnement de la JVM (Java Virtual Machine) // Classes internes, Généricité, Annotations // Programmation parallèle (multithreading) // L\'accès aux bases de données // Accès complet au système de gestion de fichiers avec Nio.2 // Expressions Lambda, références de méthodes // Mise en œuvre de l’API Stream pour la manipulation de flux de données // Le système de modules //',1690,21,3,0,'Java'),(15,'Spring : Développer avec le framework Spring','Spring est le framework Java le plus répandu pour le développement d\'applications d\'entreprises offrant une réelle alternative à Java EE. // Ses atouts : faciliter le développement et les tests, améliorer les performances, proposer de bon design pattern aux développeurs. Spring s\'appuie principalement sur l\'intégration de trois concepts clés : l\'inversion de contrôle ou injection de dépendance, la programmation orientée aspect et une couche d\'abstraction qui permet d\'intégrer d\'autres frameworks et bibliothèques avec une plus grande facilité. // Cette formation Spring  vous permet d\'apprendre les bases du framework Spring et d\'être sensibilisé à la facilité de mettre en œuvre des tests unitaires et d\'intégration avec ce framework. Le premier atelier permet aux participants de mettre en place l\'IDE Spring Tools Suite et d\'effectuer une première configuration Spring simple. Les ateliers suivants s\'adossent à une application web typique utilisant Spring MVC, une couche service et Spring Data. Les participants doivent alors compléter les sources fournies, effectuer les configurations Spring adéquates, mettre au point les tests validant la spécification. Tous les tiers d\'une application web sont abordés et plusieurs implémentations sont proposées. Le dernier chapitre permet aux participants de découvrir les aspects les plus modernes du framework et les APIs vers les réseaux sociaux, les mobiles et le cloud.','Mettre en place l\'IDE Spring Tools Suite et d\'effectuer une première configuration Spring simple. // Maîtriser une application web typique utilisant Spring MVC, une couche service et Spring Data. // Compléter les sources fournies, effectuer les configurations Spring adéquates, mettre au point les tests validant la spécification. // Prendre connaissance des aspects les plus modernes du framework et les APIs vers les réseaux sociaux, les mobiles et le cloud.','Introduction au framework Spring // Spring Cœur // Applications Web avec Spring MVC // Spring Data et l\'accès aux données (JDBC / Hibernate / JPA / NoSQL) // Spring et les tests // Spring et l’intégration',1690,21,3,0,'Spring'),(16,'Spring Boot : Accélérez vos développements','Spring Boot simplifie à l’extrême le démarrage, la configuration et le déploiement d\'un projet Spring. Avec ses capacités d’auto-configuration basées principalement sur la gestion des dépendances, il permet aux développeurs de se concentrer sur leur problématique métier plutôt que sur des problèmes techniques de configuration et d’intégration. Embarquant un conteneur de servlet embarqué, les applications Spring Boot sont de simples applications Java qu’il suffit de démarrer. Ce nouveau type de packaging simplifie à l’extrême la mise en production des applications (plus de déploiement sur un serveur applicatif!). En ce sens, les applications Spring Boot s’inscrivent dans l’approche DevOps et sont très appropriées aux architectures micro-service.','Les fonctionnalités du framework. // Son intégration dans l’IDE Spring Tool Suite. // Ses apports pour les différentes couches applicatives (JPA, Rest/MVC, Test) et pour la mise en production d’application.','Introduction à Spring Boot // Premiers pas avec Spring Boot // Persistance des données avec Spring Data // Applications Web et API Rest avec Spring MVC // Spring Boot et le test // Auto-configuration // Mise en production // Sécurité et Spring Boot',1850,21,3,0,'Spring');
/*!40000 ALTER TABLE `formation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logistique`
--

DROP TABLE IF EXISTS `logistique`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logistique` (
  `id` int NOT NULL,
  `is_salle_installee` tinyint DEFAULT NULL,
  `is_salle_reservee` tinyint DEFAULT NULL,
  `is_support_imprime` tinyint DEFAULT NULL,
  `is_machine_installee` tinyint DEFAULT NULL,
  `is_formateur_contacte` tinyint DEFAULT NULL,
  `is_formulaire_genere` tinyint DEFAULT NULL,
  `is_convocation_envoyee` tinyint DEFAULT NULL,
  `is_planning_ajour` tinyint DEFAULT NULL,
  `is_liste_imprimee` tinyint DEFAULT NULL,
  `is_ticket_imprime` tinyint DEFAULT NULL,
  `sav_id` int NOT NULL,
  PRIMARY KEY (`id`,`sav_id`),
  KEY `fk_logistique_sav1_idx` (`sav_id`),
  CONSTRAINT `fk_logistique_sav1` FOREIGN KEY (`sav_id`) REFERENCES `sav` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logistique`
--

LOCK TABLES `logistique` WRITE;
/*!40000 ALTER TABLE `logistique` DISABLE KEYS */;
INSERT INTO `logistique` VALUES (1,0,0,0,0,0,0,0,0,0,0,1);
/*!40000 ALTER TABLE `logistique` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sav`
--

DROP TABLE IF EXISTS `sav`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sav` (
  `id` int NOT NULL,
  `client` varchar(45) DEFAULT NULL,
  `question_stagiaire` varchar(45) DEFAULT NULL,
  `ca` double DEFAULT NULL,
  `nombre_formation` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sav`
--

LOCK TABLES `sav` WRITE;
/*!40000 ALTER TABLE `sav` DISABLE KEYS */;
INSERT INTO `sav` VALUES (1,NULL,NULL,0,0);
/*!40000 ALTER TABLE `sav` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session`
--

DROP TABLE IF EXISTS `session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `session` (
  `id` int NOT NULL,
  `date` date DEFAULT NULL,
  `is_intra` tinyint DEFAULT NULL,
  `lieu` varchar(45) DEFAULT NULL,
  `formation_id` int NOT NULL,
  `logistique_id` int NOT NULL,
  PRIMARY KEY (`id`,`formation_id`,`logistique_id`),
  KEY `fk_session_formation1_idx` (`formation_id`),
  KEY `fk_session_logistique1_idx` (`logistique_id`),
  CONSTRAINT `fk_session_formation1` FOREIGN KEY (`formation_id`) REFERENCES `formation` (`id`),
  CONSTRAINT `fk_session_logistique1` FOREIGN KEY (`logistique_id`) REFERENCES `logistique` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session`
--

LOCK TABLES `session` WRITE;
/*!40000 ALTER TABLE `session` DISABLE KEYS */;
INSERT INTO `session` VALUES (1,'2022-09-12',0,'Lille',1,1),(2,'2022-09-12',0,'Lille',2,1),(3,'2022-09-12',0,'Lille',3,1),(4,'2022-09-12',0,'Lille',4,1),(5,'2022-09-12',0,'Lille',5,1),(6,'2022-09-12',0,'Lille',6,1),(7,'2022-09-12',0,'Lille',7,1),(8,'2022-09-12',0,'Lille',8,1),(9,'2022-09-12',0,'Lille',9,1),(10,'2022-09-12',0,'Lille',10,1),(11,'2022-09-12',0,'Lille',11,1),(12,'2022-09-12',0,'Lille',12,1),(13,'2022-09-12',0,'Lille',13,1),(14,'2022-09-12',0,'Lille',14,1),(15,'2022-09-12',0,'Lille',15,1),(16,'2022-09-12',0,'Lille',16,1);
/*!40000 ALTER TABLE `session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sous_theme`
--

DROP TABLE IF EXISTS `sous_theme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sous_theme` (
  `id` int NOT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `theme_id` int NOT NULL,
  PRIMARY KEY (`id`,`theme_id`),
  KEY `fk_sous_theme_theme1_idx` (`theme_id`),
  CONSTRAINT `fk_sous_theme_theme1` FOREIGN KEY (`theme_id`) REFERENCES `theme` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sous_theme`
--

LOCK TABLES `sous_theme` WRITE;
/*!40000 ALTER TABLE `sous_theme` DISABLE KEYS */;
INSERT INTO `sous_theme` VALUES (1,'Unix',1),(2,'Linux',1),(3,'Excel',2),(4,'PowerPoint',2),(5,'.NET',3),(6,'Développement Windows',3),(7,'Java',4),(8,'Spring',4);
/*!40000 ALTER TABLE `sous_theme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sous_theme_has_formation`
--

DROP TABLE IF EXISTS `sous_theme_has_formation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sous_theme_has_formation` (
  `sous_theme_id` int NOT NULL,
  `formation_id` int NOT NULL,
  PRIMARY KEY (`sous_theme_id`,`formation_id`),
  KEY `fk_sous_theme_has_formation_formation1_idx` (`formation_id`),
  KEY `fk_sous_theme_has_formation_sous_theme1_idx` (`sous_theme_id`),
  CONSTRAINT `fk_sous_theme_has_formation_formation1` FOREIGN KEY (`formation_id`) REFERENCES `formation` (`id`),
  CONSTRAINT `fk_sous_theme_has_formation_sous_theme1` FOREIGN KEY (`sous_theme_id`) REFERENCES `sous_theme` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sous_theme_has_formation`
--

LOCK TABLES `sous_theme_has_formation` WRITE;
/*!40000 ALTER TABLE `sous_theme_has_formation` DISABLE KEYS */;
INSERT INTO `sous_theme_has_formation` VALUES (1,1),(1,2),(2,3),(2,4),(3,5),(3,6),(4,7),(4,8),(5,9),(5,10),(6,11),(6,12),(7,13),(7,14),(8,15),(8,16);
/*!40000 ALTER TABLE `sous_theme_has_formation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
  `id` int NOT NULL,
  `question` longtext,
  `reponse` longtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
INSERT INTO `test` VALUES (1,NULL,NULL);
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `theme`
--

DROP TABLE IF EXISTS `theme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theme` (
  `id` int NOT NULL,
  `nom` varchar(100) DEFAULT NULL,
  `description` longtext,
  `domaine_id` int NOT NULL,
  PRIMARY KEY (`id`,`domaine_id`),
  KEY `fk_theme_domaine_idx` (`domaine_id`),
  CONSTRAINT `fk_theme_domaine` FOREIGN KEY (`domaine_id`) REFERENCES `domaine` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theme`
--

LOCK TABLES `theme` WRITE;
/*!40000 ALTER TABLE `theme` DISABLE KEYS */;
INSERT INTO `theme` VALUES (1,'Unix - Linux - MacOS','Pour tout connaître sur Unix, Solaris, AIX, Linux, Red Hat, Debian, macOS,...',1),(2,'Microsoft Application','Pour apprendre Exchange, SharePoint, Office, Lync...',1),(3,'Microsoft .NET','Pour apprendre C#, ASP .NET, Visual Studio, MVC,...',1),(4,'JAVA - JAVA EE','Pour tout connaître sur Hibernate, JBoss, Spring, Weblogic,...',1);
/*!40000 ALTER TABLE `theme` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilisateur`
--

DROP TABLE IF EXISTS `utilisateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utilisateur` (
  `id` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `adresse` longtext,
  `email` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  `is_test` tinyint DEFAULT NULL,
  `note_moyenne` varchar(45) DEFAULT NULL,
  `is_technique` tinyint DEFAULT NULL,
  `is_pedagogique` tinyint DEFAULT NULL,
  `is_prerequis` tinyint DEFAULT NULL,
  `session_id` int NOT NULL,
  `test_id` int NOT NULL,
  `entreprise_id` int NOT NULL,
  `evaluation_id` int NOT NULL,
  `sav_id` int NOT NULL,
  PRIMARY KEY (`id`,`session_id`,`test_id`,`entreprise_id`,`evaluation_id`,`sav_id`),
  KEY `fk_utilisateur_session1_idx` (`session_id`),
  KEY `fk_utilisateur_test1_idx` (`test_id`),
  KEY `fk_utilisateur_entreprise1_idx` (`entreprise_id`),
  KEY `fk_utilisateur_evaluation1_idx` (`evaluation_id`),
  KEY `fk_utilisateur_sav1_idx` (`sav_id`),
  CONSTRAINT `fk_utilisateur_entreprise1` FOREIGN KEY (`entreprise_id`) REFERENCES `entreprise` (`id`),
  CONSTRAINT `fk_utilisateur_evaluation1` FOREIGN KEY (`evaluation_id`) REFERENCES `evaluation` (`id`),
  CONSTRAINT `fk_utilisateur_sav1` FOREIGN KEY (`sav_id`) REFERENCES `sav` (`id`),
  CONSTRAINT `fk_utilisateur_session1` FOREIGN KEY (`session_id`) REFERENCES `session` (`id`),
  CONSTRAINT `fk_utilisateur_test1` FOREIGN KEY (`test_id`) REFERENCES `test` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilisateur`
--

LOCK TABLES `utilisateur` WRITE;
/*!40000 ALTER TABLE `utilisateur` DISABLE KEYS */;
INSERT INTO `utilisateur` VALUES (1,'Guérette','Henri','69, Avenue De Marlioz 13200 ARLES','HenriGuerette@email.fr','01 00 33 70 20','utilisateur',0,NULL,0,0,0,1,1,1,1,1);
/*!40000 ALTER TABLE `utilisateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-18 15:59:53
