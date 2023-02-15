
####################################
Anotacions sobre propietats mutables
####################################

* Autor/a: Joel Ghanem

* Data: 11/02/2023

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats mutables*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01    public class GatRenat {
    02        public int vides = 7;         // vides disponibles del gat Renat
    03        public static void main(String[] args) {
    04            GatRenat renat;           // declarem l'objecte (la referència) al gat
    05            renat = new GatRenat();   // creem la instància del gat Renat.
    06            System.out.println("Abans el gat Renat tenia " + renat.vides + " vides");
    07            renat.vides = renat.vides - 1;  // Renat ha tingut un accident
    08            System.out.println("Ara el gat Renat té " + renat.vides);
    09        }
    10    }

Pregunta 1. Obtenir
===================

Per consultar (llegir, obtenir) el valor d'una propietat de la instància,
cal cridar la variable vides dins de la instancia renat 

Pregunta 2. Assignar
====================

Per canviar (escriure, assignar) el valor d'una propietat de la instància,
cal modificar la variable vides de la instancia, en aquest cas renat.vides

Pregunta 3. Valors absurds
==========================

A la pregunta següent:

    És possible indicar que el gat Renat té -12 vides? Com? És quelcom
    desitjable que pugui passar? En cas que es pugui, com ho podries
    evitar fent servir els coneixements de programació estructurada i
    modular que hem treballat fins ara?

La meva resposta és: Sí que es possible modificant la variable vides, No és molt desitjable ja que podria ocasionar errors al nostre codi. Es podria evitar cridant a un modul que ens retornes el valor de la variable.
