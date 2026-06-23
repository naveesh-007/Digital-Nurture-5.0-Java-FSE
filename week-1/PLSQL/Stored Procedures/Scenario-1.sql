CREATE TABLE Accounts_Interest (
    AccountID NUMBER PRIMARY KEY,
    AccountHolderName VARCHAR2(100),
    AccountType VARCHAR2(20),
    Balance NUMBER(15,2)
);

INSERT INTO Accounts_Interest VALUES (101, 'Naveesh', 'SAVINGS', 10000);
INSERT INTO Accounts_Interest VALUES (102, 'Priya', 'SAVINGS', 8000);
INSERT INTO Accounts_Interest VALUES (103, 'Arjun', 'CURRENT', 15000);
INSERT INTO Accounts_Interest VALUES (104, 'Neha', 'SAVINGS', 12000);

COMMIT;

SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    v_rows_updated NUMBER;
BEGIN
    UPDATE Accounts_Interest
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'SAVINGS';

    v_rows_updated := SQL%ROWCOUNT;

    DBMS_OUTPUT.PUT_LINE(
        v_rows_updated || ' savings account(s) updated with 1% interest.'
    );

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/