# TP01 - Couverture du Code

##  Objectif
Ce TP a pour but de comprendre les différents types de **couverture de code** :
- Couverture **des lignes**
- Couverture **des branches**
- Couverture **des conditions**

Chaque exercice contient des tests unitaires pour atteindre un ou plusieurs de ces types de couverture.

---

##  Structure du projet

Le projet est structuré en trois dossiers principaux pour les tests :

- `TP1/LineCoverageTest/`
- `TP1/BranchCoverageTest/`
- `TP1/ConditionCoverageTest/`

Chaque dossier contient un fichier `ExoXTest.java` correspondant à l'exercice X.

---

##  Détail par exercice
##  Exercice 1 : `Palindrome.isPalindrome()`

###  Description :
La méthode `isPalindrome(String str)` vérifie si une chaîne est un palindrome, c’est-à-dire si elle se lit de la même façon de gauche à droite et de droite à gauche.

###  Couvertures :
- **Line coverage** : chaque ligne du code doit être exécutée.
- **Branch coverage** : chaque branche (`if`, `while`) doit être testée.
- **Condition coverage** : chaque sous-condition dans un `if` composé (`||`, `&&`) doit être évaluée à vrai et à faux.

### Tests nécessaires :
| Entrée    | Résultat attendu |
|-----------|------------------|
| `vide`    | `true`           |
| `""`      | `true`           |
| `"radar"` | `true`           |
| `"hello"` | `false`          |

### Remarque :
Les **tests sont différents** pour chaque critère :
- **Condition coverage** teste `str == null` et `str.length() <= 1` séparément.
- **Branch coverage** teste le chemin du retour `true` et `false`.
- **Line coverage** peut être atteinte avec seulement 2-3 tests.

---

##  Exercice 2 : `Anagram.isAnagram()`

###  Description :
La méthode `isAnagram(String a, String b)` vérifie si deux chaînes sont des anagrammes (mêmes lettres dans un ordre différent).

###  Couvertures :
- **Line coverage** : parcourir toutes les lignes de la méthode.
- **Branch coverage** : tester toutes les branches (`if`, `return`).
- **Condition coverage** : tester les sous-conditions (comme `a == null || b == null`).

### 🧪 Tests nécessaires :
| Entrée                    | Résultat attendu |
|----------------------------|------------------|
| `"listen", "silent"`       | `true`           |
| `"hello", "world"`         | `false`          |
| `null, "abc"`              | `false`          |
| `"abc", null`              | `false`          |
| `"abc", "cab"`             | `true`           |
| `"abc", "abcd"`            | `false`          |

###  Remarque :
Les **tests diffèrent légèrement** entre **condition** et **branche** :
- La condition `a == null || b == null` nécessite 3 cas pour couverture complète.
- **Line** et **Branch** peuvent être atteints avec 3 à 4 tests.

---

##  Exercice 3 : `BinarySearch.binarySearch()`

###  Description :
Cette méthode recherche une valeur dans un tableau trié à l’aide de l’algorithme de recherche dichotomique.

###  Couvertures :
- **Line coverage** : exécuter toutes les lignes (initialisation, boucle, conditions).
- **Branch coverage** : tester les trois cas possibles dans `if (midVal < target)`, `>`, et `==`.
- **Condition coverage** : ici, les conditions sont simples, mais on doit tester les différentes comparaisons.

### 🧪 Tests nécessaires :
| Entrée                              | Résultat attendu |
|--------------------------------------|------------------|
| `[1, 3, 5, 7], target = 3`           | `1`              |
| `[1, 3, 5, 7], target = 7`           | `3`              |
| `[1, 3, 5, 7], target = 4`           | `-1`             |
| `[], target = 5`                     | `-1`             |

###  Remarque :
Les **tests sont presque identiques** pour tous les critères de couverture, car chaque branche simple dépend d’une seule condition (`<`, `>`, `==`).  
Donc **Line, Branch et Condition coverage génèrent les mêmes cas de test.**

---

###  Exercice 4 : `QuadraticEquation.solve()`

- La méthode contient plusieurs branches conditionnelles (test sur le discriminant, `delta`).
- Les tests sont **différents** pour chaque type de couverture (ex : pour tester le cas `delta == 0`, `delta > 0`, `delta < 0`).

Les trois types de tests ont été définis séparément.

---

###  Exercice 5 : `RomanNumeral.toRoman()`

- Il y avait une erreur dans la boucle : `for (int i = 0; i <= symbols.length; i++)` → corrigé en `i < symbols.length`
- Cette méthode contient une **boucle avec plusieurs conditions**, donc les tests diffèrent légèrement selon la couverture.

 Des tests différents sont nécessaires ici aussi.

---

### Exercice 6 : `FizzBuzz.fizzBuzz()`

Cette méthode contient uniquement des **conditions simples**, indépendantes :

- `n % 15 == 0`
- `n % 3 == 0`
- `n % 5 == 0`
- Sinon

 **Pas de conditions composées** (`&&`, `||`)
 **Pas de logique imbriquée**

Donc :
- Les tests pour **ligne**, **branche** et **condition** sont **identiques**.

**Tests réutilisés** dans les trois classes de test :
- `Exo6Test` dans `LineCoverageTest`
- `Exo6Test` dans `BranchCoverageTest`
- `Exo6Test` dans `ConditionCoverageTest`

---

##  Environnement de test

Les tests ont été exécutés avec :
- IntelliJ IDEA Community Edition
- JUnit 5
- Couverture analysée manuellement ou avec l’outil intégré

---

##  Remarques finales

- Tous les tests ont été validés.
- Une attention particulière a été portée à la **correction des erreurs** (ex. boucle `for` dans l'exercice 5).
- La couverture est complète pour chaque type, sauf mention contraire (ex. exercice 6).

---

