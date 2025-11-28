# Model de conception JAVA
Auteur :
_AHAMED Nasser_,
_CANTOR Romain_

## Model de conception étudié
**Les _Observer_**

Vous trouverez un **Wiki** qui explique en détails la mise en place de ce model de ce patterne.<br>
Vous trouverez aussi un exemple concret sur l'utilisation de celle-ci, basé sur le **jeu Minecraft**.

## Organisation du projets

> Note : Nous éviterons d'utiliser le nom de classe ``Observer`` car une interface à ce nom existe déjà dans Java.
> Le nom de classe ``Observateur`` à la place pour éviter les conflits.

Le projet est struturé de la manière suivante :

* ``classes``
  * ``HUD``
  * ``Player``
  * ``SoundSystem``

* ``interfaces``
  * ``Observateur``
  * ``Subject``
