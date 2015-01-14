BEGIN TRANSACTION;

delete FROM Spiele;
delete FROM Benutzer;

COMMIT;