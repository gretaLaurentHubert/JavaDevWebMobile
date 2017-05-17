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
$ cd JavaDevWebMobile
```

Remonter d'un niveau:

```bash
$ cd ..
```

### Afficher le contenu du répertoire courant

Affichage simple

```bash
$ ls
```

Affichage détaillé:

```bash
$ ls -l
```
Raccourci (alias) : `ll`

Affichage détaillé (ordre croissant des dates):

```bash
$ ls -rtl
```

### Créer un répertoire

```bash
$ mkdir RepertoireACreer
```


### Créer un fichier
```bash
touch fichierACreer
```

### Créer un fichier caché
```bash
touch .fichierCaché
```

### Supprimer un fichier
```bash
rm fichierASupprimer
```

### Supprimer un dossier (attention DANGER)
```bash
rm -rf dossierASupprimer
```

## Commandes git

### Cloner un dépôt distant

```bash
$ git clone git@github.com:gretaLaurentHubert/JavaDevWebMobile.git
```

### Récupérer les modification du dépôt
```bash
$ git pull
```

### Afficher le statut du dépôt

```bash
git status
```

### Ajouter un fichier à enregistrer
```bash
$ git add NOM_DU_FICHIER
```

### Enregistrer le fichier
```bash
$ git commit -m "Message obligatoire"
```

### Envoyer les informations vers le dépôt distant
```bash
$ git push
```



## Commandes supplémentaires

### Alias
Taper la commande:
```bash
$ alias
...
ll='ls -l'
...
```
