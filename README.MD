# Sécurité des systèmes Distribués


## Table of Contents
[Overview](#overview)
[Partie 1:](#partie1)
* 1. [Overview](#overview)
* 2. [1. Télécharger Keycloak 20](#Keycloak-20)
* 3. [2. Démarrer Keycloak](#dk)
* 4. [3. Créer un compte Admin](#admincompte)
* 5. [4. Créer une Realm](#realm)
* 6. [5. Créer un client à sécuriser](#securityclient)
* 7. [6. Créer des utilisateurs](#createuser)
* 8. [7. Créer des rôles](#createrole)
* 9. [8. Affecter les rôles aux utilisateurs](#showuserrole)
* 10. [9. Avec PostMan :](#withpostman)
        * [- Tester l'authentification avec le mot de passe](#authtest)
        * [- Analyser les contenus des deux JWT Access Token et Refresh Token](#JWT)
        * [- Tester l'authentification avec le Refresh Token](#Refresh_Token)
        * [- Tester l'authentification avec Client ID et Client Secret](#client_id)
        * [- Changer les paramètres des Tokens Access Token et Refresh Token](#access&refreshtoken)

## partie1

## Overview

## Keycloak 20
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img1.png)

## dk
*  2. Démarrer Keycloak

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img2.png)

### admincompte
*  3. Créer un compte Admin

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img3.png)


```
SparkSession ss = SparkSession.builder().appName("TP SQPARKS SQL").master("local[*]").getOrCreate();
// Lire le fichier CSV des incidents
Dataset<Row> df1 = ss.read().option("header", true).option("inferSchema", true).csv("incidents.csv");
```

* Afficher le nombre d'incidents par service.

```
  // Calculer le nombre d'incidents par service
     Dataset<Row> incidentsByServiceDF = df1.groupBy("service").count();
  // Afficher les résultats
     incidentsByServiceDF.show();
```

![image](https://github.com/BeidjaCheikh/TP_sparkSQL/blob/master/images/img2.png)

* Affichez les deux années avec le plus d'incidents.

```
     // Extraire l'année de chaque incident
        Dataset<Row> incidentsWithYearDF = df1.withColumn("year", df1.col("date").substr(0, 4));
     // Calculer le nombre d'incidents par année
        Dataset<Row> incidentsByYearDF = incidentsWithYearDF.groupBy("year").count();
     // Trier les résultats par nombre d'incidents
        Dataset<Row> incidentsByYearDFSorted = incidentsByYearDF.sort(incidentsByYearDF.col("count").desc());
     // Afficher les deux premières lignes
        incidentsByYearDFSorted.show(2);
```

![image](https://github.com/BeidjaCheikh/TP_sparkSQL/blob/master/images/img3.png)

### Hopital Database

Créez une base de données MySQL nommée DB_HOPITAL, qui contient trois tables

* PATIENTS :

![image](https://github.com/BeidjaCheikh/TP_sparkSQL/blob/master/images/img4.png)

* MEDECINS :

![image](https://github.com/BeidjaCheikh/TP_sparkSQL/blob/master/images/img5.png)

* CONSULTATIONS :

![image](https://github.com/BeidjaCheikh/TP_sparkSQL/blob/master/images/img6.png)

* -// Créer une session Spark:

```
SparkSession ss = SparkSession.builder().appName("TP SPARK SQL").master("local[*]").getOrCreate();

```

* // Chargement des données de consultations :

```
       Dataset<Row> df1 = ss.read().format("jdbc")
                .option("url", "jdbc:mysql://localhost:3306/db_hopital")
                .option("driver", "com.mysql.jdbc.Driver")
                .option("user", "root")
                .option("password", "")
                .option("query", "select * from consultations")
                .load();
```
* // Chargement des données des médecins :
```
 // Chargement des données des médecins
        Dataset<Row> df2 = ss.read().format("jdbc")
                .option("url", "jdbc:mysql://localhost:3306/db_hopital")
                .option("query", "select * from medecins")
                .option("user", "root")
                .option("password", "")

                .load();
```
*  // Afficher le nombre de consultations par jour :

```
   df1.groupBy(col("DATE_CONSULTATION").alias("DATE de CONSULTATION")).count().show();
```
```
show()
```
![image](https://github.com/BeidjaCheikh/TP_sparkSQL/blob/master/images/img7.png)


