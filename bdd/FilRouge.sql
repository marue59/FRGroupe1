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
INSERT INTO `formation` VALUES (1,'Unix, Maitriser Unix','Cette formation vous pr??pare au passage de la certification \"AVIT by ENI - Administration d???un syst??me Linux','Permettre aux participants d\'acc??der ?? une r??elle ma??trise du syst??me Unix gr??ce ?? une progression p??dagogique rigoureuse et ?? de nombreux exercices pratiques sous les principales versions d\'Unix ( AIX, HP/UX, Solaris et Linux). // Fournir une synth??se des informations n??cessaires ?? l\'utilisation quotidienne et ?? la compr??hension du fonctionnement d\'un syst??me Unix. // D??tailler une s??lection d\'exemples vari??s et repr??sentatifs des possibilit??s du syst??me. // Pr??senter les diff??rences fondamentales entre les principales versions du syst??me Unix.','Notions et fonctions de base // L\'ex??cution des commandes // Les outils et la programmation du shell // Les m??canismes internes et la communication // Exploitation du syst??me',2260,28,4,0,'Unix'),(2,'Unix Perfectionnement','Orient?? vers l\'utilisation performante et s??curis??e du syst??me Unix, ce cours vous permettra d\'approfondir les fonctionnalit??s conduisant ?? une meilleure productivit??. Il vous apprendra ?? mettre en ??uvre les principales techniques d\'ex??cution en environnement r??seau. Enfin, il vous montrera comment analyser ?? l\'aide des tableaux de bord les situations rencontr??es dans son exploitation op??rationnelle.','Passer l\'??tape importante de la ma??trise de l\'??diteur \"vi\",2 8,\". // Approfondir les fonctionnalit??s d\'Unix. //  Mettre en ??uvre diff??rents shells. // Construire des outils ?? l\'aide des shells. // Comprendre et s??curiser l\'environnement. // Optimiser l\'exploitation d\'Unix.','Introduction // Mise en oeuvre des diff??rents shells // Construction d\'outils ?? l\'aide des shells // Param??trage et configuration de l\'environnement // Gestion de la s??curit?? pour l\'utilisateur // Utilisation des commandes // Exploration et recherche de fichiers // Edition automatique de fichiers avec awk // Sauvegardes et archivages // Gestion de l\'environnement d\'ex??cution // Analyse et optimisation des performances TCP/IP sous Unix // Syst??me graphique et fen??tr??',1690,21,3,0,'Unix'),(3,'Linux pour d??butants','Linux est souvent consid??r?? comme un syst??me complexe et tr??s technique, il est vrai que les premi??res distributions ??taient effectivement destin??es ?? des utilisateurs avertis. Depuis quelques ann??es maintenant on peut aborder Linux avec la m??me facilit?? que les syst??mes Mac ou Windows. // Cette formation est destin??e prioritairement aux non-informaticiens ou aux d??butants sur Linux. Il s\'agit de vous donner une r??elle autonomie sur ce syst??me pour une utilisation fluide au quotidien. // L\'ensemble des sujets fondamentaux est abord?? de fa??on simple et concr??te. Vous serez en mesure ??galement de comprendre et d??battre avec des sp??cialistes Linux en utilisant le vocabulaire ad??quat et sachant diff??rentier les t??ches simples de celles plus complexes.','Comprendre le fonctionnement d\'un syst??me Linux. // Comprendre le d??roulement d\'une session. // Savoir utiliser son poste de travail sous Linux. // G??rer les fichiers et les applications associ??es. // Configurer et installer Linux en r??seau local.','A quoi sert un syst??me Linux, comment ??a marche? // Une session type // Compl??ments sur les fichiers // Le poste de travail // La gestion des applications Linux en r??seau local // Installer Linux',1650,21,3,0,'Linux'),(4,'Ma??triser les outils Linux','Savoir ??tre performant en choisissant le bon outil pour le bon traitement dans le vaste atelier offert par l\'Open Source. Ma??triser l\'exploitation de fichiers aux formats divers (texte brut, texte format??, image, binaire, ...) notamment avec grep, sed, et awk.','Revoir le Shell Bash. //  Automatiser les traitements avec des shellscripts. // S\'adapter aux expressions r??guli??res, au Grep, ed et sed. // Introduire et comprendre le langage awk. // G??rer la publication des donn??es. // Utiliser les outils et commandes sur les fichiers.','Rappels sur le shell bash // Automatiser les traitements avec des shellscripts // Grep, ed, sed et les expressions r??guli??res // Le langage awk // Publication des donn??es // Outils et commandes sur les fichiers',2090,28,4,0,'Linux'),(5,'Excel ??? Initiation','Sorti fin 2015, Excel 2016 est le tout r??cent successeur d\'Excel 2013. La majorit?? des fonctionnalit??s n\'a pas ??volu??, mais Microsoft a tout de m??me apport?? quelques nouveaut??s tant dans l\'interface utilisateur que dans les fonctionnalit??s m??mes d\'Excel. // Cette formation Excel 2016 Initiation est un bon d??but pour conna??tre les fonctions de base du logiciel.','??tre ?? l???aise avec l???environnement de travail. // Savoir construire des tableaux en soignant rapidement leur mise en forme. // Comprendre comment r??aliser des calculs de base. // ??tre en mesure de cr??er, modifier, sauvegarder et imprimer ses documents. // Pr??parer les bases de l\'examen TOSA.','Environnement et m??thodes dans Excel 2016 // Calculs (formules, fonctions) avec Excel 2016 // Mise en forme sous Excel 2016 // Mise en page et param??trage de l???impression // Travail en multi-feuilles sur Excel 2016 // Initiation ?? la repr??sentation et ?? la gestion des donn??es',650,14,2,0,'excel'),(6,'Excel ??? Perfectionnement','Cette formation Excel 2016 Perfectionnement destin??e ?? toute personne souhaitant ma??triser de mani??re approfondie les bases d???Excel, couvre les besoins essentiels du logiciel. Elle constitue en outre une excellente introduction pour ceux qui souhaiteraient poursuivre leur mont??e en comp??tences sur les fonctions plus avanc??es d???Excel 2016.','G??rer des listes de donn??es. // Ma??triser les repr??sentations graphiques. // Savoir cr??er des liaisons entre calcul. // Atteindre le niveau Op??rationnel de la certification TOSA.','Consolidation de tableaux Excel 2016 // Perfectionnement sur les Calculs avec Excel 2016 // Gestion des grands tableaux de type liste de donn??es avec Excel 2016 // Cr??ation de tableaux et graphiques crois??s dynamiques avec Excel 2016',650,14,2,0,'excel'),(7,'PowerPoint ??? Initiation','Avec l\'arriv??e de la version 2016, PowerPoint propose une interface simplifi??e et maintenant adapt??e au tactile. Le logiciel incontournable de la pr??sentation int??gre de nouveaux outils de conception tels que les rep??res d\'alignement ou de trajectoire d\'objets. // Les participants ?? cette formation PowerPoint 2016 Initiation d??couvriront les diff??rentes ??tapes de la cr??ation d\'une pr??sentation et disposeront des comp??tences n??cessaires ?? l\'??laboration de leurs premiers \"PowerPoint\".','Construire avec m??thode et rapidit??, une pr??sentation int??grant du texte et des illustrations. // Utiliser les masques de diapositives pour acc??l??rer la conception. // Mettre au point le diaporama pour la projection et l???impression. // Atteindre le niveau Op??rationnel de la certification TOSA.','Pr??senter l???interface // Mieux pr??senter son texte dans une diapositive // Utiliser des dispositions de diapositives pour optimiser leurs contenus // Utiliser des Th??mes et mod??les pour faciliter et acc??l??rer la conception de diapositives // Illustrer ses diapositives avec des organigrammes, des SmartArt, des tableaux ou des graphiques // Diffuser son diaporama // Optimiser la mise en page',650,14,2,0,'PowerPoint'),(8,'PowerPoint ??? Perfectionnement','Il est plus facile de retenir l???attention d???un auditoire ou de faire passer ses id??es en s???appuyant sur des supports visuels de qualit??. PowerPoint permet pr??cis??ment la cr??ation de pr??sentations \"attractives\". // Cette formation PowerPoint 2016 Perfectionnement vise ?? fournir aux participants les comp??tences n??cessaires ?? la conception de pr??sentations percutantes avec PowerPoint 2016. Ils apprendront notamment ?? valoriser leurs cr??ations en y int??grant diff??rents types d???objets (graphiques, tableaux, dessins, vid??os...), des effets d???animations, etc.','Param??trer et personnaliser un diaporama. // Dynamiser sa pr??sentation avec des transitions et des animations ??labor??es. // Perfectionner vos textes en cr??ant un sommaire, des liens hypertextes, des boutons d???action. // Savoir utiliser l?????cran de contr??le (mode pr??sentateur) pour optimiser votre projection. // Atteindre le niveau Expert de la certification TOSA.','Optimiser son environnement et l???exploitation de son diaporama // Devenir expert dans le param??trage de son diaporama // Perfectionner la gestion de vos textes // Maitriser la cr??ation et modification des objets de la pr??sentation // Dynamiser son animation // Optimiser et approfondir l???utilisation des masques, th??mes et mod??les',350,7,1,0,'PowerPoint'),(9,'Le langage C#','Le langage C# est le langage objet phare de Microsoft. Il permet de d??velopper tout type d\'application (client lourd, web, web service, ...). Le langage C# est tr??s li?? ?? la plateforme .Net ?? laquelle il \"emprunte\" ses objets pour d??velopper des applications fen??tr??es (Windows Forms ou WPF), des sites WEB (ASP.net Web Forms et MVC), ou encore se connecter aux bases de donn??es (ADO.net, LINQ et Entity Framework). L\'environnement de d??veloppement int??gr?? incontournable pour le C# est Visual Studio. // Cette formation C# vous permettra de ma??triser les fondamentaux du langage C# et l\'environnement de programmation Visual Studio. Au-del?? du langage C#, qui reste l???objectif de base de la formation, la plateforme .NET vous sera ??galement pr??sent??e afin de bien comprendre l\'environnement global sur lequel peut s???appuyer  le langage C#.','Comprendre les principes du d??veloppement objet (classe, m??thode, h??ritage, etc.). // Comprendre le r??le du framework .NET et savoir utiliser ses classes. // Configurer et utiliser Visual Studio. // Ma??triser la syntaxe et les concepts du langage C#. // Utiliser ADO.NET et LINQ pour acc??der aux donn??es d\'une base quelque soit leur provenance et les manipuler. // Savoir appliquer les grands principes de C# ?? la r??alisation d\'applications riches (Windows Forms ou WPF). // Utiliser des services Web XML dans une application C#. // Tester des fonctionnalit??s avanc??es de C#. // Cr??er une premi??re application Web en ASP.NET.','Introduction ?? .Net // La conception Objet // Les bases de C# // La programmation en C# // La programmation avanc??e en C# // Les classes incontournables du framework // Introduction ?? l???acc??s aux donn??es en .NET // Introduction ?? WPF et aux Windows Forms // ASP.Net/ C# et Webform',2695,35,5,0,'C_Sharp'),(10,'C# perfectionnement','Cette formation ?? Langage C# avanc?? ?? vous permettra de ma??triser tous les concepts fondamentaux li??s au d??veloppement des applications .NET (WPF, LINQ, Service Windows, Multithread) et ?? la communication (Socket, WCF, WebServices REST et SOAP). // Apr??s une synth??se technique sur les possibilit??s et les performances des diff??rentes technologies .NET, vous apprendrez ?? g??rer de fa??on efficace vos applications sous forme de services (WebServices, WCF). // Ensuite vous prendrez la mesure des possibilit??s de LINQ et de sa philosophie originale pour g??rer les donn??es ainsi que celle du rempla??ant des Windows Forms : WPF (effets graphiques, liens avec XAML, databinding, etc.). // Vous apprendrez aussi ?? d??velopper vos propres services syst??mes et ?? utiliser la technologie des sockets ainsi que les multithread. Pour finir, vous aborderez le d??veloppement et le d??ploiement de services Windows.','Cr??er et d??ployer un service Windows. // Optimiser le code de vos applications. // Programmer en des application multithreads. // Impl??menter des WebServices SOAP et REST. // Utiliser les sockets pour  la programmation r??seau. // Utiliser WPF. // Utiliser LINQ dans un programme C#.','Rappels et compl??ments sur le Framework .Net // Performances et m??moire (code non manag??) - Optimisation C# // Cr??er et d??ployer un service Windows // Multithreading sous .NET // Introduction ?? la communication sous .NET // Services Web ASP.NET (SOAP et REST) // Programmation r??seau avec les sockets // WCF // WPF (Windows Presentation Foundation) // Cr??er ses propres contr??les utilisateurs (User Controls) // LINQ (Language Integrated Query)',2290,28,4,0,'C_Sharp'),(11,'WPF : D??veloppement d\'applications graphiques','Initialement propos?? avec le framework .NET 3.0, Windows Pr??sentation Foundation, plus couramment nomm?? WPF est un sous-syst??me graphique pour le rendu des interfaces utilisateur dans les applications Windows. // Bas?? sur DirectX, il supporte ainsi l\'acc??l??ration mat??rielle et des fonctionnalit??s d\'interface modernes comme la transparence et les d??grad??s, devenu standards avec l\'arriv??e de Windows 7. // Outre les aspects graphiques, WPF offre ??galement un nouveau langage bas?? sur XML, le XAML (eXtensible Application Markup Langage) qui permet de s??parer clairement l\'interface utilisateur et la logique m??tier, partageant de ce fait le travail du designer et du codeur.','Apprendre ?? utiliser le nouveau langage d??claratif XAML, utilis?? pour le d??veloppement d\'interfaces Windows. // ??tre en mesure de d??velopper des applications conviviales et graphiquement riches. // ??tre en mesure de configurer et d??ployer des applications WPF.','Concevoir une application Windows Client // Introduction ?? Visual Studio 2017 et WPF // Concevoir et d??velopper une interface utilisateur // Contr??ler une interface utilisateur // Liaison de Donn??es simple et validation // Liaison de Donn??es vers les collections // Architecture MVVM // Graphiques WPF 2D, multim??dia et impressions // Personnalisation des contr??les // Propri??t??s attach??es et comportements avec WPF // Animations dans WPF // ??tats, param??tres et cycle de vie des applications // Configurer et d??ployer des applications Windows Client // WPF avec .NET Core',2695,35,5,0,'WPF'),(12,'WCF et ASP.NET Core','Cette formation WCF s\'adresse aux d??veloppeurs .NET exp??riment??s. // Pour suivre ce cours, vous devez connaitre la programmation C#. Il est ??galement n??cessaire d\'avoir une exp??rience significative dans le d??veloppement d\'applications .NET.','Cr??er un service WCF. // D??ployer un service WCF. // Configurer et s??curiser des services WCF. // Mettre en oeuvre un service WCF transactionnel.','Architecture Orient??e Service (SOA) // D??buter avec le d??veloppement WCF // H??berger les services WCF // D??finition et impl??mentation de contrats WCF // Points de terminaison et Comportements // Tester et r??soudre les probl??mes des services WCF // S??curit?? // Fonctionnalit??s avanc??es // La nouvelle approche avec ASP.NET Core // Cr??ation d???un service REST avec ASP.NET Core // gRPC // D??ploiement',2290,28,4,0,'ASP_NET'),(13,'Java, les fondamentaux','Le langage Java est au c??ur des applications d???entreprise et a r??ussi ?? s???imposer comme l???un des langages orient??-objet les plus utilis?? dans le monde. Cette formation a pour objectif d???acqu??rir de solides bases sur le langage Java et de permettre une initiation progressive aux diff??rentes APIs coeurs. Les entr??es-sorties, l???acc??s aux bases donn??es, les derni??res nouveaut??s de Java seront pr??sent??es ainsi qu???une introduction technique compl??te ?? un environnement de d??veloppement standard pour Java (Eclipse, Maven, etc.)','Ma??triser son environnement de d??veloppement (IDE Java). // Ma??triser la syntaxe Java. // Savoir appliquer les concepts de la programmation orient??e objet au langage Java (classes, m??thodes, encapsulation, h??ritage, constructeur, polymorphisme, classe abstraite, interfaces, relations entre classes, etc.). // Mettre en ??uvre les principales fonctions des API standards (Collections, I/O, JDBC, Streams, ???). // Conna??tre les sp??cificit??s des diff??rentes versions de Java.','Pr??sentation de Java // Outils de d??veloppement // Java, fondamentaux // Classes, objets, relations entre objets // Les exceptions // D??ploiement d???applications // Les collections et la g??n??ricit?? // Les flux d\'entr??es-sorties // L\'acc??s aux bases de donn??es avec l???API JDBC // Expressions Lambda, r??f??rences de m??thodes // Introduction ?? l???API Stream pour la manipulation de flux de donn??es //',2490,35,5,0,'Java'),(14,'Java Avanc??, perfectionnement','Cette formation Java avanc?? permet aux personnes ayant suivi une premi??re initiation ?? Java, d???approfondir leurs connaissances du langage afin d???int??grer directement une ??quipe projet. // La formation commence par d??tailler le fonctionnement interne de la JVM (Java Virtual Machine) afin que le d??veloppeur puisse diagnostiquer des probl??mes de performances li??s ?? la conception de son programme et ?? l\'utilisation des objets Java. // Vous apprendrez ?? concevoir une application multi-thread??e, et ?? synchroniser ses threads, tout en ??vitant la corruption de donn??es. // Vous apprendrez ensuite ?? utiliser le langage Java dans le contexte des bases de donn??es relationnelles (JDBC, JPA/Hibernate), ce qui apporte une dimension de projet professionnel ?? la formation. // La manipulation avanc??e de fichiers/r??pertoires est ??galement visit??e avec les API Nio.2.','Avoir compris le fonctionnement de la JVM. // Programmer en Java dans le contexte des bases de donn??es relationnelles. // D??velopper une application Java multit??ches en utilisant les threads. // Utiliser les expressions lambdas. // Mettre en ??uvre l???API Stream. // Mettre en ??uvre les modules de Java 9.','Fonctionnement de la JVM (Java Virtual Machine) // Classes internes, G??n??ricit??, Annotations // Programmation parall??le (multithreading) // L\'acc??s aux bases de donn??es // Acc??s complet au syst??me de gestion de fichiers avec Nio.2 // Expressions Lambda, r??f??rences de m??thodes // Mise en ??uvre de l???API Stream pour la manipulation de flux de donn??es // Le syst??me de modules //',1690,21,3,0,'Java'),(15,'Spring : D??velopper avec le framework Spring','Spring est le framework Java le plus r??pandu pour le d??veloppement d\'applications d\'entreprises offrant une r??elle alternative ?? Java EE. // Ses atouts : faciliter le d??veloppement et les tests, am??liorer les performances, proposer de bon design pattern aux d??veloppeurs. Spring s\'appuie principalement sur l\'int??gration de trois concepts cl??s : l\'inversion de contr??le ou injection de d??pendance, la programmation orient??e aspect et une couche d\'abstraction qui permet d\'int??grer d\'autres frameworks et biblioth??ques avec une plus grande facilit??. // Cette formation Spring  vous permet d\'apprendre les bases du framework Spring et d\'??tre sensibilis?? ?? la facilit?? de mettre en ??uvre des tests unitaires et d\'int??gration avec ce framework. Le premier atelier permet aux participants de mettre en place l\'IDE Spring Tools Suite et d\'effectuer une premi??re configuration Spring simple. Les ateliers suivants s\'adossent ?? une application web typique utilisant Spring MVC, une couche service et Spring Data. Les participants doivent alors compl??ter les sources fournies, effectuer les configurations Spring ad??quates, mettre au point les tests validant la sp??cification. Tous les tiers d\'une application web sont abord??s et plusieurs impl??mentations sont propos??es. Le dernier chapitre permet aux participants de d??couvrir les aspects les plus modernes du framework et les APIs vers les r??seaux sociaux, les mobiles et le cloud.','Mettre en place l\'IDE Spring Tools Suite et d\'effectuer une premi??re configuration Spring simple. // Ma??triser une application web typique utilisant Spring MVC, une couche service et Spring Data. // Compl??ter les sources fournies, effectuer les configurations Spring ad??quates, mettre au point les tests validant la sp??cification. // Prendre connaissance des aspects les plus modernes du framework et les APIs vers les r??seaux sociaux, les mobiles et le cloud.','Introduction au framework Spring // Spring C??ur // Applications Web avec Spring MVC // Spring Data et l\'acc??s aux donn??es (JDBC / Hibernate / JPA / NoSQL) // Spring et les tests // Spring et l???int??gration',1690,21,3,0,'Spring'),(16,'Spring Boot : Acc??l??rez vos d??veloppements','Spring Boot simplifie ?? l???extr??me le d??marrage, la configuration et le d??ploiement d\'un projet Spring. Avec ses capacit??s d???auto-configuration bas??es principalement sur la gestion des d??pendances, il permet aux d??veloppeurs de se concentrer sur leur probl??matique m??tier plut??t que sur des probl??mes techniques de configuration et d???int??gration. Embarquant un conteneur de servlet embarqu??, les applications Spring Boot sont de simples applications Java qu???il suffit de d??marrer. Ce nouveau type de packaging simplifie ?? l???extr??me la mise en production des applications (plus de d??ploiement sur un serveur applicatif!). En ce sens, les applications Spring Boot s???inscrivent dans l???approche DevOps et sont tr??s appropri??es aux architectures micro-service.','Les fonctionnalit??s du framework. // Son int??gration dans l???IDE Spring Tool Suite. // Ses apports pour les diff??rentes couches applicatives (JPA, Rest/MVC, Test) et pour la mise en production d???application.','Introduction ?? Spring Boot // Premiers pas avec Spring Boot // Persistance des donn??es avec Spring Data // Applications Web et API Rest avec Spring MVC // Spring Boot et le test // Auto-configuration // Mise en production // S??curit?? et Spring Boot',1850,21,3,0,'Spring');
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
INSERT INTO `sous_theme` VALUES (1,'Unix',1),(2,'Linux',1),(3,'Excel',2),(4,'PowerPoint',2),(5,'.NET',3),(6,'D??veloppement Windows',3),(7,'Java',4),(8,'Spring',4);
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
INSERT INTO `theme` VALUES (1,'Unix - Linux - MacOS','Pour tout conna??tre sur Unix, Solaris, AIX, Linux, Red Hat, Debian, macOS,...',1),(2,'Microsoft Application','Pour apprendre Exchange, SharePoint, Office, Lync...',1),(3,'Microsoft .NET','Pour apprendre C#, ASP .NET, Visual Studio, MVC,...',1),(4,'JAVA - JAVA EE','Pour tout conna??tre sur Hibernate, JBoss, Spring, Weblogic,...',1);
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
INSERT INTO `utilisateur` VALUES (1,'Gu??rette','Henri','69, Avenue De Marlioz 13200 ARLES','HenriGuerette@email.fr','01 00 33 70 20','utilisateur',0,NULL,0,0,0,1,1,1,1,1);
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
