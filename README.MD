# Sécurité des systèmes Distribués


## Table of Contents
[Overview](#overview)
[Partie 1:](#partie1)
* 1. [Overview](#overview)
* 2. [1. Télécharger Keycloak 20](#Keycloak-20)
* 3. [2. Démarrer Keycloak](#dk)
* 4. [3. Créer un compte Admin](#admincompte)
* 5. [4. Créer une Realm](#createRealm)
* 6. [5. Créer un client à sécuriser](#Create_a_client_to_secure)
* 7. [6. Créer des utilisateurs](#createusers)
* 8. [7. Créer des rôles](#createroles)
* 9. [8. Affecter les rôles aux utilisateurs](#showuserrole)
* 10. [9. Avec PostMan :](#withpostman)
        * [- Tester l'authentification avec le mot de passe](#testauth)
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

## admincompte
*  3. Créer un compte Admin

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img3.png)

## createRealm
*  4. Créer une Realm

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img4.png)

## Create_a_client_to_secure
*  5. Créer un client à sécuriser

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img5.png)

## createusers
*  6. Créer des utilisateurs

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img6.png)

## createroles
* 7. Créer des rôles

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img7.png)

## showuserrole
* 8. Affecter les rôles aux utilisateurs

```
* roles de l'utilisateur user1.
```
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img8.png)

```
* roles de l'utilisateur cheikh.
```
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img9.png)

## withpostman

### testauth

*  9.  Avec PostMan 
 ```
 - Tester l'authentification avec le mot de passe
```
```
Access Token
```
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img10.png)
```
Refresh Token
```
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img11.png)

### JWT
* - Analyser les contenus des deux JWT Access Token et Refresh Token

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img12.png)
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img13.png)
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img14.png)

### Refresh_Token
* - Tester l'authentification avec le Refresh Token

![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img15.png)
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img16.png)
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img17.png)

### client_id
* - Tester l'authentification avec Client ID et Client Secret
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img18.png)

### access&refreshtoken
* - Changer les paramètres des Tokens Access Token et Refresh Token
![image](https://github.com/BeidjaCheikh/Security-of_Distributed_Systems/blob/master/images/img19.png)


