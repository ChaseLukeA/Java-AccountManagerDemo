Account Manager WIP

Tried putting the database in WebContent/assets/db and accessing
localhost:8080/AccountManager/assets/db/accounts.sqlite as my
CONNECTION string but it would not work. I spent at least two hours
researching and trying different ways to use the local db from the project
folder without success. To access my database, please copy the
WebContent/assets/db/accounts.sqlite database to ~/ (your local user folder in
Mac OS X) and point to it in the edu.cvtc.web.utilities DBUtility.java file in
the CONNECTION assignment for it to work. I tried to just use
jdbc:sqlite:~/accounts.sqlite but unfortunately that didn't understand the
unix ~ home folder...
