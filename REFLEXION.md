# Réflexion sur le refactoring Maven

## Choix de design des packages

L'architecture suit un modèle en couches avec le module utils comme base commune. Les modules sensor-data-collection, data-management, report-generation et user-interface forment la couche métier, et main-application orchestre l'ensemble. Cette séparation respecte le principe de séparation des responsabilités et limite les couplages.

## Modifications du parent POM

- Migration de dependencyManagement pour centraliser les versions des dépendances internes et externes
- Utilisation de pluginManagement pour standardiser la configuration des plugins
- Passage à maven-compiler-plugin avec release=21 au lieu de source/target pour une meilleure cohérence
- Ajout de maven-enforcer-plugin pour garantir Java 21 minimum et la convergence des dépendances
- Suppression des propriétés redondantes dans les modules enfants
- Ajout d'un profil fast-tests pour accélérer les builds en excluant les tests d'intégration

## Risques évités

- Dérive de versions : toutes les versions sont maintenant centralisées dans le POM parent
- Incohérence Java : tous les modules utilisent maintenant Java 21 de manière uniforme
- Dépendances dupliquées : dependencyManagement élimine les déclarations de versions dans les modules
- Build non reproductible : l'enforcer garantit l'environnement minimal requis

## Prochaine amélioration

Introduire une couche d'abstraction entre report-generation et data-management via une interface de service. Cela permettrait de découpler davantage les modules et faciliterait les tests unitaires en permettant le mock des dépendances.