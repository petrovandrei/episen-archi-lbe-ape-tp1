# episen-archi-lbe-ape-tp1

Application qui inverse un mot

Front : 
- expose un service rest qui permet de post un mot
- un fichier avec comme nom ce mot est crée à la racine du projet
- le mot est enregistre sur mongo
- le front met dans la queue rabbitmq l'id

Back :

- reçoit l'id de la queue rabbitmq
- récupere le mot en base 
- écrit le mot inversé dans le fichier crée au début

