# Petit guide de survie de la ligne de commande
## Commandes de base

### Où suis-je ?
Affiche le répertoire courant

```bash
$ pwd
/e/Users/Stagiaire/JavaDevWebMobile
```

Le `/e` au début correspond au lecteur `E:`

```bash
$ pwd
/c/Users/Stagiaire/JavaDevWebMobile
```

Le `/c` au début correspond au lecteur `C:`

### Changer de répertoire

Aller dans un répertoire présent dans le répertoire courant:

```bash
cd JavaDevWebMobile
```

Remonter d'un niveau:

```bash
cd ..
```

### Afficher le contenu du répertoire courant

Affichage simple

```bash
ls
```

Affichage détaillé:

```bash
ls -l
```

Affichage détaillé (ordre croissant des dates):

```bash
ls -rtl
```
