class Point:
    # CONSTRUCTEURS
    def __init__(self):
        """
        Ici on déclare toutes ses valeurs par défaut
        quand on créera une variable de type point
        il aura automatiquement x et y a 0
        on remarque la présence de "_" avant le nom de la variable
        c'est pour spécifier que la variable est inaccessible en
        dehors de la classe Point
        
        si on voulait qu'elle soit accessible c'est self.x par exemple
        """
        self._x = 0
        self._y = 0
        
    # REQUETES
    def getAbscisse(self):
        """
        Retourne l'abscisse
        """
        return self._x
    
    def getOrdonnee(self):
        """
        Retourne l'ordonnée
        """
        return self._y
    
    # COMMANDES
    
    def setAbscisse(self, valeur : int):
        """
        On peut donc ici affecter valeur a notre abscisse
        """
        if valeur != self._x:
            self._x = valeur
    
    def setOrdonnee(self, valeur : int):
        """
        On peut donc ici affecter valeur a notre ordonnée
        """
        if valeur != self._y:
            self._y = valeur
    
    def sum(self, other):
        """
        Calcule l'addition entre deux points
        """
        self._x += other.getAbscisse()
        self._y += other.getOrdonnee()
        
    def sub(self, other):
        """
        Calcule la soustraction entre deux points
        """
        self._x -= other.getAbscisse()
        self._y -= other.getOrdonnee()
    
# Test de l'utilisation de la classe Point

# Déclaration de la variable 
point = Point()

# On récupère la variable x par le biais de la fonction 
# car la variable est privée mais si elle ne l'était pas 
# Cela aurait été plus facile de la modifier 
print(point.getAbscisse())

# Nouveau point
other = Point()
other.setAbscisse(7)
other.setOrdonnee(2)

# Opération d'ajout
point.sum(other)

print(point.getAbscisse())