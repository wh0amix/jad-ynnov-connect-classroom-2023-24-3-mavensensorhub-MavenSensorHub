/**
 * Package pour la collecte de données de capteurs.
 *
 * API Publique et Stable:
 * - ISensor : Interface principale pour tous les capteurs
 * - ISensorFactory : Factory pour créer les capteurs
 * - SensorType : Enumération des types de capteurs
 * - SensorData : Classe de données pour stocker les mesures
 *
 * API Interne (ne pas utiliser directement):
 * - AbstractSensor : Classe de base pour l'implémentation des capteurs
 * - SensorFactory : Implémentation concrète de la factory
 * - Classes concrètes de capteurs (TemperatureSensor, etc.)
 *
 * Ce package est utilisé par data-management, report-generation et user-interface.
 * Il dépend uniquement du package utils.
 */
package com.jad.sensordata;