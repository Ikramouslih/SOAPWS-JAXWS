# JEE-Activite-1 / SOAPWS-JAXWS

Le but de cette activite est de comprendre comment créer, déployer et utiliser un service web SOAP en utilisant JaxWS.

## Travail à faire ##
1. Créer un Web service qui permet de :
     - Convertir un montant de l’auro en DH,
     - Consulter un Compte,
     - Consulter une Liste de comptes.
2. Déployer le Web service avec un simple Serveur JaxWS.
3. Consulter et analyser le WSDL avec un Browser HTTP.
4. Tester les opérations du web service avec un outil comme SoapUI ou Oxygen.
5. Créer un Client SOAP Java.

<img width="508" alt="Screenshot 2023-10-17 220836" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/b896a4ad-1368-443b-b64c-cfd4718032dc">


=> Vidéo à utiliser comme ressource principale : https://www.youtube.com/watch?v=ig5UHI12HPs

## Les notions clés ##

### Les Web Services SOAP ### 

Les web services SOAP (Simple Object Access Protocol) sont une technologie de communication basée sur XML qui permet à des applications distribuées de communiquer entre elles sur un réseau, généralement via HTTP, SMTP ou d'autres protocoles. SOAP a été l'une des premières technologies de communication utilisées pour créer des services web.
Voici quelques points clés sur les web services SOAP :

- Protocole basé sur XML : Les messages échangés entre les applications sont généralement formatés en XML. Les messages SOAP sont lisibles par les humains et peuvent être traités par des machines.
- Structure du message : Un message SOAP comprend généralement un en-tête (header) et un corps (body). L'en-tête peut contenir des informations telles que des informations d'authentification, des métadonnées, etc., tandis que le corps contient les données réelles à transférer entre les applications.
- Protocoles de transport : HTTP est le protocole de transport le plus couramment utilisé pour les web services SOAP.
- Normes et spécifications : SOAP est accompagné de diverses spécifications et normes pour garantir l'interopérabilité entre les différentes implémentations. Par exemple : WS-Security.
- Langage indépendant : Cela signifie que vous pouvez créer des web services SOAP en utilisant différents langages de programmation, tels que Java, C#, PHP, etc.
- Complexité : Les web services SOAP sont souvent considérés comme plus verbeux et plus complexes que les web services basés sur REST (Representational State Transfer).

![How+does+it+work+Service+Provider+Service+UDDI+Requester](https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/c7aa4249-09d1-4652-9f03-3a7ca593077d)


### WSDL - Web Services Description Language ### 

WSDL est un langage XML utilisé pour décrire les fonctionnalités d'un service web.
Voici quelques points clés à retenir sur WSDL :

- Description : WSDL est utilisé pour documenter un service web en spécifiant les opérations qu'il expose, les types de données utilisés, les protocoles de communication, etc.
- Structuré : Les documents WSDL sont structurés de manière à définir clairement les entrées, les sorties et les méthodes du service.
- Consommation : Les clients de services web utilisent des fichiers WSDL pour comprendre comment interagir avec un service, ce qui facilite l'intégration et l'appel des fonctions du service.

<img width="960" alt="wsdl" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/303fea28-1520-4488-ad31-99fa0fcda03a">

XSD (XML Schema Definition) est un langage XML utilisé pour définir la structure et les contraintes des données dans des documents XML. Il est souvent utilisé en relation avec WSDL (Web Services Description Language) pour définir la structure des messages échangés entre les clients et les services web, assurant ainsi la cohérence des données lors de la communication entre les différentes parties d'une application distribuée.

<img width="960" alt="shema xsd" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/c208cdfe-cbda-497f-873b-3c29540bc681">

### UDDI - Universal Description, Discovery, and Integration ### 

UDDI est un protocole et un registre de services web qui permet la publication, la découverte et la recherche de services web. 
Voici quelques points clés à retenir sur UDDI :

- Registre : UDDI fournit un registre centralisé où les fournisseurs de services web peuvent enregistrer des informations sur leurs services.
- Découverte : Les utilisateurs, développeurs ou entreprises peuvent utiliser UDDI pour rechercher et découvrir des services web disponibles, ce qui facilite l'intégration de services existants dans leurs applications.
- Protocoles : UDDI est basé sur des normes XML et SOAP, ce qui le rend compatible avec d'autres technologies de services web.
- Public : Les registres UDDI peuvent être publics, accessibles sur Internet, ou privés, utilisés en interne par une organisation.
- Rôle : UDDI joue un rôle essentiel dans la découverte et l'intégration de services web, facilitant ainsi l'interopérabilité des services dans un environnement distribué.



### JAX-WS - Java API for XML Web Services ### 

JAX-WS est une API Java qui permet de créer et de consommer des services web SOAP (Simple Object Access Protocol).
JAX-WS utilise JAXB (Java Architecture for XML Binding) pour faciliter la conversion des données entre les objets Java et les messages XML lors de la création et de la consommation de services web. JAXB permet de marquer les classes Java avec des annotations pour définir la structure XML des données, créant ainsi une correspondance automatique (mapping objet XML) entre les objets Java et les données XML. Cela simplifie la communication entre les applications Java et les services web basés sur XML.
Voici quelques points clés à retenir sur JAX-WS :

- API Java : JAX-WS est une API standard fournie par Java pour simplifier le développement de services web en utilisant le protocole SOAP.
- Création de services : JAX-WS permet aux développeurs de créer des services web en annotant les classes Java avec des annotations spécifiques, ce qui facilite la transformation des méthodes Java en opérations de service web.
- Consommation de services : JAX-WS offre également des outils pour générer des clients de services web à partir de descriptions de services, telles que des fichiers WSDL, ce qui facilite l'appel de services distants.
- Intégration : JAX-WS peut être utilisé dans des applications Java EE (Enterprise Edition) pour créer des services web en entreprise.
- Sécurité : JAX-WS prend en charge divers mécanismes de sécurité, tels que WS-Security, pour sécuriser les communications entre les clients et les services web.
- Avantages : JAX-WS simplifie la création de services web en Java en évitant la nécessité de générer manuellement du code XML, tout en fournissant une approche orientée objet pour la communication distante.

![dep](https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/0b22835d-c46c-4f74-b5f4-d77a66e3aa1e)

## Le Web Service SOAP ##

### => Server ###
<img width="960" alt="exec server" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/e102fde9-1a71-4bb3-9092-4ebe48068300">


### Test 1 : Convert() ###
<img width="960" alt="1" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/9392be73-90f0-46c0-99b8-4f46d352e6a9">


### Test 2 : getCompte() ###
<img width="960" alt="2" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/6aa9b76a-d79d-424b-b0dc-f5acacd62fd2">


### Test 3 : listComptes() ###
<img width="960" alt="3" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/cd4a88d7-636e-4afd-8e74-9f00352dee80">


### Test 4 : getCompte() après l'annotation @XmlTransient sur l'attribut dateCreation  ###
<img width="960" alt="after jaxb annotation no creation date" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/ffcadc78-4d6a-4487-b1b0-cd13c9599fa5">


### => Client ###

- Tout d'abord, il est nécessaire de créer un "proxy" qui nous permettra de consommer le service web : 
<img width="735" alt="jakarta pluggin for function generate java code from wsdl" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/e6d383f1-5018-4366-b2e7-a083be23205b">
<img width="960" alt="generate java code from wsdl" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/35e19324-9af5-4170-9a2e-1101e8cc74ed">
<img width="328" alt="Screenshot 2023-10-16 205231" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/acf34b4e-aa54-4aa6-80a7-e80a13716a64">
<img width="960" alt="exec client" src="https://github.com/Ikramouslih/SOAPWS-JAXWS/assets/60039200/5c30612e-d811-4765-a1ce-8eb9b9e5ca0c">





